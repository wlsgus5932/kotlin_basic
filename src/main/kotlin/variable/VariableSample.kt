package variable

class VariableSample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            /*
             * val 불변 (value 약어)
             * var 가변 (variable 약어)
            */
            val name :String = "Flature"
            val org = "bubaum"
            var age = 12

            //변경불가능
            //org = "bubaum2"

            //변경가능
            age = 15

            println("name: ${name} ")
            println("org: ${org}")
            println("age: $age")
        }
    }
}