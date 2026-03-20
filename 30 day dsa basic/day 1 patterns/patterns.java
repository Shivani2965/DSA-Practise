class patterns {
    public static void main(String[] args) {
        int n = 3;
        patterns p = new patterns();
        // p.pattern1(n);
        // System.out.println("2nd pattern");
        // p.pattern2(n);
        // System.out.println("3rd pattern");
        // p.pattern3(n);
        // System.out.println("4th pattern");
        // p.pattern4(n);
        // System.out.println("5th pattern");
        // p.pattern5(n);
        // System.out.println("6th pattern");
        // p.pattern6(n);
        // System.out.println( "7th pattern");
        // p.pattern7(n);
        // System.out.println("8th pattern");
        // p.pattern8(n);

        //striver sheet patterns
        // System.out.println("9th pattern");
        // p.pattern9(n);
        // p.pattern10(n);
        // p.pattern11(n);
        // p.pattern12(n);
        // p.pattern13(n);


        //apna clg patteern 11
        // p.pattern14(n);
            p.pattern15(n);
    }

    void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }// striver sheet patterns

    void pattern9(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(+j);

            }
            System.out.println();

        }
    }

    void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(+i);

            }
            System.out.println();

        }
    }

    void pattern11(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(+j);

            }
            System.out.println();

        }
    }

    void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            //space n-i-1
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");

            }
            //stars 2*i+1
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(" *");

            }
            //space
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");

            }

            System.out.println();

        }
    }
    ///sharda apna college 11. pattern
    /// 

    void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n - i ; j++) {
            System.out.print(" -");
            }
            for (int j = 0; j <n; j++) {
                System.out.print("* ");

            }

        }
    }

    void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            //space n-i-1
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");

            }
            //stars 2*i+1
            for (int j = 0; j < i; j++) {
                System.out.print(+i+" ");

            }
            //space
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");

            }

            System.out.println();

        }
    }

    //palindrom pattern
    
}
