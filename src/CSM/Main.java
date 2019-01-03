package CSM;

import CSM.Plugins.Interfaces.IDoStepPlugin;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        // 4 lines below are not necessary if the plugin is added to classpath

        File doStepPlugin = new File(args[0]);
        URL[] urls = new URL[1];
        urls[0] = doStepPlugin.toURI().toURL();
        URLClassLoader ucl = new URLClassLoader(urls);

        ServiceLoader<IDoStepPlugin> doStepPlugins = ServiceLoader.load(IDoStepPlugin.class, ucl);
        doStepPlugins.forEach(service -> service.DoStep(1,1.1,2.2));
        System.out.println("mjello");
    }
}
