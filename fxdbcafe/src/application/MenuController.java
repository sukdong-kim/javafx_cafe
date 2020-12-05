package application;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MenuController {

	int total_coffee=0;
	int total_cake = 0;
	int total =0;
	int subtotal =0;
	int tax =0;
	int service =0;
	int l;
	
	 String s_total_coffee;
	 String s_total_cake;
	 String s_total;
	 String s_subtotal;
	 String s_tax;
	 String s_service;
	 
	Vector<String> sel;
	@FXML
	private CheckBox c1;

	@FXML
	private CheckBox c2;

	@FXML
	private CheckBox c3;

	@FXML
	private CheckBox c4;

	@FXML
	private CheckBox c5;

	@FXML
	private CheckBox c6;

	@FXML
	private CheckBox c7;

	@FXML
	private TextField txt_c1;

	@FXML
	private TextField txt_c2;

	@FXML
	private TextField txt_c31;

	@FXML
	private TextField txt_c32;

	@FXML
	private TextField txt_c41;

	@FXML
	private TextField txt_c42;

	@FXML
	private TextField txt_c7;

	@FXML
	private TextField txt_c62;

	@FXML
	private TextField txt_c61;

	@FXML
	private TextField txt_c52;

	@FXML
	private TextField txt_c51;

	@FXML
	private CheckBox k1;

	@FXML
	private CheckBox k2;

	@FXML
	private CheckBox k3;

	@FXML
	private CheckBox k4;

	@FXML
	private CheckBox k5;

	@FXML
	private CheckBox k6;

	@FXML
	private TextField txt_k1;

	@FXML
	private TextField txt_k2;

	@FXML
	private TextField txt_k3;

	@FXML
	private TextField txt_k4;

	@FXML
	private TextField txt_k6;

	@FXML
	private TextField txt_k5;

	@FXML
	private TextArea ta;

	@FXML
	private TextField txt_t1;

	@FXML
	private TextField txt_t2;

	@FXML
	private TextField txt_t3;

	@FXML
	private TextField txt_t4;

	@FXML
	private TextField txt_t5;

	@FXML
	private TextField txt_t6;

	public void reset() {	
		txt_c1.setText("");
		txt_c2.setText("");
		txt_c31.setText("");
		txt_c41.setText("");
		txt_c51.setText("");
		txt_c61.setText("");
		txt_c32.setText("");
		txt_c42.setText("");
		txt_c52.setText("");
		txt_c62.setText("");
		txt_c7.setText("");
		txt_k1.setText("");
		txt_k2.setText("");
		txt_k3.setText("");
		txt_k4.setText("");
		txt_k5.setText("");
		txt_k6.setText("");

		txt_t1.setText("");
		txt_t2.setText("");
		txt_t3.setText("");
		txt_t4.setText("");
		txt_t5.setText("");
		txt_t6.setText("");
		
		ta.setText("");
		
		 total_coffee=0;
		 total_cake = 0;
		 total =0;
		 subtotal =0;
		 tax =0;
		 service = 1500;
		 l=0;
	}


	@FXML
	void onClickB1(ActionEvent event) {    	
		if(!(txt_c1.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 3000;
		txt_c1.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));    

	}

	@FXML
	void onClickB2(ActionEvent event) {
		if(!(txt_c2.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 3000;
		txt_c2.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB31(ActionEvent event) {
		if(!(txt_c31.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 3500;
		txt_c31.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB32(ActionEvent event) {
		if(!(txt_c32.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 4000;
		txt_c32.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB41(ActionEvent event) {
		if(!(txt_c41.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 4000;
		txt_c41.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB42(ActionEvent event) {
		if(!(txt_c42.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 4500;
		txt_c42.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB51(ActionEvent event) {
		if(!(txt_c51.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 4000;
		txt_c51.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB52(ActionEvent event) {
		if(!(txt_c52.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 4500;
		txt_c52.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB61(ActionEvent event) {
		if(!(txt_c61.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 4000;
		txt_c61.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB62(ActionEvent event) {
		if(!(txt_c62.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 4500;
		txt_c62.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickB7(ActionEvent event) {
		if(!(txt_c7.getText().equals("")))
			l++;
		else
			l=1;

		total_coffee += 5000;
		txt_c7.setText(String.valueOf(l));  
		txt_t1.setText(String.valueOf(total_coffee));   
	}

	@FXML
	void onClickK1(ActionEvent event) {
		if(!(txt_k1.getText().equals("")))
			l++;
		else
			l=1;

		total_cake += 4500;
		txt_k1.setText(String.valueOf(l));  
		txt_t2.setText(String.valueOf(total_cake));   
	}

	@FXML
	void onClickK2(ActionEvent event) {
		if(!(txt_k2.getText().equals("")))
			l++;
		else
			l=1;

		total_cake += 5500;
		txt_k2.setText(String.valueOf(l));  
		txt_t2.setText(String.valueOf(total_cake));  
	}

	@FXML
	void onClickK3(ActionEvent event) {
		if(!(txt_k3.getText().equals("")))
			l++;
		else
			l=1;

		total_cake += 5000;
		txt_k3.setText(String.valueOf(l));  
		txt_t2.setText(String.valueOf(total_cake));  
	}

	@FXML
	void onClickK4(ActionEvent event) {
		if(!(txt_k4.getText().equals("")))
			l++;
		else
			l=1;

		total_cake += 5000;
		txt_k4.setText(String.valueOf(l));  
		txt_t2.setText(String.valueOf(total_cake));  
	}

	@FXML
	void onClickK5(ActionEvent event) {
		if(!(txt_k5.getText().equals("")))
			l++;
		else
			l=1;

		total_cake += 7000;
		txt_k5.setText(String.valueOf(l));  
		txt_t2.setText(String.valueOf(total_cake));  
	}

	@FXML
	void onClickK6(ActionEvent event) {
		if(!(txt_k6.getText().equals("")))
			l++;
		else
			l=1;

		total_cake += 1000;
		txt_k6.setText(String.valueOf(l));  
		txt_t2.setText(String.valueOf(total_cake));  
	}

	@FXML
	void onClickReceipt(ActionEvent event) {

	  	ta.setText(ta.getText()+"\t\t\t\t\t\t ������ \n\n");
	  	Random r = new Random();
	  	int ir = r.nextInt(10000);
	  	ta.setText(ta.getText()+"Reference #   " + "\t\t\t\t\t\t\t\t\t\t\t\t"+ ir + "\n");
		ta.setText(ta.getText()+"==========================================================\n");
	  	
		if(!(txt_c1.getText().equals("")))
	    	ta.setText(ta.getText()+"Today's coffee  : " + "\t\t\t"+ txt_c1.getText() + "\n");
		if(!(txt_c2.getText().equals("")))
	    	ta.setText(ta.getText()+"����������  :        " + "\t\t\t"+ txt_c2.getText() + "\n");
		if(!(txt_c31.getText().equals("")))
	    	ta.setText(ta.getText()+"�Ƹ޸�ī�� Hot  : " + "\t\t\t"+ txt_c31.getText() + "\n");
		if(!(txt_c32.getText().equals("")))
	    	ta.setText(ta.getText()+"�Ƹ޸�ī�� Ice  :  " + "\t\t\t"+ txt_c32.getText() + "\n");
		if(!(txt_c41.getText().equals("")))
	    	ta.setText(ta.getText()+"ī����� Hot  :   " + "\t\t\t"+ txt_c41.getText() + "\n");
		if(!(txt_c42.getText().equals("")))
	    	ta.setText(ta.getText()+"ī����� Ice  :      " + "\t\t\t"+ txt_c42.getText() + "\n");
		if(!(txt_c51.getText().equals("")))
	    	ta.setText(ta.getText()+"īǪġ�� Hot  :    " + "\t\t\t"+ txt_c51.getText() + "\n");
		if(!(txt_c52.getText().equals("")))
	    	ta.setText(ta.getText()+"īǪġ�� Ice  :    " + "\t\t\t"+ txt_c52.getText() + "\n");
		if(!(txt_c61.getText().equals("")))
	    	ta.setText(ta.getText()+"ī���ī Hot  :    " + "\t\t\t"+ txt_c61.getText() + "\n");
		if(!(txt_c62.getText().equals("")))
	    	ta.setText(ta.getText()+"ī���ī Ice  :      " + "\t\t\t"+ txt_c62.getText() + "\n");
		if(!(txt_c7.getText().equals("")))
	    	ta.setText(ta.getText()+"����ī��  :          " + "\t\t\t"+ txt_c7.getText() + "\n");
		
		ta.setText(ta.getText()+"==========================================================\n");
		       
    	ta.setText(ta.getText()+" Ŀ������ �հ� = " + "\t\t\t"+ s_total_coffee + "\n\n");

		if(!(txt_k1.getText().equals("")))
	    	ta.setText(ta.getText()+"Ŀ������  :          " + "\t\t\t"+ txt_k1.getText() + "\n");
		if(!(txt_k2.getText().equals("")))
	    	ta.setText(ta.getText()+"ũ�� ����  :          " + "\t\t\t"+ txt_k2.getText() + "\n");
		if(!(txt_k3.getText().equals("")))
	    	ta.setText(ta.getText()+"���ڷ�����  :       " + "\t\t\t"+ txt_k3.getText() + "\n");
		if(!(txt_k4.getText().equals("")))
	    	ta.setText(ta.getText()+"ġ������  :          " + "\t\t\t"+ txt_k4.getText() + "\n");
		if(!(txt_k5.getText().equals("")))
	    	ta.setText(ta.getText()+"ũ����  :          " + "\t\t\t"+ txt_k5.getText() + "\n");
		if(!(txt_k6.getText().equals("")))
	    	ta.setText(ta.getText()+"��ī��  :          " + "\t\t\t"+ txt_k6.getText() + "\n");
		
		ta.setText(ta.getText()+"==========================================================\n");
    	ta.setText(ta.getText()+" ���� �հ� = " + "\t\t\t"+ s_total_cake + "\n\n");
		
    	ta.setText(ta.getText()+"==========================================================\n\n");
    	
    	ta.setText(ta.getText()+"����� = " + "\t\t"+ s_service + "\n");
    	ta.setText(ta.getText()+"���� = " + "\t\t\t"+ s_tax + "\n");
    	ta.setText(ta.getText()+"�߰��հ� = " + "\t\t"+ s_subtotal + "\n");
    	ta.setText(ta.getText()+"Total = " + "\t\t\t"+ s_total + "\n\n");
    	
		ta.setText(ta.getText()+"==========================================================\n");
    	
    	DateFormat format = new SimpleDateFormat("yyyy�� MM�� dd��");
    	String currentdate = format.format(Calendar.getInstance().getTime());
    	DateFormat format1 = new SimpleDateFormat("hh�� mm�� ss��");
    	String currentdate1 = format1.format(Calendar.getInstance().getTime());
    	
    	ta.setText(ta.getText()+"Date : " + "\t"+ currentdate + "\t\t Time : " + currentdate1+ "\n\n");
   
    	ta.setText(ta.getText()+"**************** Thank you Come Again******************\n");
    	

	}

	@FXML
	void onClickReset(ActionEvent event) {
		reset();
	}

	@FXML
	void onClickTotal(ActionEvent event) {
		int sum = total_coffee + total_cake;
		if(sum >50000)
			service = 2000;
		else
			service = 1000;
		subtotal = sum+service;
		tax = (int)(0.1*sum);
		total = subtotal+tax;

	
        NumberFormat numberFormatter = NumberFormat.getNumberInstance();
        s_total_coffee = numberFormatter.format(total_coffee);
        s_total_cake = numberFormatter.format(total_cake);
        s_subtotal = numberFormatter.format(subtotal);
        s_service = numberFormatter.format(service);
        s_tax = numberFormatter.format(tax);
        s_total = numberFormatter.format(total);

		txt_t1.setText(String.valueOf(s_total_coffee));
		txt_t2.setText(String.valueOf(s_total_cake));
		txt_t3.setText(String.valueOf(s_service));
		txt_t4.setText(String.valueOf(s_tax));
		txt_t5.setText(String.valueOf(s_subtotal));
		txt_t6.setText(String.valueOf(s_total));
	}
	@FXML
	void onClickExit(ActionEvent event) {
		System.exit(0);
	}

}
