x = int(input("What line length would you like? "))
y= input("What kind of line would you like? (Horozontal/Vertical) ")
Horozontal= y=="Horozontal";
Vertical= y=="Vertical";
if(Vertical):
    for x in range (0,x):
        print("*")
if(Horozontal):
    for x in range(0,x):
        print("*", end= " ")