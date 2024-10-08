# Store-Management-Project
My Project is for Unit 2 APCSA 
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](![alt text](image.png))

## Description

For my project, I created a fast-food restaurant management system that tracks products like burgers and hotdogs. The program uses object-oriented principles, with a superclass called Food that holds common attributes such as name, price, calories, and bun type. Two subclasses, Burger and Hotdog, extend the superclass and introduce specific attributes like meatType and hasCheese for burgers, and sausageType and hasMustard for hotdogs. Accessor and mutator methods allow modification of these attributes, and each class has its own toString() method to display the state of the objects. This system provides a basic yet flexible structure to manage fast-food items efficiently.