abstract class Animal(_name: String = "The animal"): IAnimal
{
    val animalName = _name
    override fun move(direction:String)
    {
        println("${animalName}The animal moves $direction")
    }



    abstract override fun makeASound()


}