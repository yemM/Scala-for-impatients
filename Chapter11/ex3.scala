import Math._

object Fraction
{
  def unapply(fraction: Fraction) = {
    Some((fraction.num, fraction.den))
  }
}


class Fraction(n: Int, d: Int)
{
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
  
  override def toString = num + "/" + den
  
  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  
  def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

  def +(other: Fraction): Fraction = {
    val Fraction(otherNum, otherDen) = other
    new Fraction(num * otherDen + otherNum * den, den * otherDen)
  }

  def -(other: Fraction): Fraction = {
    val Fraction(otherNum, otherDen) = other
    new Fraction(num * otherDen - otherNum * den, den * otherDen)
  }

  def *(other: Fraction): Fraction = {
    val Fraction(otherNum, otherDen) = other
    new Fraction(num * otherNum, den * otherDen)
  }

  def /(other: Fraction): Fraction = {
    val Fraction(otherNum, otherDen) = other
    new Fraction(num * otherDen, den * otherNum)
  }
}

val fraction = new Fraction(1,2)

println(fraction + new Fraction(2,3))
println(fraction - new Fraction(1,4))
println(fraction * new Fraction(-3,6))
println(fraction * new Fraction(1,-4))
