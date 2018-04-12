package com.springTest.mad_java;

import java.net.URL;
import java.util.Arrays;

/**
 * @author esther
 * 2018-01-12 10:54
 * $DESCRIPTION}
 */

public class BootstrapTest {
    public static void main(String[] args) {
        URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
       // Stream.of(urls).forEach(url -> System.out.println(url.toExternalForm()));
        Arrays.stream(urls).forEach(url -> System.out.println(url.toExternalForm()));
    }
}
