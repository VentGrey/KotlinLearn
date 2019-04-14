fun main(args: Array<String>) {

    // Infered types
    var MyString = "Hello World" // String
    var MyInt = 2 // Integer
    var MyFloat = 2.0 // Floating point number

    // Strong types
    var MyWorld: String = "Hello Jupiter"
    var MyInteger: Int = 4
    var MyFloatingPoint: Float = 4F

    // Any of these variables can mutate at anytime
    MyString = "Hello Earth"
    MyInt = 4
    MyFloat = 3.0

    // Val types cannot change as it is related to functional programming
    val InmutableString: String = "Hello I cannot mutate"
    val InmutableInt: Int = 56
    val InmutableFloat: Float = 34F

    // Printing variable declarations
    println(MyString)
    println(MyInt)
    println(MyFloat)
    println(MyWorld)
    println(MyInteger)
    println(MyFloatingPoint)
    println(InmutableString)
    println(InmutableInt)
    println(InmutableFloat)

    // Basic data types

    // Number types (Their value is their bit-width)
    var DoubleType: Double = 64.0
    var FloatType: Float = 32F
    var LongType: Long = 64L
    var IntType: Int = 32
    var ShortType: Short = 16
    var ByteType: Byte = 8

    // Print Numbers
    println(DoubleType)
    println(FloatType)
    println(LongType)
    println(IntType)
    println(ShortType)
    println(ByteType)

    /*
    Literal constants for integral values

    Decimals: 123
        - Longs are tagged by a capital L: 123L
    Hexadecimals: 0x0F
    Binaries: 0b00001011
    OCTALS ARE NOT SUPPORTED (NO ONE USES THEM ANYWAYS)

     */

    /*
    Explicit conversions:
    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()
     */

    // Char type
    var c: Char = 'o'
    println(c)

    // Boolean type
    var bul: Boolean = true // false
    println(bul)
    /*
    Boolean operators:
    || OR
    && AND
    ! NOT
     */

    // Arrays (The fucking weirdest arrays I've ever seen)
    var x: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10) // Array of integers
    println(x)
}