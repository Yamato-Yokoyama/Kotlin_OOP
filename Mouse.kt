class Mouse (_name:String="The Mouse"):Animal(_name)
{
    var CheeseAmount: Int = 0

    override fun makeASound() {
        squeaks()
    }

    private fun squeaks()
    {
        println("$animalName said squeaks")
    }
//    fun store()
//    {
//        println("$animalName said squeaks")
//    }
    fun StealCheese(x:Int)
    {
        this.CheeseAmount += x
        println("$CheeseAmount")
    }
    fun EatCheese()
    {
        this.CheeseAmount--
        println("$CheeseAmount")
    }
}