package shapes

import interfaces.Descriptible
import interfaces.Drawable

class Square: Drawable, Descriptible {
    var height = 0

    override fun draw():String{
        var finalString = ""
        for(i in 1..height){
            finalString += "* ".repeat(height)
            finalString += "\n"
        }
        return finalString
    }

    override fun askMeasurements(){
        println("Ingrese la altura del cuadrado")
        try{
            height = readLine()!!.toInt()
        }catch (e: NumberFormatException){
            println("Valor no válido")
        }

    }
}