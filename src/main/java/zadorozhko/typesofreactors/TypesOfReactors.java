package zadorozhko.typesofreactors;

public class TypesOfReactors {

    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}
