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
    val non: String,
    var preu: Double,
    var stock: Int,
    val categoria: Categoria
)
//Declarar classe Inventari
class Inventari{


}