//{ Driver Code Starts
process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split("\n").map(string => {
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
    for(;i<t;i++){
        
        let n = parseInt(readLine());
        
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        let k = parseInt(readLine());
        for(let i=0;i<n;i++){
            arr[i] = input_ar1[i];
        }
        
        let obj = new Solution();
        let res = obj.printFirstNegativeInteger(n, k, arr);
        
        let S = '';
        for(let i=0;i<res.length;i++)
        {
            S+=(res[i]);
            S+=' ';
        }
        console.log(S);
        
    }
}

// } Driver Code Ends


class Solution {
/**
* @param number n
* @param number k
* @param number[] arr

* @returns number[]
*/
    printFirstNegativeInteger(n, k, arr) {
        // code here
        let q = []
        let ans = []
        let min = 0;
        
        for(let i=0;i<k;i++){
            if(arr[i] < 0){
                q.push(i)
            }
        }
        
            if(q.length > 0){
                ans.push(arr[q[0]])
            }else{
            ans.push(0)

            }

        for(let i=k; i<arr.length; i++){
            
            //remove a element that outfor from k range
            if(q.length > 0 && i-q[0] >= k ){
                q.splice(0,1);
            }
            
            
            //add 
            if(arr[i] < 0){
                q.push(i);
            }
            
            //
            
            if(q.length > 0){
                ans.push(arr[q[0]])
            }else{
            ans.push(0)

            }
            
        }
        
        
        return ans;
   
    }
}
        
