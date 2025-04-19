public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");


        SortingAlgorithm algorithm  = new SelectionSort();
        SortingAlgorithm algorithm2 = new MergeSort();
        SortingAlgorithm algorithm3 = new InsertionSort();

        if (algorithm != null) {
            algorithm.sort();
            algorithm2.sort();
            algorithm3.sort();
        }
    }
    // private static SortingAlgorithm getSortingAlgorithm() {
    //     return null;
    // }
}
