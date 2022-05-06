import java.util.HashMap;
 
public class desafioThree {
     
    // Função para retornar a contagem
    // de todos os pares válidos
    static int countPairs(int arr[], int n)
    {
     
        // Para armazenar as frequências
        // de (arr[i] - i)
        HashMap<Integer,
                Integer> map = new HashMap<Integer,
                                           Integer>();
        for (int i = 0; i < n; i++)
            map.put(arr[i] - i, 0);
         
        for (int i = 0; i < n; i++)
            map.put(arr[i] - i, map.get(arr[i] - i) + 1);
     
        // Para armazenar a contagem necessária
        int res = 0;
        for (int x : map.values())
        {
            int cnt = x;
     
            // Se cnt é o número de elementos
            // cuja diferença com seu índice
            // é o mesmo então ((cnt * (cnt - 1)) / 2)
            // tais pares são possíveis
            res += ((cnt * (cnt - 1)) / 2);
        }
     
        return res;
    }
     
    public static void main (String[] args)
    {
        int arr[] = { 1, 5, 3, 4, 2 };
        int n = arr.length;
     
        System.out.println(countPairs(arr, n));
    }
}
