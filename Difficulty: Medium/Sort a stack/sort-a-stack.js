//{ Driver Code Starts
//Initial Template for javascript

"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", (_) => {
  inputString = inputString
    .trim()
    .split("\n")
    .map((string) => {
      return string.trim();
    });

  main();
});

function readLine() {
  return inputString[currentLine++];
}

/* Function to print an stack */
function printStack(s, size) {
  let i = size -1;
  let str = "";
  while(s.length > 0){
    str=s[i] + " " + str;
    i--;
    s.pop();
  }
  console.log(str);
}

class Stack {
  constructor(){
    this.stack = [];
  }
}



function main() {
  let t = parseInt(readLine());
  let i = 0;
  for (; i < t; i++) {
    let input_line;
    let N = parseInt(readLine());
    let s = new Stack();
    input_line = readLine().split(" ").map((x) => parseInt(x));
    for(let j = 0;j<N;j++) s.stack.push(input_line[j]);
    s.sort();
    printStack(s.stack,s.stack.length);
    
  }
}

// } Driver Code Ends


//User function Template for javascript

/*
class Stack {
  constructor(){
    this.stack = [];
  }
}
*/


/* The below method sorts the stack s 
you are required to complete the below method */
Stack.prototype.sort = function() {
    
    
    for(let i=0; i<this.stack.length; i++){
        
        for(let j=i+1; j<this.stack.length; j++){
            
            if(this.stack[j] > this.stack[i]){
                
                let temp = this.stack[j];
                this.stack[j] = this.stack[i];
                this.stack[i] = temp
                // console.log(this.stack)
                
            }
            
            
        }
    }
    

};