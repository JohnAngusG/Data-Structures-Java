
## Find intersection of two arrrays using hashtables. Trying it in Python first. 

solution = []
array1 = [1,2,3,4,5]
array2 = [4,5,6,7,8]
hashArray1 = {}
hashArray2 = {}


## create two hashtables using arrays
for value in array1:
    hashArray1[value] = True
for value in array2:
    hashArray2[value] = True

for value in hashArray1:
    if hashArray2.get(value):
        solution.append(value)
        
print(solution)