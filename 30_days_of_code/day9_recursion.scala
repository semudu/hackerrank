/* Day 9: Recursion */
object Solution {

    def factorial(n:Int):Int = n match {
        case 0 => 1
        case _ => n * factorial(n-1)
    }
    
    def main(args: Array[String]) {
        val n = io.StdIn.readInt
        println(factorial(n))
    }
}