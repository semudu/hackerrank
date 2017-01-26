object Solution {

    def primeFactorCount(n:Int):Int = {
        var count = 0
        var k = n
        var i = 2

        while(k>1 && i<=k){
            while(k % i == 0){
                k /= i
                count += 1
            }
            i += 1
        }

        count
    }
    
    def main(args: Array[String]) {
        
        var N = 0
        var Y = 0
        val T = io.StdIn.readInt()
        var games = new Array[Int](T)
        for(i <- 0 until T){
            var turnCount = 0
            N = io.StdIn.readInt()
            if(N>0){
                    var h:Array[Int] = io.StdIn.readLine.split(" ").map(_.toInt)
                    
                    for(hi <- h){
                        turnCount^=primeFactorCount(hi)
                    }   
                
            }
            games(i) = if (turnCount  == 0) 2 else 1
            
        }
        
        for(game <- games)
            println(game)
        
    }
}