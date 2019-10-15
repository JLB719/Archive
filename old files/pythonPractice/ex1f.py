
def findShortAddress(input) :
    if (input == None) :
        return None
    if (input == "") :
        return None;
    list = input.split(",")
    length = len(list)
    firstPart = list[0]
    postcode = list[length - 1]
    postcode = postcode.strip();
    # answer = isaplpha(postcode[0]);
    # print(isalpha(postcode[0]))
    # print(answer)
    print(postcode);
    print(len(postcode));
    # print(len(postcode) == 6)
    print(postcode[0].isalpha());
    if (len(postcode) != 6) :
        # print("reaches here")
        return None
    if ((postcode[0].isalpha() == False) or (postcode[1].isdigit() == False) or (postcode[2].isdigit() == False) or (postcode[3].isdigit() == False) or (postcode[4].isalpha() == False) or (postcode[5].isalpha() == False)) :
        print("reaches here")
        return None
    else :
        return firstPart + postcode

address = "james , abc, n234nn"
print(findShortAddress(address))
