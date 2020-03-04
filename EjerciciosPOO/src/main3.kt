fun main() {
    println("Ingrese la cantidad de contraseñas: ")
    var cantidad: Int? = readLine()?.toInt()
    var array = cantidad?.let { arrayOfNulls<Password>(it) }
    println("Largo de las contraseñas: ")
    var tamano: Int? = readLine()?.toInt()

    var largo = 0
    if (array != null)
    {
        while(largo <= array.size - 1)
        {
            var objeto = tamano?.let { Password(it) }
            array[largo] = objeto

            //Array de booelanos
            var arrayBooleanos = cantidad?.let { arrayOfNulls<Boolean>(it) }
            if (objeto != null)
            {
                arrayBooleanos?.set(largo, objeto.esFuerte())
            }

            largo ++

            if (objeto != null)
            {
                println("Contrase;a: ${objeto.contrasenia}, ${objeto.esFuerte()}")
            }
        }
    }
}