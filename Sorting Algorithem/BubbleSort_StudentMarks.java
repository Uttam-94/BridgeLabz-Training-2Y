public class BubbleSort_StudentMarks {
    
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
    }
    public static void printMarks(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] marks = {85, 92, 45, 78, 61, 88, 73, 95, 56, 82};
        
        System.out.println("Original Marks:");
        printMarks(marks);
        
        bubbleSort(marks);
        
        System.out.println("Sorted Marks (Ascending):");
        printMarks(marks);
    }
}
