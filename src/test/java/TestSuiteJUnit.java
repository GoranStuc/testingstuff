import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestSuiteJUnit {
    @Test
    public void runAllTests() {
        Class<?>[] classes = {JUnitStartTeardown.class,NineGagTests.class};

        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }
}
