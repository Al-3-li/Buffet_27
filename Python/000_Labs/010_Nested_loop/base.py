s= input("What symbol would you like to use? ")
x= int(input("How long do you want the box to be? "))
y= int(input("How tall do you want the box to be? "))
for a in range(0,y):
    print(" ")
    for b in range(0,x):
        print(s, end=" ")
        