import dao.BaseAccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
        BaseAccountDao bao =  app.getBean(BaseAccountDao.class);
        System.out.println(bao.searchNameAndPassword("super","man"));
    }
}
