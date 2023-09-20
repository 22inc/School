import turtle as t
import random
import math
import os
import datetime

currentDate = datetime.datetime.now()

os.system('cls' if os.name == 'nt' else 'clear')

print("Hello my name is Malik, I will be the painter for you today.")
print("Todays date is: " + str(currentDate))
print("\nThis is Sunny Days!")

# Set up the screen
screen = t.Screen()
screen.bgcolor("lightblue")
screen.title("Sunny Days")

# Create a turtle
painter = t.Turtle()

# Function to draw a rectangle
def drawRectangle(width, height, color):
    painter.fillcolor(color)
    painter.begin_fill()
    for _ in range(2):
        painter.forward(width)
        painter.left(90)
        painter.forward(height)
        painter.left(90)
    painter.end_fill()

# Function to draw a triangle
def drawTriangle(base, height, color):
    painter.fillcolor(color)
    painter.begin_fill()
    painter.forward(base)
    painter.left(135)
    painter.forward(height)
    painter.left(90)
    painter.forward(height)
    painter.left(135)
    painter.forward(base)
    painter.end_fill()

# Function to draw a tree
def drawTree():
    # Tree trunk
    painter.penup()
    painter.goto(200, -80)  # Move the tree trunk to the right
    painter.pendown()
    drawRectangle(20, 60, "saddlebrown")

    # Tree leaves
    painter.penup()
    painter.goto(160, -20)  # Move the tree leaves to the right
    painter.pendown()
    drawTriangle(100, 80, "darkgreen")

# Draw the house
painter.penup()
painter.goto(-80, -80)
painter.pendown()

# Base of the house
drawRectangle(160, 100, "lightyellow")

# Roof of the house
painter.penup()
painter.goto(-80, 20)
painter.pendown()
drawTriangle(160, 110, "red")

# Door
painter.penup()
painter.goto(-20, -80)
painter.pendown()
drawRectangle(40, 80, "brown")

# Windows
painter.penup()
painter.goto(-60, -20)
painter.pendown()
drawRectangle(20, 20, "yellow")

painter.penup()
painter.goto(40, -20)
painter.pendown()
drawRectangle(20, 20, "yellow")

# Draw the sun higher and to the right
painter.penup()
painter.goto(100, 160)  # Adjusted coordinates for the sun
painter.pendown()
painter.color("yellow")
painter.begin_fill()
painter.circle(40)
painter.end_fill()

# Draw the tree
drawTree()

# Hide the turtle
painter.hideturtle()

# Close the window on click
screen.exitonclick()
