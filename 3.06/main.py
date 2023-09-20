import os
import datetime
import time
import sys

currentDate = datetime.datetime.now()

os.system('cls' if os.name == 'nt' else 'clear')

print("Hello my name is Malik, I will be the delivery driver for you today.")
print("Todays date is: " + str(currentDate))

def getSize():
    size = input("\nWhat size pizza would you like? (S/M/L) ")
    sizeStore = "N/A"
    if size == "S":
        print("Copy that, small it is.")
        sizeStore = "small"
        getCrust(sizeStore)
    if size == "M":
        print("Copy that, medium it is.")
        sizeStore = "medium"
        getCrust(sizeStore)
    if size == "L":
        print("Copy that, large it is.")
        sizeStore = "large"
        getCrust(sizeStore)
    else:
        print("Invalid, remember this IS case sensitive.")
        getSize()

def getCrust(sizeStore):
    crust = input("\nWhat type of crust would you like? (Stuffed/Cheese/Thin) ")
    crustStore = "N/A"
    if crust == "Stuffed":
        print("Copy that, stuffed it is.")
        crustStore = "stuffed"
        getTopping(sizeStore, crustStore)
    if crust == "Cheese":
        print("Copy that, cheese it is.")
        crustStore = "cheese"
        getTopping(sizeStore, crustStore)
    if crust == "Thin":
        print("Copy that, thin it is.")
        crustStore = "thin"
        getTopping(sizeStore, crustStore)
    else:
        print("Invalid, remember this IS case sensitive.")
        getCrust(sizeStore)

def getTopping(sizeStore, crustStore):
    topping = input("\nWhat type of topping would you like? (Pepperoni/Sausage/Extra Cheese) ")
    toppingStore = "N/A"
    if topping == "Pepperoni":
        print("Copy that, pepperoni it is.")
        toppingStore = "pepperoni"
        main(sizeStore, crustStore, toppingStore)
    if topping == "Sausage":
        print("Copy that, sausage it is.")
        toppingStore = "sausage"
        main(sizeStore, crustStore, toppingStore)
    if topping == "Extra Cheese":
        print("Copy that, extra cheese it is.")
        toppingStore = "extra cheese"
        main(sizeStore, crustStore, toppingStore)
    else:
        print("Invalid, remember this IS case sensitive.")
        getTopping(sizeStore, crustStore)
    
def main(sizeStore, crustStore, toppingStore):
    print("\nYou have ordered a " + sizeStore + " pizza, with " + crustStore + " crust and " + toppingStore + " as a topping.")
    isCorrect = input("Is this correct? (Y/N)")
    if isCorrect == "Y":
        print("\nCopy that, thank you for ordering Malik's Pizza!")
        time.sleep(10)
        sys.exit()
    if isCorrect == "N":
        print("Dang, that sucks, I will re-route you through our ordering process.")
        getSize()
    else: 
        print("Invalid, remember this IS case sensitive.")
        main(sizeStore, crustStore, toppingStore)
getSize()