package Creational;

import Creational.AbstractFactory.CardType;
import Creational.AbstractFactory.CreditCard;
import Creational.AbstractFactory.CreditCardFactory;
import Creational.Builder.LunchOrder;
import Creational.Builder.LunchOrderBean;
import Creational.Builder.LunchOrderTelescoping;
import Creational.Factory.Website;
import Creational.Factory.WebsiteFactory;
import Creational.Factory.WebsiteType;
import Creational.Prototype.Movie;
import Creational.Prototype.Record;
import Creational.Prototype.Registry;
import Creational.Prototype.Statement;
import Creational.Singleton.SingletonDB;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //singleton
        //SingletonDB instance = SingletonDB.getInstance();
        //System.out.println(instance);
        //SingletonDB instance2 = SingletonDB.getInstance();
        //System.out.println(instance2);

        //builder
        //LunchOrderBean lunchOrderBean = new LunchOrderBean();
        //lunchOrderBean.setBread("garlic bread");
        //System.out.println(lunchOrderBean.getBread());

        //builder telescoping
        //LunchOrderTelescoping lunchOrderTelescoping = new LunchOrderTelescoping("bread");
        //System.out.println(lunchOrderTelescoping.getCondiments());

        //builder with the class Builder
        //LunchOrder.Builder builder = new LunchOrder.Builder();
        //builder.condiments("lettuce").bread("Wheat").dressing("mayo").meat("Turkey");

        //LunchOrder lunchOrder = builder.build();
        //System.out.println(lunchOrder.getBread());

        //Prototype shallow copy same memory, if deep copy new memory
        //String sql = "select * from movies where title = ?";
        //List<String> parameters = new ArrayList<>();
        //parameters.add("Star Wars");
        //Record record = new Record();
        //Statement firstStatement = new Statement(sql, parameters, record);
        //System.out.println(firstStatement.getSql());
        //Statement secondStatement = firstStatement.clone();
        //System.out.println(secondStatement.getSql());

        //Registry registry = new Registry();
        //Movie movie =  (Movie) registry.createItem("Movie");
        //movie.setTitle("Creational Patterns in Java");
        //System.out.println(movie);
        //System.out.println(movie.getRunTime());
        //System.out.println(movie.getTitle());
        //System.out.println(movie.getPrice());

        //Movie anotherMovie = (Movie) registry.createItem("Movie");
        //anotherMovie.setTitle("Gang of four");
        //System.out.println(anotherMovie);
        //System.out.println(anotherMovie.getRunTime());
        //System.out.println(anotherMovie.getTitle());
        //System.out.println(anotherMovie.getPrice());

        //Factory
        //Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        //System.out.println(site.getPages());

        //site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        //System.out.println(site.getPages());

        //Abstract Factory
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(670);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());


    }
}
