package screensClasses

class Notes {
   val noteName: MutableMap<String, String> = mutableMapOf()
   
   fun createNote(archives: Archives, key: String) {
      while (true) {
         println("Введите название заметки")
         val inputName = readln()
         if (inputName == "") {
            println("Имя не может быть пустым!")
         } else {
            while (true) {
               println("Введите текст заметки:")
               val inputBodyText = readln()
               if (inputBodyText != "") {
                  noteName[inputName] = inputBodyText
                  archives.archiveName[key]!!.add(inputName)
                  return
               }else{
                  println("Заметка не может быть пустой!")
               }
            }
         }
      }
   }
}