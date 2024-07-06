//{ Driver Code Starts
//Initial Template for javascript

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
        let s = readLine().trim();
        let obj = new Solution();
        let res = obj.findMaxLen(s);
        if(res === -0)
            res = 0;
        console.log(res);
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {string} s
 * @return {number}
*/


class Solution {
    findMaxLen(s) {
        let stack = [-1]; 
        let maxLen = 0;

        for (let i = 0; i < s.length; i++) {
            if (s.charAt(i) === '(') {
                stack.push(i); 
            } else {
                stack.pop(); 
                if (stack.length === 0) {
                    stack.push(i); 
                } else {
                    maxLen = Math.max(maxLen, i - stack[stack.length - 1]);
                }
            }
        }

        return maxLen; 
    }
}
