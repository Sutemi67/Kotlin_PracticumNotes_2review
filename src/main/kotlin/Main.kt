import screensClasses.Archives
import screensClasses.Notes
import screensClasses.ScreenFunctions

fun main(args: Array<String>) {
   val screen = ScreenFunctions()
   val archives = Archives()
   
   
   screen.greetingMenu(archives, notes = Notes())
}