package com.lnicholson

class Team {
String teamName

int numberOfEmployees

String description

String sectionName

static hasMany=[tasks:Task, teamleader:Teamleader]

    static constraints = {

teamName blank:false, size:1..20

numberOfEmployees blank:false, size:1..3

description blank:false, size:1..300

sectionName blank:false, size:1..10

    }
String toString(){
return teamName
}
}
