class GettingLoopy {
    public static void main(String[] args) {
        // Part A: Counting (for) Loops
        System.out.println("Part A: Counting (for) Loops");

        // 1. Loop that counts up by 1 from 0 to 30
        System.out.println("1. Loop that counts up by 1 from 0 to 30");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Loop that counts down by 1 from 30 to 0
        System.out.println("2. Loop that counts down by 1 from 30 to 0");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Loop that counts up by 3 from 0 to 18
        System.out.println("3. Loop that counts up by 3 from 0 to 18");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. Loop that counts down by 2 from 10 to 0
        System.out.println("4. Loop that counts down by 2 from 10 to 0");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Part B: Output for loops
        System.out.println("\nPart B: Output for loops");

        // 5. Nested loop that creates the figure *
        System.out.println("5. Nested loop that creates the figure *");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 6. Nested loop that creates the figure *****
        System.out.println("6. Nested loop that creates the figure *****");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 7. Nested loop that creates the figure *****
        System.out.println("7. Nested loop that creates the figure *****");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}