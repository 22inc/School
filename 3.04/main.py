import turtle as t
import random
import math
import math
import os
import datetime

currentDate = datetime.datetime.now()

os.system('cls' if os.name == 'nt' else 'clear')

print("Hello my name is Malik, I will be the painter for you today.")
print("Todays date is: " + str(currentDate))
print("This is Sunny Days!")

# Set up the screen
t.bgcolor("lightblue")
t.title("Sunny Days")

# Function to draw a rectangle
def drawRectangle(width, height, color):
    t.fillcolor(color)
    t.begin_fill()
    for _ in range(2):
        t.forward(width)
        t.left(90)
        t.forward(height)
        t.left(90)
    t.end_fill()

# Function to draw a triangle
def drawTriangle(base, height, color):
    t.fillcolor(color)
    t.begin_fill()
    t.forward(base)
    t.left(135)
    t.forward(height)
    t.left(90)
    t.forward(height)
    t.left(135)
    t.forward(base)
    t.end_fill()

# Function to draw a tree
def drawTree():
    # Tree trunk
    t.penup()
    t.goto(200, -80)  # Move the tree trunk to the right
    t.pendown()
    drawRectangle(20, 60, "saddlebrown")

    # Tree leaves
    t.penup()
    t.goto(160, -20)  # Move the tree leaves to the right
    t.pendown()
    drawTriangle(100, 80, "darkgreen")

# Draw the house
t.penup()
t.goto(-80, -80)
t.pendown()

# Base of the house
drawRectangle(160, 100, "lightyellow")

# Roof of the house
t.penup()
t.goto(-80, 20)
t.pendown()
drawTriangle(160, 110, "red")

# Door
t.penup()
t.goto(-20, -80)
t.pendown()
drawRectangle(40, 80, "brown")

# Windows
t.penup()
t.goto(-60, -20)
t.pendown()
drawRectangle(20, 20, "yellow")

t.penup()
t.goto(40, -20)
t.pendown()
drawRectangle(20, 20, "yellow")

# Draw the sun higher and to the right
t.penup()
t.goto(100, 160)  # Adjusted coordinates for the sun
t.pendown()
t.color("yellow")
t.begin_fill()
t.circle(40)
t.end_fill()

# Draw the tree
drawTree()

# Hide the turtle
t.hideturtle()

# Close the window on click
t.exitonclick()

# Creates a house.
# Creative Commons Attribution-NonCommercial 4.0 International
# Do not reupload without significant changes, do not use in ANY way for commercial ventures.