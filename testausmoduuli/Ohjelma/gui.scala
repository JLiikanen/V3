package Ohjelma

object gui extends App {

  this.run()


  private def run() = {
    var i = 0
    while (i < 5){
    println("MOIKKA")
      if (i == 4)
        println("Viimeinen moikka!")
      i += 1
    }
  }

}
