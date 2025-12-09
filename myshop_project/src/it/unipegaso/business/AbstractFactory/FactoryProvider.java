package it.unipegaso.business.AbstractFactory;

public class FactoryProvider {

    public enum FactoryType { MENU_CLASSICO, MENU_KID}

    public static AbstractFactory getFactory(FactoryType type) {

        switch(type) {
            case MENU_CLASSICO: return new MenuClassicoFactory();
            case MENU_KID: return new MenuKidFactory();
            default: return null;
        }
    }
}
