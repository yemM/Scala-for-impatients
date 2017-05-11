/* Implement a class Money with fields for dollars and cents. Supply +, - operators as well as comparison operators == and <. For example, Money(1, 75) + Money(0, 50) == Money(2, 25) should be true. Should you also supply * and / operators? Why or why not? */

import Math._

object Money
{
  def unapply(money: Money) = {
    Some((money.dollars, money.cents))
  }
}

class Money(d: Int, c: Int)
{
  private val dollars: Int = if(c >= 100) { d + (c - reduceCents(c)) / 100 } else d
  private val cents: Int = reduceCents(c)

  def reduceCents(cents: Int): Int = {
    if (100 <= cents) {
      reduceCents(cents - 100)
    } else {
      cents
    }
  }

  override def toString() = "$" + dollars + "," + cents

  def +(other: Money): Money = {
    val Money(otherDollars, otherCents) = other
    new Money(dollars + otherDollars, cents + otherCents)
  }

  def -(other: Money): Money = {
    val Money(otherDollars, otherCents) = other
    new Money(dollars - otherDollars, cents - otherCents)
  }
}

val m1 = new Money(10,50)
println(new Money(10,50))
println(new Money(10,350))

println(m1 + new Money(130,32))
println(m1 - new Money(9,50))
