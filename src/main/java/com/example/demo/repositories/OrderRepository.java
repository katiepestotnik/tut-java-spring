package com.example.demo.repositories;
import java.util.Optional;
import com.example.demo.domain.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
