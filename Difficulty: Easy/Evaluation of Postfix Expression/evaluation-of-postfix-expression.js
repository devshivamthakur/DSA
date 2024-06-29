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
        let S = readLine();
        let obj = new Solution();
        console.log(obj.evaluatePostfix(S));
        
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {string} S
 * @returns {number}
*/

class Solution
{
    //Function to evaluate a postfix expression.
    evaluatePostfix(S)
    {
        //your code here

        let arr = [];
        let index = 0;
        while(index < S.length){
            let char = S.charAt(index);
            if(['*','/','-','+'].includes(char)){
                
                let op2 = arr.pop()
                let op1 = arr.pop()
                
                arr.push(this.solveop(Number(op1),Number(op2),char))
                
            }else{
                arr.push(char);
            }
                index++;
               
        }
        
        // console.log(arr,ans,index);
        // console.log(arr)
        let ans = arr.pop()
        return ans == '-0' ? 0 : ans ;
        
        
    }
    
    
    solveop(op1,op2,operator){
        // console.log(op1,op2,operator)
        switch(operator){
            case '+':
                return op1 + op2
            case '-':
                return op1 - op2
            case "*":
                return op1 * op2;
            case '/':
                return Math.floor(op1/op2)
        }
    }
    
    
}