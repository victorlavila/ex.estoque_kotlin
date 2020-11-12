class Estoque (var nome : String, var qtdAtual : Int, var qtdMinima : Int) {

    init {
        if (qtdAtual < 0){
            qtdAtual = 0
        }
        if(qtdMinima < 0){
            qtdMinima = 0
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

        fun precisaRepor(): Boolean {
            return qtdAtual <= qtdMinima
        }

}