package screensClasses

import java.util.Scanner

class Notes {
   val noteName: MutableMap<String, String> = mutableMapOf()
   
   fun createNote(archives: Archives, key: String) {
      println("Введите название заметки")
      val input = Scanner(System.`in`).next()
      if (input == "") {
         println("Имя не может быть пустым!")
      } else {
         println("Введите текст заметки:")
         noteName[input] = Scanner(System.`in`).nextLine()
         archives.archiveName[key]!!.add(input)
         return
      }
   }
}