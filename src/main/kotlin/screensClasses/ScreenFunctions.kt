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
         println("${archiveCount + 1}. Выход")
         
         val command = readlnOrNull()
         if (command?.toIntOrNull() != null) {
            when (command.toInt()) {
               0 -> {
                  archives.createArchive()
               }
               
               in 1 until archiveCount + 1 -> {
                  val archiveKey = archives.keyGetterArchives(command.toInt())
                  screenArchive(archives, notes, archiveKey)
               }
               
               archiveCount + 1 -> {
                  return
               }
               
               else -> println("Неизвестная команда")
            }
         } else {
            println("Введите номер команды из предложенного списка:")
         }
      }
   }
   
   private fun screenArchive(archives: Archives, notes: Notes, key: String) {
      while (true) {
         println("0. Создать заметку")
         var notesCount = 0
         if (archives.archiveName[key]?.isNotEmpty() == true) {
            for (note in archives.archiveName[key]!!) {
               notesCount++
               println("${notesCount}. Заметка $note")
            }
         }
         println("${notesCount + 1}. Назад")
         
         val command = readlnOrNull()
         if (command?.toIntOrNull() != null) {
            when (command.toInt()) {
               0 -> {
                  notes.createNote(archives, key)
               }
               
               in 1..notesCount -> {
                  val noteKey = archives.archiveName[key]?.get(command.toInt() - 1)
                  screenNote(notes, noteKey!!)
               }
               
               notesCount + 1 -> {
                  return
               }
               else -> println("Неизвестная команда")
            }
         }else{
            println("Введите команду из предложенного списка:")
         }
      }
   }
      
      private fun screenNote(notes: Notes, key: String) {
         println("Текст заметки:\n${notes.noteName[key]}\n \n0. Введите любой символ для возврата в меню")
         Scanner(System.`in`).nextLine()
      }
   }
