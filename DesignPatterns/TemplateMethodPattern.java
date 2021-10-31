import java.util.*;

abstract class Sandwich {
    void makeSandwich() {

        putOnion();
        putBeet();
        putCucumber();

        if (wantsBoiledPotato()) {
            putBoiledPotato();
        }

        if (wantsMashedSpicyPotato()) {
            putMashedSpicyPotato();
        }

        if (wantsToast()) {
            toast();
        }
    }

    void putOnion() {
        System.out.println("Put onion in sandwich");
    }
    void putBeet() {
        System.out.println("Put beet in sandwich");
    }
    void putCucumber() {
        System.out.println("Put cucumber in sandwich");
    }

    abstract boolean wantsBoiledPotato();
    abstract void putBoiledPotato();

    abstract boolean wantsMashedSpicyPotato();
    abstract void putMashedSpicyPotato();

    abstract boolean wantsToast();
    abstract void toast();
}

class RawSandwich extends Sandwich {

    @Override
    boolean wantsBoiledPotato() {
        return true;
    }

    @Override
    void putBoiledPotato() {
        System.out.println("Put boiled potato in sandwich");
    }

    @Override
    boolean wantsMashedSpicyPotato() {
        return false;
    }

    @Override
    void putMashedSpicyPotato() {

    }

    @Override
    boolean wantsToast() {
        return false;
    }

    @Override
    void toast() {

    }
}

class ToastSandwich extends Sandwich {

    @Override
    boolean wantsBoiledPotato() {
        return false;
    }

    @Override
    void putBoiledPotato() {

    }

    @Override
    boolean wantsMashedSpicyPotato() {
        return true;
    }

    @Override
    void putMashedSpicyPotato() {
        System.out.println("Put mashed spicy potato in sandwich");
    }

    @Override
    boolean wantsToast() {
        return true;
    }

    @Override
    void toast() {
        System.out.println("Toast the sandwich");
    }
}

public class Suraj {
    public static void main(String[] args) {

        Sandwich toastSandwich = new ToastSandwich();
        toastSandwich.makeSandwich();

        System.out.println();

        Sandwich rawSandwich = new RawSandwich();
        rawSandwich.makeSandwich();
    }
}