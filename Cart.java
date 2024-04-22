
package e.commerec;
public class Cart {
   private int customerId;
    private int nProducts;
    Product[] Products;

    public Cart(int customerId, int nProducts) {
        this.customerId =Math.abs(customerId);
        this.nProducts = nProducts;
        this.Products = new Product[this.nProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
       
        this.customerId = customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        
        this.nProducts = nProducts;
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products = Products;
    }
    public void addProduct(Product product,int index){
        if(index>=0&&index<nProducts)
             Products[index]=product;
        else
            System.out.println("invalid index");
        
        
        
    }
    public void removeProudct(int index){
        if(index>=0&&index<nProducts)
             Products[index]=null;
        else
            System.out.println("nvalid index");  
        
    }
    public double CalculatePrice(){
        double totalPrice=0;
        for(int i=0;i<nProducts;i++){
            if(Products[i]!=null){
                totalPrice+=Products[i].getPrice();
            }
        }
        return  totalPrice;
       
    }
    public void PlaceOrder(){
        System.out.println("customerId"+customerId);
        System.out.println("Total price:"+CalculatePrice()+"$");
        
    }
}