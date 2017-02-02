/* Day 5: Loops */
object Solution {

    def main(args: Array[String]) {
        val n = io.StdIn.readInt()
        for(i <- 1 to 10){
            println(n + " x " + i + " = " + n*i)
        }
            
    }
}

