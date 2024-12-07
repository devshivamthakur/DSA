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
    let i = 0;
    for (; i < t; i++) {
        let arr = readLine().trim().split(" ").map((x) => parseInt(x));
        let k = parseInt(readLine());
        let obj = new Solution();
        console.log(obj.searchInSorted(arr, k) ? "true" : "false");
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

    searchInSorted(arr, k) {
        // your code here
        for(let i=0; i<arr.length; i++){
            if(arr[i] == k) return true
        }
        
        return false;
    }
}