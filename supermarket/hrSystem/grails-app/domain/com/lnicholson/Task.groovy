package com.hr

class Task {
String taskName

int numberOfPeople

String sectionName

String timeRequired

String description

String department

String taskCompleted


    static constraints = {
taskName blank:false, size:1..50

numberOfPeople blank:false, size:1..3

sectionName blank:false, size:1..50

timeRequired blank:false, size:1..9

description blank:false, size:1..300

department blank:false, size:1..20

taskCompleted size:1..5

    }
}
