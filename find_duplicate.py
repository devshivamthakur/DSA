from collections import Counter
N=int(input())
list=[int(input())  for _ in range(N) ]
duplicate_number=[ number for number,count in Counter(list).items() if count>1 ]
print(duplicate_number)

