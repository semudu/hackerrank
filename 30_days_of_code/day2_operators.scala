object Solution{
    def main(args:Array[String]){
        
        val mealCost = scala.io.StdIn.readDouble()
        val tipPercent = scala.io.StdIn.readInt()
        val taxPercent = scala.io.StdIn.readInt()
            
        val tip = mealCost * tipPercent / 100
        val tax = mealCost * taxPercent / 100
            
        val totalCost = mealCost + tip + tax
        
        println("The total meal cost is " + scala.math.round(totalCost) + " dollars.")
        
        
    }
}