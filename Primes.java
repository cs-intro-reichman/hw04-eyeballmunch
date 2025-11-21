public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        
        int N = Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            if(i !=2 && i % 2 == 0){
                isPrime[i] = false;
            }
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= N; p++) {
            if (isPrime[p]){

                for (int multiple = p * p; multiple <= N; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
            
        }

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }

        System.out.println("Prime numbers up to " + N + ":");
    
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        
        int percentage = (int) Math.round((100.0 * count) / (N - 1));
        System.out.println("There are " + count + " primes between 2 and " + N + " (" + percentage + "% are primes)");

    }
}