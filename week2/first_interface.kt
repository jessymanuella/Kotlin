/*
Lab 6:
What is an interface?  is an abstract type that is used to specify a behavior that classes must implement.
Create an interface MyInterface with a method display
*/

interface MyInterface
{
    fun display():String
}

class InterfaceImp: MyInterface
{
    override fun display() = "Done"
}

fun main()
{
    val test = InterfaceImp()
    println(test.display())
}