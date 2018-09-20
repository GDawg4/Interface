import interfaces.Descriptible
import interfaces.Drawable
import shapes.Rectangle
import shapes.Square
import shapes.Triangle

fun returnMenu(menuNumber: Int):String{
    if(menuNumber == 1){
        return """
            Menu principal
            --------------
            1. Dibujar una figura
            2. Salir

        """.trimIndent()
    }
    else if (menuNumber == 2){
        return """
            Menu
            ----
            1. Dibujar un cuadrado
            2. Dibujar un rectángulo
            3. Dibujar un triángulo
            4. Salir al menú principal

        """.trimIndent()
    }
    else
        return ""
}
fun draw(drawable: Drawable):String{
    return drawable.draw()
}

fun askMeasurements(descriptible: Descriptible){
    descriptible.askMeasurements()
}
fun main(args: Array<String>) {
    var wantsToContinue = true

    do {
        print(returnMenu(1))
        var ingreso = readLine()!!

        if (ingreso == "1"){
            println(returnMenu(2))

            var chooseFigure = readLine()!!


            var newTriangle = Triangle()
            var newRectangle = Rectangle()
            var newSquare = Square()

            when (chooseFigure){
                "1"->{
                    askMeasurements(newSquare)
                    print(draw(newSquare))
                }
                "2"->{
                    askMeasurements(newRectangle)
                    print(draw(newRectangle))
                }
                "3"->{
                    askMeasurements(newTriangle)
                    print(draw(newTriangle))
                }
                else -> println("Valor no reconocido, favor intentar nuevamente")
            }

        }else if (ingreso == "2"){
            wantsToContinue = false
        }

    }while (wantsToContinue)

}