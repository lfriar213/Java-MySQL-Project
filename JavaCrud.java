import java.awt.EventQueue;

import javax.naming.InitialContext;
import javax.swing.JFrame;

public class JavaCrud{

    private JFrame frame;
        

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                try{
                    JavaCrud window = new JavaCrud();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public JavaCrud(){
        initialize();
    }
    
}