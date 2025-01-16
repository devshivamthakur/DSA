//{ Driver Code Starts
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
    let tc = parseInt(readLine());
    while (tc > 0) {
        let arr = readLine().split(' ').map(Number);
        let k = parseInt(readLine());

        let obj = new Solution();
        let res = obj.findFloor(arr, k);

        console.log(res); // Print the array as a space-separated string
        console.log("~");
        tc--;
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

    findFloor(arr, k) {
        if(arr.length ==0) return -1;
        if(k==0) return -1;
    
        // your code here
        let start = 0, end = arr.length - 1;
        let mid = Math.floor(start + (end-start) /2)
        let secMax = -1;
        let maxele = -1
        
        while(start<=end){
            if(arr[mid] == k){
                return mid;
            }else if (arr[mid] < k){
                secMax = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        
            mid = Math.floor(start + (end-start) /2)
        }
        return secMax;
    }
}