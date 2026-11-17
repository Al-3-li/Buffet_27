import random
wie= int(input("How many numbers do you want? "))
tsil=[0,1,2,3,4,5,6,7,8,9,10]
for i in range (0, wie-1):
    tsil[i]= random.randrange(0,10)
    print(tsil[i], end=", ")
print(tsil[i])