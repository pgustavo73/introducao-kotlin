import kotlin.math.pow


fun main() {
    val N1 = 48.5f // Numero 1 da opeção
    val N2 = 30f // Numero 1 da opeção
    val operacao = 7 // altere aqui entre 1 - 7 para mudar a operacão
    println("#### Calculadora KLOTIN ####")
    println(calculo(N1,N2,operacao))
}


fun calculo(a:Float?,b:Float?,o:Int?):String{
    val resultado:Float
    val men:String
    when{
        a==null -> {
            men="""### Valor de "n1" não pode ser NULO ###"""
        }
        b==null -> {
            men="""### Valor de "n2" não pode ser NULO ###"""
        }
        
        o==1 -> {
            resultado=a+b
            println("Soma")
            men="\n$a + $b = $resultado"
        }
        o==2 -> {
            resultado=a-b
            println("Subtração")
            men="\n$a - $b = $resultado"
        }
        o==3 -> {
            resultado=a*b
            println("Multiplicação")
            men="\n$a × $b = $resultado"
        }
        o==4 -> {
            resultado=a/b
            println("Divisão")
            val remainder: Float = a%b
            men="\n$a ÷ $b = $resultado\n" +
                    "Resto: $remainder"
        }
        o==5 -> {
            println("Fatorial")
            var factorial=1
            for(i in 1..a.toInt()) factorial*=i
            men="\n${String.format("%.0f",a)} = $factorial"
        }
        o==6 -> {
            resultado=a.pow(b)
            println("Exponenciação")
            men="\n$a ^ $b = $resultado"
        }
        o==7 -> {
            resultado=(a/100)*b
            println("Porcentagem")
            men="\n$a% de $b = ${String.format("%.2f",resultado)}"
        }
        else ->{men="\nOpção inválida!"}
    }
    return men
}