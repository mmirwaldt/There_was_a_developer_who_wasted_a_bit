package art.funny;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RhymeFactoryTest {
    @Test
    void test() throws IOException {
        assertEquals(Files.readString(Path.of("rhyme.txt")), RhymeFactory.create());
    }
}
