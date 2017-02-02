/* Day 4: Class vs. Instance */
class Person() {

    var age: Int = 0

    def this(initialAge:Int) = {
        // Add some more code to run some checks on initialAge
        this()
        if(initialAge<0){
            println("Age is not valid, setting age to 0.")
        }else{
            age = initialAge
        }
    }        

    def amIOld(): Unit = {
       // Do some computations in here and print out the correct statement to the console 
       if(age<13){
           println("You are young.")
       }else if(age<18){
           println("You are a teenager.")
       }else{
           println("You are old.")
       }
    }

    def yearPasses(): Unit = {
        age+=1
    }  

}