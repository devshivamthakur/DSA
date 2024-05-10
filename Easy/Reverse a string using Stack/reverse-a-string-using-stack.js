//{ Driver Code Starts
//Initial Template for javascript

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
        let S = readLine().trim(); 
        let obj = new Solution();
        let res = obj.reverse(S);
        console.log(res);
    }
}

// } Driver Code Ends


//User function Template for javascript

/**
 * @param {string} S
 * @return {string}
*/
class Stack{
    arr=[]
    top = -1 
    constructor(){
        this.arr = []
        
    }
    
    push(x){
        this.top++;
        this.arr[this.top] = x
        
    }
    
    pop(){
        if(this.top != -1){
            return this.arr[this.top--]
        }
        
        return -1;
    }
}

class Solution {
    
    reverse(S){
        const stack = new Stack();
       //code here
       let ans ="";
       for(let i=0;i<S.length;i++){
           stack.push(S.charAt(i))
       }
       
       while(stack.top != -1){
           ans+=stack.pop();
       }
       
       return ans;
    }
}