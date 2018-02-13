package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String desscription;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private  Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(String desscription, BigDecimal amount, UnitOfMeasure uom) {
        this.desscription = desscription;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String desscription, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.desscription = desscription;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

}
