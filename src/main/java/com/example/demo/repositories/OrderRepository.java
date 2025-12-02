package com.example.demo.repositories;
import java.util.Optional;
import com.example.demo.domain.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
//    TacoOrder save(TacoOrder order);
}
