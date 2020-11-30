package com.ashlythomas

import scala.annotation.tailrec

object DefaultArgs extends App{

  def factorial(x: Int): Int = {
    @tailrec
    def factorialInner(x: Int, acc: Int = 1): Int = {
      if (x <= 1) acc
      else factorialInner(x-1, acc * x)
    }
    factorialInner(x,1)
  }

  println("factorial(5): " + factorial(5))
}
