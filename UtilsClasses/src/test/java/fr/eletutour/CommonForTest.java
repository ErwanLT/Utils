package fr.eletutour;

import lombok.extern.slf4j.Slf4j;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

@Slf4j
public class CommonForTest {

    @Rule
    public final TestRule watchman = new TestWatcher() {
        @Override
        protected void starting(Description description) {
            log.info("==== Start of Test : {} ====", description.getDisplayName());
        }

        @Override
        protected void finished(Description description) {
            log.info("==== End of Test : {} ====", description.getDisplayName());
        }
    };

}
