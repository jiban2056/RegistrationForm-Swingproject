package com.Morgan;

import javax.swing.*;
import java.awt.*;

public class MainClass

{

    JFrame frame;

    Container container;

    MainClass(){

        frame.setVisible(true);
        frame.setBounds(300,300,600,600);
        container = frame.getContentPane();
    }

public static void  main(String[]args)
{

    new MainClass();
}
}

