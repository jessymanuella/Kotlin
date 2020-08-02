//Create a function that takes an integer n and returns n times 10
fun ten_times(n: Int)
{
    for (i in 1..n) {
        println(n*10)
    }
}
fun main()
{
    ten_times(5)
}