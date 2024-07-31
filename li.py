l=[2,5,7,8];
loc=-1;
a=int(input("input the element to be search\n"))
for i in range (len(l)):
    if(a==l[i]):
        loc=i
        break
if(loc==-1):
    print("item not found ")
else:
    print(loc)