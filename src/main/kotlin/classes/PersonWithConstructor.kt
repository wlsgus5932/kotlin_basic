package classes

class PersonWithConstructor constructor(private val name:String, private val age:Int) {//주생성자
    private var etc: String = "no value"

    init {
        println("initializer block : $etc")
    }

    constructor(name: String) : this(name, 15) // 부생성자

    constructor(name: String, age: Int, etc: String) : this(name, age) { //추가 생성자
        this.etc = etc
        println("additional constructor is called ${this.age}")
    }

    fun sayHello() = println("hi")

    fun introduce() = println("I'm $name and my age is $age")


}