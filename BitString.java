import java.util.*; 
  
class BitString
{ 
  
static int mod = (int) (1e9 + 7); 
  
// Iterative Function to calculate (x^y)%p in O(log y) 
static int power(int x, int y, int p) 
{ 
    int res = 1; // Initialize result 
  
    x = x % p; // Update x if it is more than or 
    // equal to p 
  
    while (y > 0)  
    { 
  
        // If y is odd, multiply x with result 
        if ((y & 1)==1) 
            res = (res * x) % p; 
  
        // y must be even now 
        y = y >> 1; // y = y/2 
        x = (x * x) % p; 
    } 
    return res; 
} 
  
// Function to count the number of binary 
// strings of length N having only 0's and 1's 
static int findCount(int N) 
{ 
    int count = power(2, N, mod); 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    Scanner in =new Scanner(System.in);
        int N = in.nextInt();; 
        System.out.println(findCount(N)); 
} 
}  
  
