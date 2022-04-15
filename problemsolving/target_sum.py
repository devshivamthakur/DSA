
def targetsum(arr, s):
    """
    Given an array of integers and a number s, find all unique pairs in the array
    whose sum is equal to s.
    """
    pairs = []
    for i in range(len(arr)):
        for j in range(i+1, len(arr)):
            if arr[i] + arr[j] == s:
                pairs.append((arr[i], arr[j]))
                break
    return pairs


l=[2,7,11,15,19]
target=1

print(targetsum(l, target))

