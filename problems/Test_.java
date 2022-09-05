package problems;

import java.util.*;
class Product{
    int id;
    int price;
    Product(int id,int price){
        this.id=id;
        this.price=price;
    }
}

class customer{
    int id;
    Product product;
    int quantity;
    customer(int id,Product product,int quantity){
        this.id=id;
        this.product=product;
        this.quantity=quantity;
    }

}


public class Test_ {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<Product>();  
        product.add(new Product(1,100));
        product.add(new Product(2,200));
        product.add(new Product(3,300));
        product.add(new Product(4,400));

        char choice = '\0';  

        List<customer> customer = new ArrayList<customer>();
        customer.add(new customer(1,product.get(0),1));
        customer.add(new customer(2,product.get(1),2));
        customer.add(new customer(3,product.get(2),3));
        int billid = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the customer id");
            int id = sc.nextInt();
            System.out.println("Enter the product id");
            int pid = sc.nextInt();
            boolean founded_customerid=false;
            boolean founded_productid=false;
            for(int i=0;i<customer.size();i++){
                if(customer.get(i).id==id){
                    founded_customerid=true;
                    //find in product list
                    for(int j=0;j<product.size();j++){
    
                        if(product.get(j).id==pid){
                            founded_productid=true;
                            billid++;
                          //display bill id,customer id,product id,quantity,bill amount
                            System.out.println("Bill id:"+billid);
                            System.out.println("Customer id:"+customer.get(i).id);
                            System.out.println("Product id:"+product.get(j).id);
                            System.out.println("Quantity:"+customer.get(i).quantity);
                            System.out.println("Bill amount:"+customer.get(i).quantity*product.get(j).price);
                            product.get(j).id=5006;
                            break;
                        }
                    }
                }
                
            }
    
                
            if(!founded_customerid){
                System.out.println("Customer id not found");
            }
            if(!founded_productid){
                System.out.println("Product id not found");
            }
            System.out.print("Want to find more items? (y or n): ");  
            choice = sc.next().charAt(0);  
            //read remaining characters, don't store (no use)  
            sc.nextLine();  

        } while (choice == 'y' || choice == 'Y');

        


     
       //hashmap compare only key not value
         //hashmap compare key and value
         

        
    }
    
}
