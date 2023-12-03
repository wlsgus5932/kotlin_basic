package variable

class DataTypeSample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //Number Type
            val number1 = 123
            val number2 = 123L
            val number3 = -123
            val number4: Long = 123

            //Any Type = Object Type
            val number5: Any = 123
            //number5는 Any타입이라 형변환이 가능하지만 val 불변타입 선언이기에 변경 불가능
            //number5 = "형변환"
            val number6 = 123.456
            val number7: Double = 123.456
            val number8: Float = 123.456F

            //Logical Data Type
            val isTrue = true
            val isFalse: Boolean = false
            var isFalse2: Any = false

            //Any 형변환 가능
            isFalse2 = 32

            //Character, String Data Type
            val character = 'a'
            println(character)
            println(character + 1) //b 출력

            val string1 = "text"
            val string2: Any = "text"
            




        }

    }
}