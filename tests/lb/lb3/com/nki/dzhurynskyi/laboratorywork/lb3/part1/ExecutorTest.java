package lb.lb3.com.nki.dzhurynskyi.laboratorywork.lb3.part1;

import com.nki.dzhurynskyi.laboratorywork.lb3.part1.Executor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecutorTest {
    Executor executor;
    @BeforeEach
    void setUp() {
        executor=new Executor();
    }

    @Test
    void modifyString() {
        String text="I play games";
        String s="ay";
        String t="computer";
        text= executor.modifyString(s,t,text);
        String temp="I play computer games";
        assertEquals(temp,text);
    }
    @Test
    void modifyString1() {
        String text="I play games";
        String s="l";
        String t="computer";
        text= executor.modifyString(s,t,text);
        String temp="I play games";
        assertEquals(temp,text);
    }
}