// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {BASICO, INTERMEDIARIO, AVANCADO}

class Aluno(val nome: String, val nivel: Nivel)

data class ConteudoEducacional(var nome: String, val duracao: Int = 120) {
    init { 
    	require(duracao > 0) { "A duracao dos cursos deverão serem sempre positiva "}
    }
    
}

class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>) { 
	val inscritos = mutableListOf<Aluno>()
    
    fun matricular(aluno: Aluno) {  
    	inscritos.add(aluno)
        println(" O Aluno(a) ${aluno.nome} matriculou se no curso de $nome")
        println()
    
    }

    fun listarInscritos() { 
    	println("Inscritos na formação $nome:")
        inscritos.forEach { println(it.nome) }
        println()
    
    }
}

fun main(){
    
    val aluno1 = Aluno("Jessica", Nivel.BASICO)
    val aluno2 = Aluno("Mariana", Nivel.AVANCADO)
    val aluno3 = Aluno("Marcos", Nivel.INTERMEDIARIO)
    
    val conteudo1 = ConteudoEducacional("Lógica de Programação", 120)
    val conteudo2 = ConteudoEducacional("Dominando Multiplas Linguagens", 240)
  
    
    val formacao1 = Formacao("Lógica de Programação", mutableListOf(conteudo1))
    val formacao2 = Formacao("Dominando Multiplas Linguagens", mutableListOf(conteudo2))
    
    formacao1.matricular(aluno1)
    formacao1.matricular(aluno2)
    formacao1.listarInscritos()

    formacao2.matricular(aluno2)
    formacao2.matricular(aluno3)
    formacao2.listarInscritos()  
    
}
