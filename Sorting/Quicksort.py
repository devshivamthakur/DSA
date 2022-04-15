def swap(arr,index1,index2):
    arr[index1],arr[index2]=arr[index2],arr[index1]


def partition(arr,start,end):
    pivot=arr[start]
    pivot_index=start

    while(start<=end):

        while(start<len(arr) and arr[start]<=pivot):
            start+=1
        while(arr[end]>pivot):
            end-=1
        if(start<end):
            swap(arr,start,end)

    swap(arr,pivot_index,end)                
    return end

def quicksort(arr,start,end):
    if start<end:
        pi=partition(arr,start,end)
        quicksort(arr,start,pi-1)
        quicksort(arr,pi+1,end)

# arr=[11,9,29,7,2,15,28]

# quicksort(arr,0,len(arr)-1)

tests = [
        [11,9,29,7,2,15,28],
        [3, 7, 9, 11],
        [25, 22, 21, 10],
        [29, 15, 28],
        [],
        [6],
        [1,2,3,4,5,7,6]
    ]
for arr in tests:
    quicksort(arr,0,len(arr)-1)
    print(arr)    