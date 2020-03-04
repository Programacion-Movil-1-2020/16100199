import Models.Auto
var autosEnsamblados = mutableListOf<Auto>()
var respuesta = ""
var contadorEnsamblados = 0
fun main(){
    println("Bienvenido")
    do {
        println("Que desea hacer? \n1)Ensamblar Auto \n2)Ver autos ensamblados \n3)Salir")
        var opcion: String? = readLine()
        when (opcion)
        {
            "1" -> {
                val auto = Auto()
                auto.ensamblarAuto()
                autosEnsamblados.add(auto)
                println("Marca: ${auto.marca}")
                println("Modelo: ${auto.modelo}")
                println("Caracteristicas")
                for (day: String in auto.arregloCaracteristicas)
                {
                    println(day)
                }
                println("Caracteristicas especiales")
                for (day: String in auto.arregloCaracteristicasEsp)
                {
                    println(day)
                }
                println("Ensamblaje exitoso")
                contadorEnsamblados ++
                println("Desea hacer algo mas? Si/No")
                respuesta = readLine().toString()
            }
            "2" -> {
                autosEnsamblados.forEach{println(it.toString())}
                println("Autos totales ensamblados: ${contadorEnsamblados}")
                println("Desea hacer algo mas? Si/No")
                respuesta = readLine().toString()
            }
            "3" -> {
                println("Gracias por tu visita")
            }
        }
    }while (respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("si"))
}