fun main(){

    val isUrgent : (Int, String) -> String = { age, name ->
        if (age >= 65)
            "$name, ${age >= 65}"
        else
        "$name, ${age >= 65}"

    }

    println(isUrgent(90, "Ibrahim"))

}