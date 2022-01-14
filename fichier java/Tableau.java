import java.util.*;

public class Tableau{

	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Cons[] session = new Cons[25];

		System.out.println("\n nbre session : ");

		int nbre_session = sc.nextInt();
		int i;


		for (i = 1; i <= nbre_session ; i++) {



			session[i] = new Cons(i);
			session[i].remplir();
			
		}

		System.out.println("\n\t AFFICHAGE : ");

		affcihe_principal(session, nbre_session);



	
		

	}

	
		static public void affcihe_principal(Cons[] session, int nbre_session){

		int i,j;

		int s,c;

		int sl,cl,d;

		String m;
		String n;

		for (s = 1; s <= nbre_session ; s++ ) {
			
			for (c = 1; c <= session[s].nbre_champ ; c++) {
/////////////////////////////////////////////////////////////////////////////////////
				
				if (session[s].type_session.compareTo("int") == 0) {

					
					m = "riens";
					
					if (session[s].liaison_principal.compareTo("oui") != 0) {
						System.out.print("\n "+session[s].tab_int[s][c]+"\t\t");
						
						m = "tab_int["+s+"]["+c+"]";
					}

					
					
					for (sl = 1; sl <= nbre_session ; sl++) {
					
						for (cl = 1; cl <= session[sl].nbre_champ; cl++ ) {

							for (d = 1; d <= session[sl].nbre_liaison_champ[cl] ; d++ ) {

								if (session[sl].dns_2[cl][d] == null) {
									session[sl].dns_2[cl][d] ="rien"; 
									
								}
								

								

								if (m.compareTo(session[sl].dns_2[cl][d]) == 0) {

									
									if (session[sl].type_session.compareTo("int") == 0) {
										System.out.print("  "+session[sl].tab_int[sl][cl]);		
										
									}

									if (session[sl].type_session.compareTo("float") == 0) {
										System.out.print("  "+session[sl].tab_float[sl][cl]);
										
									}

									if (session[sl].type_session.compareTo("string") == 0) {
										System.out.print("  "+session[sl].tab_string[sl][cl]);
										
									}

									
								}







							
							}
						
						}

					}
				}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
				if (session[s].type_session.compareTo("string") == 0) {

					
					m = "riens";

					if (session[s].liaison_principal.compareTo("oui") != 0) {
						System.out.print("\n "+session[s].tab_string[s][c]+"\t\t");
						
						m = "tab_string["+s+"]["+c+"]";
					}

					
					
					for (sl = 1; sl <= nbre_session ; sl++) {
					
						for (cl = 1; cl <= session[sl].nbre_champ; cl++ ) {

							for (d = 1; d <= session[sl].nbre_liaison_champ[cl] ; d++ ) {

								
								if (session[sl].dns_2[cl][d] == null) {
									session[sl].dns_2[cl][d] ="rien"; 
									
								}


								if (m.compareTo(session[sl].dns_2[cl][d]) == 0) {

									if (session[sl].type_session.compareTo("int") == 0) {
										System.out.print("  "+session[sl].tab_int[sl][cl]);
										
									}

									if (session[sl].type_session.compareTo("float") == 0) {
										System.out.print("  "+session[sl].tab_float[sl][cl]);
										
									}

									if (session[sl].type_session.compareTo("string") == 0) {
										System.out.print("  "+session[sl].tab_string[sl][cl]);
										
									}

									
								}
							
							}
						
						}

					}
				}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
				if (session[s].type_session.compareTo("float") == 0) {

					
					m = "riens";

					if (session[s].liaison_principal.compareTo("oui") != 0) {
						System.out.print("\n "+session[s].tab_float[s][c]+"\t\t");
						m = "tab_float["+s+"]["+c+"]";
					}

					
					
					for (sl = 1; sl <= nbre_session ; sl++) {
					
						for (cl = 1; cl <= session[sl].nbre_champ; cl++ ) {

							for (d = 1; d <= session[sl].nbre_liaison_champ[cl] ; d++ ) {


								if (session[sl].dns_2[cl][d] == null) {
									session[sl].dns_2[cl][d] ="rien"; 
									
								}
								

								if (m.compareTo(session[sl].dns_2[cl][d]) == 0) {

									if (session[sl].type_session.compareTo("int") == 0) {
										System.out.print("  "+session[sl].tab_int[sl][cl]);
										
									}

									if (session[sl].type_session.compareTo("float") == 0) {
										System.out.print("  "+session[sl].tab_float[sl][cl]);
										
									}

									if (session[sl].type_session.compareTo("string") == 0) {
										System.out.print("  "+session[sl].tab_string[sl][cl]);
										
									}

									
								}
							
							}
						
						}

					}
				}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
				



				
				
			}

		}

		
	}
	
}