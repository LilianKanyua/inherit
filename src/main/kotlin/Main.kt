fun main() {
    var car = Car("Subaru", "Legacy", "teal", 30)
    car.carry(35)
    car.identity()
    println(car.calculateParkingFees(30))


    var bus=Bus("Nissan","matatu","red",40)
    bus.carry(40)
    bus.identity()
   println(bus.calculateParkingFees(25))
   println( bus.maxTripFare(100.00))

}


open class Car(var make:String, var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Overcapacity by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }


    open fun calculateParkingFees(hours: Int): Int {
        var fees=hours*10
        return fees
    }

}
 class Bus( make:String,model: String,color: String,capacity: Int):Car(make,model,color,capacity) {
    override fun calculateParkingFees(hours: Int): Int {
         var busFees = hours * capacity
         return busFees
     }

     fun maxTripFare(fare: Double): Double {
         var max = fare * capacity
         return max
     }
 }


