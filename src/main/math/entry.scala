package main.math

import scala.util._
import scala.math._

object entry {

  def main(args: Array[String]): Unit = {

    val smp = new dist(10000, "f")
    println(smp.ds.toList.max)
    println(smp.ds.toList.min)
    println(smp.mean)
    println(smp.variance)

  
    var frame = new javax.swing.JFrame("Network Graph")
    var applet = plot
    frame.getContentPane().add(applet)
    applet.init
    frame.pack
    frame.setVisible(true)



  }

}