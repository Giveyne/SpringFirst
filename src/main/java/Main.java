import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.test.spring.PetServise.PetService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("AplicationContex.xml");
        PetService petService = applicationContext.getBean(PetService.class);
        PetService petServiceCat = (PetService) applicationContext.getBean("PetServiceCat");
        PetService petServiceDog = (PetService) applicationContext.getBean("PetServiceDog");

        petService.createPet().getVoice();
        petServiceCat.createPet().getVoice();
        petServiceDog.createPet().getVoice();

        petServiceCat.createPet().getToy();

    }
}
