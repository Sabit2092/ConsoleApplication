package console;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class application {

    public static void main(String[] args) throws Exception {

        Result result = JUnitCore.runClasses(ReadFile.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        //ReadFile readFile = new ReadFile();
        //readFile.count();


    }
}