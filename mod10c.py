def fibo(n):
   if n<0:
    print("incorrect value")
   elif n==0:
    return 0
   elif n==1 or n==2:
    return 1
   else:
    sum = fibo(n-1)+fibo(n-2)
    return sum
print(fibo(7))