var contador = 0
var respuesta = ""
var arregloPCs = arrayOf("")
fun main() {
    do lit@ {
        otro = ""
        println("Bienvenido a PC Maker!!! \nEn que podemos ayudarle?")
        println("1.- Armar un nuevo equipo \n2.- Ver equipos armados \n3.- Salir")
        var opcion: String? = readLine()
        if (opcion.equals("1")) {
            do {
                i += 1
                var pc = "PC#$contador"
                println("Que tipo de procesador desea?")
                for (proces: String in listOf("1.- I5", "2.- I7", "3.- I9")) {
                    println(proces)
                }
                var opcionProc = readLine()?.toInt() as Int
                when (opcionProc) {
                    in 1..1 -> pc += ", Procesador: I5"
                    in 2..2 -> pc += ", Procesador: I7"
                    in 3..3 -> pc += ", Procesador: I9"
                }
                println("Cuanta memoria Ram desea?")
                for (ram: String in listOf("1.- 4Gb", "2.- 8Gb", "3.- 16Gb")) {
                    println(ram)
                }
                var opcionRam = readLine()?.toInt() as Int
                when (opcionRam) {
                    in 1..1 -> pc += ", Ram: 4Gb"
                    in 2..2 -> pc += ", Ram: 8Gb"
                    in 3..3 -> pc += ", Ram: 16Gb"
                }
                println("Cuanto Almacenamiento desea?")
                for (sd: String in listOf("1.- 250Gb", "2.- 500Gb", "3.- 1Tb")) {
                    println(sd)
                }
                var opcionAlma = readLine()?.toInt() as Int
                when (opcionAlma) {
                    in 1..1 -> pc += ", Almacenamiento: 250Gb"
                    in 2..2 -> pc += ", Almacenamiento: 500Gb"
                    in 3..3 -> pc += ", Almacenamiento: 1Tb"
                }
                println(pc)
                arregloPCs += "\n$pc"
                println("Desea Armar otra PC? Si/No")
                respuesta = readLine().toString()
            } 
        
            while (respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("si"))
        }
        else if (opcion.equals("2"))
        {
            for (day: String in arregloPCs) {
                println(day)
            }
        }
        else if (opcion.equals("3"))
        {
            println("Gracias por su preferencia vuelva pronto!!!")
        }
        else
        {
            println("Eliga una opcion correcta")
            return@lit
        }
    } while (respuesta.equals("no") || respuesta.equals("NO") || respuesta.equals("No"))
}