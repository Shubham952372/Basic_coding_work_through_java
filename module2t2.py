def split(string,sep):
    temp=''
    list=[]
    for i in string:
        if(i!=sep):
            temp=temp+i
        else:
            list.append(temp)
            temp=''
    list.append(temp)  
    return list
def display_sentences(f,c):
    lines=split(f.read(),'.')
    i=0
    while True:
        try:
            print(lines[c[i]-1])
            i=i+1
        except:
            break
    f.seek(0)
def insert_line(f,l,num):
    lines=split(f.read(),'.')
    lines.insert(num,l)
    lines=''.join(i+"." for i in lines)
    f.seek(0)
    f.write(lines)
    f.seek(0)
def delete_line(f,num):
    lines=split(f.read(),'.')
    lines.pop(num-1)
    lines=''.join(i+'.' for i in lines)
    f.seek(0)
    f.truncate(0)
    f.seek(0)
    f.write(lines)
    f.seek(0)

try:
    shubham=input("ENTER THE FILE NAME :")
    f=open(shubham,"r+")
    while True:
        try:
            c=list(map(int,input("ENTER THE LINE NUMBERS WITH ONE SPACE :").split()))
            display_sentences(f,c)
            break
        except ValueError:
                print('\n!!!!!WARNING ENTER ONLY INTEGERS!!!!')
    l=input("ENTER THE LINE YOU WANT TO INSERT :")
    while True:
        try:
            num=int(input('ENTER THE NUMBER OF THE LINE '))
            insert_line(f,l,num)
            print(f.read())
            break
        except ValueError:
            print('\n!!!!!WARNING ENTER ONLY INTEGERS!!!!')
    while True:
        try:
            n=int(input('ENTER THE NUMBER OF LINE YOU HAVE TO DELETE'))
            delete_line(f,N)
            print(f.read())
            break
        except ValueError:
            print('\n!!!!!WARNING ENTER ONLY INTEGERS!!!!')
except FileNotFoundError:  
     print("Whoops! file  doesnt exist in the current directory")


