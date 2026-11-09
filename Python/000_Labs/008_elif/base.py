num= int(input("Please input a number: "))
ber = int(input("Please input another number: "))
que= input("What kind of math would you like to do? (add/sub/mul/div) ")
add= ("add")
sub= ("sub")
mul= ("mul")
div= ("div")
if que==add:
    print(str(num+ber))
elif que==sub:
    print(str(num-ber))
elif que==mul:
    print(str(num*ber))
elif que==div:
    print(str(num/ber))