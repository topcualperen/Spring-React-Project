package kodlamaio.northwind.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Data  // lombok yardımı ile getter ve setter yazmaktan kurtuluyoruz.
@Entity // sen bir veritabanı nesnesisin demek
@Table(name = "products") // veritabanında hangi tabloya karşılık geldiğini belirttik
@AllArgsConstructor  // constructor yazmamak için kullandık
@NoArgsConstructor  // parametresiz constructor yazmamak için kullandık
public class  Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // veriler birer birer arttığını gösterir.
        // @Column(name = "product_id")
        // private int id;
        @Column(name = "category_id")
        private int categoryId;
        @Column(name = "product_name")
        private String productName;
        @Column(name = "unit_price")
        private double unitPrice;
        @Column(name = "units_in_stock")
        private short unitsInStock;
        @Column(name = "quantity_per_unit")
        private String quantityPerUnity;

        @ManyToOne
        @JoinColumn(name = "category_category_id")
        private Category category;

}
