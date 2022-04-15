import math

def binarysearch(data,low,heigh,searching_data):
    if heigh >= low:
        mid=math.floor((low+heigh)/2)
        if data[mid]==searching_data:
            return mid
        elif data[mid]<searching_data:
            return binarysearch(data,mid+1,heigh,searching_data)
        elif data[mid]>searching_data:
            return binarysearch(data,mid-1,low,searching_data)
    else:
            return -1  


arr=[list(range(0,10)) ]
# print(arr)
print(binarysearch(arr,0,len(arr)-1,11))