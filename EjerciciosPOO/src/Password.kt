

class Password
{
        var longitud = 8
            set(value)
            {
                field = value
            }
            get() = field

        var contrasenia = ""
            set(value)
            {
                field = value
            }
            get() = field

        constructor()
        {
            generarContrasena()
        }

        constructor(longitud: Int)
        {
            this.longitud = longitud
            generarContrasena()
        }

    fun generarContrasena()
    {
        var vueltas = this.longitud
        var cont = 0
        var contrasena = ""

        while(cont <= vueltas - 1)
        {
            var numero = (0..75).random()

            if (numero in 0..25)
            {
                contrasena += ('a'..'z').random().toString()
                cont++
            }
            else if (numero in 26..50)
            {
                contrasena += ('A'..'Z').random().toString()
                cont++
            }
            else if (numero in 51..75)
            {
                contrasena += (0..9).random().toString()
                cont++
            }
        this.contrasenia = contrasena
        }
    }

    fun esFuerte(): Boolean
    {
        var mayusculas = 0
        var minusculas = 0
        var numeros = 0

        for(caracter in contrasenia)
        {
            if(caracter.isUpperCase()) { mayusculas ++ }
            if(caracter.isLowerCase()) { minusculas ++ }
            if(caracter.isDigit()) { numeros ++ }
        }

        return (mayusculas > 2 && minusculas > 1 && numeros > 5)

    }
}