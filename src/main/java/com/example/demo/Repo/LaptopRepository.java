package com.example.demo.Repo;

public class LaptopRepository {

	package com.ust.Laptop_Purchase.repo;

	import com.ust.Laptop_Purchase.Entity.Laptop;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import java.util.List;

	@Repository
	public interface LaptopRepository extends JpaRepository<Laptop, Long> {
	}


}