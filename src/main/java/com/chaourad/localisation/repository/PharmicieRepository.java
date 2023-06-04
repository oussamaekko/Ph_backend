package com.chaourad.localisation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chaourad.localisation.entites.Pharmacie;

public interface PharmicieRepository extends JpaRepository<Pharmacie, Integer> {
	Pharmacie findById(int id);
	/*@Query(value = """
			select t from Token t inner join User u\s
			on t.user.id = u.id\s
			where u.id = :id and (t.expired = false or t.revoked = false)\s
			""")
	List<Token> findAllValidTokenByUser(Integer id);
	
		//SELECT c.date_debut , c.date_fin FROM `pharmacie` p , pharmacie_service c WHERE c.pharmacie=p.id AND p.id=1;


	@Query(value = "SELECT c.date_debut , c.date_fin FROM Pharmacie p , Pharmacie_service c WHERE c.pharmacie=p.id AND p.id= :id")
	Pharmacie findAllValidInfoPharmacie(Integer id);

	
	@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
	User findUserByStatusAndName(Integer status, String name);
	//SELECT c.date_debut , c.date_fin FROM `pharmacie` p , pharmacie_service c WHERE c.pharmacie=p.id AND p.id=1;
	*/
	
	
	
	}