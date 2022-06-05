class Carro constructor(
    private val motor: Motor
    ){

    var cor: String?=null
    fun ligar(){
        println("Ligando o carro")
        motor.ligar()
    }
    fun desligar(){
        println("Desligando o carro ")
        motor.desligar()
    }



fun anda(){
    when {
        !motor.estaLigado() -> println("Liga o carro primeiro")
        !motor.temCombustivel() -> {
            println("Coloca combustivel")
            desligar()
        }
        else ->{
            motor.gastandoCombustivel()
            println("carro andando : Vrum vrum!")
        }
    }


}
    fun freia(){
        println("freiando o carro")
    }
    fun buzina(){
        println("buzinando o carro")

    }
    fun partida(){

    }
}