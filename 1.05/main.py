import os
import sys
import time
import datetime

currentDate = datetime.datetime.now()

def main():
    os.system('clear')
    os.system('cls')
    print("1.05 Input Responder")
    print("You are using this program on " + str(currentDate) + ".\n")
    print("My name is Malik!")
    time.sleep(1)
    nameInput = input("What is your name? ")
    time.sleep(1)
    print("Nice to meet you " + nameInput + "!")
    time.sleep(1)
    colorInput = input("What is your favorite color? ")
    time.sleep(1)
    print("Wow you have amazing taste, " + colorInput + " is an amazing color!")
    time.sleep(10)
    os.system('cls' if os.name == 'nt' else 'clear')
    sys.exit()
main()

# Has a conversation with you about your favorite color.
# Creative Commons Attribution-NonCommercial 4.0 International
# Do not reupload without significant changes, do not use in ANY way for commercial ventures.
