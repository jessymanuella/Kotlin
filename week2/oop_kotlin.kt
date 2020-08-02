/*
Lab 5:
Create a class Programmer
Define two properties for a Student.(name and yearOfExperience)
Define a method returning the name of the student.
Define a method returning the years of experience of the programmer.
*/
class Programmer(var name: String,var yearOfExperience: Int)
{
    fun displayName(): String
    {
        return name
    }
    fun yearExperience(): Int
    {
        return yearOfExperience
    }
}
 fun main()
 {
     val programmer = Programmer("Frank", 2)
     print(" The programmer name is ${programmer.displayName()}")
     print(" and he/she has ${programmer.yearExperience()} year(s) of experience")
 }