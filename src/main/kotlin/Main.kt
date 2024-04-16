import screensClasses.Archives
import screensClasses.Notes
import screensClasses.ScreenFunctions

fun main() {
   val screen = ScreenFunctions()
   screen.greetingMenu(archives = Archives(), notes = Notes())
}