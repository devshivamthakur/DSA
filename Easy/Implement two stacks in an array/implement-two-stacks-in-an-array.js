//{ Driver Code Starts
// Initial Template for javascript

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

// Position this line where user code will be pasted.

function main() {
    let inputIndex = 0;
    const T = parseInt(inputString[inputIndex++]);
    for (let i = 0; i < T; i++) {
        const g = new TwoStacks();
        const Q = parseInt(inputString[inputIndex++]);
        for (let j = 0; j < Q; j++) {
            const query = inputString[inputIndex++].split(' ').map(Number);
            const stack_no = query[0];
            const QueryType = query[1];
            if (QueryType === 1) {
                const a = query[2];
                if (stack_no === 1) {
                    g.push1(a);
                } else if (stack_no === 2) {
                    g.push2(a);
                }
            } else if (QueryType === 2) {
                if (stack_no === 1) {
                    process.stdout.write(g.pop1() + ' ');
                } else if (stack_no === 2) {
                    process.stdout.write(g.pop2() + ' ');
                }
            }
        }
        console.log();
    }
}

// } Driver Code Ends


// User function Template for javascript
class TwoStacks {
    top1=-1
    top2=100
    size=100
    // constructor for twoStacks()
    constructor() {
        this.arr =[]
        this.top1 = -1
        this.top2 = 100
    }

    // Function to push an integer into the stack1.
    push1(x) {
        // console.log(this.top2 - this.top1)
        //if stack not full
        if(this.top2 - this.top1 > 2){
            this.top1++;
            this.arr[this.top1] = x
        }
    }

    // Function to push an integer into the stack2.
    push2(x) {
        //if stack not full
        if(this.top2 - this.top1 > 2){
            this.top2--;
            this.arr[this.top2] = x
        }
    }

    // Function to remove an element from top of the stack1.
    pop1() {
        // console.log(this.top1)
        //if stack having at least 1 element
        if(this.top1 > -1){
            const data = this.arr[this.top1]
            this.top1--;
            return data;
            
        }else{
            
            return -1;
            
        }
    }

    // Function to remove an element from top of the stack2.
    pop2() {
                //if stack not full
        if(this.top2 < 100){
            const data = this.arr[this.top2]
            this.top2++;
            return data;
            
        }else{
            
            return -1;
            
        }
    }
}
