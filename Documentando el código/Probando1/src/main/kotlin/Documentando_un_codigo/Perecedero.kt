package Documentando_un_codigo

import java.text.SimpleDateFormat
import java.util.Date

class Perecedero(nombre: String, precio: Double, fechaCad: String): Producto(nombre, precio) {
    var diasParaCaducar: Int
    init {
        var fecha:Date= SimpleDateFormat("dd/MM/yyyy").parse(fechaCad)
        var fechaActual = Date(System.currentTimeMillis())
        val milisegundos = fecha.time - fechaActual.time
        val segundos = milisegundos/1000
        val minutos = segundos/60
        val horas = minutos/60
        val dias = horas/24
        this.diasParaCaducar = dias.toInt()
    }

    override fun calcular(cant_prod: Int): Double {


        var resultado = 0.0
        when(diasParaCaducar){
            1 -> { resultado= super.calcular(cant_prod)/4}
            2 -> {resultado = super.calcular(cant_prod)/3}
            3 -> {resultado = super.calcular(cant_prod)/2}
            else -> resultado = super.calcular(cant_prod)
        }
        return  resultado
    }

    override fun toString(): String {
        return super.toString() +", Dias para caducar: $diasParaCaducar"
    }

}