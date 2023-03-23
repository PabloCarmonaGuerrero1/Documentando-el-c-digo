package Documentando_un_codigo



class NoPerecedero(nombre: String, precio: Double, tipo: String): Producto(nombre, precio) {
    var tipo: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if(field !in lista){
                field = "otros"
            }else field = value
        }
    init {
        this.tipo = tipo
    }

    companion object{
        var lista = "legumbres, verduras, bebidas"
        fun agregarTipo(tipo2: String){
            lista += tipo2
        }
    }
    override fun toString(): String {
        return super.toString()+", Tipo: $tipo"
    }
}