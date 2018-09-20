
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

fun main(args: Array<String>) {
    var wantsToContinue = true

    do {
        print(returnMenu(1))
        var ingreso = readLine()!!

        if (ingreso == "1"){

            println(returnMenu(2))

        }else if (ingreso == "2"){
            wantsToContinue = false
        }

    }while (wantsToContinue)

}