package my

object HelloWorld {

  implicit class IntExtension(x: Int) {
    def sqr: Long = x * x
  }

  extension (x: Int)
    def sqr2: Long = x * x

  def main(args: Array[String]): Unit = {
    println("Hello world")
    println("5 sqr = " + 5.sqr)
    println("6 sqr2 = " + 6.sqr2)
  }
}
