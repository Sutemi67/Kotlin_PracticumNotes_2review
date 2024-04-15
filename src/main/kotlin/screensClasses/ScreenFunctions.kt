package screensClasses

class ScreenFunctions() {

    fun greetingMenu(archives: Archives, screenNumber: Int) {
        var archiveCount = 0
        when (screenNumber) {
            1 -> {
                println("0. Создать архив")
                if (archives.archiveName.isNotEmpty()) {
                    for (key in archives.archiveName.keys) {
                        archiveCount++
                        println("$archiveCount. Архив $key")
                    }
                }
                archiveCount++
                println("$archiveCount. Выход")
                return
            }

            2 -> {
                println("0. Создать заметку")
                for (note in archives.archiveName.values) {
                    val i = 0
                    if (note.isNotEmpty()) {
                        println("${i + 1}. Заметка $note")
                    }
                }
                println("${archives.archiveName.values.size}. Выход")
            }

            3 -> println("")
        }
    }
}
