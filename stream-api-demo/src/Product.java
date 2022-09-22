public class Product {
    private Integer id;
    private String name;
    private Float price;

    public Product() {
    }

    public Product(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Product))
            return false;
        if (obj == this)
            return true;
        Product input = (Product) obj;
        return (input.id.equals(this.id)) && (input.name.equals(this.name) && (input.price.equals(this.price)));
    }

    @Override
    public final int hashCode() {
        int hashVal = 1;
        if (this.id != null) {
            hashVal += this.id.hashCode();
        }
        if (this.name != null) {
            hashVal += this.name.hashCode();
        }
        if (this.price != null) {
            hashVal += this.price.hashCode();
        }
        return hashVal;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
