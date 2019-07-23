import org.scalatest.{FlatSpec, FunSuite, Matchers}

class test1 extends FunSuite{
  val list:List[Int] = List()
   test("question 1 passed"){

     assertThrows[IllegalStateException](main1.q1(list))
   }



    test("question 2 passed"){
      assertResult(4){
        main1.max1(List(1,4,3,2),0)
      }
      assertResult(0){
        main1.max1(List(0,0),0)
      }

      assertThrows[IllegalStateException](main1.max1(list, 0))
    }

  test("question 3 passed"){
    assertResult(1){
      main1.fib(0,1,2)
      main1.fib(0,1,1)
    }
    assert(main1.fib(0,1,15)==610)
  }
    test("question 4 passed"){
      assert(main1.q4(5)==3)
      assert(main1.q4(2)==2)
      assert(main1.q4(10)==27)
    }


}
