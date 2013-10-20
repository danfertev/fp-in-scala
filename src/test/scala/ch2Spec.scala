import org.junit.runner.RunWith
import org.specs2.mutable._
import org.specs2.runner.JUnitRunner
import ch2._

/**
 * Denis Anfertev
 * 21.10.13 0:07
 */
@RunWith(classOf[JUnitRunner])
class ch2Spec extends Specification {
  "The nth Fibonacci number" should {
    "be 0 if n == 0" in {
      fib(0) must_== 0
    }
    "be 5 if n == 5" in {
      fib(5) must_== 5
    }
    "be 13 if n == 7" in {
      fib(7) must_== 13
    }
  }

  "Array of Int" should {
    "be sorted ascending" in {
      isSorted[Int](Array(1, 2, 3, 3, 5), _ - _ <= 0)
    }
    "not be sorted ascending" in {
      !isSorted[Int](Array(1, 2, 2, 5, 4), _ - _ <= 0)
    }
    "be sorted descending" in {
      isSorted[Int](Array(5, 3, 3, 2, 1), _ - _ >= 0)
    }
    "not be sorted descending" in {
      !isSorted[Int](Array(5, 3, 3, 1, 2), _ - _ >= 0)
    }
    "with no element should be sorted" in {
      isSorted[Int](Array(), _ - _ >= 0)
    }
    "with one element should be sorted" in {
      isSorted[Int](Array(1), _ - _ < 0)
    }
  }
  //TODO Array of String
}
