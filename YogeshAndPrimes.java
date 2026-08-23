import java.util.* ;
import java.io.*; 
import java.util.Scanner;

public class Solution {

    
    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int[] A = new int[Q];
        int[] B = new int[Q];
        int[] K = new int[Q];
        for(int i = 0 ; i < Q ; i++){
            A[i] = scan.nextInt();
            B[i] = scan.nextInt();
            K[i] = scan.nextInt();
            max = Math.max(max,B[i]);
        }
        int[] primes = new int[max+1];
        formPrimes(max,primes);
        for(int i = 0 ; i < Q ; i++){
            System.out.println(findKthPrime(A[i],B[i],K[i],primes));
        }
    }
    private static void formPrimes(int B,int[] primes){
        Arrays.fill(primes,1);
        primes[0]=0;
        primes[1]=0;
        for(int i = 2 ; i <= B/i ; i++){
            if(primes[i]==1){
                for(int j = i*i ; j <=B ; j+=i){
                    primes[j]=0;
                }
            }
        }
        //System.out.println(Arrays.toString(primes));
        for(int i = 2;i<=B ; i++){
            primes[i]+=primes[i-1];
        }
    }

    private static int findKthPrime(int A,int B,int K,int[] primes){
        K = primes[A-1]+K;
        int low = A;
        int high = B;
        int res = -1;
        //System.out.println(Arrays.toString(primes));
        while(low<=high){
            int mid = (low+high)/2;
            if(primes[mid]==K){
                res = mid;
                high = mid-1;
            }else if(primes[mid]<K){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
    
    private static int findKthPrime1(int A,int B,int K){
        int primC = 0;
        for(int i = A ; i <= B ; i++){
            if(isPrime(i)){
                //System.out.println(i);
                primC++;
                if(primC==K)return i;
            }
        }
        return -1;
    }
    private static boolean isPrime(int num){
        if(num==2||num==3)return true;
        if(num==1||num%2==0||num%3==0)return false;
        for(int i = 5 ; i <= num/i ; i+=6){
            if(num%i==0||num%(i+2)==0)return false;
        }
        return true;
    }
}
