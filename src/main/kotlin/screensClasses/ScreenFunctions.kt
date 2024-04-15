package screensClasses

class ScreenFunctions() {

    fun exitScreen(screenNumber: Int): Int = screenNumber - 1


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
                if (archives.archiveName.values.isNotEmpty()) {
                    for (note in archives.archiveName.values) {
                        val i = 0
                        println("${i + 1}. Заметка $note")
                    }
                    println("${archives.archiveName.values.size + 1}. Выход")
                }
            }

            3 -> println("")
        }
    }
}
