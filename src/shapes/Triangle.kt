package shapes

import interfaces.Descriptible
import interfaces.Drawable

class Triangle:Drawable, Descriptible {
    var height: Int = 0

    override fun askMeasurements(){
        println("Favor ingrese la altura del triángulo")
        try{
            height = readLine()!!.toInt()
        }catch (e: NumberFormatException){
            println("Valor no válido")
        }
    }

    override fun draw():String{
        var finalString = ""
        for(i in 1..height){
            finalString += " ".repeat(height-i)
            finalString += "* ".repeat(i)
            finalString += "\n"
        }
        return finalString
    }
}