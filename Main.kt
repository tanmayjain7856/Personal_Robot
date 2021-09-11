import java.util.*

fun main()
{
    /*Initializing the object Robot and giving it a name*/
    val robot = Robot("Alexa")

    /*Printing the details of the Robot along with a greeting*/
    robot.introduction()
    println()

    /*Input an alarm time you want to wake up*/
    robot.ringAlarm("7: 00 AM")
    println()

    /*Let the robot know the type of coffee you prefer along with the number of spoons of sugar*/
    robot.makeCoffee(Coffee("Coffee With Milk", 2))
    println()

    /*Input the water temperature in Celsius*/
    robot.makeWater(27)
    println()

    /*The robot packs the bag according to the day to the week*/
    robot.packYourBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()

    /*A random breakfast, lunch and dinner are made depending on the items you have*/
    robot.makeFood()
    println()

    /*Random color combination of clothes is made by the robot*/
    robot.clothes()
    println()
}