
package e.commerec;

/**
 *
 * @author PC
 */
public class ClothingProduct extends Product{
    
   private String size;
    private String fabric;

    public ClothingProduct() {
    }

    public ClothingProduct(int productId,String name,float price, String size, String fabric) {
        super(productId, name,price);
        this.size = size;
        this.fabric = fabric; 
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }
    
    
}
