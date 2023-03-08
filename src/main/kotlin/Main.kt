fun main(){
    var car= Car("toyota","legacy","grey",10)
    car.carry(15)
    car.identity()
    println(car.calculateParkingFees(70))
    var bus = Bus("bus","golden","yellow",40)
    bus.carry(45)
    bus.identity()
    println(bus.calculateParkingFees(24))

}
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
 open class Gari(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {


        var final = people - capacity
        if (people <= (capacity)) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $final people")
        }
    }
    ////- identity() : Prints out the color, make and model in the following
    ////format e.g: “I am a white subaru legacy”
    fun identity(){
        println("I am a white toyota legacy ")
    }
    //- calculateParkingFees(hours: Int) : Calculates and returns the
    //parking fees by multiplying the hours by 20
    fun calculateParkingFees(hrs:Int): Int{
        var product = hrs * 20
        return product
    }

}

class Car( make:String, model:String, color:String, capacity:Int): Gari(make, model, color, capacity){
}
//Craeate a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
class Bus(var make:String,var model:String,var color:String,var capacity:Int) {
   fun carry(people: Int) {
       var final = people - capacity
       if (people <= (capacity)) {
           println("Carrying $people passengers")
       } else {
           println("Over capacity by $final people")
       }
   }
   fun identity(){
       println("I am a yellow bus golden")
        }
      fun calculateParkingFees(hrs: Int): Int {
            var product = hrs * 20
           return product
       }

        fun maxTripFare(fare: Double): Double {
            var product = fare * 30
            return product
        }
    }
//}
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.
