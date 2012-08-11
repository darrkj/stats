package main.math

import processing.core._
import main.resources
import scala.math._

object plot extends PApplet{



 
  
  override def setup(): Unit = {
    size(1200, 1200) 
  }

 
  override def draw(): Unit = {

    val pic = loadImage("/src/main/resources/Darrell.jpg")
    image(pic, 25, 25)

  } //end draw
}


