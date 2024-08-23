  f = open("shubham","r")
c=0
f.seek(0)
x=f.read()
for i in x:
    if i=='\n':
        c+=1
print(c)'''

'''f = open("shubham","r")
c=0
x=f.read()
for i in x:
        c+=1
print(c) '''       

'''f = open("shubham","r")
c=0
with open('shubham','r') as f1:
   for i in f:
        word=i.split()
        for i in word:
            for j in i:
              if(i.isspace):
                    c=c+1
print(c)'''
'''print(x)
for i in x:
    if i == ' ':
        c+=1
print(c)        

'''
'''f=open("shubham","r")
f.readlines()
c=0
f.seek(0)
for i in f.readlines():
    for j in i:
        if j>='A' and j<='Z':
           c+=1
print(c)'''        