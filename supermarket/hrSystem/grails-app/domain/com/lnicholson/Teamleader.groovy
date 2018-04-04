package com.lnicholson

class Teamleader {
String fullName

String department

String sectionName

int officePhone

String employeeEmail

String employeeID

String password


    static constraints = {
fullName blank:false, size:1..15

department blank:false, size:1..10

sectionName blank:false, size:1..15

officePhone blank:false, size:1..12

employeeEmail blank:false, size:1..50, email:true

employeeID blank:false, size:1..11, unique:true

password blank:false, size:1..18

    }
}
