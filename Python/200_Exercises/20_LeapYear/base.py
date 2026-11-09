jahr= int(input("Please enter a year you'd like to check! "))
if jahr%4==0:
    print(str(jahr) + " was a leap year!")
elif jahr%100 == 0 and jahr%400!=0:
    print(str(jarh) + " was not a leap year!")
else:
    print(str(jahr) + " was not a leap year!")