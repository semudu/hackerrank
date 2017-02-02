/* Day 3: Intro to Conditional Statements */
object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var N = sc.nextInt();
        sc.close()
        if((N % 2 == 0 && ((6 to 20).contains(N))) || N % 2 != 0) {
           println("Weird")
        }else{
           println("Not Weird") 
        }
           
    }
}
