package one.dio.productcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "product", type = "catalog")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;
}
