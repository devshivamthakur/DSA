//{ Driver Code Starts
// Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => { inputString += inputStdin; });

process.stdin.on('end', _ => {
    inputString =
        inputString.trim().split('\n').map(string => { return string.trim(); });

    main();
});

function readLine() { return inputString[currentLine++]; }

function main() {
    let t = parseInt(readLine());
    for (let i = 0; i < t; i++) {
        const arr = readLine().split(' ').map(x => parseInt(x));
        let obj = new Solution();
        let ans = obj.maxSubarraySum(arr);
        if (ans == -0) ans = 0;
        console.log(ans);
    }
}
// } Driver Code Ends


// User function Template for javascript

/**
 * @param {number[]} arr
 * @returns {number}
 */
class Solution {
    // Function to find the sum of contiguous subarray with maximum sum.
    maxSubarraySum(nums) {
    let sum = 0, maxSum = nums[0]
   for(let i=0; i<nums.length; i++){

    //1st add sum with current element
    sum += nums[i]

    //2nd update the maxSum
    // maxSum = Math.max(sum, maxSum);
    if(sum > maxSum){
        maxSum = sum;
    }

    //check if sum goes to negative if yes reset the sum
    if(sum < 0) sum = 0;
   }

    return maxSum;
    }
}