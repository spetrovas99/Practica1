# Practica1
Práctica de Java.

# How does it work.

I have created 9 classes, with different methods each one.
### Products:
The Product class have as attributes name, productId, stock, price, price (premium price), pricenop (non-premium price) and enum money that includes dollar, euro, pound.
- The getMny method of type string in which you print the symbol depending on the currency.
- The changeMoney method that has as parameters the origin currency  and the destination currency. It serves to change the currency in a conventional way if the user wishes it.
- The stats method prints the data about that product and checks if it has stock, if it does not have it, it will not let you buy it. 
- The time method is to establish a maximum delivery date, by default it is 15 days.
### Category:
The categories have only one attribute, the name, and two ArrayList. One for all the categories (static) and the other for the products of each category.
- The printProducts method print the products of one category.
- The printCategoty method print all the categories.
- The searchCategory method the search category method searches all the categories for any match with the name that the user has entered by keyboard.
- The searchProducts method works the same as the searchCategory method but at the time of implementing it, the category is searched first and then the product.
### User:
The User class have as attributes name, email,login, password, premium , credit and one ArrayList one for the products of users.
- The sign_up method the user enters the login and password by keyboard. In addition, the program asks if you want to be premium. If you say yes, you have to enter the credit card, we do this so that when you buy a product you will not be charged for shipping costs that are 10% of the final price of the product.
- The error method notifies you if you have miswritten the email or if your password or login has a length less than 7.
- The code method  compares the code entered by the user and the code received in the mail (file). you will not be able to access the app until you enter the correct code.
- The printUserProducts method only print the products that the user buy with the price.
- The buy method show you a summary with your puchase and ask if you want to change the currency.
### Menu:
Is a menu with 6 options (search product, search category, buy, show catalog, show my product list and close)
- When you select the opcion of buy , first you should introduce the name of the category then , the name of the product and then the program ask you if you want to buy it.
- The opcion of show catalog only show you the name of all the categories created.
**It is recommended before buying a product to know what categories exist**
- the lastest option is close, it serves to close session in the application.
### Main:
I create different categories and within the categories several products.
I call the functions sign_up to register the two files that I create in the class file and finally the menu explained above.
### File:
I created a simulator of email with files.
- The first method is used to register, a random code of 5 numbers is created, in which the user has to enter later to verify the account.
- The second method(mail) only serves to wellcome the user.
- The tiquet method is like a recipt for each product that user buys.
