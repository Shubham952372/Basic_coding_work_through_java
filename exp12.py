import random
import string
n=int(input("emter the number of student we want find the details:"))
l=[]
for i in range(n):
    l1=[]
    reg=random.randint(10000,60000)
    l1.append(reg)

    letter =  string.ascii_lowercase
    st="".join(random.choice(letter))
for i in range(5):
    l1.append(st)

    marks=random.randint(30,100)
    l1.append(marks)

    phone_number=random.randint(6200000000,9999999999)
    l1.append(phone_number)
print(l1)




