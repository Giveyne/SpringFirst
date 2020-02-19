import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.test.spring.PetServise.Cat;
import ru.test.spring.PetServise.PetService;
import ru.test.spring.PetServise.Toy;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("AplicationContex.xml");

        PetService petService = applicationContext.getBean(PetService.class);
        Cat cat = applicationContext.getBean(Cat.class);
        PetService petServiceCat = (PetService) applicationContext.getBean("PetServiceCat");
        PetService petServiceDog = (PetService) applicationContext.getBean("PetServiceDog");
//default
        petService.createPet().getVoice();
        //Явное присваивание кота
        petServiceCat.createPet().getVoice();
        //Явное присваивание собаки
        petServiceDog.createPet().getVoice();

        petServiceCat.createPet().getToy();
        // aop before
        cat.getToy();
        // aop after

    }
}
