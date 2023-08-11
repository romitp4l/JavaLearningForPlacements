
public class BubbleSort {
    public static void main(String[] args) {
        /*
        **Bubble Sort Definition:**

        Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated for each element until the entire list becomes sorted.

**Explanation:**

        1. The algorithm starts by comparing the first two elements of the array. If the first element is greater than the second element, they are swapped.

        2. The algorithm then moves to the next pair of elements (element at index 1 and element at index 2) and compares them. If they are out of order, they are swapped. This process continues until the end of the array.

        3. After the first pass, the largest element will have "bubbled up" to the end of the array.

        4. The algorithm then repeats the same process for the remaining elements, excluding the already sorted portion at the end.

        5. This process is repeated for each element in the array, gradually moving the larger elements towards the end and forming a sorted portion at the end of the array.

**Example:**

        Let's walk through an example using the array `[5, 2, 9, 1, 5, 6]`.

                **Step 1: Initial Array**
```
[5, 2, 9, 1, 5, 6]
```

**Step 2: First Pass**
        - Compare 5 and 2. Swap them.
```
[2, 5, 9, 1, 5, 6]
```
        - Compare 5 and 9. No need to swap.
        - Compare 9 and 1. Swap them.
```
[2, 5, 1, 9, 5, 6]
```
        - Compare 9 and 5. Swap them.
```
[2, 5, 1, 5, 9, 6]
```
        - Compare 9 and 6. Swap them.
```
[2, 5, 1, 5, 6, 9]
```
        The largest element, 9, is now at the end.

**Step 3: Remaining Passes**
        - Repeat the same process for the remaining elements. After each pass, the largest unsorted element will move to its correct position.

                **Step 4: Sorted Array**
```
[1, 2, 5, 5, 6, 9]
```

        Bubble sort is not efficient for large lists due to its quadratic time complexity (O(n^2)), but it's easy to understand and implement.
        */
    }
}

