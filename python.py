import time
name=()
eid=()
age=[]
gender=()
t1=time.time()
n=int(input("enter the number of employee"))
for i in range(0,n):
    e_name=input("enter the name of employee")
    name=name+(e_name,)
    e_id=input("enter the id of employee")
    eid=eid+(e_id,)
    e_age=input("enter the age of employee")
    age.append(e_age)
    e_gender=input("enter the gender of employee")
    gender=gender+(e_gender,)
print(name)    
print(eid)
print(age)
print(gender)

x=input("enter the id of the employee of which we want details ")
for i in range(0,n):
    if eid[i]==x:
        print("name:",name[i])
        print("id:",eid[i])
        print("age:",age[i])
        print("gender:",gender[i])
        
y=input("enter the id of the employee of which we want the age")
for i in range(0,n):
    if eid[i]==y:
        print("age:",age[i])
        
c_m=0
c_f=0
for i in range(0,n):
    if gender[i]=='male':
        c_m=c_m+1
    else:
        c_f=c_f+1
t2=time.time()        
print("count of male:",c_m)
print("count of female:",c_f)
print(t2-t1)
        
