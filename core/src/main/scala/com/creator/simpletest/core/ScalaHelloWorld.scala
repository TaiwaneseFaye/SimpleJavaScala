package com.creator.simpletest.core

import com.typesafe.scalalogging.LazyLogging

object ScalaHelloWorld extends LazyLogging {
  def main(args: Array[String]): Unit = {
    println("Hello, Scala World!")
    logger.info("Hello, Scala World again!")
  }
}

