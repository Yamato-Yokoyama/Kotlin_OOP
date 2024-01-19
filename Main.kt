//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    val mouse1: Mouse = Mouse("Jerry")
    mouse1.makeASound()
    mouse1.StealCheese(10)
    mouse1.EatCheese()




//    val dog0: Animal = Dog("hachi")
//    moveAndMakeASound(dog0)
//
//    val cat1: Animal = Dog("Tom")
//    moveAndMakeASound(cat1)

}

fun moveAndMakeASound(animal:Animal)
{
    animal.move("forward")
    animal.makeASound()
}