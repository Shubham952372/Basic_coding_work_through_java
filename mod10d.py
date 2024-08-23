n=int(input())
if n==1 or n==2:
    print("incorrect")
elif n>0:
    for i in range(2,n):
        if n%i==0:
            print("composite")
        else:
            print("not composite")
else:
    print("enter positive no.")            

