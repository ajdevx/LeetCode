// Last updated: 15/09/2025, 19:35:49
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* result = (int*)malloc(2 * sizeof(int)); // Allocate memory for the result array

    if (result == NULL) {
        *returnSize = 0; // Memory allocation failed
        return NULL;
    }

    for (int i = 0; i < numsSize; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                *returnSize = 2;
                return result; // Return the result array
            }
        }
    }

    // If no solution is found, free the allocated memory and return NULL
    free(result);
    *returnSize = 0;
    return NULL;
}
