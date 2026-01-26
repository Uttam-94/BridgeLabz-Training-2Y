public class CountingSort_StudentAges {
    
    public static void countingSort(int[] ages) {
        if (ages.length == 0) {
            return;
        }
        
        int minAge = ages[0];
        int maxAge = ages[0];
        
        for (int age : ages) {
            if (age < minAge) {
                minAge = age;
            }
            if (age > maxAge) {
                maxAge = age;
            }
        }
        
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        
        for (int age : ages) {
            count[age - minAge]++;
        }
        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        int[] output = new int[ages.length];
        
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }
        
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }
    public static void printAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 13, 17, 11, 14, 16, 12, 18, 10, 15, 14, 17, 13};
        
        System.out.println("Original Student Ages:");
        printAges(ages);
        
        countingSort(ages);
        
        System.out.println("Sorted Student Ages (Ascending):");
        printAges(ages);
    }
}
