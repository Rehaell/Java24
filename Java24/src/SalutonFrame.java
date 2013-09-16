import javax.swing.*;

public class SalutonFrame extends JFrame {
  public SalutonFrame() {
    super("Saluton Mondo!");
    setLookAndFeel();
    setSize(350, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  private void setLookAndFeel() {
    try {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch (Exception exec) {
      //ignore error
    }
  }
  
  public static void(String[] arguments) {
    SalutonFrame sal = new SalutonFrame();
  }
  
}
