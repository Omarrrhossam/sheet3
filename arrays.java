
    public class Main {
        public static Integer max(ArrayList<Integer> list) {

            if (list == null || list.size() == 0) {
                return null;
            }


            Integer max = list.get(0);

            // Iterate through the list to find the maximum value
            for (Integer num : list) {
                if (num > max) {
                    max = num;
                }
            }

            return max;
        }

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(3);
            numbers.add(2);

            System.out.println(max(numbers));

            ArrayList<Integer> emptyList = new ArrayList<>();
            System.out.println(max(emptyList)); // Output: null

            System.out.println(max(null));
        }
    }



}
