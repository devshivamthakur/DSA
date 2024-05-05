class Stack {
    arr;
    top;
    size;

    constructor(size) {
        this.arr = [];
        this.size = size;
        this.top = -1;
        // console.log(this.arr)
    }

    push(number) {
        //if stack is available to push
        if (this.size - this.top < 2) return false

        this.top++;
        this.arr[this.top] = number
        // console.log(this.arr,this.top)
        return true
    }

    pop() {
        console.log(this.top)
        //if stack having empty stack
        if (this.top == -1) return -1

        let index = this.top
        this.top--;
        //delete element from Top of stack
        return this.arr.splice(index, 1)[0]

    }

    peek() {
        //if stack having empty stack
        if (this.top == -1) return -1

        return this.arr[this.top]

    }

}

let obj = new Stack(10)
obj.push(1)
obj.push(2)
obj.push(3)
obj.push(4)
obj.push(5)
obj.push(6)
obj.push(7)
obj.push(8)
obj.push(9)
obj.push(10)
obj.push(8)
obj.push(9)
obj.push(10)

obj.pop()
obj.pop()
obj.pop()
obj.pop()
obj.pop()
obj.pop()
obj.pop()
obj.pop()
obj.pop()
// obj.pop()
// obj.pop()






console.log(obj.arr)
// console.log(obj.pop())
// console.log(obj.peek())

