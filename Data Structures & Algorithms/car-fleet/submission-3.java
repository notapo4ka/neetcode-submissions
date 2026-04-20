class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int[][] cars = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, Comparator.comparingInt(a -> a[0]));
        reverseArray(cars);


        double prevCarTime = (double) (target - cars[0][0]) / cars[0][1];
        int carFleets = 1;

        for (int i = 1; i < cars.length ; i++) {
            double currentCarTime = (double) (target - cars[i][0]) / cars[i][1];

            if (currentCarTime > prevCarTime) {
                carFleets++;
                prevCarTime = currentCarTime;
            }
        }

        return carFleets;
    }

    private void reverseArray(int[][] cars) {
        for (int i = 0; i < cars.length / 2; i++) {
            int[] temp = cars[i];
            cars[i] = cars[cars.length - 1 - i];
            cars[cars.length - 1 - i] = temp;
        }
    }
}
