

//Fase 1: Sintaxi Bàsica, Nuls i Funcions (40 min)
//Objectiu: Familiaritzar-se amb la sintaxi de variables, tipus, gestió de nuls i la declaració de funcions amb paràmetres i retorn.
//Tasques a realitzar:
//Impressió amb Control de Nuls: Dissenyar una funció que rebi una variable opcional (String?) i la mostri per terminal.
// Si la variable conté text, l'ha d'imprimir; si és null o està buida, ha de mostrar un missatge alternatiu per defecte fent servir l'operador (?:).
//Càlcul de Descompte amb Paràmetres: Dissenyar una funció pura que rebi dos paràmetres (un preu de tipus numèric i un percentatge de descompte) i retorni el preu final després d'aplicar aquest descompte.
//Resultat esperat: Ambdues funcions provades en el bloc main amb diferents valors (incloent valors nuls per a la primera funció).

//Declarar funcion Mensaje
fun Mensaje(text:String?) {
    val Mensaje = if (text.isNullOrEmpty()) null else text
    println(Mensaje ?: "No hay mensaje")
}

//Declarar funcion Calculo
fun Calculo(precio: Double, descuento: Double): Double {
    return precio - (precio * descuento / 100)
    }
//Declarar funcion Calculo

//Probar la funciON Mensaje
fun main() {
    Mensaje("Probando, probando")
    Mensaje(null)
    Mensaje("")

//Prueba funciön Calculo

val precio1 = Calculo(100.0, 20.0)
    println("Precio con descuento producto 1: $precio1")
val precio2 = Calculo(10.0, 10.0)
    println("Precio con descuento producto 2: $precio2")
    }
