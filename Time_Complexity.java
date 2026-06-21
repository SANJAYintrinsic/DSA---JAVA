| Complexity | Name         | Example                        |
| ---------- | ------------ | ------------------------------ |
| O(1)       | Constant     | Access array element           |
| O(log n)   | Logarithmic  | Binary Search , * , /          |
| O(n)       | Linear       | Single loop                    |
| O(n log n) | Linearithmic | Merge Sort                     |
| O(n²)      | Quadratic    | Nested loops                   |
| O(2ⁿ)      | Exponential  | Recursive Fibonacci            |
| O(n!)      | Factorial    | Traveling Salesman brute force |

how much time a program takes as input size n increases.
how much extra memory a program uses.

O(1) — Constant Time
class Example {
        int[] arr = {10,20,30,40};
        System.out.println(arr[2]);
    }
}

O(1) - constant
for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
       System.out.println(i + " " + j);            
        }


O(n) — Linear Time
Two Separate Loops → O(n)
class Example {
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

Linear Search
| Case         | Situation                 | Complexity |
| ------------ | ------------------------- | ---------- |
| Best Case    | Element at first position | O(1)       |
| Average Case | Middle                    | O(n)       |
| Worst Case   | Last or not present       | O(n)       |

for(int i=1;i<n;i*=2)  -  O(n)
{
    for(int j=0;j<i;j++)
    {
    }
}
for(int i=0;i<n or i<n/2 or i<n*n;i++)  for all n - O(n)



O(n²) — Quadratic Time
Nested Loop Example
class Example {
    public static void main(String[] args) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.println(i + " " + j);
            }
        }
Three Loops But Not O(n³) - O(n²)
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        for(int k=0;k<100;k++)
        {
        }
    }
} 100 is constant.


    
Three Nested Loops
for(...)
   for(...)
      for(...)
→ O(n³)

    
    
O(log n) — Binary Search
Multiplying Instead of Adding - O(log n)
for(int i=1; i<n; i=i*2)
{
}
Logarithm Base Doesn't Matter - O(log n)
for(int i=1; i<n; i*=3)
{
}



O(n log n) - Merge Sort
Dividing array → log n
Merging arrays → n

Outer Linear, Inner Logarithmic - O(n log n)
for(int i=0; i<n; i++)
{
    for(int j=1; j<n; j*=2)
    {
    }
}

While Inside While - O(n log n)
int i=1;
while(i<n)
{
    int j=1;
    while(j<n)
    {
        j*=2;
    }
    i++;
}



Square Root Loop  -  O(√n)
for(int i=1; i*i<n; i++)
{
}

O(2ⁿ) — Exponential Time
Recursive Fibonacci

O(n!) — Factorial Time
Permutations

O((log n)²)
for(int i=1;i<n;i=i*2)
{
    for(int j=1;j<n;j=j*2)
    {
    }
}

