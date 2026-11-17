import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
#joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself


# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke


num= int(input("How many jokes do you want? "))
wrd= input("What kind of joke do you want? (Single/Double/Both) ")
if wrd=="Single":
    for x in range (0,num):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        joke["type"]=="single"
        print(joke["joke"])
elif wrd== "Double":
    for x in range(0,num):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
        print(joke["setup"])
        print(joke["delivery"])
elif wrd== "Both":
    for x in range(0,num):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        ekoj = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=double").json()
        print(joke["joke"])
        print(ekoj["setup"])
        print(ekoj["delivery"])
else:
    print("Sorry! that doesn't exist. :(")