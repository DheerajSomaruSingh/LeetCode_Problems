import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ansrow = new ArrayList<>();
        ansrow.add(1); // First element of the row is always 1
        long ans = 1; // Use long to avoid integer overflow
        for(int i = 1; i <= rowIndex; i++){ // Loop until i <= rowIndex
            ans = ans * (rowIndex + 1 - i) / i; // Correct calculation with double cast
            ansrow.add((int) ans); // Convert long back to int
        }
        return ansrow;
    }
}

