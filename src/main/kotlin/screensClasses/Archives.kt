package screensClasses

class Archives {
   val archiveName: MutableMap<String, MutableList<String>> = mutableMapOf()
   
   fun createArchive() {
      while (true) {
         println("Введите название нового архива:")
         val input = readln()
         if (input == "") {
            println("Имя не может быть пустым!")
         } else {
            archiveName[input] = mutableListOf()
            return
         }
      }
   }
   
   fun getArchiveKey(index: Int): String {
      val keysArray: MutableList<String> = mutableListOf()
      for (keys in archiveName.keys) {
         keysArray.add(keys)
      }
      return keysArray[index - 1]
   }
}


