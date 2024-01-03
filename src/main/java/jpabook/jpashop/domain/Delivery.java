package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;
    @OneToOne()
    private Orders orders;

    @Embedded
    private Address address;

    @Enumerated(value = EnumType.STRING) // .ORDINAL 이면 숫자가 들어감
    private DeliveryStatus status; // READY, COMP
}
