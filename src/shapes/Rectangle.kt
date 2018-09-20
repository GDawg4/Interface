package shapes

import interfaces.Descriptible
import interfaces.Drawable

class Rectangle: Drawable, Descriptible {
    var height = 0
    var width = 0

    override fun draw():String{
        var finalString = ""
        for(i in 1..height){
            finalString += "* ".repeat(width)
            finalString += "\n"
        }
        return finalString
    }
    override fun askMeasurements(){
        println("Ingrese la altura del rectángulo")
        height = readLine()!!.toInt()

        println("Ingrese el ancho del rectángulo")
        width = readLine()!!.toInt()

        try{
            height = readLine()!!.toInt()
            width = readLine()!!.toInt()
        }catch (e: NumberFormatException){
            println("Valor no válido")
        }
    }
}