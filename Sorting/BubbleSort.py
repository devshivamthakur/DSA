def bubblesort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-1):
            if arr[i]<arr[j]:
                arr[i],arr[j]=arr[j],arr[i]


arr=[1,2,3,4,5,7,6,8,9,10]
bubblesort(arr)
print(arr)