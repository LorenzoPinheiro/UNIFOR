public class Recurssao {

    public static int fatorial(int n){
        if(n < 0 ) throw new RuntimeException("Apenaas existe fatorial de numeros positivos");
        if(n == 0){
            return 1;
        }
        return n * fatorial(--n); // --n == n - 1 é diferente de n--
    }

    private static int somaLinear(int[] array, int index){
        if(index == array.length - 1){
            return array[index];
        }
        int aux = somaLinear(array,index+1);
        return array[index] + aux;
    }
    public static int somaLinear(int[] array){
        return somaLinear(array, 0);
    }


    private static void reverter(int[] array, int low, int high){
        if(low < high){
            array[low] = array[low] + array[high];
            array[high] = array[low] - array[high];
            array[low] = array[low] - array[high];
            reverter(array, low+1, high+1);
        }
    }
    public static void reverter(int[] array){
        reverter(array, 0, array.length-1);
    }


    public static int fibonacci(int n){
        if(n <= 2){
            return n-1;
        }
        return fibonacci(--n) + fibonacci(--n);
    }

    public static int regressiva(int n){
        System.out.println(n);
        if(n <=1){
            return 0;
        }
        else{
            return regressiva(n-1);
        }
    }





}
