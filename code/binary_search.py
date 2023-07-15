# Assuming we have a sorted list of numbers
# and we wish to find "11"
listOfNumbers = [i*2+1 for i in range(20)]

def binary_search(numbers, target, lo=0, hi=None):
    if hi == None: hi = len(listOfNumbers) - 1

    mid = int(lo + (hi - lo) / 2)
    while numbers[mid] != target:
        if numbers[mid] < target: lo = mid + 1
        else: hi = mid - 1
        if hi < lo: return None
        mid = int(lo + (hi - lo) / 2)
    return mid

print(binary_search(listOfNumbers, 11))