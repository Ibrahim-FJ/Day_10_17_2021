import kotlin.random.Random
import kotlin.random.nextInt

fun main(){


    val greetingFunction = { playerName: String, buildingNo: Int ->



        val currentYear = 2021
        println("Adding $buildingNo hours")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"

    }

    fun runSimulation(playerName : String, greetingFunction : (String, Int) -> String){
        val buildingNo = Random.nextInt(1..5)
        println(greetingFunction(playerName, buildingNo))
    }
    runSimulation("Ibrahim", greetingFunction)

}