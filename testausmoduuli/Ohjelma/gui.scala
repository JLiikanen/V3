package Ohjelma

import gui._
import scala.io.StdIn.readLine

object gui extends App {

  val command = ""



  this.run()

  private def run() = {
    var i = 0
    while (i < 5){
     println("MOIKKA")
     this.encounter()
      if (i == 4)
        println(command)
      i += 1
    }
  }

  private def encounter() = {
     println("HEI! Se olen minä!")
     val command = readLine()
  }

}



