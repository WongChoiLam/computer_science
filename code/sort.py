import sys

# read numbers from stdin
toSort = [int(line.rstrip()) for line in sys.stdin.readlines()]

# print array before sorting
print("Original:\t", toSort)

# sort by library code, the recommended way in practice
toSort.sort()

# print array after sorting
print("Sorted:\t\t", toSort)