import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class  prg{
    int[] num1 = {1,2,2,1};
    int[] num2 = {2,2};
    HashSet<Integer> dataa = new HashSet<>();
    public  int[] data() {
        for (int i = 0 ; i < num1.length ; i++){
            for (int j = 0 ; j < num2.length ; j++){
                if (num1[i]==num2[j]){
                    dataa.add(num1[i]);
                }
            }
        }
        int[] result = new int[dataa.size()];
        int index = 0;
        for (int num : dataa) {
            result[index++] = num;
        }
        return result;
    }
    }


        public class intersection {
            public static void main(String[] args) {

                prg obj = new prg();
                System.out.println(Arrays.toString(obj.data()));

            }
        }
