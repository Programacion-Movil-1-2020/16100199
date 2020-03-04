package Models

class Auto
{
    var marca: String = ""
    var modelo: String = ""
    var arregloCaracteristicas = arrayOf("")
    var arregloCaracteristicasEsp = arrayOf("")
    var autosEnsamblados = mutableListOf<Auto>()

    fun ensamblarAuto() {
        println("Ingrese la marca del auto")
        marca = readLine().toString()
        println("Ingrese el modelo del auto")
        modelo = readLine().toString()
        var contador = 0
        do {
            println("Que caracteristica desea?")
            for (proces: String in listOf("1.- Transmisión manual","2.- Transmisión automática","3.- Controles Electricos"))
            {
                println(proces)
            }
            var opcionProc = readLine()
            when (opcionProc) {
                "1" -> arregloCaracteristicas += "-Transmisión manual\n"
                "2" -> arregloCaracteristicas += "-Transmisión automática\n"
                "3" -> arregloCaracteristicas += "-Controles Electricos\n"
            }
            contador++
        } while (contador < 3)
        contador=0
        do {
            println("Que caracteristica especial desea?")
            for (proces: String in listOf(
                "1.- Faros led",
                "2.- Camara de reversa",
                "3.- Asientos de piel"
            )) {
                println(proces)
            }
            var opcionProc = readLine()

            when (opcionProc)
            {
                "1" -> arregloCaracteristicasEsp += "-Faros led"
                "2" -> arregloCaracteristicasEsp += "-Camara de reversa"
                "3" -> arregloCaracteristicasEsp += "-Asientos de piel"
            }
            contador++
        } while (contador < 3)
    }

    fun verAutos()
    {
        for (posicion  in autosEnsamblados )
        {
            println(posicion)
        }
    }
    override fun toString(): String {
        var caracgen = ""
        var caracesp = ""
        for(posicion in arregloCaracteristicas)
        { caracgen += "\n ${posicion}" }
        for(posicion in arregloCaracteristicasEsp)
        { caracesp += "\n ${posicion}" }
        return "Marca: ${marca} \t Modelo: ${modelo}\nCaracteristicas:\n${caracgen}Caracteristicas especiales:\n${caracesp}"
    }
}