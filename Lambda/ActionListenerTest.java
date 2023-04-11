package Lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest {
    public ActionListener makeActionListener() {
        // ActionListener a1 = new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println(e.getActionCommand());                
        //     }
        // };

        ActionListener a1 = e -> System.out.println(e.getActionCommand());
        return a1;
    }

    public static void main(String[] args) {
        ActionListenerTest test = new ActionListenerTest();
        test.makeActionListener();
    }
}
