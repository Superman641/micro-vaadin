package ru.cwt.microvaadin.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * Created by user on 31.10.2017.
 */
@Theme("valo")
@SpringUI
public class VaadinUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("hello world"));
    }
}
