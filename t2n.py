name=()
eid=()
age=[]
gender=()
n=int(input("enter the number of employee"))
for i in range(0,n):
    e_name=input("enter the name of employee")
    name=name+(e_name,)
    e_id=input("enter the id of employee")
    eid=eid+(e_id,)
    e_age=input("enter the age of employee")
    age.append(e_age)
    e_gender=input("enter the gender of employee")
    gender+=(e_gender,)
print(name)    
print(eid)
print(age)
print(gender)

#