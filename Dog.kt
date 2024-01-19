class Dog(_name:String = "The dog"):Animal(_name)
{

    override fun makeASound() {
        println("$animalName said woof")
    }

    private fun bark()
    {
        println("$animalName said woof")
    }
}

