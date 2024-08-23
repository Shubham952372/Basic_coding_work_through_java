d=dict()
n=int(input("Enter the number of employee"))
for i in range(0,n):
    l=list()
    name=input("Enter the employee name:")
    id=int(input("Enter the employee ID:"))
    l.append(id)
    age=int(input("Enter the employee age:"))
    l.append(age)
    g=input("Enter the employee gender:")
    l.append(g)
    d[name]=l
  
x=input("enter the name:")
print("ID   AGE   GENDER")
print(*d[x],sep="   ")
 
y=input("enter the employee who age you want to know")
print(d[y][1])

c_m=0
c_f=0
for i in d:
    if d[i][2]=='male':
        c_m=c_m+1
    elif d[i][2]=='female':
        c_f=c_f+1
print("Number of male is {}".format(c_m))
print("Number of female is {}".format(c_f))

t=tuple(d)
print(t)



    