import com.yyf.mybatisPlusSpring.mapperFactoryBean.mapper.CustomerMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, world");
    }

    @Test
    public void test_dao_plus(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyf/mybatisPlusSpring/dao/applicationContext.xml");
        com.yyf.mybatisPlusSpring.dao.DAO.I_CustomerDao test = (com.yyf.mybatisPlusSpring.dao.DAO.I_CustomerDao)applicationContext.getBean("customerDao");
        com.yyf.mybatisPlusSpring.dao.POJO.Customer customer = test.findCustomerById(2);
        System.out.println(customer);
    }

    @Test
    public void test_mapper_factory_bean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyf/mybatisPlusSpring/mapperFactoryBean/applicationContext.xml");
        com.yyf.mybatisPlusSpring.mapperFactoryBean.mapper.CustomerMapper customerMapper = (com.yyf.mybatisPlusSpring.mapperFactoryBean.mapper.CustomerMapper)applicationContext.getBean("customerMapper");
        com.yyf.mybatisPlusSpring.mapperFactoryBean.POJO.Customer customer = customerMapper.findCustomerById(1);
        System.out.println(customer);
    }

    @Test
    public void test_mapper_scanner_configurer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyf/mybatisPlusSpring/mapperScannerConfigurer/applicationContext.xml");
        com.yyf.mybatisPlusSpring.mapperScannerConfigurer.DAO.I_CustomerDao test = (com.yyf.mybatisPlusSpring.mapperScannerConfigurer.DAO.I_CustomerDao)applicationContext.getBean("customerDao");
        com.yyf.mybatisPlusSpring.mapperScannerConfigurer.POJO.Customer customer = test.findCustomerById(1);
        System.out.println(customer);
    }
}
