def mean(numbers):
    total = 0
    for x in numbers :
        total += x

    return total/len(numbers)

numbers = [1, 2, 3]
print(mean(numbers))
