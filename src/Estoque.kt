class Estoque (var nome : String, var qtdAtual : Int, var qtdMinima : Int) {

    init {
        if (qtdAtual < 0 || qtdMinima < 0) {
            println("Saldo não pode ser negativo")
        }
    }

        fun mudarNome(novoNome: String): String {
            nome = novoNome
            return nome
        }

        fun mudarQtdMinima(qtd: Int): Int {
            qtdMinima = qtd
            return qtdMinima
        }

        fun repor(quantidade: Int): Int {
            qtdAtual += quantidade
            return qtdAtual
        }

        fun darBaixa(quantidade: Int): Int {
            qtdAtual -= quantidade
            return qtdAtual
        }

        fun mostra(): String {
            return "Produto: $nome \nQuantidade mínima: $qtdMinima \nQuantidade Atual: $qtdAtual"
        }

        fun precisaRepor() {
            if (qtdAtual < qtdMinima) {
                println(true)
            } else {
                println(false)
            }
        }

}