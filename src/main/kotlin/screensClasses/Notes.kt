package screensClasses

import java.util.Scanner

class Notes {
   val noteName: MutableMap<String, MutableList<String>> = mutableMapOf()
   
   fun createNote(index: String) {
      println("Введите заметку")
      val input = Scanner(System.`in`).nextLine()
      if (input == "") {
         println("Имя не может быть пустым!")
      } else {
         noteName[input] = mutableListOf()
         return
      }
   }
}