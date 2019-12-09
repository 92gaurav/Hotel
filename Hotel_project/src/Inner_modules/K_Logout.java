package Inner_modules;

import java.io.IOException;


import java.net.MalformedURLException;


public class K_Logout {

public void logout() {
	
	System.out.println("Logout Successfully");
	System.out.println("Browser Closed");
}


public static void main(String[] args) throws MalformedURLException, IOException {
	// TODO Auto-generated method stub
	
	A_login qa = new A_login();
	
	B_properties qb = new B_properties() ;
	C_room qc = new C_room() ;
	D_manageprice qd = new D_manageprice() ;
	E_guests qe = new E_guests();
	F_staffs qf = new F_staffs();
	G_poss qg = new G_poss();
	H_templatee qh = new H_templatee();
	I_Dashboards qi = new I_Dashboards();
	J_Settings qj = new J_Settings();
	K_Logout qk = new  K_Logout();
			      
	try {		
	qa.pagelogin();
	qa.urlresponse(null);
	qb.property();
	qc.room();
	qd.pricemanager();
	qe.guests();
	qf.staff();
    qg.pos_point();
	qh.template_designer();
	qi.home_page();
	qj.setting_dropdown();
	qk.logout();
	
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}