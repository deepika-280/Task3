package com.epam.principles3;

@Repository

public class Repp extends JpaRepository<CustomerEntity, Long>{
	
	 CustomerEntity findByUsername(String username);

}