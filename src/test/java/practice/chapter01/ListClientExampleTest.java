package practice.chapter01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ListClientExampleTest {
    @Test
    public void testListClientExample(){
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        Assert.assertThat(list, instanceOf(ArrayList.class));
    }

}