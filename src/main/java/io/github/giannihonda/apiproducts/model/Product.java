package io.github.giannihonda.apiproducts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//POJO - plain old java object

@Entity
@Table(name = "product") //exemplo se o nome fosse diferente
public class Product {

    @Id
    @Column(name = "id") //exemplo se o nome fosse diferente, se aplica para todos os columns, que alias nao sao necessarios quando o nome e igual do db
    private String id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
