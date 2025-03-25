public class whileloop {

    public static void main(String[] args) {
        int a = 1;
        while (a <= 8) {
            System.out.println("hello " + a);
            a++;
        }

        // Call the doWhile method
        doWhile();
        forloop();
    }

    public static void doWhile() {
        int i = 1;
        do {
            System.out.println("Printing the do loop! " + i);
            i++;
        } while (i <= 10);
    }
    public static void forloop() {
    	
    	for (int i = 0; i < 5; i++) {
    		  System.out.println(i);
    		}
	}
}
