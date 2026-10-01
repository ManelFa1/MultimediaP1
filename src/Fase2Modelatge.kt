//Fase 2: Modelatge POO i Encapsulament (40 min)
//Objectiu: Definir el model de dades de productes i la seva gestió utilitzant estructures natives de Kotlin.
//Tasques a realitzar:
//Enums: Crear un enum per classificar les categories del supermercat (ex. ALIMENTACIO, BEGUDES, NETEJA, FRESCOS).
//Modelatge de Productes: Crear una class per a l'entitat Producte, que contingui identificador, nom, preu, stock i categoria.
//Lògica de Negoci (Inventari): Dissenyar una classe Inventari que mantingui una llista privada mutable de productes. Implementar mètodes per a:
//Registrar un nou producte.
//Consultar tots els productes.
//Actualitzar l'stock o el preu d'un producte donat el seu ID.

//Declaramso categorias
enum class Categoria{
    ALIMENTACIO,
    BEGUDES,
    NETEJA,
    FRESCOS
}

//Declarar classe Producte
class Producte(
    val id: Int,
    val nom: String,
    var preu: Double,
    var stock: Int,
    val categoria: Categoria
)
//Declarar classe Inventari
class Inventari {
    val productes = mutableListOf<Producte>()

    //Afegir producte
    fun RegistrarProducte(producte: Producte) {
        productes.add(producte)
    }

    //Consulta Productes
    fun ConsultarProducte() {
        for (product in productes) {
            println("Producte ${product.id} - ${product.nom} - ${product.preu}€ - Stock: ${product.stock} - ${product.categoria}")
        }
    }

    //Actualitzar stock
    fun Actualitzar(id: Int, newStock: Int) {
        for (producte in productes) {
            if (producte.id == id) {
                producte.stock = newStock
            }
        }
    }

    //Actualitzar preu
    fun PreuActualitzat(id: Int, nouPreu: Double) {
        for (producte in productes) {
            if (producte.id == id) {
                producte.preu = nouPreu
            }
        }
    }

fun main(){
    val inventari = Inventari()
    val producte1 = Producte(1,"Doritos",1.70,20, Categoria.ALIMENTACIO)
    val producte2 = Producte(2, "Cocacola",2.50,40, Categoria.BEGUDES)
//Afegir productes a inventari
    inventari.productes.add(producte1)
    inventari.productes.add(producte2)
//Consultar productes
    inventari.Actualitzar(2,3)
//Actualitzar stock
    inventari.Actualitzar(3,4)
//Actualitzar preu
    inventari.PreuActualitzat(2,50.00)
    println("No veas la inflación")
    inventari.ConsultarProducte()
}

}