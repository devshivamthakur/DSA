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
        let obj = new MyQueue();
        let q = parseInt(readLine());
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        let index = 0;
        let s = '';
        while(q--){
            if(input_ar1[index] === 1){
                index++;
                let a = input_ar1[index++];
                obj.push(a);
            }
            else{
                index++;
                s += obj.pop() + " ";
            }
        }
        console.log(s);
        
    }
}
// } Driver Code Ends


//User function Template for javascript

class MyQueue {
    
    constructor(){
		this.front = 0;
		this.rear = 0;
		this.arr = new Array(100005);
	}
	
	
	/**
     * @param {number} x
    */
    
	//Function to push an element x in a queue.
	push(x)
	{
	    if(this.rear != 100005 ){
	    this.arr[this.rear++] = x;
	        
	    }
	    
	} 
	
	/**
     * @returns {number}
    */

    //Function to pop an element from queue and return that element.
	pop()
	{
		if(!this.isEmpty()){
		    
		    let ele = this.arr[this.front];
		    this.arr[this.front] = -1;
		    this.front++;
		    if(this.isEmpty()){
		        this.front = 0
		        this.rear = 0;
		    }

		    return ele
		    
		}
// 		console.log(this.front,this.rear)
		
		return -1;
	} 
	
	isEmpty(){
	    return this.front == this.rear;
	}
}
