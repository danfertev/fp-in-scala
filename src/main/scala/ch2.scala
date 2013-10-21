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
    def step(k: Int): Boolean = {
      if (k == 0) true
      else if (ord(as(k - 1), as(k))) step(k - 1) else false
    }
    if (n < 2) true else step(n - 1)
  }

  def isSortedArray2[A](as: Array[A], ord: (A, A) => Boolean): Boolean = {
    val n = as.length
    if (n < 2) true
    else (1 until n).forall(a => ord(as(a - 1), as(a)))
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
}
