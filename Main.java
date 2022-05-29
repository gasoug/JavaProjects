import java.util.Scanner;

class Vector {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("## PTI Gabriel de Sousa ##");
    System.out.println("Informe o tamanho do vetor: ");
    int limite = sc.nextInt();
    int[]  vetor = tamVetor(limite);
    for(int i = 0; i < vetor.length; i++){
      System.out.println("Informe o valor do vetor de numero " + (i+1) + ":");
      vetor[i] = sc.nextInt();
    }
    for (int x = 0; x < vetor.length; x++){
      System.out.print(vetor[x] + " ");
    }
    boolean ordenado = ordem(vetor);
    
    //VERIFICA A MAIOR DIFERENÇA ENTRE OS NÚMEROS DO VETOR
    System.out.println("A maior diferença entre os valores do vetor é de: " + maiorDif(vetor));
    
     //VAI IMPRIMIR SE O VETOR ESTÁ EM ORDEM CRESCENTE. TRUE SE SIM, FALSE SE NÃO
    System.out.println("Está em ordem crescente? " + ordenado);
    
  }
//FUNÇÃO QUE ADAPTA O TAMANHO DO VETOR BASEADO NO NÚMERO QUE O USUÁRIO DIGITAR
  public static int[] tamVetor(int tamanho){
    int[] num = new int[tamanho];
    return num;
  }

  //ESSA FUNÇÃO VAI ORDENAR OS VETORES
  public static int[] ordenar(int[] ordenado){
    int novoVetor = ordenado.length;
    for (int i = 0; i < novoVetor - 1 ; i++){
      for (int j = 0; j < novoVetor - i - 1; j++){
        if (ordenado[j] > ordenado[j + 1]){
          int temporaria = ordenado[j];
          ordenado[j] = ordenado[j + 1];
          ordenado[j + 1] = temporaria;
        }
      }
    }
    return ordenado;
  }
  public static int maiorDif(int[] diferir){
    ordenar(diferir);//PRECISA CHAMAR A FUNÇÃO QUE ORDENA PRIMEIRO PARA VERIFICAR A MAIOR DIFERENÇA CASO O VETOR NÃO ESTEJA ORDENADO, RETORNARIA UM VALOR ERRADO
    int tamanho = diferir.length;
    int diferenca = diferir [tamanho-1] - diferir[0];
    return diferenca;
  }

  //A FUNÇÃO ABAIXO RECEBE O VETOR E VERIFICA SE O VALOR DO PRÓXIMO VETOR É MAIOR QUE O ANTERIOR RETORNA FALSE SE NÃO FOR E TRUE SE FOR
  public static boolean ordem(int diff[]){
    boolean cresc = false;
    int vetor = diff.length;
    for(int i = 0; i < vetor-1; i++){
      if(diff[0] < diff[i]){
        cresc = true;
      }
      else{
        cresc = false;
      }
    }
    return cresc;
  }
}
