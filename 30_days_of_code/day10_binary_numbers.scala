object Solution {

    def main(args: Array[String]) {
        var  max = 0
        var  sum = 0
         
        var n = io.StdIn.readInt
        while(n>1){
            if(n%2 == 1) {
                sum += 1
            } else {
                if(sum>max) max = sum
                sum = 0
            }
            n/=2
        }
        
        sum += n
        if(sum>max) max = sum
        println(max)
        
    }
}

