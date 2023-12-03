package classes

class Person {
    var name: String = "JH"
    var age: Int = 30
    var country: String = "south korea"
    var height: Int = 150
    var weight: Int = 30

    fun sayHello() = println("hi")

    fun introduce() = println("I'm $name and my age is $age")
}