class Node {
    constructor(data) {
        this.data = data;
        this.next = null
    }
}

class Stack {

    root;
    top;
    constructor() {
        this.root = null;
        this.top = null;

    }

    push(number) {

        //check if the stack is empty
        if (this.root == null) {
            this.root = new Node(number)
            this.top = this.root;
            return true;
        }


        this.top.next = new Node(number)
        this.top = this.top.next

        return true



    }

    pop() {

        //check if stack is empty
        if (this.root == null || this.top == null) return -1;

        //if there is only one element
        if (this.root.next == null) {
            let data = this.root.data
            this.root = null
            this.top = null
            return data
        }

        //find the last element in the stack
        let temp = this.root
        while (temp.next != this.top) {
            temp = temp.next
        }

        // console.log(temp)
        let data = temp.next.data
        temp.next = null

        this.top = temp
        // console.log(this.root,this.top)
        return data

    }

    peek() {
        if (this.root == null || this.top == null) return -1;

        return this.top.data;
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

console.log(obj.peek())



console.log(obj.peek())
