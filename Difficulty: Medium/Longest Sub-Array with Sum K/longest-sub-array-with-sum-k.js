//{ Driver Code Starts
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => { inputString += inputStdin; });

process.stdin.on('end', () => {
    inputString = inputString.trim().split('\n').map(string => string.trim());
    main();
});

function readLine() { return inputString[currentLine++]; }

function printList(arr) { console.log(arr.join(' ')); }

function main() {
    let t = parseInt(readLine(), 10);
    for (let i = 0; i < t; i++) {
        let arr = readLine().split(' ').map(x => parseInt(x, 10));
        let k = parseInt(readLine(), 10);
        let obj = new Solution();
        let res = obj.lenOfLongestSubarr(arr, k);
        console.log(res);
        console.log("~");
    }
}

// } Driver Code Ends


// User function Template for javascript

/**
 * @param {number[]} arr
 * @param {number} k
 * @returns {number}
 */
class Solution {
    lenOfLongestSubarr(arr, k) {
        
   let prefixSum = 0;
    let maxLength = 0;
    const prefixMap = new Map();

    for (let i = 0; i < arr.length; i++) {
        prefixSum += arr[i];

        // If the current prefix sum equals k, update maxLength
        if (prefixSum === k) {
            maxLength = i + 1;
        }

        // If (prefixSum - k) exists in the map, update maxLength
        if (prefixMap.has(prefixSum - k)) {
            maxLength = Math.max(maxLength, i - prefixMap.get(prefixSum - k));
        }

        // Add the current prefix sum to the map if not already present
        if (!prefixMap.has(prefixSum)) {
            prefixMap.set(prefixSum, i);
        }
    }

    return maxLength;
    }
}
