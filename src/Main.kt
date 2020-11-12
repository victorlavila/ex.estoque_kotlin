fun main() {

    var estoque1 = Estoque("Sapato", -10, 5)
    var estoque2 = Estoque("Sandália", 8, 2)

    estoque1.repor(20)
    println(estoque1.mostra())

    estoque1.darBaixa(5)
    estoque1.mudarNome("Sapato masculino")
    println(estoque1.mostra())

}