package Documentando_un_codigo

fun main(args: Array<String>) {
    val pizza = Perecedero("pizza", 5.8, "22/03/2023")
    val manzana = Perecedero("manzana", 1.2, "14/03/2023")
    val pera = Perecedero("pera", 1.0, "12/03/2023")
    val pollo = Perecedero("pollo", 10.3, "15/03/2023")
    val pasta = NoPerecedero("colgate", 5.4, "Higiene")
    val pelicula = NoPerecedero("Terminator", 15.3, "Ocio")
    val bicicleta = NoPerecedero("bicicleta", 450.5, "deporte")
    val listaProducto: MutableList<Producto> = mutableListOf(pizza, manzana, pera, pollo, pasta, pelicula, bicicleta)
    var linea1 = lineaProducto(pizza, 1)
    var compra = Compra()
    var pago = 0.0


    var confirmacion = true
    fun listaProductos(){
        println("Nuestros productos: ")
        for (i in (0..listaProducto.size - 1)) {
            println("${i + 1} ${listaProducto[i].nombre}")
        }
    }
    for (p in listaProducto){
        compra.comprar(p)
    }

    val pollo2 = Perecedero("pollo", 10.3, "15/03/2023")

    compra.anyadir(pollo2)

    compra.mostrarLista()
    compra.mostrarFactura()
}