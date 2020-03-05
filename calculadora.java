import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculadora extends JFrame
{
    JButton Adicao,Subtacao,Divisao,Multiplicacao,N0,N1,N2,N3,N4,N5,N6,N7,N8,N9,LimparTela,Potenciacao2,Potenciacao3,Radiciacao2,Radiciacao3,Tangente,Cotangente,Seno,Cosseno,Secante,Cossecante,Igual,Delete,Ponto;
    JButton Npi,Logaritimo,Arredondamento1,RParaG,GParaR,PotenciacaoXY,RadiciacaoX,Inverso,Expoente,Fatorial,AjudaTela,SobreACalculadoara,Hypotenusa,ArcoSeno,ArcoCosseno,ArcoTangente,Mod,Porcentagem,NSinal,Sair;
    JToggleButton BotaoShift;
    JPanel AreaVisor,Visor,Teclado1,AreaTeclado1,Teclado2;
    JLabel Titulo,Tela1;
    ButtonHandler Handler = new ButtonHandler();
    
    public static void main(String args[])
    {
        calculadora x =new calculadora();
    }
    public calculadora ()
    {
        super("Calculadora");
        Container Tela = getContentPane();
        Tela.setLayout(null);
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------Visor da calculadora----------------------------------------------------------------------------------------------------------------------------------------------------------------
        //--Componente----------------------------------Dimensoes do componente-----------------------------Adicionar componente-------------------------------Cor do componente------------
        AreaVisor=new JPanel();                         AreaVisor.setBounds(0,0,400,100);                   Tela.add(AreaVisor);                                        AreaVisor.setBackground(Color.WHITE);
        Visor=new JPanel();                             Visor.setBounds(20,10,360,80);                      AreaVisor.add(Visor);                                       Visor.setBackground(Color.GRAY);
        AreaTeclado1=new JPanel();                      AreaTeclado1.setBounds(0,100,400,500);              Tela.add(AreaTeclado1);                                     AreaTeclado1.setBackground(Color.BLACK);
        Teclado1=new JPanel();                          Teclado1.setBounds(20,50,350,30);                   AreaTeclado1.add(Teclado1);                                 Teclado1.setBackground(Color.BLACK);
        Teclado2=new JPanel();                          Teclado2.setBounds(20,100,350,350);                 AreaTeclado1.add(Teclado2);                                 Teclado2.setBackground(Color.BLACK);
        //--Layout do Componente------------------------Borda do componente-----------------------------------------
        AreaVisor.setLayout(new BorderLayout());
        /*Visor.setLayout(null); */                     Visor.setBorder(new javax.swing.border.TitledBorder(""));
        Teclado1.setLayout(new GridLayout(1,5,5,5));    Teclado1.setBorder(new javax.swing.border.TitledBorder(""));
        AreaTeclado1.setLayout(null);                   
        Teclado2.setLayout(new GridLayout(9,5,5,5));    Teclado2.setBorder(new javax.swing.border.TitledBorder(""));
        
        //--Componente----------------------------------Dimensoes do componente-----------------------------Fonte do componente------------------------------------------Adicionar componente-----------
        Titulo =new JLabel("Calculadora");              Titulo.setBounds(250,10,110,20);                    Titulo.setFont(new Font("Times New Roman",Font.BOLD,20));    AreaTeclado1.add(Titulo); 
        //--Cor do componente---------------------------Borda do componente---
        Titulo.setForeground(Color.RED);                Titulo.setBorder(new javax.swing.border.TitledBorder(""));
        //--Componente----------------------------------Dimensoes do componente-----------------------------Fonte do componente------------------------------------------Adicionar componente-----------
        Tela1 =new JLabel("0.0");                       Tela1.setPreferredSize(new Dimension (350,60));     Tela1.setFont(new Font("Capri",Font.BOLD,30));              Visor.add(BorderLayout.CENTER, Tela1);
        /*Tela1.setBounds(160,20,300,40);*/             Tela1.setHorizontalAlignment(SwingConstants.RIGHT); //Visor.add(Tela1);
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------Teclado 1-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //--Componente-----------------------------------Adicionar componente-------------------------------Ação do componente------------------------------------------Informação do componente---------------------------------------------------------------------------
        SobreACalculadoara=new JButton("SCa");          Teclado1.add(SobreACalculadoara);                   SobreACalculadoara.addActionListener(Handler);              SobreACalculadoara.setToolTipText("Sobre A Calculadoara");
        AjudaTela=new JButton("AJuda");                 Teclado1.add(AjudaTela);                            AjudaTela.addActionListener(Handler);                       AjudaTela.setToolTipText("Ajuda"); 
        Sair=new JButton("Sair");                       Teclado1.add(Sair);                                 Sair.addActionListener(Handler);                            Sair.setToolTipText("Sair");
        BotaoShift=new JToggleButton("Shift");          Teclado1.add(BotaoShift);                           BotaoShift.addActionListener(Handler);                      BotaoShift.setToolTipText("Shift");
        
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------Teclado 2-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //--Componente----------------------------------Adicionar componente--------------------------------Ação do componente------------------------------------------Informação do componente----------------------------------------------------------------------------
        Tangente=new JButton("Tan");                    Teclado2.add(Tangente);                             Tangente.addActionListener(Handler);                        Tangente.setToolTipText("Tangente");       
        Cotangente=new JButton("Ctg");                  Teclado2.add(Cotangente);                           Cotangente.addActionListener(Handler);                      Cotangente.setToolTipText("Cotangente");
        Seno=new JButton("Sen");                        Teclado2.add(Seno);                                 Seno.addActionListener(Handler);                            Seno.setToolTipText("Seno");
        Cosseno=new JButton("Cos");                     Teclado2.add(Cosseno);                              Cosseno.addActionListener(Handler);                         Cosseno.setToolTipText("Cosseno");
        Secante=new JButton("Sec");                     Teclado2.add(Secante);                              Secante.addActionListener(Handler);                         Secante.setToolTipText("Secante");
        Cossecante=new JButton("Csc");                  Teclado2.add(Cossecante);                           Cossecante.addActionListener(Handler);                      Cossecante.setToolTipText("Cossecante");
        Hypotenusa=new JButton("Hyp");                  Teclado2.add(Hypotenusa);                           Hypotenusa.addActionListener(Handler);                      Hypotenusa.setToolTipText("Hypotenusa");
        ArcoSeno=new JButton("ASen");                   Teclado2.add(ArcoSeno);                             ArcoSeno.addActionListener(Handler);                        ArcoSeno.setToolTipText("Arco do Seno");
        ArcoCosseno=new JButton("ACos");                Teclado2.add(ArcoCosseno);                          ArcoCosseno.addActionListener(Handler);                     ArcoCosseno.setToolTipText("Arco do Cosseno");
        ArcoTangente=new JButton("ATan");               Teclado2.add(ArcoTangente);                         ArcoTangente.addActionListener(Handler);                    ArcoTangente.setToolTipText("Arco do Tangente");
        Arredondamento1=new JButton("Rnd4");            Teclado2.add(Arredondamento1);                      Arredondamento1.addActionListener(Handler);                 Arredondamento1.setToolTipText("Arredondamento");
        Potenciacao2=new JButton("X^2");                Teclado2.add(Potenciacao2);                         Potenciacao2.addActionListener(Handler);                    Potenciacao2.setToolTipText("Numero elevado ao quadrado");
        Potenciacao3=new JButton("X^3");                Teclado2.add(Potenciacao3);                         Potenciacao3.addActionListener(Handler);                    Potenciacao3.setToolTipText("Numero elevado ao cubo");
        PotenciacaoXY=new JButton("X^Y");               Teclado2.add(PotenciacaoXY);                        PotenciacaoXY.addActionListener(Handler);                   PotenciacaoXY.setToolTipText("Numero elevado ao Y");
        Logaritimo=new JButton("Log");                  Teclado2.add(Logaritimo);                           Logaritimo.addActionListener(Handler);                      Logaritimo.setToolTipText("Logaritimo");
        RParaG=new JButton("R>G");                      Teclado2.add(RParaG);                               RParaG.addActionListener(Handler);                          RParaG.setToolTipText("Numero elevado ao Y");
        GParaR=new JButton("G>R");                      Teclado2.add(GParaR);                               GParaR.addActionListener(Handler);                          GParaR.setToolTipText("Numero elevado ao Y");
        LimparTela=new JButton("C");                    Teclado2.add(LimparTela);                           LimparTela.addActionListener(Handler);                      LimparTela.setToolTipText("Numero elevado ao Y");
        Delete=new JButton("Del");                      Teclado2.add(Delete);                               Delete.addActionListener(Handler);                          Delete.setToolTipText("Delete");
        Radiciacao2=new JButton("R2");                  Teclado2.add(Radiciacao2);                          Radiciacao2.addActionListener(Handler);                     Radiciacao2.setToolTipText("Raiz quadrada de um numero");
        Radiciacao3=new JButton("R3");                  Teclado2.add(Radiciacao3);                          Radiciacao3.addActionListener(Handler);                     Radiciacao3.setToolTipText("Raiz cubica de um numero");
        RadiciacaoX=new JButton("RX");                  Teclado2.add(RadiciacaoX);                          RadiciacaoX.addActionListener(Handler);                     RadiciacaoX.setToolTipText("Raiz X de numero");
        Npi=new JButton("PI");                          Teclado2.add(Npi);                                  Npi.addActionListener(Handler);                             Npi.setToolTipText("Numero Pi");
        Inverso=new JButton("1/X");                     Teclado2.add(Inverso);                              Inverso.addActionListener(Handler);                         Inverso.setToolTipText("Inverso de um numero");
        Fatorial=new JButton("X!");                     Teclado2.add(Fatorial);                             Fatorial.addActionListener(Handler);                        Fatorial.setToolTipText("Fatorial de um numero");
        N7=new JButton("7");                            Teclado2.add(N7);                                   N7.addActionListener(Handler);                              N7.setToolTipText("Numero 7");
        N8=new JButton("8");                            Teclado2.add(N8);                                   N8.addActionListener(Handler);                              N8.setToolTipText("Numero 8");
        N9=new JButton("9");                            Teclado2.add(N9);                                   N9.addActionListener(Handler);                              N9.setToolTipText("Numero 9");
        Adicao=new JButton("+");                        Teclado2.add(Adicao);                               Adicao.addActionListener(Handler);                          Adicao.setToolTipText("Adicao");
        Subtacao=new JButton("-");                      Teclado2.add(Subtacao);                             Subtacao.addActionListener(Handler);                        Subtacao.setToolTipText("Subtacao");
        N4=new JButton("4");                            Teclado2.add(N4);                                   N4.addActionListener(Handler);                              N4.setToolTipText("Numero 4");
        N5=new JButton("5");                            Teclado2.add(N5);                                   N5.addActionListener(Handler);                              N5.setToolTipText("Numero 5");
        N6=new JButton("6");                            Teclado2.add(N6);                                   N6.addActionListener(Handler);                              N6.setToolTipText("Numero 6");
        Divisao=new JButton("/");                       Teclado2.add(Divisao);                              Divisao.addActionListener(Handler);                         Divisao.setToolTipText("Divisao");
        Multiplicacao=new JButton("*");                 Teclado2.add(Multiplicacao);                        Multiplicacao.addActionListener(Handler);                   Multiplicacao.setToolTipText("Multiplicacao");
        N1=new JButton("1");                            Teclado2.add(N1);                                   N1.addActionListener(Handler);                              N1.setToolTipText("Numero 1");
        N2=new JButton("2");                            Teclado2.add(N2);                                   N2.addActionListener(Handler);                              N2.setToolTipText("Numero 2");
        N3=new JButton("3");                            Teclado2.add(N3);                                   N3.addActionListener(Handler);                              N3.setToolTipText("Numero 3");
        Porcentagem=new JButton("P%");                  Teclado2.add(Porcentagem);                          Porcentagem.addActionListener(Handler);                     Porcentagem.setToolTipText("Porcentagem");
        NSinal=new JButton("+/-");                      Teclado2.add(NSinal);                               NSinal.addActionListener(Handler);                          NSinal.setToolTipText("Sinal de Numero");
        N0=new JButton("0");                            Teclado2.add(N0);                                   N0.addActionListener(Handler);                              N0.setToolTipText("Numero 0");
        Ponto=new JButton(".");                         Teclado2.add(Ponto);                                Ponto.addActionListener(Handler);                           Ponto.setToolTipText("Ponto");
        Igual=new JButton("=");                         Teclado2.add(Igual);                                Igual.addActionListener(Handler);                           Igual.setToolTipText("Igual");
        Expoente=new JButton("Exp");                    Teclado2.add(Expoente);                             Expoente.addActionListener(Handler);                        Expoente.setToolTipText("Expoente");
        Mod=new JButton("Mod");                         Teclado2.add(Mod);                                  Mod.addActionListener(Handler);                             Mod.setToolTipText("Modulo");
        //--------Cor do componente-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------Teclado 1-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        AjudaTela.setBackground(Color.LIGHT_GRAY);      Sair.setBackground(Color.LIGHT_GRAY);               SobreACalculadoara.setBackground(Color.LIGHT_GRAY);               
        //--------------------------------------------------------------------------Teclado 2-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        N0.setBackground(Color.GRAY);                   Adicao.setBackground(Color.GRAY);                   LimparTela.setBackground(Color.GREEN);                      Potenciacao2.setBackground(Color.LIGHT_GRAY);
        N1.setBackground(Color.GRAY);                   Subtacao.setBackground(Color.GRAY);                 Delete.setBackground(Color.GREEN);                          Potenciacao3.setBackground(Color.LIGHT_GRAY);
        N2.setBackground(Color.GRAY);                   Divisao.setBackground(Color.GRAY);                  Tangente.setBackground(Color.LIGHT_GRAY);                   PotenciacaoXY.setBackground(Color.LIGHT_GRAY);
        N3.setBackground(Color.GRAY);                   Multiplicacao.setBackground(Color.GRAY);            Cotangente.setBackground(Color.LIGHT_GRAY);                 RParaG.setBackground(Color.LIGHT_GRAY);
        N4.setBackground(Color.GRAY);                   Ponto.setBackground(Color.GRAY);                    Seno.setBackground(Color.LIGHT_GRAY);                       GParaR.setBackground(Color.LIGHT_GRAY);
        N5.setBackground(Color.GRAY);                   Igual.setBackground(Color.GRAY);                    Cosseno.setBackground(Color.LIGHT_GRAY);                    Npi.setBackground(Color.LIGHT_GRAY);
        N6.setBackground(Color.GRAY);                   NSinal.setBackground(Color.GRAY);                   Secante.setBackground(Color.LIGHT_GRAY);                    Inverso.setBackground(Color.LIGHT_GRAY);
        N7.setBackground(Color.GRAY);                   Porcentagem.setBackground(Color.GRAY);              Cossecante.setBackground(Color.LIGHT_GRAY);                 Radiciacao2.setBackground(Color.LIGHT_GRAY);
        N8.setBackground(Color.GRAY);                   Expoente.setBackground(Color.GRAY);                 Arredondamento1.setBackground(Color.LIGHT_GRAY);            Radiciacao3.setBackground(Color.LIGHT_GRAY);
        N9.setBackground(Color.GRAY);                   Mod.setBackground(Color.GRAY);                      Logaritimo.setBackground(Color.LIGHT_GRAY);                 RadiciacaoX.setBackground(Color.LIGHT_GRAY);
        Hypotenusa.setBackground(Color.LIGHT_GRAY);     ArcoSeno.setBackground(Color.LIGHT_GRAY);           ArcoCosseno.setBackground(Color.LIGHT_GRAY);                ArcoTangente.setBackground(Color.LIGHT_GRAY);                                           
        Fatorial.setBackground(Color.LIGHT_GRAY);       BotaoShift.setBackground(Color.LIGHT_GRAY);                                                                                                                                                                                                                              
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        addWindowListener(
                new WindowAdapter() 
                {
                    public void windowClosing(WindowEvent we) {
                        int opcao; opcao=JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "Sair do programa",JOptionPane.YES_NO_OPTION);
                        if (opcao==JOptionPane.YES_OPTION) {System.exit(0);}
                    }
                }
        );
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        this.setDefaultCloseOperation(0);
        this.setSize(400,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public class ButtonHandler implements ActionListener
    {
        String xx="0";
        String cadeia = "0";
        String copiar = "";
        int OP;
        double xa=0,xb=0,xr=0;
        char op='n';
        int Achou, zerar, num ;
        long fac=-1;
        int m,f=1;
        public void actionPerformed(ActionEvent event)
        {
            //-------------Teclado 1-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            if(event.getSource() == SobreACalculadoara){JOptionPane.showMessageDialog(null,"Calculadora feita em Java");}
            
            else if(event.getSource() == AjudaTela){CalculadoraAjuda X = new CalculadoraAjuda();}
            
            else if(event.getSource() == Sair){int opcao; opcao=JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "Sair do programa",JOptionPane.YES_NO_OPTION);
                                                    if (opcao==JOptionPane.YES_OPTION) System.exit(0);}
            //-------------Teclado 2-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            if(event.getSource() == N1){if(zerar == 1) xx = "";if(xx.equals("0"))xx = "";xx = xx + "1";zerar = 0;}
            
            else if(event.getSource() == N2){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"2";zerar = 0;}
            
            else if(event.getSource() == N3){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"3";zerar = 0;}
            
            else if(event.getSource() == N4){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"4";zerar = 0;}
            
            else if(event.getSource() == N5){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"5";zerar = 0;}
            
            else if(event.getSource() == N6){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"6";zerar = 0;}
            
            else if(event.getSource() == N7){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"7";zerar = 0;}
            
            else if(event.getSource() == N8){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"8";zerar = 0;}
            
            else if(event.getSource() == N9){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"9";zerar = 0;}
            
            else if(event.getSource() == N0){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx +"0";zerar = 0;}
            
            else if(event.getSource() == Ponto){Achou = 0;if(zerar == 1)xx = "";for (int i=0; i<xx.length(); ++i)if (xx.charAt(i) == '.') Achou=1;
                                                    if (xx.equals("")) xx = xx + "0."; else if (Achou == 0) xx = xx + "."; zerar = 0;}
            
            else if(event.getSource() == Npi){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx + "3.14159265359";zerar = 0;}
            //Math.PI
            else if(event.getSource() == Adicao){xa = Double.parseDouble(Tela1.getText());op = '+';zerar = 1;}
            
            else if(event.getSource() == Subtacao){xa = Double.parseDouble(Tela1.getText());op = '-';zerar = 1;}
            
            else if(event.getSource() == Divisao){xa = Double.parseDouble(Tela1.getText());op = '/';zerar = 1;}
            
            else if(event.getSource() == Multiplicacao){xa = Double.parseDouble(Tela1.getText());op = '*';zerar = 1;}
            
            else if(event.getSource() == Igual){xb = Double.parseDouble(Tela1.getText());
                                                switch(op) {case 'n': xr = xb;break;    
                                                            case '+': xr = xa + xb;break;   
                                                            case '-': xr = xa - xb;break;                                 
                                                            case '*': xr = xa * xb;break;   
                                                            case '/': if(xb == 0){JOptionPane.showMessageDialog(null,"Impossivel dividir por 0");}else{xr = xa / xb;}break;
                                                            case '^': xr = Math.pow(xa, xb);break;
                                                            case 'r': xr = Math.pow (xa, 1.0 / xb);break;
                                                            case '!': num=(int)xb; 
                                                            long txx = 1;
                                                            for (int i = 2; i <= num; i++) 
                                                            {
                                                                  txx = txx * i;
                                                            }
                                                            xr = txx;
                                                            break;
                                                            case 'e': xr =(xa * (Math.pow(10, xb)));break;
                                                            case 'i': xr = (Math.abs (xa % xb));break;
                                                            case 'j': xr =(Math.sqrt((Math.pow(xa, 2))+(Math.pow(xb, 2))));break;
                                                                                                                   }    
                                                            xx = String.valueOf(xr);zerar = 1;}
            
            else if(event.getSource() == Tangente){xx=String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(xx))));}
            
            else if(event.getSource() == Cotangente){xx=String.valueOf(1/(Math.tan(Math.toRadians(Double.parseDouble(xx)))));}
            
            else if(event.getSource() == Seno){xx=String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(xx))));}
            
            else if(event.getSource() == Cosseno){xx=String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(xx))));}
            
            else if(event.getSource() == Secante){xx=String.valueOf(1/(Math.cos(Math.toRadians(Double.parseDouble(xx)))));}
            
            else if(event.getSource() == Cossecante){xx=String.valueOf(1/(Math.sin(Math.toRadians(Double.parseDouble(xx)))));}
            
            else if(event.getSource() == Potenciacao2){xx = String.valueOf(Math.pow(Double.parseDouble(xx) , 2));zerar = 1;}
            
            else if(event.getSource() == Potenciacao3){xx = String.valueOf(Math.pow(Double.parseDouble(xx), 3));zerar = 1;}
            
            else if(event.getSource() == PotenciacaoXY){xa = Double.parseDouble(Tela1.getText());op = '^';zerar = 1;}
            
            else if(event.getSource() == Logaritimo){xx = String.valueOf(Math.log10(Double.parseDouble(xx)));zerar = 1;}
            
            else if(event.getSource() == RParaG){xx=String.valueOf(Math.toRadians(Double.parseDouble(xx)));zerar = 1;}
            
            else if(event.getSource() == GParaR){xx=String.valueOf((Double.parseDouble(xx)/180));zerar = 1;}
            
            else if(event.getSource() == LimparTela){xx="0.0";zerar = 1;}
            
            else if(event.getSource() == Delete){if (xx.length()  > 1) xx = xx.substring(0, xx.length()-1);else{xx = "0.0"; zerar = 1;}}
            
            else if(event.getSource() == Radiciacao2){xx = String.valueOf(Math.sqrt(Double.parseDouble(xx)));zerar = 1;}
            
            else if(event.getSource() == Radiciacao3){xx = String.valueOf(Math.cbrt(Double.parseDouble(xx)));zerar = 1;}
            
            else if(event.getSource() == RadiciacaoX){xa = Double.parseDouble(Tela1.getText());op = 'r';zerar = 1;}
            
            else if(event.getSource() == Inverso){xx = String.valueOf(1/Double.parseDouble(xx));zerar = 1;}
            
            else if(event.getSource() == Fatorial){xr = Double.parseDouble(Tela1.getText());op = '!';zerar = 1;}
                                                                                      
            else if(event.getSource() == Hypotenusa){xa = Double.parseDouble(Tela1.getText());op = 'j';zerar = 1;}
            
            else if(event.getSource() == ArcoSeno){xx=String.valueOf(Math.toDegrees(Math.asin(Math.cos(Double.parseDouble(xx)))));zerar = 1;}
            
            else if(event.getSource() == ArcoCosseno){xx=String.valueOf(Math.toDegrees(Math.acos(Math.sin(Double.parseDouble(xx)))));zerar = 1;}
            
            else if(event.getSource() == ArcoTangente){xx=String.valueOf(Math.toDegrees(Math.atan(Double.parseDouble(xx))));zerar = 1;}
            
            else if(event.getSource() == Expoente){xa = Double.parseDouble(Tela1.getText());op = 'e';zerar = 1;}
            
            else if(event.getSource() == NSinal){xx=String.valueOf((Double.parseDouble(xx))*(-1));}
            
            else if(event.getSource() ==Porcentagem){xx=String.valueOf((Double.parseDouble(xx))/100);}
            
            else if(event.getSource() == BotaoShift){
                if(BotaoShift.isSelected())
                {
                    OP=1;
                }
                else
                {
                    OP=2;
                }
                switch(OP)
                {
                    case 1:
                    Mod.setText("MOD");
                    if(event.getSource() == Mod){xa = Double.parseDouble(Tela1.getText());op = 'i';zerar = 1;}
                    break;
                    case 2:
                    Mod.setText("XXX");
                    if(event.getSource() == Mod){if(zerar == 1)xx = "";if(xx.equals("0"))xx = "";xx = xx + "3.14159265359";zerar = 0;}
                    break;
                }
            }
            else if(event.getSource() == Arredondamento1){xx=String.valueOf(Math.floor(Double.parseDouble(xx)));zerar = 1;}
            
            Tela1.setText("" + xx);
            
        }
    }
    public class CalculadoraAjuda extends JFrame 
    {
        JButton ButtonOK,Button1,Button2;
        JLabel LabelTitulo,TelaAjudaTexto,TelaAjudaTexto2,TelaAjudaTexto3,TelaAjudaTexto4;
        JPanel TelaAjuda,TelaTitulo,TelaBotao,PanelPagina1,PanelPagina2;
        JTabbedPane AbaPanel;
        ButtonHandler2 Handler2 = new ButtonHandler2();
        public CalculadoraAjuda(){
            super("Calculadora - ajuda");
            Container Tela2 = getContentPane();
            Tela2.setLayout(new BorderLayout());
            Tela2.setBackground(Color.GRAY);
            //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            //--Componente------------------------------------------------Adicionar componente--------------------------------Cor do componente----------------------------------------------------------Layout e Dimensões do componente---------------------------------------
            TelaTitulo = new JPanel(new BorderLayout());                add(BorderLayout.NORTH, TelaTitulo);                TelaTitulo.setBackground(Color.GRAY);                                       TelaTitulo.setPreferredSize(new Dimension(400,50));
            TelaAjuda = new JPanel(new BorderLayout());                 add(BorderLayout.CENTER, TelaAjuda);                TelaAjuda.setBackground(Color.LIGHT_GRAY);
            TelaBotao = new JPanel();                                   add(BorderLayout.SOUTH, TelaBotao);                 TelaBotao.setBackground(Color.LIGHT_GRAY);
            PanelPagina1 = new JPanel();                                add(BorderLayout.CENTER, PanelPagina1);             PanelPagina1.setBackground(Color.LIGHT_GRAY);                               PanelPagina1.setLayout(null);                                               
            //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            //--Componente------------------------------------------------Dimensões e Adicionar componente--------------------Cor do componente--------------------------------------------------------------Dimensões do componente--------------------------------------------
            LabelTitulo = new JLabel("Calculadora - Ajuda");            TelaTitulo.add(BorderLayout.CENTER, LabelTitulo);   LabelTitulo.setFont(new Font("Times New Roman",Font.BOLD, 30));             LabelTitulo.setPreferredSize(new Dimension(100,50));    
            TelaAjudaTexto = new JLabel("<html>Legenda<br><br>Tan - Tangente<br>Ctg - Cotangente<br>Sen - Seno<br>Cos - Cosseno<br>Sec - Secante<br>Csc - Cossecante<br>1/x - Inverso de numero<br>X! - XFatorial<br>Log -Logaritimo </html>");               
            PanelPagina1.add(TelaAjudaTexto);                           TelaAjudaTexto.setBounds(10,10,150,250);            TelaAjudaTexto.setFont(new Font("Times New Roman",Font.BOLD, 15));
            TelaAjudaTexto2 = new JLabel("<html><br>(+) - Adicao<br>(-) - Subtracao<br>(/) - Divisao<br>(*) - Multiplicacao<br>(X!) -Fatorial<br>(.) - Ponto<br>Hyp - Hypotenusa<br>EXP - Expoente<br>Rnd - Arredondamento1<br>(=) - Igual</html>");             
            PanelPagina1.add(TelaAjudaTexto2);                          TelaAjudaTexto2.setBounds(10,200,150,250);          TelaAjudaTexto2.setFont(new Font("Times New Roman",Font.BOLD, 15));
            TelaAjudaTexto3 = new JLabel("<html>Npi - Numero Pi<br>RParaG - Converte radiano para grau<br>GParaR - Converte grau para radiano<br>(C) - Limpa os numeros do visor<br>X^2 - Numero ao quadrado<br>X^3 - Numero ao cubo<br><br></html>");
            PanelPagina1.add(TelaAjudaTexto3);                          TelaAjudaTexto3.setBounds(200,40,150,250);          TelaAjudaTexto3.setFont(new Font("Times New Roman",Font.BOLD, 15));
            TelaAjudaTexto4 = new JLabel("<html><br>Raiz2 - Raiz quadrada<br>Raiz3 - Raiz cubica<br>X^Y - X elevado a Y<br>RaizX - Raiz X de numero<br>(+/-) - Troca de sinal<br>Del - Delete<br>(%) - Porcentagem<br>(.) -Ponto</html>");
            PanelPagina1.add(TelaAjudaTexto4);                          TelaAjudaTexto4.setBounds(200,200,150,250);         TelaAjudaTexto4.setFont(new Font("Times New Roman",Font.BOLD, 15));
            //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            //-----Componente----------------------------------------------Adicionar componente--------------------------------------------Dimensões componente----------------------------------------------Açoes do componente-------------------------------------------------
            ButtonOK = new JButton("OK");                               TelaBotao.add(ButtonOK);                            ButtonOK.setPreferredSize(new Dimension(100,30));                            ButtonOK.addActionListener(Handler2);
            ButtonOK.setFont(new Font("Times New Roman",Font.BOLD, 30));
            //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            this.setSize(400,600);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }
        public class ButtonHandler2 implements ActionListener
        {
            public void actionPerformed(ActionEvent event2)
            {
                if(event2.getSource() == ButtonOK){setVisible(false); dispose();}
            }
        }
     }
}

