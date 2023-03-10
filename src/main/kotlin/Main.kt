fun main() {
    var car = Car("Nissan", "matatu", "teal", 30)
    car.carry(35)
    car.identity()
    var result=car.calculateParkingFees(20)
    println(result)

    var bus=Bus("Toyota","mini","red",40)
    bus.carry(40)
    bus.identity()
    var busFees=bus.calculateParkingFees(25)
    println(busFees)
}


open class Car(var make:String, var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people-capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Overcapacity by $x people")
        }
    }

    fun identity(){
        println("I am a $color $make $model")
    }
      fun calculateParkingFees(hours:Int):Int{
        var fees=hours*10
          return fees
    }
 }
class Bus(make:String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
    
}

