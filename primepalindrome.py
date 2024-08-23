def fun(n):
    if n<2:
        return 0
    if n==2:
        return 1
    c = 0
    for i in range(2,n):
        if n%i == 0:
            c = 1
            break
    if c == 1:
        return 0
    else:
        return 1
def pal(n):
    string = str(n)
    if string == str(string)[::-1]:
        return 1
    else:
        return 0
        
for i in range(int(input())):
    n=int(input())
    m=int(input())
    l=[]
    l2=[]
    
    for k in range(n,m+1):
        if fun(k) == 1:
            l.append(k)
    #print(l)
    sum = 0
    for j in range(len(l)):
        if(pal(l[j]) == 1):
            sum += l[j]
    print(sum)
    
