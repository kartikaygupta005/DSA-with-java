class Solution { 
    public int[] arrayRankTransform(int[] arr) { 
        int[] temp = arr.clone(); 
        int n = arr.length; 
        int[] answer = new int[n];  

        transform(arr, temp, n, answer);

        return answer;
    } 

    private static void transform(int[] arr, int[] temp, int n, int[] answer) { 
        Arrays.sort(temp); 
        int rank = 1;

        for (int i = 0; i < n; i++) { 
            if (i > 0 && temp[i] == temp[i - 1]) {
                continue;
            }

            for (int j = 0; j < n; j++) {
                if (arr[j] == temp[i]) {
                    answer[j] = rank;
                }
            }

            rank++;
        }
    } 
}
