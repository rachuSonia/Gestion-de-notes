import java.util.Scanner;

public class Projet {

	/* Fonction pour afficher le tableau T des éléves */
	public static void affiche (String [][] T) 
	{
		int i,j;
		System.out.println("-------------------------------------------------------");
		System.out.println("            nom  | prenom | classe | moyenne ");
		System.out.println("-------------------------------------------------------");
		for(i=0;i<T.length;i++)
		{
			System.out.print("Eléve ["+i+"]");
			for(j=0;j<T[i].length;j++)
			{
				System.out.print("  "+T[i][j]+"  ");
				 System.out.print("\t");
			}
			System.out.print("\n");
			
		}
		System.out.println("-------------------------------------------------------");

	}
	
	
	/* Fonction qui permet de juger les éléves du tableau T */
	
	 public static void juger(String T[][]){
         int i=0;
         for(i=0;i<T.length;i++){
             float conv=Float.parseFloat(T[i][3]); 
             
             if(conv<7.0){
                 T[i][3]="échoue";
             }else if(conv<10.0){
                 T[i][3]="se représente";
                 
             }else{
                 T[i][3]="Réussit";
             }
         }
        affiche(T); 
     }
	
	
	/* Fonction qui permet de chercher le nom d'un éléve dans le tableau T */
		public static void recherhce (String [][] T, String nom) 
		{
			boolean nomRecherhce=false;
			int i,j;
			for(i=0;i<T.length;i++)
			{
				for(j=0;j<T[i].length;j++)
				{
					if(nom.equalsIgnoreCase(T[i][j]))
					{
						nomRecherhce=true;
					}
				}
				
			}
			if(nomRecherhce)
			{
				System.out.println("Le nom de l'éléve  "+nom+"  est présent !!");
			}
			else {
				System.out.println("Le nom de l'éléve  "+nom+"   n'est pas présent !!");
			}

	    }
		
	
		/* Fonction qui permet de supprimer des éléves du tableau T en fonction de leur moyenne donnée */
		
		public static void supprimer(String TSup [][], String moy){
	         
	         int i=0;
	         int j=0;
	         int cp=0;
	         int n=0;
	         while(i<n){
	             if(moy.equals(TSup[i][3])){
	                 cp++;
	                 for(int t=i;t<n;t++){
	                     j=t+1;
	                     TSup[t][0]=TSup[j][0];
	                     TSup[t][1]=TSup[j][1];
	                     TSup[t][2]=TSup[j][2];
	                     TSup[t][3]=TSup[j][3];      
	                 }
	             }
	             i++;
	         }
	         n=n-cp;
	         affiche(TSup);
	     }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix;
		int nbrEleve,i,j;
		int cr=40;
		String repo;
		String a=null;
		boolean pal=true;
		i=0;
		j=0;
		
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		
		System.out.println("combien d'etudiant voulez-vouz insérer");
		nbrEleve=sc.nextInt();
		
		System.out.println("--------------------------------------------------");
		String Tab[][] = new String [nbrEleve][cr];
		
		for(i=0;i<Tab.length;i++)
		{	
			System.out.println("Eléve ["+i+"]");
			
				while(pal){
		            System.out.println("insérer le nom : ");
		            Tab[i][j]=sc.next();
		          j++;
		            System.out.println("insérer le prenom : ");
		            Tab[i][j]=sc.next();
		          j++;
		            System.out.println("insérer la classe : ");
		            Tab[i][j]=sc.next();
		          j++;
		            System.out.println("insérer la moyenne : ");
		            Tab[i][j]=sc.next();
		          j++;
		          System.out.println("voulez-vouz ajouter un aurte etudiant oui / non : ");
		          repo=sc.next();
			          if(repo.equals("oui")) 
			            { 
			        	  pal=true; i++;j=0;
			        	  }
			            else {
			            	pal=false;
			            }
			      	Projet T=new Projet();
				}
				
		}
		
		
	        
		
		
		System.out.println("---------------- Gestion d'éléves : -----------------");
		
		do
		{
			System.out.println("-----Menu------");
			System.out.println("0-->Quitter le programme");
			System.out.println("1-->Afficher les élèves du tableau T");
			System.out.println("2-->Rechercher le nom d’un élève donné dans le tableau T");
			System.out.println("3-->Ajouter un élève au tableau T");
			System.out.println("4-->Supprimer du tableau T les élèves dont la moyenne est donnée en paramètre");
			System.out.println("5-->Juger les élèves du tableau T");

			System.out.println("--------------------------------------------------");
			do
			{
				System.out.println("entrez votre choix");
				choix=sc.nextInt();
				if(choix>4)
				{
					System.out.println("Vous avez décidez de quitter le programme");
				}
			}
			while(choix>4);
			
			switch(choix)
			{
				case 0:
				{
					System.out.println("Choisissez un autre choix !!");
				}
				break;
				
				
				
				/* afficher le tableau T des éléves */
				
				case 1:
				{
				Projet T=new Projet();	
				T.affiche(Tab);
				}
				break;
				
				
				/* recherche le nom d'un éléve dans le tableau T */
				case 2:
				{
					System.out.println("entrez le nom de l'éléve que vous cherchez :");
					a=sc2.nextLine();
					
					Projet T=new Projet();	
					T.recherhce(Tab,a);
					
				}
				break;
				case 3:
				{

					/* ajouet un éléve dans le tableau T */
					
					
					 System.out.println("voulez-vouz ajouter un aurte etudiant oui / non : ");
			          repo=sc.next();
				          if(repo.equals("oui")) 
				            { 
				        	  pal=true; i++;j=0;
				        	  String newTab[][] = new String [nbrEleve+1][cr];
				        	  for(i=Tab.length-1;i>=newTab.length;i--)
				        		 
					        	  {
				        		  System.out.println("éléve : ["+i+"]");
				        		  newTab[i][j]=Tab[i-1][j];
					        		  System.out.println("insérer le nom : ");
							            newTab[i][j]=sc.next();
							          j++;
							            System.out.println("insérer le prenom : ");
							            newTab[i][j]=sc.next();
							          j++;
							            System.out.println("insérer la classe : ");
							            newTab[i][j]=sc.next();
							          j++;
							            System.out.println("insérer la moyenne : ");
							            newTab[i][j]=sc.next();
							          j++;
					        	  }
						         
				            }
				            else {
				            	pal=false;
				            }
				      	Projet T=new Projet();	
						T.affiche(Tab);

				}
				break;
				
				/* supprimer un éléve dans le tableau T */
				case 4:
				{
					System.out.println("entrez la moyenne :");
					String moyenne=sc2.nextLine();
					
					Projet T=new Projet();	
					T.supprimer(Tab,moyenne);
				}
				break;
				
				/* juger un éléve dans le tableau T */
				case 5:
				{
					Projet T=new Projet();	
					T.juger(Tab);
				}
			}
		}while(choix!=0);
			
		
		
		
		System.out.println("--------------- Fin du programme ---------------");
		sc.close();
		sc2.close();
		}
	}