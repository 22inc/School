import math
import os
import sys
import time
import datetime

currentDate = datetime.datetime.now()

os.system('clear')
os.system('cls')

print("Coded by Malik.")
print("Todays date is: " + str(currentDate))

print("\nThis program calculates the volume and surface area of a cylinder.\n")

radius = float(input("Enter the radius (r) of the cylinder: "))
height = float(input("Enter the height (h) of the cylinder: "))

# Calculate the surface area of the cylinder
lateralSurfaceArea = 2 * math.pi * radius * height
baseArea = 2 * math.pi * radius**2
totalSurfaceArea = lateralSurfaceArea + baseArea

volume = math.pi * radius**2 * height

print(f"The surface area of the cylinder is: {totalSurfaceArea:.2f}")
print(f"The volume of the cylinder is: {volume:.2f}")

time.sleep(10)
os.system('cls' if os.name == 'nt' else 'clear')
sys.exit()

# Calculates volume and surface areas of cylinders.
# Creative Commons Attribution-NonCommercial 4.0 International
# Do not reupload without significant changes, do not use in ANY way for commercial ventures.
