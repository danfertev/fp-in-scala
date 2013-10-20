/**
 * Denis Anfertev
 * 20.10.13 23:49
 */
object ch2 {
  //exercise 1
  def fib(n: Int): Int = {
    def next(i: Int, i1: Int, k: Int): Int = {
      if (k == n) i
      else next(i1, i + i1, k + 1)
    }
    next(0, 1, 0)
  }

  //exercise 2
  def isSorted[A](as: Array[A], ord: (A, A) => Boolean): Boolean = {
    def step(xs: Array[A]): Boolean = xs match {
      case Array() => true
      case Array(y) => true
      case ys@Array(y1, y2, _*) => if (ord(y1, y2)) step(ys.tail) else false
    }
    step(as)
  }

  //exercise 3
}
