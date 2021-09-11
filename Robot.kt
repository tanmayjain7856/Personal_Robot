import java.util.*

/*Class Robot defines the tasks which will be performed by the Robot*/
class Robot(var name: String)
{
    fun introduction()
    {
        println("Good Morning! I'm $name and I'm your new personal assistant. I will help you to make your day even more simpler.")
    }
    fun ringAlarm(time: String)
    {
        println("I'm $name. The time is already $time, please wake up!!!")
    }
    fun makeCoffee(coffee: Coffee)
    {
        println("Your coffee: ${coffee.typeOfCoffee} with ${coffee.sugarSpoons} spoons of sugar is ready.")
        println("Enjoy your coffee")
    }
    fun makeWater(temperature: Int)
    {
        println("It's $name. Your water is ready at $temperature' Celsius. Come take a bath.")
    }
    fun packYourBag(day: Int)
    {
        val messageTemplate = "Books kept for today are: "
        val subjects = arrayOf("AI", "Web Development", "Data Mining", "Compiler Design", "Machine Learning", "Advance DBMS", "Neural Networks")
        when (day) {
            Calendar.MONDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[6]}")
            Calendar.TUESDAY -> println("$messageTemplate ${subjects[2]}, ${subjects[5]}")
            Calendar.WEDNESDAY -> println("$messageTemplate ${subjects[1]}, ${subjects[4]}")
            Calendar.THURSDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[3]}")
            Calendar.FRIDAY -> println("$messageTemplate ${subjects[6]}, ${subjects[2]}")
            else -> println("It's a holiday!!Yippee!!!")
        }
    }

    /*Here a random choice is made by the robot using the system defined method random()*/
    fun makeFood()
    {
        val breakfast = mutableListOf("Corn Flakes", "Maggi", "OatMeal", "Bread with Milk", "Chapati with curd", "Pasta", "Sandwich", "Cereal")
        val lunch = mutableListOf("Dal with Rice", "Chapati with Vegetable", "Veggie-Salsa Tortilla", "Veggie Salad", "White Bean Soup", "Shahi Paneer", "Curd")
        val dinner = mutableListOf("Salad", "Mixed Berries", "veggie Burger", "Steamed Vegetables", "Brownie", "Pastry")
        println("Your Breakfast is ${breakfast.random()}")
        println("Your Lunch is ${lunch.random()}")
        println("Your Dinner is ${dinner.random()}")
    }

    fun clothes()
    {
        val tShirt = mutableListOf("Black", "White", "Blue", "Red", "Grey", "Yellow", "Orange", "Pink")
        val trousers = mutableListOf("Black", "White", "Blue", "Brown", "Grey", "Yellow")
        val shoes = mutableListOf("Black", "Blue", "Brown", "Red", "White", "Green")
        println("Your ${tShirt.random()} T-Shirt is ready.")
        println("Your ${trousers.random()} trousers are ready.")
        println("Your ${shoes.random()} Shoes are ready.")
    }
}