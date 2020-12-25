
public class Bst<T extends Comparable<T>> {
    T data;
    Bst<T>left;
    Bst<T>right;
    Bst(T data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
  int check=0;
        /*
    if old_data.compareto(new_data); if result <0 then 
     new element is greater than old element
    * if result>0 than new element is smaller than old element 
    if result==0 than new element is equal to old element 
    */
    public boolean insert(T o) throws Exception {
            if(data.compareTo(o)<0){      
                if(right==null){
                    right=new Bst<T>(o);
                    return true;
                }
                right.insert(o);
         }
         else if (data.compareTo(o)>0) {
             if(left==null){
                 left=new Bst<T>(o);
                 return true;
             }
             left.insert(o);
         }
    

            
        return false;
    }
    public void show(Bst<T> temp_root) {   //inorder traversal
        if(temp_root!=null){
            show(temp_root.left);
            System.out.println(temp_root.data);
            show(temp_root.right);
        }
    }
     public void show_root(Bst<T> temp_root){
         if(temp_root!=null){
             System.out.println("root element is :"+temp_root.data);
         }else{
             System.out.println("tree haven't any element ");
         }
     }   
     public int height_tree(Bst<T> temp_root){
      if(temp_root!=null){
          if(temp_root.left==null&& temp_root.right==null){
                return 0;
          }else{
              return 1+Math.max(height_tree(temp_root.left), height_tree(temp_root.right));
          }
      }else{
          return 0;
      }
     }
     public void search(T data, Bst<T> temp_root){
         try{
            if(temp_root==null){
                System.out.println("tree is empty");
            }else{
                if(temp_root.data==data){
                    check++;
                    System.out.println("founded at :"+check);
                    return;
                }else{
                    if(temp_root.data.compareTo(data)>0){  // if element is smaller than root
                       check++; 

                       if(temp_root.left!=null){
                        search(data, temp_root.left);
                       }else{
                           System.out.println("not available");
                           return;
                       }
                    }else if(temp_root.data.compareTo(data)<0){ // if element is grater than root
                       check++;

                       if(temp_root.right!=null){
                        search(data, temp_root.right);
                       }else{
                        System.out.println("not available");
                           return;
                       }
                   
                    }
                }
            }
         }catch(NullPointerException ex){
             
         }
         
     }
public static void main(String[] args) throws Exception  {
    Bst<Integer> temp_root=new Bst<Integer>(5);
    temp_root.insert(1);
    temp_root.insert(2); 
     temp_root.insert(3);
    temp_root.insert(4); 
     temp_root.insert(6);
    temp_root.insert(7);  
    temp_root.insert(8);
    temp_root.insert(9);  
    temp_root.insert(10);
    // temp_root.show(temp_root);
    // temp_root.show_root(temp_root);
    temp_root.search(10, temp_root);
//  System.out.println("height of tree"+temp_root.height_tree(temp_root));
}
    
}