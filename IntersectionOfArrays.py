
## Find intersection of two arrrays using hashtables. Trying it in Python first. 

def Interesection_Of_Arrays(array1, array2):
    solution = []
    hashArray1 = {}
    hashArray2 = {}

    ## create two hashtables using arrays
    for value in array1:
        hashArray1[value] = True
    for value in array2:
        hashArray2[value] = True
    
    for value in hashArray1:
        if hashArray2.get(value):   ## tried solving it using hashArray[value] but kept getting a Key error as 1 isnt in array 2. Use get to retrieve the actual 
            solution.append(value)
    return solution


data1 = [2, 3, 4, 5, 6]
data2 = [3, 6, 9]

print(Interesection_Of_Arrays(data1, data2))