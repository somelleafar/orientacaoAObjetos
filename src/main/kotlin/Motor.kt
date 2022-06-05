class Motor {
    private var ligado: Boolean = false
    private var nivelCombustivel : Int=2

    fun ligar() {
        ligado = true
    }

    fun desligar(){
        ligado=false
    }
    fun estaLigado() :Boolean{
        return ligado
    }


fun temCombustivel():Boolean{
    return nivelCombustivel>0
}
    fun gastandoCombustivel(){
        println("gastando combustivel, o nivel está em $nivelCombustivel")
        nivelCombustivel --
    }
}