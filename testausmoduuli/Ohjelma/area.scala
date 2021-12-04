package Ohjelma

abstract class area {

  def returnName : String

  def speak() : Unit = println("MOooi!")


}

class Forest extends area {

  def returnName = "Mettä"

  this.speak()

}