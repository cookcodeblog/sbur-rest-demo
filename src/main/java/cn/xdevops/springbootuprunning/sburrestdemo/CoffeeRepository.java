package cn.xdevops.springbootuprunning.sburrestdemo;

import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
