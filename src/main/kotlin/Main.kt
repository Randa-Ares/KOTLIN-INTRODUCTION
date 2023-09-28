fun main(args: Array<String>) {
    println("What is your name?")
    val name = readln()
    println("Hello,$name")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

//    TASK 2
    println("Printing task 2y")

    print("Enter a number: ")
    // Reads lines from standard input - keyboard
    // and !! ensures the input is not null
    val stringInput = readLine()!!
    // converts the string input to integer
    var integer:Int = stringInput.toInt()
    // printIn prints the following line to the output screen
    println("You entered: $integer")

//    TASK 3

    val first: Int = 10
    val second: Int = 20

    val sum = first + second

    println("The sum is : $sum")

//    TASK 4
    println("Printing task 4")

    val year = 1900
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            //year is divisible by 400, hence a leap year
            leap = year % 400 == 0
        }else
            leap = true
    }else
        leap = false
    println(if (leap) "$year is a leap year." else "$year is not a leap year.")

//   TASK 5

    println("Printing task 5")

    val ch = 'z'

    when(ch) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }
}
