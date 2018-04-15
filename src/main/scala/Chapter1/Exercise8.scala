package Chapter1

import scala.math.BigInt._
import scala.util.Random

object Exercise8 extends App {
  println(
    probablePrime(100, Random).toString(32)
  )

}
