public class InsertionSort_EmployeeIDs {
    
    public static void insertionSort(int[] employeeIDs) {
        for (int i = 1; i < employeeIDs.length; i++) {
            int key = employeeIDs[i];
            int j = i - 1;
            
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }
            
            employeeIDs[j + 1] = key;
        }
    }
    public static void printEmployeeIDs(int[] employeeIDs) {
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] employeeIDs = {1034, 1057, 1012, 1089, 1045, 1023, 1067, 1019, 1056, 1033};
        
        System.out.println("Original Employee IDs:");
        printEmployeeIDs(employeeIDs);
        
        insertionSort(employeeIDs);
        
        System.out.println("Sorted Employee IDs (Ascending):");
        printEmployeeIDs(employeeIDs);
    }
}
