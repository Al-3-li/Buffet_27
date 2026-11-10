x = int(input("Please input a number: "))
nu =0;
for count in range (1,x):
    print(count, end=" + ")
    nu= nu+count
print(x)
nu= nu+x
print("The sum of 1 to " + str(x) + " is " + str(nu))