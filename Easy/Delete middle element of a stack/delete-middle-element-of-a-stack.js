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
    for(let i=0;i<t;i++)
    {
        let input_line = readLine().split(' ');
        let sizeOfStack = parseInt(input_line[0]);
    
        input_line = readLine().split(' ');
        let myStack = new Stack();
        for(let i=0;i<sizeOfStack;i++){
            myStack.push(BigInt(input_line[i]));
        }
        let obj = new Solution();
        let ans = obj.deleteMid(myStack, sizeOfStack);
        let s="";
        while(!myStack.empty())
        {
            s+=myStack.top()+" ";
            myStack.pop();
        }
        console.log(s);
    }
}
class Stack
{
    constructor(){
        this.a = new Array();
    }
    top(x){
        return this.a[this.a.length-1];
    }
    push(x){
        this.a.push(x);
    }
    pop(){
        if(this.a.length!=0)
            this.a.pop();
    }
    empty(){
        return this.a.length==0;
    }
}
// } Driver Code Ends


//User function Template for javascript



/**
 * @param {Stack} s
 * @param {number} sizeOfStack
*/
class Solution 
{
    //Function to delete middle element of a stack.
    deleteMid(s, sizeOfStack)
    {
    let mid = Math.floor((sizeOfStack /2))
    // console.log(mid)
    this.deleteHelp(s,mid,0);
    // console.log(s)

        
    }
    
    deleteHelp(s,mid,index){
        //if we reached to the middle of the stack
        // console.log(mid,index)
        if(mid == index){
            s.pop();
            return;
            
            
        }
        
        const ele = s.top()
        s.pop()
        this.deleteHelp(s,mid,++index);
        s.push(ele);
        return;
        
        
        
    }
    
    
}
