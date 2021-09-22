package com.example.appmotivation.repositorio

import com.example.appmotivation.infra.MotivationConstants
import com.example.appmotivation.infra.MotivationConstants.FRASEFILTRO.HAPPY
import com.example.appmotivation.infra.MotivationConstants.FRASEFILTRO.SOL
import kotlin.random.Random

data class Frase(val frase: String, val filter: Int)

class Mock {

    private val ALL = MotivationConstants.FRASEFILTRO.ALL
    private val SOL = MotivationConstants.FRASEFILTRO.SOL
    private val HAPPY = MotivationConstants.FRASEFILTRO.HAPPY

    fun getFrase(filterId: Int): String {
        val filtered = mListFrase.filter { it.filter == filterId || filterId==ALL}
        val rand = Random.nextInt(mListFrase.size)
        return filtered[rand].frase
    }


    private val mListFrase: List<Frase> = listOf(
    Frase("Não sabendo que era impossível, foi lá e fez.", HAPPY),
    Frase("Se você acredita, faz toda a diferença.", HAPPY),
    Frase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente", HAPPY),
    Frase("Não pare quando estiver cansado, pare quando tiver terminado.", SOL),
    Frase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", SOL),
    Frase("Enquanto não estivermos comprometidos, haverá hesitação!", SOL),
    )
}

