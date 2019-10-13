# Hotel-Booking
> Calculate Best Hotel Rates.


Application that calculates best rates of a hotel chain for chosen data and type of customer (Regular or Reward).


## Getting Started

To run the application you must have installed:

```sh
 Java8 (https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
```

## Features

This application receives a text file with information about customer type and reservation dates. Taking into account a hotel chain that offers different pricing for businessday, weekend and customer type (Regular customer or Rewards customer). The application calculates the lowest available rate and uses the hotel rating as a tiebreaker. The application should be run from the command line only.


## Design

The application was designed by creating the `Hotel` class, which contains the attributes of name, rating and rate types.

The `FileHelper` class receives the reservation information through a text file. Auxiliary methods have been created to manipulate the received string and extract the customer type data and their dates of stay.

The `DateHelper` class has methods designed to manipulate incoming date strings, converting them to Date type, and validating if the dates are weekend.

The `PriceCalculator` class has methods that use the data manipulated by `DateHelper` class auxiliary methods and perform the calculation to find the best rates from input and `Hotel` class information.

`MainClass` is responsible for executing the application, instantiating the other classes and returning the hotel name with the best rates.

Unit tests were created using `JUnit5`.

## Configuration

The application receives as input a text file (one line) with the information in the following format:

```sh
<clientType>: <date1>, <date2>, <data3>, …
```

```sh
Example: 
Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
```
The text file must be in the same folder as the application .jar file and has to be named as:

```sh
file.txt
```

To run the application from the command line, go to the directory and folder where the .jar file is located and type the following command:

```sh
java -jar flaviaDessoldi_hotelBooking_2019.jar
```

## Meta

Flavia Giovana Dessoldi – [@FlaviaDessoldi](https://www.linkedin.com/in/flavia-dessoldi/) – flavia.dessoldi@gmail.com


