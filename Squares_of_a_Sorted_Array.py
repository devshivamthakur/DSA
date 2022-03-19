
N=int(input())
list_v=[ int(input()) for i in range(N) ]
k=int(input())
list_v.sort(reverse=True)
print(list_v[k-1])


