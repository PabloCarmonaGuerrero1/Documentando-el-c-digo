package Documentando_un_codigo

abstract class Producto(nombre: String, precio: Double) {
    var nombre: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            while (field == "") {
                println("El campo nombre no puede estar vacio.")
                field = readln()
            }
        }
    var precio: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if (field <= 0) {
                while (field <= 0) {
                    println("El campo precio no puede ser 0 o menor que 0")
                    field = readln().toDouble()
                }
            }
        }

    init {
        this.nombre = nombre
        this.precio = precio
    }


    open fun calcular(cant_prod: Int): Double {
        val resultado = cant_prod * precio
        return resultado
    }

    override fun toString(): String {
        return "$nombre, Precio: $precio und."
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Producto

        if (nombre != other.nombre) return false

        return true
    }

    override fun hashCode(): Int {
        return nombre.hashCode()
    }

}