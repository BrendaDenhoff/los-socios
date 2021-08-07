package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
      val lucas = Cliente(Enojado,LasRosas, 65)
      val pepe = Cliente(Feliz, LasRosas, 300)
      val patricio = Cliente(Indiferente,LasRosas, 40)
      val brenda = Cliente(Resfriado,LasRosas, 19)

      describe("enojado") {
          lucas.cuantaPropinaDejariaSoloEstadoDeAnimo(1500).shouldBe(0)
          it("en el barrio Las Rosas") {
              lucas.cuantaPropinaDejariaConBarrio(1500).shouldBe(50)
          }
          it("en el barrio Las Lauchas") {
              lucas.barrio = LasLauchas
              lucas.cuantaPropinaDejariaConBarrio(1500).shouldBe(0)
          }
          it("en el barrio Barrio Verde") {
              lucas.barrio = BarrioVerde
              lucas.cuantaPropinaDejariaConBarrio(1500).shouldBe(200)
          }
          it("en el barrio La Torres") {
              lucas.barrio = LasTorres
              lucas.cuantaPropinaDejariaConBarrio(1500).shouldBe(0)
          }
      }

      describe("feliz") {
          pepe.cuantaPropinaDejariaSoloEstadoDeAnimo(1000).shouldBe(250)
          it("en el barrio Las Rosas") {
              pepe.cuantaPropinaDejariaConBarrio(1000).shouldBe(300)
          }
          it("en el barrio Las Lauchas") {
              pepe.barrio = LasLauchas
              pepe.cuantaPropinaDejariaConBarrio(1000).shouldBe(125)
          }
          it("en el barrio Barrio Verde") {
              pepe.barrio = BarrioVerde
              pepe.cuantaPropinaDejariaConBarrio(1000).shouldBe(250)
          }
          it("en el barrio La Torres") {
              pepe.barrio = LasTorres
              pepe.cuantaPropinaDejariaConBarrio(1000).shouldBe(250)
          }
      }

      describe("indiferente") {
          patricio.cuantaPropinaDejariaSoloEstadoDeAnimo(1500).shouldBe(40)
          it("en el barrio Las Rosas") {
              patricio.cuantaPropinaDejariaConBarrio(1500).shouldBe(90)
          }
          it("en el barrio Las Lauchas") {
              patricio.barrio = LasLauchas
              patricio.cuantaPropinaDejariaConBarrio(1500).shouldBe(20)
          }
          it("en el barrio Barrio Verde") {
              patricio.barrio = BarrioVerde
              patricio.cuantaPropinaDejariaConBarrio(1500).shouldBe(200)
          }
          it("en el barrio La Torres") {
              patricio.barrio = LasTorres
              patricio.cuantaPropinaDejariaConBarrio(1500).shouldBe(40)
          }
      }

      describe("resfriado") {
          brenda.cuantaPropinaDejariaSoloEstadoDeAnimo(800).shouldBe(800)
          it("en el barrio Las Rosas") {
              brenda.cuantaPropinaDejariaConBarrio(800).shouldBe(850)
          }
          it("en el barrio Las Lauchas") {
              brenda.barrio = LasLauchas
              brenda.cuantaPropinaDejariaConBarrio(800).shouldBe(400)
          }
          it("en el barrio Barrio Verde") {
              brenda.barrio = BarrioVerde
              brenda.cuantaPropinaDejariaConBarrio(800).shouldBe(800)
          }
          it("en el barrio La Torres") {
              brenda.barrio = LasTorres
              brenda.cuantaPropinaDejariaConBarrio(800).shouldBe(800)
          }
      }
  }
})
