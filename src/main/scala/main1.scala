object main1 extends App {


  //question 1
  def q1(list:List[Int]):Unit={
    if(list.size==0)
      throw new IllegalStateException()
  def qa1 (list: List[Int], counter: Int): Unit
  =
  {
    list match {
      case Nil => return
      case x :: xs => {
        println(x + "=" + counter)
        qa1(xs, counter + 1)
      }
    }

  }
qa1(list,0)
}

 //question 2
  def max1(list:List[Int],maxelement:Int):Int= {
    if(list.size==0)
      throw new IllegalStateException("hi")
    def max(list: List[Int], maxelement: Int): Int = {

      list match {
        case Nil => maxelement

        case x :: xs => if (maxelement < x) max(xs, x) else max(xs, maxelement)
      }
    }
    max(list,0)
  }
  //question 3

  def fib(first:Int,second:Int,n:Int): Int =
  {
    if(n==0)
    {
      return first
    }
    return fib(second,first+second,n-1)
  }

  // question 4
  def q4(n:Int):Int={
    digitsum(sumq4(n))
  }
  def sumq4(n:Int):Int =
  {
    if(n==1)
    {
      return 1;
    }
    return n*sumq4(n-1)
  }
  def digitsum(n:Int):Int=
  {
    if(n==0)
      return 0;
    return n%10+digitsum(n/10)
  }
}

