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


function main() {
  let t = parseInt(readLine());
  let i = 0;
 
  for (; i < t; i++) {
    let A = readLine().trim();
    let obj = new Solution();
    let res = obj.FirstNonRepeating(A);
    console.log(res);
  }

}

// } Driver Code Ends


//User function Template for javascript

/**
 * @param {string} A
 * @return {string}
*/

class Solution {
  FirstNonRepeating(A){  //code here
 //code here
    let ans = ""
    let q = [];
    let map =new Map();
    
    // console.log(A.includes('&'))
    
    let prevNon = ans;
    
    for(let i=0; i<A.length; i++){
        let char = A.charAt(i)
        
        map.set(char, (map.get(char) || 0) + 1)
        q.push(char);
    
        while(q.length !=  0){
            if( map.get(q[0]) > 1){
                q.splice(0,1)
            }else{
                ans += q[0];
                break;
            }
            
        }
        
        if(q.length == 0){
            // console.log(q)

            ans += "#"
        }
        
        
    }
    
    return ans;

  }
}
