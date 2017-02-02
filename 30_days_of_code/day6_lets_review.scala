/* Day 6: Let's Review */
object Solution {

    def main(args: Array[String]) {
 
        val T = io.StdIn.readInt()
        var On:Array[String] = new Array[String](T)
        for(i<-0 until T){
            var S = io.StdIn.readLine()
            var O = ""
            for(j <- (0 until S.length).by(2)){
                O+=S(j)
            }
            O +=" "
            for(j <- (1 until S.length).by(2)){
                O+=S(j)
            }
            On(i) = O
        }
        
        for(i<- 0 until T){
            println(On(i))
        }
        
        
    }
}