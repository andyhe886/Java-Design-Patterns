package Creational.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        if (pages != null){
            return pages;
        } else {
            return null;
        }

    }

    public Website(){
        this.createWebsite();
    }

    public abstract void createWebsite();

}
