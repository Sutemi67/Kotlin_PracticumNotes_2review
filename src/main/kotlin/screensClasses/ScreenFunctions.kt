package screensClasses

import java.util.Scanner

class ScreenFunctions {
   
   fun greetingMenu(archives: Archives, notes: Notes) {
      screenMain(archives, notes)
   }
   
   private fun screenMain(archives: Archives, notes: Notes) {
      while (true) {
         var archiveCount = 0
         println("0. Создать архив")
         if (archives.archiveName.isNotEmpty()) {
            for (key in archives.archiveName.keys) {
               archiveCount++
               println("$archiveCount. Архив $key")
            }
         }
         println("${archiveCount+1}. Выход")
         
         when (val command = Scanner(System.`in`).nextLine().toInt()) {
            0 -> {
               archives.createArchive()
            }
            
            in 1 until archiveCount+1 -> {
               val archiveKey = archives.keyGetterArchives(command)
               screenArchive(notes, archiveKey)
            }
            
            archiveCount+1 -> {
               return
            }
            
            else -> println("Неизвестная команда")
         }
      }
   }
   
   private fun screenArchive(notes: Notes, key:String) {
      while (true) {
         println("0. Создать заметку")
         var notesCount = 0
         if (notes.noteName.isNotEmpty()) {
            for (note in notes.noteName.keys) {
               notesCount++
               println("${notesCount}. Заметка $note")
            }
         }
         println("${notesCount + 1}. Назад")
         
         when (val command = Scanner(System.`in`).nextLine().toInt()) {
            0 -> {
               notes.createNote()
            }
            
            in 1 until notesCount+1 -> {
               val noteKey = notes.keyGetterNotes(command)
               screenNote(notes, noteKey)
            }
            
            notesCount+1 -> {
               return
            }
            
            else -> println("Неизвестная команда")
         }
      }
   }
   
   private fun screenNote(notes: Notes, key: String) {
      println("Текст заметки:\n${notes.noteName[key]}\n \n0. Введите любой символ для возврата в меню")
      Scanner(System.`in`).nextLine()
   }
   
   private fun exitScreen(screenNumber: Int): Int {
      return if (screenNumber - 1 != 0) {
         screenNumber - 1
      } else {
         0
      }
   }
}
