public class SelectionSort_ExamScores {
    
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
    public static void printScores(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] scores = {78, 92, 56, 88, 64, 95, 72, 85, 68, 91};
        
        System.out.println("Original Exam Scores:");
        printScores(scores);
        
        selectionSort(scores);
        
        System.out.println("Sorted Exam Scores (Ascending):");
        printScores(scores);
    }
}
