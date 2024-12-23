//{ Driver Code Starts
// Initial Template for javascript

"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => { inputString += inputStdin; });

process.stdin.on("end", (_) => {
    inputString =
        inputString.trim().split("\n").map((string) => { return string.trim(); });

    main();
});

function readLine() { return inputString[currentLine++]; }

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for (; i < t; i++) {
        let input1 = readLine().split(' ').map(x => parseInt(x));
        let a = input1;
        let obj = new Solution();
        let res = obj.pairWithMaxSum(a);
        console.log(res);
        console.log("~");
    }
}

// } Driver Code Ends


// User function Template for javascript
/**
 * @param {number[]} arr
 * @returns {number[]}
 */

class Solution {
    // Function to find a pair with maximum sum in the given array.
    pairWithMaxSum(arr) {
    let maxScore = 0;

    for (let i =0; i < arr.length-1; i++) {
        if(arr[i] + arr[i+1] > maxScore){
            maxScore = Math.max(maxScore, arr[i] + arr[i+1])
        }
       
    }

    return maxScore;
        
    }
}