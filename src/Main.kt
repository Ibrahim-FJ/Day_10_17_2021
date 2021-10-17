fun main(){

    val isUrgent  = { age : Int, name : String ->
        if (age >= 65)
            "$name, ${age >= 65}"
        else
        "$name, ${age >= 65}"

    }

    println(isUrgent(90, "Ibrahim"))

}