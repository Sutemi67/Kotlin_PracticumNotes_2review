import screensClasses.Archives
import screensClasses.ScreenFunctions
import java.util.Scanner

fun main(args: Array<String>) {
    val screen = ScreenFunctions()
    val archives = Archives()
    var screenNumber = 1

    while (true) {
        screen.greetingMenu(archives, screenNumber)
        val archiveCount = archives.archiveName.size

        val command = Scanner(System.`in`).nextLine().toInt()
        if (archives.archiveName.isEmpty()) {
            when (command) {
                0 -> {
                    archives.createArchive()
                }

                1 -> return
                else -> println("Неверная команда")
            }
        } else {
            when (command) {
                0 -> {
                    archives.createArchive()
                }

                in 1..archiveCount -> {
                    screenNumber = 2

                }

                archiveCount + 1 -> {
                    if (screenNumber - 1 != 0) {
                        screenNumber--
                    } else {
                        return
                    }
                }

                else -> println("Неверная команда")
            }
        }
    }
}