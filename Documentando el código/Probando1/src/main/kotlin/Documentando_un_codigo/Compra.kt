package Documentando_un_codigo

class Compra {
    var listaCompra: MutableList<lineaProducto> = mutableListOf()

    fun comprar(producto: Producto){
        listaCompra.add(lineaProducto(producto,1))
    }
    fun calcularPrecio(): Double{
        var suma = 0.0
        for(i in listaCompra){
            // suma += i.producto.calcular(i.cantidad)
            suma+=i.calcular()
        }
        return suma
    }

    fun anyadir(producto: Producto){
        var encontrado=false
        for(i in (0..listaCompra.size - 1)){
            if(listaCompra[i].producto.nombre == producto.nombre){
                listaCompra[i].cantidad ++
                encontrado=true
            }

        }

        if (!encontrado) {

            listaCompra.add(lineaProducto(producto, 1))

        }
    }

    fun eliminar(producto: Producto): MutableList<lineaProducto>{
        for (i in (0..listaCompra.size - 1)) {
            if (listaCompra[i].producto.nombre == producto.nombre) {
                listaCompra[i].cantidad--
                break
            }
        }
        return listaCompra
    }
    fun mostrarLista(): MutableList<lineaProducto>{
        for(i in (0..listaCompra.size - 1)){
            println("${i + 1} ${listaCompra[i].producto.nombre}  ${listaCompra[i].cantidad}")
        }
        return listaCompra
    }
    fun mostrarFactura(){

        println("-------")
        println("Factura")
        println("-------")

        for(i in listaCompra){
            println("Producto: ${i.producto.toString()}, cantidad: ${i.cantidad} und., precio total con descuento: ${i.producto.calcular(i.cantidad)}€")
        }
        println("Total compra: ${calcularPrecio()}€")
    }
}
