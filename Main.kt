fun main() {
    clearConsole()
    println("Hello, kotlin!")
    val list = arrayOf(
        "Программы",
        "Прог1",
        "Прог2",
        "Прог3"
    )
    val list_quantity: Int = list.size;


    for (i in 0..list_quantity)
    {
        println("[" + i + "] " + list[i])
    }

}

/* kotlinc src/Main.kt -include-runtime -d out/main.jar
java -jar out/main.jar */

fun clearConsole() {
        repeat(100) { println() }
    }