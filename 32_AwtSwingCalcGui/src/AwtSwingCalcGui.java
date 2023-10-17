//25/01/23
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AwtSwingCalcGui implements ActionListener {
	Frame frm;
	Panel pnl;
	Label lno1, lno2, lresult;
	TextField tno1, tno2, tresult;
	Button badd, bsub, bmul, bdiv;
	JButton breset, bexit;
	
	public AwtSwingCalcGui()
	{
		frm=new Frame();
		frm.setSize(800, 900);
		frm.setVisible(true);
		
		pnl=new Panel();
		frm.add(pnl);
		pnl.setBackground(Color.blue);
		
		GridLayout gl=new GridLayout(6,2);
		pnl.setLayout(gl);
		
		Font f=new Font("Times New Roman", Font.BOLD+Font.ITALIC, 22);
		
		lno1=new Label("No 1");
		lno2=new Label("No 2");
		lresult=new Label("Result");
		
		lno1.setBackground(Color.orange);
		
		tno1=new TextField(10);
		tno2=new TextField(10);
		tresult=new TextField(10);
		
		lno1.setFont(f);
		lno2.setFont(f);
		lresult.setFont(f);
		tno1.setFont(f);
		tno2.setFont(f);
		tresult.setFont(f);
		
		badd=new Button("+");
		bsub=new Button("-");
		bmul=new Button("*");
		bdiv=new Button("/");
		breset=new JButton("C");
		bexit=new JButton("Exit");
		
		pnl.add(lno1);
		pnl.add(tno1);
		pnl.add(lno2);
		pnl.add(tno2);
		pnl.add(lresult);
		pnl.add(tresult);
		
		pnl.add(badd);
		pnl.add(bsub);
		pnl.add(bmul);
		pnl.add(bdiv);
		pnl.add(breset);
		pnl.add(bexit);
		
		//27/01/23 :
		//Register Event on Source Component
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		breset.addActionListener(this);
		bexit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==badd)
		{
			String s1=tno1.getText();
			String s2=tno2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int sum=n1+n2;
			tresult.setText(Integer.toString(sum));
		}
		
		if(e.getSource()==bsub)
		{
			String s1=tno1.getText();
			String s2=tno2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int result=n1-n2;
			tresult.setText(Integer.toString(result));
		}
		
		if(e.getSource()==bmul)
		{
			String s1=tno1.getText();
			String s2=tno2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int result=n1*n2;
			tresult.setText(Integer.toString(result));
		}
		
		if(e.getSource()==bdiv)
		{
			String s1=tno1.getText();
			String s2=tno2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int result=n1/n2;
			tresult.setText(Integer.toString(result));
		}
		
		if(e.getSource()==breset)
		{
			tno1.setText("");
			tno2.setText("");
			tresult.setText("");
		}
		
		if(e.getSource()==bexit)
		{
			System.exit(0);
		}
	}
}
