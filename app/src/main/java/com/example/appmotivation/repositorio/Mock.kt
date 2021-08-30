package com.example.appmotivation.repositorio
import java.util.*
import com.example.appmotivation.infra.MotivationConstants

data class Frase(val description: String, val category: Int)

fun Int.random(): Int {
    return Random().nextInt(this)
}

class Mock {


    private val ALL = MotivationConstants.FRASEFILTRO.ALL
    private val HAPPY = MotivationConstants.FRASEFILTRO.HAPPY
    private val SOL = MotivationConstants.FRASEFILTRO.SOL

    private val mListPhrases: List<Frase> = listOf(
        Frase("Não sabendo que era impossível, foi lá e fez.", HAPPY),
        Frase("Você não é derrotado quando perde, você é derrotado quando desiste!", HAPPY),
        Frase("Quando está mais escuro, vemos mais estrelas!", HAPPY),
        Frase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", HAPPY),
        Frase("Não pare quando estiver cansado, pare quando tiver terminado.", HAPPY),
        Frase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", HAPPY),
        Frase("Você perde todas as chances que você não aproveita.", SOL),
        Frase("Fracasso é o condimento que dá sabor ao sucesso.", SOL),
        Frase(" Enquanto não estivermos comprometidos, haverá hesitação!", SOL),
        Frase("Se você não sabe onde quer ir, qualquer caminho serve.", SOL),
        Frase("Se você acredita, faz toda a diferença.", SOL),
        Frase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", SOL)
    )

    /**
     * Obtém frase aleatória de acordo com o filtro
     * */
    fun getPhrase(value: Int): String {


        val filtered = mListPhrases.filter { (it.category == value || value == ALL) }

        // Número aleatório de 0 ao tamanho da lista retornada do filtro
        val rand = (filtered.size).random()

        // Retorna string
        return filtered[rand].description

    }


}