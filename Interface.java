package Interface;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Interface extends JFrame implements ActionListener {
    private JTextField textoUsuario;
    private JPasswordField textoKey;
    private JPanel login;
    private JButton botao;

    public Interface(){
        super("Interface"); //titulo
        setSize(230,200); //tamanho da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechando o programa ele se encerra
        setLocationRelativeTo(null);

        //Criando os componentes
        textoUsuario = new JTextField(20);
        textoKey = new JPasswordField(20);
        botao = new JButton("Logar");

        botao.addActionListener(this);

        //Criando Painel
        login = new JPanel();
        login.add(new JLabel("Usuário: "));
        login.add(textoUsuario);
        login.add(new JLabel("Senha: "));
        login.add(textoKey);
        login.add(botao);


        add(login);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt){
        //Verificando as informações ao clicar no botão
        String login = "abc";
        String senha = "123";

        String nome = textoUsuario.getText();
        String senh = new String (textoKey.getPassword());
        Date relogio = new Date();


        if(nome.equals(login) && senh.equals(senha)){
            JOptionPane.showMessageDialog(Interface.this,"Acesso permitido!");
        }else {
            JOptionPane.showMessageDialog(Interface.this,"Acesso negado!");
        }


    }

    public static void main(String[] args) {
        Interface janela = new Interface();

        janela.setVisible(true);
    }


}
