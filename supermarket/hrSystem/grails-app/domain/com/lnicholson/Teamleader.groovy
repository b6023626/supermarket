package com.hr

class Teamleader {
String fullName

String department

String sectionName

int officePhone

String employeeEmail

int employeeID

String password


    static constraints = {
fullName blank:false, size:1..15

department blank:false, size:1..10

secionName blank:false, size:1..15

officePhone blank:false, size:1..12

employeeEmail blank:false, size:1..50

employeeID blank:false, size:1..11

password blank:false, size:1..18

    }
}
