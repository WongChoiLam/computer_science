import sys

# read numbers from stdin
toSort = [int(line.rstrip()) for line in sys.stdin.readlines()]

# print array before sorting
print("Original:\t", toSort)

# outer loop, loop for n-1 times
def bubble_sort(toSort):
    for i in range(len(toSort) - 1, 0, -1):
        swapped = False
        # inner loop
        for j in range(0, i):
            if toSort[j] > toSort[j+1]:
                # swap
                toSort[j], toSort[j+1] = toSort[j+1], toSort[j]
                swapped = True
        if not swapped: break # no elementes are swapped, meaning the array is already sorted, no need for further looping

bubble_sort(toSort)

# print array after sorting
print("Sorted:\t\t", toSort)