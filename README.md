# Java Music Exchange
A Java App for a Music Shop that sells various musical instruments. The app was created using test driven design principles. To test the app run all tests using IntelliJ IDE.


The objective of this app was to demonstrate thes use of the following in Java:
* Abstract classes
* Concrete classes
* Interfaces
* Enums

## The app carries out the following:
* Uses abstract class Instrument as the parent class for all instrument types (i.e. piano, guitar).
* Uses enums for instrument type (i.e. woodwind, keyboard)
* Uses abstract class Items as the parent class to all items in the shop (i.e. large drum set).
* Uses Interface IPlay for all instruments to ensure they have a play mehtod.
* Uses interface ISell for all shop items to ensire they have a method to calculate their markup.
* Uses Class Shop to encapsulate all instruments and items. Shop class also has a method to calculate potential profit from all items in stock.
