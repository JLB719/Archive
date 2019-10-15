def check(password) :
    if(lengthCheck(password) and chars(password) and Firstdigit(password) and mix(password)) :
        return True
    else :
        return False


def lengthCheck(password) :
    if(len(password) >= 8 and len(password) <= 12) :
        return True
    else :
        return False


def chars(password) :
    for x in password :
        if (not x.isdigit() and not x == "." and not x.isalpha()) :
            return False
    return True


def Firstdigit(password) :
    if (password[0].isdigit()) :
        return False
    else :
        return True


def mix(password) :
    if (not password.isupper() and not password.islower()) :
        return True
    else :
        return False

tester = "abAaf,xdffffff"
print(check(tester))
