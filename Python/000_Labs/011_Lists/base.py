import random
j= "What did the sea say to the sand? Nothing, it just waved."
o="Why did the scarecrow win a Nobel prize? Because he was outstanding in his field!"
k="What do you call cheese that isn't yours? Nacho cheese!"
e="Why can't you tell a joke to an egg? It might crack up."
s="Why did the bicycle fall over? It was two-tired."

ekojtsil=[j, o, k, e, s]
ekoj= random.randrange(0,4)
if ekoj==0:
    print(j)
elif ekoj==1:
    print(o)
elif ekoj==2:
    print(k)
elif ekoj==3:
    print(e)
else:
    print(s)