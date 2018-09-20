package shapes

import interfaces.Descriptible
import interfaces.Drawable

class Triangle:Drawable, Descriptible {
    var height: Int = 0

    override fun askMeasurements(){
        println("Favor ingrese la altura del triángulo")
        //intentamos convertir el ingreso a int
        //si falla, mostramos error
        try{
            height = readLine()!!.toInt()
        }catch (e: NumberFormatException){
            println("Valor no válido")
        }
    }

    //dibujamos el triángulo
    override fun draw():String{
        var finalString = ""
        //magia gris
        for(i in 1..height){
            finalString += " ".repeat(height-i)
            finalString += "* ".repeat(i)
            finalString += "\n"
        }
        return finalString
    }
}