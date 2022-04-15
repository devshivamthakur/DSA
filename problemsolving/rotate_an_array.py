n=int(input())
num=[]
for _ in range(n):
    num.append(int(input()))
k=int(input())
j=n-k
newlist=num[-k:]+num[:j]
print(newlist)
