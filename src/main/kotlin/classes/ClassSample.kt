package classes

fun main() {
    val aMan = Person()
    aMan.sayHello()
    aMan.introduce()

    aMan.age = 55
    println("sorry, my real age is ${aMan.age}")

    println("====================")

    val jedi = PersonWithConstructor("jedi", 150)
    val flature = PersonWithConstructor("flature")
    val garry = PersonWithConstructor("garry", 15, "추가값")

    jedi.sayHello()
    jedi.introduce()

    flature.sayHello()
    flature.introduce()

    garry.sayHello()
    garry.introduce()
}