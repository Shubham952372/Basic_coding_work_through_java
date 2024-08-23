import os
import tkinter as tk
from tkinter import filedialog
from modules.training import train_models
from module.predict import predict_video, identify_images

def browse_dir():
    """Opens a dialog box to browse to the required directory in the GUI
    Args: None
    Returns: The absolute path of the directory selected.
    """
    currdir = os.getcwd()
    root.withdraw()
    tempdir = filedialog.askdirectory(parent=root, initialdir=currdir, title='Please select a directory')
    if len(tempdir) > 0:
        print("You selected location: %s" % tempdir)
    else:
        return browse_dir()
    return tempdir

def browse_file():
    """Opens a browse window to select a file
    :return: The absolute path of the file selected as a string
    """
    currdir = os.getcwd()
    root.withdraw()
    filepath = filedialog.askopenfilename(parent=root, initialdir=currdir, title='Please select a file')
    if len(filepath) > 0:
        print("You selected file: %s" % filepath)
    else:
        return browse_file()
    return filepath

def trainOnDataset(event):
    """Function get called on left click event on the button 'train'
        Opens a browse dialog to select the location of training data.
        Trains the LBP and Fisherfaces Recognisers on the given training set.
        Saves the configuration of the trained model in XML files for future use.
        Displays the result in the GUI.
    :param event: The function is bound to the button train("Train on Data") and activated by left click event.
    """
    txt.delete('1.0', tk.END)
    txt.insert(tk.END, 'Training on dataset.\n')
    path = browse_dir()
    train_models(path)
    status.config(text='Training done successfully.')
    txt.delete('1.0', tk.END)
    txt.insert(tk.END, 'Prediction Models are ready.\n')

def processVideo(event):
    """Function get called on left click event on the button 'calculateVideo'
        Opens a browse dialog to select the video file.
        Processes the video for detecting faces and making predictions on them by loading the trained models.
        Displays the result in the GUI.
    :param event: The function is bound to the button calculateVideo("Calculate Attendance from Video") and activated by left click event.
    """
    status.config(text='Processing Video...')
    txt.delete('1.0', tk.END)
    txt.insert(tk.END, 'Processing video.\n')
    path = browse_file()
    result = predict_video(path)
    status.config(text='Result computed successfully.')
    presentlist = list(result)
    txt.delete('1.0', tk.END)
    txt.insert(tk.END, 'Students present are:\n')
    num = 1
    for name in presentlist:
        txt.insert(tk.END, str(num) + '. ' + name + '\n')
        num += 1
    if num == 1:
        txt.delete('1.0', tk.END)
        txt.insert(tk.END, 'No persons found.\n')

def testImages(event):
    """Function get called on left click event on the button 'calculateImages'
        Opens a browse dialog to select the directory containing the images.
        Processes the images for detecting faces and making predictions on them by loading the trained models.
        Displays the result in the GUI.
    :param event: The function is bound to the button calculateImages("Test on Images") and activated by left click event.
    """
    txt.delete('1.0', tk.END)
    txt.insert(tk.END, 'Processing images.\n')
    path = browse_dir()
    result = identify_images(path)
    status.config(text='Result computed successfully.')
    txt.delete('1.0', tk.END)
    txt.insert(tk.END, 'Persons identified are:\n')
    num = 1
    for label in result:
         txt.insert(tk.END, str(num) + '. ' + result[label] + '\n')
         num += 1
    if num == 1:
        txt.delete('1.0', tk.END)
        txt.insert(tk.END, 'No persons found.\n')

def resetProgram():
    """Function bound to the Reset option in the Options menu in the MenuBar.
        It clears the status of the status bar and the Text display in the GUI
    """
    status.config(text='Ready.')
    txt.delete('1.0', tk.END)
    txt.insert(tk.END, 'Ready.\n')

"""
Main Script starts here.
"""
root = tk.Tk()
root.wm_title("Smart Attendance System")

status = tk.Label(root, text="Ready", bd=1, relief=tk.SUNKEN, anchor=tk.W)
status.pack(side=tk.BOTTOM, fill=tk.X)

topFrame = tk.Frame(root, width=480, height=320)
topFrame.pack()

bottomFrame = tk.Frame(root, width=480, height=320)
bottomFrame.pack(side=tk.BOTTOM, fill="both", expand=True)
bottomFrame.grid_propagate(False)
bottomFrame.grid_rowconfigure(0, weight=1)
bottomFrame.grid_columnconfigure(0, weight=1)

# create a Text widget
txt = tk.Text(bottomFrame, borderwidth=3, relief="sunken")
txt.config(font=("consolas", 12), undo=True, wrap='word')
txt.grid(row=0, column=0, sticky="nsew", padx=2, pady=2)
txt.insert(tk.END, "Ready.")

# create a Scrollbar and associate it with txt
scrollb = tk.Scrollbar(bottomFrame, command=txt.yview)
scrollb.grid(row=0, column=1, sticky='nsew')
txt['yscrollcommand'] = scrollb.set

train = tk.Button(topFrame, text="Train on Data")
calculateVideo = tk.Button(topFrame, text="Calculate Attendance from Video")
calculateImages = tk.Button(topFrame, text="Test Model on Images")

train.bind("<Button-1>", trainOnDataset)
calculateVideo.bind("<Button-1>", processVideo)
calculateImages.bind("<Button-1>", testImages)

orig_color_train = train.cget("background")
orig_color_calculatevideo = calculateVideo.cget("background")
orig_color_calculateimage = calculateImages.cget("background")

train.pack(side=tk.LEFT)
calculateVideo.pack(side=tk.LEFT)
calculateImages.pack(side=tk.LEFT)

menu = tk.Menu(root)
root.config(menu=menu)

subMenu = tk.Menu(menu)
menu.add_cascade(label="Options", menu=subMenu)
subMenu.add_command(label="Reset", command=resetProgram)
subMenu.add_separator()
subMenu.add_command(label="Exit", command=root.quit)

root.mainloop()
