object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = Array.ofDim[Int](6,6);
        for(arr_i <- 0 until 6) {
           for(arr_j <- 0 until 6){
              arr(arr_i)(arr_j) = sc.nextInt();
           }
        }

        var max = -9*8
        var sum = 0
        for(arr_i <- 0 until 4){
            for(arr_j <- 0 until 4){
                for(arr_k <- 0 until 3){
                    for(arr_l <- 0 until 3){
                        if(!(arr_k == 1 && (arr_l == 0 || arr_l == 2)))
                            sum += arr(arr_k + arr_i)(arr_j + arr_l)
                    }
                }
                if(sum>max) max = sum
                sum = 0
            }
        }

        println(max)

    }
}