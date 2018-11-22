
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




/**
 * @description： TODO
 * @author： Mr.He
 * @date： 2018-11-09 13:33
 **/
public class TestLog {



    @Test
    public void log1() {
        Logger log= LoggerFactory.getLogger(TestLog.class);
        String name="测试1";
        log.info("这是一22条日志{ }",name);

    }

    @Test
    public void log2() {
        Logger log= LoggerFactory.getLogger("paperLog");
        String name="测试2";
        log.info("这是一条日志{ }", name );
    }

    @Test
    public void log3() {

    }

    @Test
    public void log4() {

    }


}
