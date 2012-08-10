package math

object entry {

  def main(args: Array[String]): Unit = {
    import scala.util._
import scala.math._

//can wrap some pattern matching or if statment around this to get 
//boolean, float, int, long, string, Guassian, PrintableChar

def rand(y: Int) =  (for (z <- (1 to y)) yield Random.nextDouble()).toArray

def qrand(y: Int) =  (for (z <- (1 to y)) yield Random.nextGaussian()).toArray

def normal(x: Int, mean: Double, stddev: Double): Array[Double] = {
  qrand(x).toList.map(_ * stddev + mean).toArray
} 

def uniform(x: Int, min: Double, max: Double): Array[Double] = {
  rand(x).toList.map(_ * (max - min) + min).toArray
}

def expon(x: Int, lambda: Double): Array[Double] = {
  rand(x).toList.map(1 - _).map(-Math.log(_)/lambda).toArray
}

def mean(x: Array[Double]): Double = x.sum / x.length

def variance(x: Array[Double]): Double = {
  val xbar = mean(x)
  x.toList.map(_ - xbar).map(Math.pow(_, 2)).sum / (x.length)
}

rand(50).sortWith(_ < _)

val x = normal(100, 5, 1)
val z = normal(100, 0, 1)




def time[T](code : => T) =  {
  val t0 = System.nanoTime : Double
  val res = code
  val t1 = System.nanoTime : Double
  println("Elapsed time " + (t1 - t0) / 1000000.0 + " msecs")
  res
}


//////odds and ends functions created from project euler
def fib (x: Int): Int = {
	if (x == 1) 1
	else if (x == 2) 2
	else fib(x-1) + fib(x-2)
}


def isPrime(x: Int): Boolean = {
    if ((2 until (x/2)+1).filter(x % _ == 0).length == 0) true
    else false
}

def primeFactors(x: Int) = {
    (2 until x).filter(isPrime).filter(x % _ == 0)
}


def isPalindrome(x: Int): Boolean = {
  if (x.toString == x.toString.reverse) true
  else false
}

//Faster prime function
def isPrime2(x: Int): Boolean = {
    if ((2 until ceil(sqrt(x.toDouble)).toInt+1).filter(x % _ == 0).length == 0) true
    else false
}


def triNum(x: Int): Int = {
	(1 until x+1).sum
}


def numDivs(x: Int): Int = {
	(1 until x/2+1).filter(z => x % z == 0).length
}


def ifEven(x: Int): Int = { x/2}

def ifOdd(x: Int): Int = {3*x + 1}


  }

}