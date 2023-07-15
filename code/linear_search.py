# Assuming we have a list of numbers 1,3,5,7,9,...
# and the question is, what is the index of number '11'
listOfNumbers = [i*2+1 for i in range(20)]
toFind = 11
# search from the first index to the last index
for i in range(0, len(listOfNumbers)):
    if listOfNumbers[i] == toFind:
        print("Found", toFind, "at index", i)
        break
