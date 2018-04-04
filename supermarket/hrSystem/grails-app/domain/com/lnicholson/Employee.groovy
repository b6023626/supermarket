package com.lnicholson

class Employee {

String fullName

Date dateOfBirth

String residence

double hourlyRate

Date dateEmployed

String taxCode

String contract

String employeeID

Team team

    static constraints = {

fullName size: 5..50, blank: false

dateOfBirth blank: false

residence blank:false, size:1..100

hourlyRate blank:false

dateEmployed blank:false

taxCode blank:false, size:1..30

contract blank:false, size:4..11

employeeID blank:false, size:2..11, unique:true

    }



}
