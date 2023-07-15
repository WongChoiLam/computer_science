def partition(A, lo, hi):
    # divides the sub array 'A' [lo,hi] into two partitions, where
    # A[i] <= A[temp_pivot] for i < temp_pivot
    # A[i] >  A[temp_pivot] for i > temp_pivot
    # A:  array to sort
    # lo: the lowest index
    # hi: the highest index
    pivot = A[hi]
    temp_pivot = lo - 1
    for j in range(lo, hi):
        if A[j] <= pivot:
            temp_pivot += 1
            A[temp_pivot], A[j] = A[j], A[temp_pivot]
    temp_pivot += 1
    A[hi], A[temp_pivot] = A[temp_pivot], A[hi]
    return temp_pivot


def quicksort(A, lo=0, hi=None):
    # sort array 'A' in the range [0,hi]
    # A:  array to sort
    # lo: the lowest index
    # hi: the highest index
    if hi == None: hi = len(A) - 1
    if lo >= hi or lo < 0: return
    pivot = partition(A, lo, hi)

    quicksort(A, lo, pivot-1)
    quicksort(A, pivot+1, hi)

import sys

# read numbers from stdin
toSort = [int(line.rstrip()) for line in sys.stdin.readlines()]

# print array before sorting
print("Original:\t", toSort)

# outer loop, loop for n-1 times
quicksort(toSort)

# print array after sorting
print("Sorted:\t\t", toSort)