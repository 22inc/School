import os
import sys
import time

def load_menu():
    menu = {}
    with open("menu.txt", "r") as menu_file:
        for line in menu_file:
            parts = line.strip().split(":")
            if len(parts) == 2:
                item, price = parts
                menu[item] = float(price)
    return menu

def main():
    menu = load_menu()
    order = {}
    
    while True:
        os.system('cls' if os.name == 'nt' else 'clear')  # Clear the screen
        
        print("Menu:")
        for item, price in menu.items():
            print(f"{item}: ${price:.2f}")
        
        item = input("\nWhat would you like to order (press 'r' to checkout): ").strip()
        
        if item == 'r':
            break
        
        if item in menu:
            quantity = int(input(f"How many would you like to order? "))
            if item in order:
                order[item] += quantity
            else:
                order[item] = quantity
        else:
            print("Invalid item. Please choose from the menu.")
    
    totalCost = sum(menu[item] * quantity for item, quantity in order.items())
    os.system('cls' if os.name == 'nt' else 'clear')  # Clear the screen
    
    print("Your order:")
    for item, quantity in order.items():
        print(f"{item}: {quantity}")
    
    # Add tax
    taxRate = 0.065  # 6.5% tax rate
    totalCostWithTax = totalCost * (1 + taxRate)
    
    print(f"Subtotal: ${totalCost:.2f}")
    print(f"Total cost with tax: ${totalCostWithTax:.2f}")
    
    # Tip menu
    while True:
        tipPercentage = input("\nSelect a tip percentage (10-50%): ")
        try:
            tipPercentage = float(tipPercentage)
            if 10 <= tipPercentage <= 50:
                break
            else:
                print("Please enter a valid tip percentage between 10% and 50%.")
        except ValueError:
            print("Please enter a valid number for the tip percentage.")
    
    tipAmount = totalCostWithTax * (tipPercentage / 100)
    totalCostWithTip = totalCostWithTax + tipAmount
    
    print(f"\nTip amount: ${tipAmount:.2f}")
    print(f"Total cost with tip: ${totalCostWithTip:.2f}")
    print("Thank you for ordering!")
    time.sleep(10)
    os.system('cls' if os.name == 'nt' else 'clear')
    sys.exit()
main()

# Acts as a drive through menu system with menu entrys from Chick-Fil-A
# Creative Commons Attribution-NonCommercial 4.0 International
# Do not reupload without significant changes, do not use in ANY way for commercial ventures.