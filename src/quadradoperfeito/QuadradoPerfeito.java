package quadradoperfeito;

/**
 * Serviço oferecidos para cacular se um numero 
 * é quadrado perfeito.
 */

public class QuadradoPerfeito {
    
    /**
     * Verifica se o numero passado como marâmetro é um quadrado perfeito.
     *
     * @param k Variável que recebe o numero passado como parâmetro.
     * @param i Variável usada para armazenar os numeros impares.
     * @param q Variável usada para armazenaro valor final sendo ele quadrado perfeito ou não.
     *
     * @return true para quadrado perfeito e false quando não é quadrado perfeito.
     *
     * @throws IllegalArgumentException Caso o valor informado seja menor que 1.
     */

    public static boolean quadradoPerfeito(int k){
        
        if (k < 1) {
            throw new IllegalArgumentException("Informe um valor maior que 1 para k!");
        }
        
        int i = 1;
        int q = 1;
        
        while(q < k){
            
            i = i + 2;
            q = q + i;
            
        }
        
        if(q == k){
            return true;
        }else{           
            return false;
        }
    }
    
    public static void main(String[] args) {
 
        System.out.println(quadradoPerfeito(16));
    
    }
    
}
