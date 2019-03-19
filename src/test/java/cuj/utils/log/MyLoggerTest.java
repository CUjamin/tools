package cuj.utils.log;

import static org.junit.Assert.*;

/**
 * @Auther: cujamin
 * @Date: 2019/3/19 09:58
 * @Description:
 */
public class MyLoggerTest {
    public static void main(String[] args) {

        MyLogger myLogger = new MyLogger("log.log");
        for(int i=0;i<10;++i){
            System.out.println("准备写入:"+i);
            try{
                Thread.sleep(1);
            }catch (InterruptedException ie){
                System.out.println("InterruptedException");
            }
            myLogger.write("log:"+i);
        }
        System.out.println(MyLogger.logList);
    }

}