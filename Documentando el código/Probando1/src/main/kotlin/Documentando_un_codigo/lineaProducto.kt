package Documentando_un_codigo

class lineaProducto(producto: Producto, cantidad: Int) {
    var producto: Producto
    var cantidad: Int
    init {
        this.producto = producto
        this.cantidad = cantidad
    }

    open fun calcular(): Double {
        return  producto.calcular(cantidad)
    }

}
