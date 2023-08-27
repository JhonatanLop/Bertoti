package coffe.nick.api.coffee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long>{
    
}
