//{ Driver Code Starts
// Initial Template for javascript
// Position this line where user code will be pasted.
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
        let x = parseInt(readLine());
        let input_line = readLine().split(' ');
        let arr = input_line.map(num => parseInt(num));

        let obj = new Solution();
        let ans = obj.getFloorAndCeil(x, arr);
        console.log(ans[0], ans[1]);
        console.log("~");
    }
}

// } Driver Code Ends


// User function Template for javascript

class Solution {
    getFloorAndCeil(x, arr) {
        arr.sort((a,b)=>a-b)
        // code here
        let start = 0, end = arr.length-1;
        let mid = Math.floor(start + (end-start)/2)
        let flor = -1, ceil = -1;
        while(start<=end){
            // console.log(mid)
            if(arr[mid] == x){
                return [arr[mid], arr[mid]]
            }else if(arr[mid] < x){
                flor = arr[mid]
                start = mid + 1;
            }else{
                if(arr[mid] > x){
                    ceil = arr[mid];
                }
                end = mid-1;
            }
            
            
            mid = Math.floor(start + (end-start)/2)
        }
        
        return [flor, ceil]
    }
}
