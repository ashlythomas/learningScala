package com.ashlythomas

/**
 * @author ${user.name}
 */
object MyFunc extends App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  println("hello")
  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def calledByValue(x: Long): Unit = {
    println("calledByValue called by value: " + x)
    println("calledByValue called by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("calledByName called by name: " + x)
    println("calledByName called by name: " + x)
  }

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite())

}
