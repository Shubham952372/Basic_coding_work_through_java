s=input("enter the string:")
w=4
c=0
x=4
while x<len(s):
    for i in range(len(s)):
        c=c+4
        x=x+4
    print(s[c:x],w="    ")
print(s[len(s)-x:])    