
package e.commerec;

public class Order {
    private int customerId;
    private int orderId;
    private Product[] Products;
    private float totalPrice;
    public Order(){
        
    }

    public Order(int customerId,int orderId ,Product[] Products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.Products =Products ;
        this.totalPrice = Math.abs(totalPrice);
    }
    private double TotalPrice(){
        double total=0;
        for(int i=0;i<Products.length;i++){
            if(Products[i]!=null){
                total+=Products[i].getPrice();
            }
            
        }
        return total;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products = Products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void printOrderInfo(){
        System.out.println("Here is your Order summary:");
        System.out.println("your orderId:"+orderId);
        System.out.println("your customer ID:"+customerId);
        System.out.println("the Products:");
        for(int i=0;i<Products.length;i++){
            if(Products[i]!=null)
            System.out.println(Products[i].getName()+"$"+Products[i].getPrice());
       
        }
        System.out.println("the totalPrice"+ TotalPrice()+"$" );
        
        
    }
}
  