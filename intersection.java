import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len1 = sc.nextInt();
        int len2 = sc.nextInt();

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        for(int i = 0; i < len1; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < len2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] answer = new int[Math.min(len1, len2)];
        int answer_index = 0;

        for(int i = 0; i < len1; i++) {

            for(int j = 0; j < len2; j++) {

                if(arr1[i] == arr2[j]) {

                    boolean alreadyExists = false;

                    for(int k = 0; k < answer_index; k++) {
                        if(answer[k] == arr1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }

                    if(!alreadyExists) {
                        answer[answer_index] = arr1[i];
                        answer_index++;
                    }

                    break;
                }
            }
        }

        for(int i = 0; i < answer_index; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
