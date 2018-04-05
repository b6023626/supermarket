package com.lnicholson

class Shift {
String timeOfDay

String dayOfWeek

int numberOfHours

double startingTime

    static constraints = {
timeOfDay blank:false, size:1..15

dayOfWeek blank:false, size:5..10

numberOfHours blank:false, size:1..5

startingTime blank:false
    }
}

