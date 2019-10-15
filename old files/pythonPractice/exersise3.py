def getResult(grades) :
    for x in grades :
        if (x < 0 or x > 100) :
            return "Error"
        if (x < 40) :
            return "Fail"

    meanGrade = mean(grades)
    projectGrade = grades[len(grades) - 2]
    if (meanGrade < 50 or projectGrade < 50) :
        return "PASS"

    if (meanGrade < 70 or projectGrade < 70) :
        return "MERIT"

    return "DISTINCTION"
def mean(grades) :
    runSum = 0
    for x in len(grades) - 2 :
        runSum += grades[x]

    return runSum / len(grades) -1

def valid(grade) :
    if (grade < 0 or grade > 100) :
        return False

    return True

grades = []
for x in range(0, 8) :
    print("Enter project grades when done enter invalid grade")
    input = input()
    if(not valid(input)) :
        for y in range(x, 8) :
            grades.append(0)
    else :
        grades.append(input)

print("Enter project grade")
grades.append(input())

print(getResult(grades))
