class pattern {
    public static void main(String[] args) {
        pattern8(5);
        
       
    }

    static void pattern1(int n) {
        for (int i = 0; i < n - i + 1; i++) {
            System.out.print("");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n - i + 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }

        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i<=n; i++) {
            for (int j = 1; j <= n- i; j++) {
                System.out.print(+j);
            }
            
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    } 

    static void pattern10(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10_1(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (stars >= n) {
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(+start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(+j);
            }

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(+j);
            }
            System.out.println();
            space -= 2;
        }
    }

    static void pattern13(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + a);
                a++;
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + n - i - 1; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);

            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = (char) ('A');
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
            space -= 2;
        }

    }

    static void pattern20(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            if (i < n) {
                space -= 2;
            } else {
                space += 2;
            }
            //stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i==0 || i==n-1 || j==0|| j==n-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n){
        for (int i =0; i< 2 * n - 1; i++){
            for (int j=0; j< 2 * n -1; j++){
                int top =i;
                int left= j;
                int right = (2 * n - 2) - i;
                int bottom= (2 * n - 2) - j;
                System.out.print( n- Math.min(Math.min(top, bottom), Math.min(right, left)) + " ");

            }
            System.out.println();

        }
    }
}
