
public class Main {
    public static void sort(ArrayList<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("The list cannot be null");
        }


        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Before sorting: " + numbers);
        sort(numbers);
        System.out.println("After sorting: " + numbers);
    }
}

