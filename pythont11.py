d=dict()
n=int(input("enter the number of employees"))
for i in range(0,n):
  name=input("enter the name")
  k=input("enter the key for name")
  d[k]=name
  eid=input("enter the eid")
  p=input("enter the key for eid")
  d[p]=eid
  age=input("enter the age")
  t=input("enter the key for age")
  d[t]=age
  gender=input("enter the gender")
  x=input("enter the key for gender")
  d[x]=gender 
for k,v in d.items():
  print("key:{} and value:{}" .format(k,v))  
t=tuple(d)
#for i in t:
 # print(i)
C=int(input("enter the employee number to know detail: "))

