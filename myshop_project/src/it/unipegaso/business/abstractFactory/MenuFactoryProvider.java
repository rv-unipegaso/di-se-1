package it.unipegaso.business.abstractFactory;

public class MenuFactoryProvider {

    public enum FactoryType { MENU_CLASSICO, MENU_KIDS }

    public static MenuFactory getFactory(FactoryType type) {
        switch(type) {
            case MENU_CLASSICO: return new MenuClassicoFactory();
            case MENU_KIDS: return new MenuKidFactory();
            default: return null;
        }
    }

}
