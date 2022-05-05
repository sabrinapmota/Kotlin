import java.util.*

fun main() {
     do {
         val entrada = Scanner(System.`in`)
         var n1: Float
         var n2: Float
         var n3: Float
         var n4: Float
         var opcao: Int
         do {
              print("Informe a primeira nota:")
              n1 = entrada.nextFloat()
             }
         while (n1 < 0 || n1 > 10)

         do {
              print("Informe a segunda nota:")
              n2 = entrada.nextFloat()
             }
         while (n2 < 0 || n2 > 10)

         do {
              print("Informe a terceira nota:")
              n3 = entrada.nextFloat()
             }
         while (n3 < 0 || n3 > 10)

         do {
              print("Informe a quarta nota:")
              n4 = entrada.nextFloat()
             }
         while (n4 < 0 || n4 > 10)

         val media = (n1 + n2 + n3 + n4) / 4

            print("Media semestral: ")
         println(media)

         println()

         do {
             print("Novo calculo (1=sim, 2=nao): ")
             opcao = entrada.nextInt()
             }
         while (opcao != 1 && opcao != 2)
    }
    while (opcao == 1)
}