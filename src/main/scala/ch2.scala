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
  def isSortedArray[A](as: Array[A], ord: (A, A) => Boolean): Boolean = {
    val n = as.length
    var res = true
    var i = 0
    while (i < n - 1 && res) {
      if (!ord(as(i), as(i + 1))) res = false
      i += 1
    }
    (n < 2) || res
  }

  def isSortedArray2[A](as: Array[A], ord: (A, A) => Boolean): Boolean = {
    val n = as.length
    (n < 2) || (1 until n).forall(a => ord(as(a - 1), as(a)))
  }

  def isSortedList[A](ls: List[A], ord: (A, A) => Boolean): Boolean = {
    def step(xs: List[A]): Boolean = xs match {
      case List() => true
      case List(y) => true
      case ys@List(y1, y2, _*) => if (ord(y1, y2)) step(ys.tail) else false
    }
    step(ls)
  }

  //exercise 3
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = (a: A) => (b: B) => f(a, b)

  //exercise 4
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  //exercise 5
  def compose[A, B, C](f: A => B, g: B => C): A => C = (a: A) => g(f(a))
}
