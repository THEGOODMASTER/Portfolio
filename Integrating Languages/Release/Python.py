import re
import string

#Description - This method doubles the value passed into it.
#@param value - Gained through user input.
#@returns - Returns 2 times the number passed in.
def DoubleVal(userNum):
    return userNum * 2

#Description - This method just prints out a multiplication table to the 10th multiple of the number passed in.
#@param - Gained through userInput. Is used as one factor on the multiplication table.
#@returns - Returns the final value in the table.
def MultiplicationTable(userNum):
    print(userNum, '* 1 =', userNum * 1)
    print(userNum, '* 2 =', userNum * 2)
    print(userNum, '* 3 =', userNum * 3)
    print(userNum, '* 4 =', userNum * 4)
    print(userNum, '* 5 =', userNum * 5)
    print(userNum, '* 6 =', userNum * 6)
    print(userNum, '* 7 =', userNum * 7)
    print(userNum, '* 8 =', userNum * 8)
    print(userNum, '* 9 =', userNum * 9)
    print(userNum, '* 10 =', end =' ')
    return userNum * 10

#Description - Prints the options available for the user to choose from.
def PrintMenu():
    print("1: Display a Multiplication Table")
    print("2: Double a Value")
    print("3: Exit")
    print("Enter your selection as a number 1, 2, or 3.")
