package screensClasses

import java.util.Scanner

class Notes {
   val noteName: MutableMap<String, String> = mutableMapOf()
   
   fun createNote(archives: Archives, archiveKey:String) {
      println("Введите название заметки")
      val input = Scanner(System.`in`).nextLine()
      if (input == "") {
         println("Имя не может быть пустым!")
      } else {
         println("Введите текст заметки:")
         noteName[input] = Scanner(System.`in`).nextLine()
         archives.archiveName[archiveKey]?.add(input)
         return
      }
   }
   fun keyGetterNotes(index: Int): String {
      val keysArray: MutableList<String> = mutableListOf()
      for (keys in noteName.keys) {
         keysArray.add(keys)
      }
      return keysArray[index-1]
   }
}