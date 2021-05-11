import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Dimension;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Completenumber {
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable(){
      @Override
      public void run() {
        TextTestFrame frame = new TextTestFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      }
    });
  }
}
// kokomadeyoshi
@SuppressWarnings("serial")
class TextTestFrame extends JFrame {
  public TextTestFrame(){
    setTitle("TextTest");
    setSize(300, 120);
    JTextField textField = new JTextField();
    final JButton button = new JButton("CHECK!");
    
    button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {
            String sc= textField.getText();
            int num =  Integer.parseInt(sc);
            if(isPerfectNumber(num)){   //メソッドに代入して、完全数⇒perfectと出力
                JOptionPane.showMessageDialog(null,"perfect");
            } else{
                JOptionPane.showMessageDialog(null, "no");  //完全数でない⇒noと出力
            }
            
        }
        //呼び出し元のメソッド、完全数かどうか判定
        boolean isPerfectNumber(int n){
            int sum = 0;
            for(int i = 1; i<= n /2;i++){ //それ自体を除き約数はn/2以下
                if(n % i ==0){           //剰余算で約数かどうかを判定
                    sum += i;           //約数⇒sumに代入
                }
            }
            if(sum == n){           //sumがnなら完全数
                return true;
            } else {
                return false;
            }
        }
});
    
        

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3,2));
    panel.add(new JLabel("完全数かどうか:", SwingConstants.LEFT));
    panel.add(textField);
    panel.add(button);
    
    add(panel, BorderLayout.NORTH);
  }
}
