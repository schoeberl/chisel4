package example

import chisel4._

class Add extends Module {

}

object Add extends App:
  println("Hello Chisel4")
  val m = new Add()
  emitHardware(m)
