import org.scalatest.{FlatSpec, FunSpec, FunSuite, Matchers}

class test2 extends FunSpec with Matchers{
  val list:List[Int] = List()
     describe("main1::q1"){

       it("empty list"){
         assertThrows[IllegalStateException](main1.q1(list))
       }



     }

  describe("main1:max1"){
     it("check")
    {
      val  result = main1.max1(List(1,4,3,2),0)
      assert(result==4)
    }


    assertThrows[IllegalStateException](main1.max1(list, 0))


  }
}
