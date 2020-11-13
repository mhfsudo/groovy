/*
 * Groovy funktioniert aber auch ohne Java Syntax
 */

System.out.println("Hello Groovy")      //Output Hello Groovy

println("Hello Groovy")                 //Output Hello Groovy

println "Hello Groovy"                  //Output Hello Groovy

println 'Hello Groovy'                  //Output Hello Groovy

String name = 'Lisa'
println "Mein Name ist ${name}"         //Output Mein Name ist Lisa

println "Mein Name ist $name"           //Output Mein Name ist Lisa

//Groovy erkennt den Datentyp automatisch
def lastName = 'Simpson'
println "Mein Nachname ist $lastName"   //Output Nachname ist Simpson

def value = true
println value.getClass().getName()      //Output java.lang.Boolean