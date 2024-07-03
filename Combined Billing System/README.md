## Combined Billing System

Description
The Combined Billing System is a Java application designed to generate bills for water, gas, electricity and telecommunication. The system creates billing files that include detailed information about the customer's usage and corresponding charges.

File Contents
Each billing file contains the following information:

cid: Customer ID
name: Customer Name
eUnits: Electricity Units Consumed
gUnits: Gas Units Consumed
wUnits: Water Units Consumed
InternetGB: Internet Usage in GB
LocalMin: Local Call Minutes
InternationalMin: International Call Minutes
EBill: Electricity Bill Amount
GasBill: Gas Bill Amount
WaterBill: Water Bill Amount
PhoneBill: Phone Bill Amount

Getting Started

Prerequisites
Java Development Kit (JDK) installed on your machine.
An Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse.
Installation
Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/your-username/Combined-Billing-System.git
Open the project in your preferred IDE.

Build the project to resolve dependencies and compile the code.

Running the Application
Navigate to the main class (e.g., template.java).

Run the main class to start the application.

Follow the on-screen instructions to generate billing files for customers.

Usage
Input Customer Data: Enter the customer ID, name, and usage details for electricity, gas, water, internet, and phone services.

Generate Bills: The application calculates the bill amounts for each service based on the provided usage data.

Save to File: The generated bills are saved to a file with the specified content format.
