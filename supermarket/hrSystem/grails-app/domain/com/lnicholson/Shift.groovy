package com.hr

class Shift {
double timeOfDay

String dayOfWeek

int numberOfHours

double startingTime

    static constraints = {
timeOfDay blank:false

dayOfWeek blank:false, size:5..10

numberOfHours blank:false, size:1..5

startingTime blank:false
    }
}
