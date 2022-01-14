import java.util.*;

public class Cons{

	public String type_session;
	public String nom_session;

	public String liaison_principal;
	



	public int[] nbre_liaison_champ = new int[100];

	public int nbre_champ;
	public int num_session;
	public int num_champ;


	public String[][][] dns = new String[100][100][100];
	public String[][] dns_2 = new String[100][100];

	public int[][] tab_int = new int[100][100];
	public String[][] tab_string = new String[100][100];
	public float[][] tab_float = new float[100][100];
	




	public Cons(int session_parametre){
		Scanner sc = new Scanner(System.in);

		this.num_session = session_parametre;

		System.out.println("\n nom de la session");

		this.nom_session = sc.next();

		System.out.println("\n nbre de champs");

		this.nbre_champ = sc.nextInt();

		System.out.println("\n type de la session");

		this.type_session = sc.next();
		

		System.out.println("\n chaque de donnees de la session sera t'il lier a une autre donnees d'une autre session ?");

		liaison_principal = sc.next();

		if (liaison_principal.compareTo("oui") != 0) {
			liaison_principal = "non";
			System.out.println("liaison : "+liaison_principal);
			
		}

		
		


	}

	public void remplir(){
		Scanner sc = new Scanner(System.in);
		String c;

		int session_remplir, champ_remplir = 0;
		String type_remplir;

		int i,l;

		String liaison_multiple;

		if (type_session.compareTo("int") == 0 ){

			for (i = 1; i <= nbre_champ ; i++ ) {
				System.out.println("\nentrer la valeur du champ(INT) "+i);
				
				tab_int[num_session][i] = sc.nextInt();
				nbre_liaison_champ[i]   = 1;

				if (liaison_principal.compareTo("oui") == 0) {
					System.out.println("ce champs aura t'il des liaison multiple ?");
					liaison_multiple = sc.next();
					

					if(liaison_multiple.compareTo("oui") == 0){
						System.out.println("entrer le nombre de liaison souhaiter");
						nbre_liaison_champ[i] = sc.nextInt();
					}

					for(l = 1; l <= nbre_liaison_champ[i]; l++){

						System.out.println("\n entrer le numero de la session puis le numero du champs a lier");
						session_remplir = sc.nextInt();
						champ_remplir   = sc.nextInt();
						System.out.println("\n entrer le TYPE de la session a relier");
						type_remplir    = sc.next();

						if (type_remplir.compareTo("int") == 0) {
							dns_2[i][l] = "tab_int["+champ_remplir+"]";
						}


						if (type_remplir.compareTo("string")  == 0) {
							dns_2[i][l] = "tab_string["+session_remplir+"]["+champ_remplir+"]";
						}

						if (type_remplir.compareTo("float") == 0) {
							dns_2[i][l] = "tab_float["+session_remplir+"]["+champ_remplir+"]";
						}

						

					}
					

				}
				
			}
		}

		if (type_session.compareTo("float") == 0) {

			for (i = 1; i <= nbre_champ ; i++ ) {
				System.out.println("\nentrer la valeur du champ(FLOAT) "+i);
				tab_float[num_session][i] = sc.nextFloat();
				nbre_liaison_champ[i] = 1;


				if (liaison_principal.compareTo("oui") == 0) {
					System.out.println("ce champs aura t'il des liaison multiple ?");
					liaison_multiple = sc.next();
					

					if(liaison_multiple.compareTo("oui") == 0){
						System.out.println("entrer le nombre de liaison souhaiter");
						nbre_liaison_champ[i] = sc.nextInt();
					}

					for(l = 1; l<= nbre_liaison_champ[i]; l++){

						System.out.println("\n entrer le numero de la session puis le numero du champs");
						session_remplir = sc.nextInt();
						champ_remplir   = sc.nextInt();
						System.out.println("\n entrer le TYPE de la session a relier");
						
						type_remplir    = sc.next();

						if (type_remplir.compareTo("int") == 0) {
							dns_2[i][l] = "tab_int["+session_remplir+"]["+champ_remplir+"]";
						}


						if (type_remplir.compareTo("string")  == 0) {
							dns_2[i][l] = "tab_string["+session_remplir+"]["+champ_remplir+"]";
						}

						if (type_remplir.compareTo("float") == 0) {
							dns_2[i][l] = "tab_float["+session_remplir+"]["+champ_remplir+"]";
						}

						

					}
					

				}
				
			}
		}

		if (type_session.compareTo("string") == 0) {

			for (i = 1; i <= nbre_champ ; i++ ) {
				System.out.println("\nentrer la valeur du champ(STRING) "+i);
				tab_string[num_session][i] = sc.next();
				nbre_liaison_champ[i] = 1;

				if (liaison_principal.compareTo("oui") == 0) {
					System.out.println("ce champs aura t'il des liaison multiple ?");
					liaison_multiple = sc.next();

					if(liaison_multiple.compareTo("oui") == 0){
						System.out.println("entrer le nombre de liaison souhaiter");
						nbre_liaison_champ[i] = sc.nextInt();
					}

					for(l = 1; l <= nbre_liaison_champ[i]; l++){

						System.out.println("\n entrer le numero de la session puis le numero du champs");
						session_remplir = sc.nextInt();
						champ_remplir = sc.nextInt();
						
						System.out.println("\n entrer le TYPE de la session a relier");
						type_remplir    = sc.next();

						

						if (type_remplir.compareTo("int") == 0) {
							
							dns_2[i][l] = "tab_int["+session_remplir+"]["+champ_remplir+"]";
							
						}


						if (type_remplir.compareTo("string")  == 0) {
							
							dns_2[i][l] = "tab_string["+session_remplir+"]["+champ_remplir+"]";
							
						}

						if (type_remplir.compareTo("float") == 0) {
							
							dns_2[i][l] = "tab_float["+session_remplir+"]["+champ_remplir+"]";
							
						}

						

					}
					

				}


			}
		}



	} 
}