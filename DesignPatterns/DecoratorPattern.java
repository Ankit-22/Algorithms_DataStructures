interface Pizza {
    public String getDescription();
    public double getCost();
}

abstract class PizzaDecorator implements Pizza {
    Pizza pizza;

    PizzaDecorator(Pizza simplePizza) {
        this.pizza = simplePizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}


class SimplePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Dough";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}


class MozzPizza extends PizzaDecorator {

    MozzPizza(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozz";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }
}

class TomatoSaucePizza extends PizzaDecorator {
    TomatoSaucePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }
}

public class Suraj {
    public static void main(String[] args) {
        TomatoSaucePizza p = new TomatoSaucePizza(new MozzPizza(new SimplePizza()));
        System.out.println(p.getDescription());
        System.out.println(p.getCost());

    }
}