package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {


}
