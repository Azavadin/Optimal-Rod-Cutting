# Optimal-Rod-Cutting

A company is in the business of buying rods in wholesale, cutting it, and
selling the pieces in the retail market. The market fluctuates and the price 
for different sizes of rods changes by the day. Here's where we come in, the
company wants our help to know how much maximum money they can make, and how 
to cut the rods of a given length to get that maximum money.

For example, if the rods of various lengths sell at the following prices on
a given day:

Inch   price
1       $1
2       $1
3       $2
4       $3
5       $4
6       $5
7       $5
8       $9
9       $9
10      $10

Cutting a 20 inches rod into ten pieces of 2 inches each will only get them 
$10. However, if they cut it into 6 pieces of two 8-inches, and four 1-inches
will get them $22. There may be other combinations that produce better price.
The additional challenge is the prices fluctuate each day.

We're asked to write a program, but in a way the algorithm for computing
the sizes can be changed.

Write a class RodCutter that will take the various lengths and their prices.
Then write one method on the class, cutRod that takes a length as parameter
and returns two things - maximum price the company can expect and the
size of the rods that they should cut the given length to get that price.
For example, if the input parameter is 2 (and the prices are as above),
then the output will be $2 and the sizes will be 1, 1 (for 2 pieces).

First write the class RodCutter so it works with a simple algorithm.
Then (and only after fully completing the above, not before), create another
version of RodCutter that will use techniques to shorten the
time to compute the result. The two versions must produce the same result,
just their computations efficiencies must be different.

Write a test to verify that the time taken by the second implementation is at least an order of magnitude faster than the first solution.

After you complete the program, answer the following questions:

1. What design principles did you use in this program? Explain each
and specify the classes that participated.

DRY (Do not repeat yourself): DRY principle is stated as "Every piece of knowledge must have a single, unambiguous, authoritative representation within a system". DRY principle is used in every class of our program. For Example, Let's say we are writing various test cases for various classes, like let's say for the RodCutterTest class. Rather than duplicating the code, again and again, we initialize various objects in the setup method which avoids duplicity at multiple places. Instead of initializing the same things in each test, it becomes much easier and more convenient to just do it once and makes the code simple and maintainable.


SRP (Single Responsibility principle): The single responsibility principle helps us to make sure that each class should have only one single reason to change. In our program, we have made sure that each of our classes follows SRP. For example, in PerformanceTest.java class we are only handling a single responsibility which is testing the performance of both the RodCutter and RodCutterOptimal classes.


OCP (Open Closed Principle): The open closed principle helps us to make sure that the software entities should be open for extension, but closed for modification. In our assignment, we have observed that we have not made any changes to the existing code. Besides every time we are adding bits of new code which integrates with the existing code without altering/modifying the base code. This, in turn, facilitates open closed principle.

For Example, In our program, we have two RodCutter classes. Here we extend RodCutter class to get RodCutterOptimal class without altering the RodCutter class.

2. What design patterns did you use in this program? Explain each
and specify the classes that participated.

Cascade method pattern:

The design pattern which we used in this program is the Cascade method pattern. In cascade method pattern, each method returns an object, allowing the calls to be chained together in a single statement without requiring variables to store the intermediate results. 

For Example, for every call to the cutRod() method, there are several iterations which take place in the cutRod method in order to calculate the maximum rod price and the lengths which constitute that price. Using the cascade method pattern, it offers a very easy and effective method to find the desired result.

Factory Method Pattern:

We have also used the Factory Method Pattern in our program which is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory methodóeither specified in an interface and implemented by child classes or implemented in a base class and optionally overridden by derived classesórather than by calling a constructor.

For Example, In RodCutterTest we use cutRod() method, it is overridden by RodCutterOptimal, so the test methods don't know the RodCutter they are testing is a RodCutter or RodCutterOptimal.
