public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) { // Check boundary condition before accessing
            arr[4] = 10; // Correct index
            System.out.println(arr[4]); // Access within bounds
        }
        else{
            System.out.println("Index out of bounds");
        }
    }
}