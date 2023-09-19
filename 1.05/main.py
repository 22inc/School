import os
import sys
import time
import datetime

current_date = datetime.datetime.now()

def main():
    os.system('clear')
    os.system('cls')
    print("1.05 Input Responder")
    print("You are using this program on " + str(current_date) + ".\n")
    print("My name is Malik!")
    time.sleep(1)
    ni = input("What is your name? ")
    time.sleep(1)
    print("Nice to meet you " + ni + "!")
    time.sleep(1)
    ci = input("What is your favorite color? ")
    time.sleep(1)
    print("Wow you have amazing taste, " + ci + " is an amazing color!")
    time.sleep(10)
    os.system('clear')
    os.system('cls')
    sys.exit()
main()

# Has a conversation with you about your favorite color.
# Creative Commons Attribution-NonCommercial 4.0 International
# Do not reupload without significant changes, do not use in ANY way for commercial ventures.