class BitSequence(private var value: Long = 0) {
  def update(bit: Int, state: Int): Unit = {
    value |= (state & 1L) << (bit - 1)
  }

  def apply(bit: Int): Int = {
    if ((value & 1L << (bit -1)) > 0) 1  else 0
  }

  override def toString: String = {
    "%64s".format(value.toBinaryString).replace(' ', '0')
  }
}


val x = new BitSequence()

x(1) = 1
x(10) = 1
x(63) = 1
x(64) = 1

println(x(5), x(63))
println(x)