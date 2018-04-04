package com.lnicholson

class Manager {
String fullName

String userName

String password

String employeeEmail

String office

String department


    static constraints = {
fullName blank:false, size:1..50

userName blank:false, size:1..16, unqiue:true

password blank:false, size:1..18

employeeEmail blank:false, size:5..50, email:true

office blank:false, size:1..10

department blank:false, size:1..15

    }
}
