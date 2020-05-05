import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("SNAKE");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800,825);
        setLocation(250,100);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
