package math

import scala.math._
import scala.util._

class dist(val y: Int, pdf: String) {

  val length = y
  
  def rand(x: Int) =  (for (z <- (1 to x)) yield Random.nextDouble()).toArray
  val ds = rand(length)
  
  def qrand(x: Int) =  (for (z <- (1 to x)) yield Random.nextGaussian()).toArray
  val dt = qrand(length)
  
  def normal(x: Int, mean: Double, stddev: Double): Array[Double] = {
	  qrand(x).toList.map(_ * stddev + mean).toArray
  }
  
  def uniform(x: Int, min: Double, max: Double): Array[Double] = {
	  rand(x).toList.map(_ * (max - min) + min).toArray
  }

  def expon(x: Int, lambda: Double): Array[Double] = {
	  rand(x).toList.map(1 - _).map(-Math.log(_)/lambda).toArray
  }
  
  def mean(): Double = ds.sum / ds.length

  def variance(): Double = {
	  val xbar = mean()
	  ds.toList.map(_ - xbar).map(Math.pow(_, 2)).sum / (ds.length)
  }
  
  //can wrap some pattern matching or if statment around this to get 
//boolean, float, int, long, string, Guassian, PrintableChar


 


/*
rand(50).sortWith(_ < _)

val x = normal(100, 5, 1)
val z = normal(100, 0, 1)*/
}