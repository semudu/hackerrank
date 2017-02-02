object Solution {

    def main(args: Array[String]) {

        val n = io.StdIn.readInt
        val phoneBook = List.fill(n)(io.StdIn.readLine.split("\\s+").take(2) match {case Array(x,y) => (x,y)}).toMap 
        val names = Iterator.continually(io.StdIn.readLine).takeWhile(x => (x != null && !x.isEmpty)).toList
        
        names.map(n=>(n,phoneBook.get(n))).foreach(t=> t match{
            case (n,Some(x)) => println(s"$n=$x")		
            case (n,None) => println("Not found")
         })

    }
}