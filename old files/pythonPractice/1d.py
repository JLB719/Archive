def createID(input) :
    print(input)
    if(input == "Error") :
        return "Error"
    # inputSplit = input.split(" ")
    if (len(inputSplit) < 2 or len(inputSplit) > 3) :
        return "Error"

    if (len(inputSplit) == 2) :
        arrayacesszero = inputSplit[0]
        arrayacessone = inputSplit[1]
        return arrayacesszero[0].lower() + arrayacessone[0].lower()
    if (len(inputSplit) == 3) :
        arrayacesszero = inputSplit[0]
        arrayacessone = inputSplit[1]
        arrayacesstwo = inputSplit[2]
        return arrayacesszero[0].lower() + arrayacessone[0].lower() + arrayacesstwo[0].lower()

    return "Error"

x = input("Enter a name for id to be created")
y = createID(x)
print(y)
