import interfaces.Descriptible
import interfaces.Drawable
import shapes.Rectangle
import shapes.Square
import shapes.Triangle

//función para imprimir el menú apropiado
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

//funcion para dibujar to-do lo que sea dibujable
fun draw(drawable: Drawable):String{
    return drawable.draw()
}

//funcion para medir lo que sea medible
fun askMeasurements(descriptible: Descriptible){
    descriptible.askMeasurements()
}

fun main(args: Array<String>) {
    var wantsToContinue = true

    //imprimimos el menú hasta que quiera salir
    do {
        print(returnMenu(1))
        var ingreso = readLine()!!

        //si ingresa 1, crea las figuras \"vacías\" e imprime menú
        if (ingreso == "1"){
            var wantsToKeepDrawing = true
            do {
                println(returnMenu(2))

                var chooseFigure = readLine()!!

                var newTriangle = Triangle()
                var newRectangle = Rectangle()
                var newSquare = Square()

                //dependiendo de que figura elija, se pasa parámetro a la función
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
                    "4"->{
                        wantsToKeepDrawing = false
                    }
                    else -> println("Valor no reconocido, favor intentar nuevamente")
                }
            }while (wantsToKeepDrawing)

        }else if (ingreso == "2"){
            wantsToContinue = false
        }

    }while (wantsToContinue)

}