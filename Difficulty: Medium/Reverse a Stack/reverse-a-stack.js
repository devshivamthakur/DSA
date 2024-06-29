//{ Driver Code Starts
//Initial Template for javascript

// Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let St = readLine().trim().split(" ").map((x) => parseInt(x));
        let obj = new Solution();
        obj.reverse(St, n);
        let S = "";
        for(let i=0; i<n; i++){
            S+=St[i]+" ";
        }
        console.log(S);
    }
}

// } Driver Code Ends

//User function Template for javascript
/**
 * @param {string} St
 * @returns {string}
*/

class Solution {
    //Function to reverse a string.
    
    reverse(St) {
        // console.log(typeof St)
        //your code here
        // let arr = []
        let ans = this.solve(St);
        ans = ans.split(" ")
        for(let i = 0;i<ans.length;i++){
            // if(ans[)
            St[i] = ans[i];
        }

    }
    
    solve(arr){
        if(arr.length == 0) return ""
        if(arr.length == 1){
            
            return arr.pop();
        }
        
        
        let top = arr.pop();
       let ans = top+ " " +this.solve(arr)
        return ans
    }
    
}