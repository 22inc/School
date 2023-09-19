import turtle
import random
import math
import math
import os
import datetime

currentDate = datetime.datetime.now()

os.system('cls' if os.name == 'nt' else 'clear')

print("Hello my name is Malik, I will be the painter for you today.")
print("Todays date is: " + str(currentDate))

# Prompt the user for the number of small stars
numSmallStars = int(input("\nEnter the number of small stars to create the big circle shape: "))

# Prompt the user for star size and color
starSize = int(input("Enter star size (10-50): "))
starColor = input("Enter star color (e.g., 'yellow', 'blue', 'red'): ")

# Initialize the Turtle Graphics environment
turtle.speed(0)
turtle.bgcolor("black")

# Function to draw a star with random rotation
def drawStar(size, color):
    turtle.color(color)
    for _ in range(5):
        turtle.forward(size)
        turtle.right(144)

# Function to draw a big circle shape with small stars
def drawBigCircleShape(numStars, size, color):
    for i in range(numStars):
        angle = 360 / numStars * i
        x = size * 2 * math.cos(math.radians(angle))
        y = size * 2 * math.sin(math.radians(angle))
        turtle.penup()
        turtle.goto(x, y)
        turtle.pendown()
        drawStar(size // 2, color)  # Draw small stars
        turtle.penup()
        turtle.goto(0, 0)  # Return to center
        turtle.pendown()

# Draw the big circle shape with small stars
drawBigCircleShape(numSmallStars, starSize, starColor)

# Close the Turtle Graphics window when done
turtle.done()

# Creates a big circle depending on inputs.
# Creative Commons Attribution-NonCommercial 4.0 International
# Do not reupload without significant changes, do not use in ANY way for commercial ventures.