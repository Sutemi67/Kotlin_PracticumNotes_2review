package screensClasses

import java.util.Scanner

class Archives () {
    val archiveName: MutableMap<String, MutableList<String>> = mutableMapOf()

    fun createArchive() {
        val input = Scanner(System.`in`)
        while (true) {
            println("Введите название нового архива:")
            val name = input.nextLine()
            if (name == "") {
                println("Имя не может быть пустым!")
            }
            else{
                archiveName[name]= mutableListOf()
                return
            }
        }
    }
}