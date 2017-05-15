package xyz.coop;

import org.junit.Test;
import xyz.coop.resources.HelloWorldResource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppTest {

    @Test
    public void hasHelloWorldEndpoint() throws Exception {
        HelloWorldResource helloWorldResource = new HelloWorldResource();

        assertThat(helloWorldResource.get(), is("Hello World"));
    }
}