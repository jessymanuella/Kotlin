//Create a function that takes two integers and displays their sum
fun add_numbers(a:Int,  b:Int ): Int
{
    return a+b
}

fun main()
{
    val number=5; 
    val number2=6;
    val result = add_numbers(number,number2);
    println(" The result is $result")
}