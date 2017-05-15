package xyz.coop;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import xyz.coop.resources.HelloWorldResource;

public class BeanstalkApplication extends Application<BeanstalkConfiguration> {
    public static void main(String[] args) throws Exception {
        new BeanstalkApplication().run(args);
    }

    @Override
    public String getName() {
        return "beanstalk";
    }

    @Override
    public void initialize(Bootstrap<BeanstalkConfiguration> bootstrap) {
    }

    @Override
    public void run(BeanstalkConfiguration configuration,
                    Environment environment) {

        environment.jersey().register(new HelloWorldResource());

    }
}