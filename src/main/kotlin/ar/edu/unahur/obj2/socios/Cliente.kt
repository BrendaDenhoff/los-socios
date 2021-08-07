package ar.edu.unahur.obj2.socios

import kotlin.math.max

class Cliente(var estadoDeAnimo: EstadoDeAnimo,var barrio: Barrio, var plataEnBolsillo: Int) {

    fun cuantaPropinaDejariaSoloEstadoDeAnimo(valorDelPedido: Int) = estadoDeAnimo.propina(valorDelPedido, plataEnBolsillo)

    fun cuantaPropinaDejariaConBarrio(valorDelPedido: Int) = barrio.propinaExtra(this.cuantaPropinaDejariaSoloEstadoDeAnimo(valorDelPedido))
}


abstract class EstadoDeAnimo {
    abstract fun propina(valorDelPedido: Int, plataEnBolsilloDelCliente: Int): Int
}

object Enojado: EstadoDeAnimo() {
    override fun propina(valorDelPedido: Int, plataEnBolsilloDelCliente: Int) = 0
}

object Feliz: EstadoDeAnimo() {
    override fun propina(valorDelPedido: Int, plataEnBolsilloDelCliente: Int) = valorDelPedido * 25 / 100
}

object Indiferente: EstadoDeAnimo() {
    override fun propina(valorDelPedido: Int, plataEnBolsilloDelCliente: Int) = plataEnBolsilloDelCliente
}
object Resfriado: EstadoDeAnimo() {
    override fun propina(valorDelPedido: Int, plataEnBolsilloDelCliente: Int) = valorDelPedido
}

abstract class Barrio{
    abstract fun propinaExtra(propinaDelPedido: Int): Int
}

object LasRosas: Barrio() {
    override fun propinaExtra(propinaDelPedido: Int) = propinaDelPedido + 50
}

object LasLauchas: Barrio() {
    override fun propinaExtra(propinaDelPedido: Int) = propinaDelPedido / 2
}

object BarrioVerde: Barrio() {
    override fun propinaExtra(propinaDelPedido: Int) = max(propinaDelPedido, 200)
}

object LasTorres: Barrio() {
    override fun propinaExtra(propinaDelPedido: Int) = propinaDelPedido
}
