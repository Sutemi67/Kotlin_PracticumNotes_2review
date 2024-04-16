package screensClasses

import java.util.Scanner

class Archives {
   val archiveName: MutableMap<String, MutableList<String>> = mutableMapOf()
   
   fun createArchive() {
      
      while (true) {
         println("Введите название нового архива:")
         val input = Scanner(System.`in`).nextLine()
         
         if (input == "") {
            println("Имя не может быть пустым!")
         } else {
            archiveName[input] = mutableListOf()
            return
         }
      }
   }
   
   fun keyGetterArchives(index: Int): String {
      val keysArray: MutableList<String> = mutableListOf()
      for (keys in archiveName.keys) {
         keysArray.add(keys)
      }
      return keysArray[index-1]
   }
}
