
#reading of file after the creation of file
'''f = open("p5.txt","r")
(f.read())

#5(a) 

f = open("p5.txt","w")
f.write(" ")   

#5(b)

with open("p5.txt","w") as f:#delete whole file
    f.write("")'''

#5(b)
'''try:
    with open('p5.txt', 'r') as fr:
        # reading line by line
        lines = fr.readlines()
         
        # pointer for position
        ptr = 1
     
        # opening in writing mode
        with open('p5.txt', 'w') as fw:
            for line in lines:
               
                # we want to remove 5th line
                if ptr != 5:
                    fw.write(line)
                ptr += 1
    print("Deleted")
     
except:
    print("Oops! something error")'''

'''#5(c)

# with is like your try .. finally block in this case
with open('stats.txt', 'r') as file:
# read a list of lines into data
    data = file.readlines()

#print data
#print "Your name: " + data[0]

# now change the 2nd line, note that you have to add a newline
data[1] = 'Mage\n'

# and write everything back
with open('stats.txt', 'w') as file:
    file.writelines( data )'''

#5(d)

'''f=open("p5.txt","a")    
f.write("\nlove your self")'''

#5(e)
'''
f=open("p5.txt","r+")
t=f.read()
f=open("p6.txt","w")
f.write(t)'''
#5(f)

'''with open("stats.txt","r+") as f:
    i=int(input("enter the line"))
    t=f.readlines()

    print(t[i])'''
#5(g)
'''with open("stats.txt", "r") as file:
    first_line = file.readline()
    for last_line in file:
        pass

print(first_line)
#This is last
print(last_line)'''


