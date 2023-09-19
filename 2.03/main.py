import math
import os
import sys
import time
import datetime

currentDate = datetime.datetime.now()

os.system('cls' if os.name == 'nt' else 'clear')

print("Coded by Malik.")
print("Today's date is: " + str(currentDate))

print("\nThis program calculates the volume and surface area of a cylinder.\n")

radius = float(input("Enter the radius (in meters, for example) of the cylinder: "))
height = float(input("Enter the height (in meters, for example) of the cylinder: "))

# Calculate the surface area of the cylinder
lateralSurfaceArea = 2 * math.pi * radius * height
baseArea = 2 * math.pi * radius**2
totalSurfaceArea = lateralSurfaceArea + baseArea

volume = math.pi * radius**2 * height

print(f"The surface area of the cylinder is: {totalSurfaceArea:.2f} square meters")
print(f"The volume of the cylinder is: {volume:.2f} cubic meters")

time.sleep(10)
os.system('cls' if os.name == 'nt' else 'clear')
sys.exit()
