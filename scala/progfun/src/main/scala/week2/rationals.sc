package week2

class Rational(x: Int, y: Int) {
  require(y != 0, "Denominator must be nonzero number")

  def numer = x
  def denom = y

  override def toString = s"$numer / $denom"

  def +(that: week3.Rational) =
    Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def -(that: week3.Rational) =
    this + -that

  def unary_- : week3.Rational = Rational(-numer, denom)
}

object Rational {
  def apply(x: Int, y: Int) = new week3.Rational(x, y)
}


Rational(1, 2) + Rational(1, 2)