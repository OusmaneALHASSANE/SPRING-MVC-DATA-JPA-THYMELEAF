package ozzo.glsid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import antlr.collections.List;
import ozzo.glsid.dao.ProduitRepository;
import ozzo.glsid.entities.Produit;

@SpringBootApplication
public class TpMvcJpaSpringDataThymeleafApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(TpMvcJpaSpringDataThymeleafApplication.class, args);
		ProduitRepository produitsrepository=ctx.getBean(ProduitRepository.class);
		produitsrepository.save(new Produit("HP 1", 3000.0, 20));
		produitsrepository.save(new Produit("DELL ", 4500.0, 10));
		produitsrepository.save(new Produit("ACER", 3000.0, 20));
		produitsrepository.save(new Produit("SAMSUNG", 3700.0, 25));
		produitsrepository.save(new Produit("mac", 3000.0, 70));
		produitsrepository.save(new Produit("HP 2", 3000.0, 20));
		produitsrepository.save(new Produit("DELL 2 ", 4500.0, 10));
		produitsrepository.save(new Produit("ACER 3", 3000.0, 20));
		produitsrepository.save(new Produit("SAMSUNG 2", 3700.0, 25));
		produitsrepository.save(new Produit("Macboo", 3000.0, 70));
		java.util.List<Produit> produits=produitsrepository.findAll();
		
		for(Produit p: produits) {
			System.out.println("Nom:"+p.getDesignation()+"\tPRIX:"+p.getPrix());
		}
		
	

	}

}
