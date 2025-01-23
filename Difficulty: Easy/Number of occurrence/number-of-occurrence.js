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

function printList(res, n) {
    let s = "";
    for (let i = 0; i < n; i++) {
        s += res[i];
        s += " ";
    }
    console.log(s);
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for (; i < t; i++) {
        let input_ar1 = readLine().split(' ').map(x => parseInt(x));
        let n = input_ar1.length;
        let arr = new Array(n);
        for (let i = 0; i < n; i++) {
            arr[i] = input_ar1[i];
        }
        let x = parseInt(readLine());
        let obj = new Solution();
        let res = obj.countFreq(arr, x);
        console.log(res);
        console.log("~");
    }
} // } Driver Code Ends

// } Driver Code Ends


// User function Template for javascript
/**
 * @param {number[]} arr
 * @param {number} target
 * @returns {number}
 */

class Solution {
    // Function to count the occurrences of x in the array.
    countFreq(arr, target) {
        if(!arr.length) return 0;
        if(arr.length == 1 && arr[0] == target) return 1;
        
        const first = this.bs(0, arr.length-1, arr, target, true)   
        const last = this.bs(0, arr.length-1, arr, target, false);
        // console.log(first, last)
        
        return (last>-1 && first>-1) ? (last - first)  + 1 : 0

    }
    
    bs(start, end, arr, target, lefts){

        let mid = Math.floor(start + (end - start) / 2);
        let count = -1;
        
        while(start <= end){
            
            if(arr[mid] == target){

                if(lefts){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
                
                count = mid;

            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            
            
            mid = Math.floor(start + (end - start) / 2);
        }
        
        return count;
    }
}