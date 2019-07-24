val r = new PartialFunction[Int, String]
{

  // Applying isDefinedAt method
  def isDefinedAt(q: Int) = q!=10

  // Applying apply method
  def apply(q:Int) = q+"is"

}

// Displays output if the
// condition is satisfied
println(r(10))
