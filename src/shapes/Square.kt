package shapes

import interfaces.Descriptible
import interfaces.Drawable

class Square: Drawable, Descriptible {
    var height = 0

    //dibujamos cuadrado
    override fun draw():String{
        var finalString = ""
        //magia gris
        for(i in 1..height){
            finalString += "* ".repeat(height)
            finalString += "\n"
        }
        return finalString
    }

    override fun askMeasurements(){
        //intentamos convertir el ingreso a int
        //si falla, mostramos error
        println("Ingrese la altura del cuadrado")
        try{
            height = readLine()!!.toInt()
        }catch (e: NumberFormatException){
            println("Valor no válido")
        }

    }
}