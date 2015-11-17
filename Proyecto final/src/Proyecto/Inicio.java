package Proyecto;
import java.awt.Color;
import java.util.Scanner;

public class Inicio {

	private static String user1="Cruiz";
	private static String user2="Cmullo";
	private static String user3="Jsalazar";
	private static String user4="Admin";
	private static String pass="12345";
	public static int inten=1;
	public static int intentos=3,opcion_conta;
	private static Scanner usuario;
	private static Scanner contrasena;
	public static Scanner dato=new Scanner (System.in);
	public static String opcion="123";
	public static String respuesta="Si";
	public static int ing_programacion=0,ing_computacion=0,ing_contabilidad=0;
	
	public static void main(String[] args) throws InterruptedException {
		int porciento=0;
		int salto=0;
		inicio(salto,porciento);
	}

	
	public static String inicio(int porciento,int salto) throws InterruptedException{
		while (inten<=intentos){ //while 1
			espacio(salto);
			System.out.print("                                                  Ingrese su usuario, por favor: ");
			usuario = new Scanner(System.in);
			String user=" ";
			user=usuario.next();
			while (!isString(user)){//while validar usuario
				System.out.println("                                                  Solo puede ingresar cadenas de letras");
				System.out.print("                                                    Ingrese su usuario: ");
				user=usuario.next();	
				}//fin validar usuario
			System.out.print("                                                  Escriba su contaseña: ");
			contrasena = new Scanner (System.in);
			String con="";
			con=contrasena.next();
			while (!isNumber(con)){//while validar contraseña
				System.out.println("                                                  Solo puede ingresar datos numéricos");
				System.out.print("                                                    Ingrese su contraseña: ");
				con=contrasena.next();
				}//fin validar contraseña
			if ((user.equals(user1))|(user.equals(user2))|(user.equals(user3))|(user.equals(user4)) & (pass==con)){//si la con, user bien voy aki	
				cargando(porciento,salto);
				bienvenido(salto);
				menu(salto);	
			}//termino aki cuando pongo bien con y user
			else intentos--;{espacio(salto);espacio(salto);espacio(salto);espacio(salto);
			System.out.println("                                                  Usuario o Contraseña Incorrecta le quedan "+intentos+ " intentos");
			espacio(salto);Computacion.espera_porciento();Computacion.espera_porciento();espacio(salto);}
			if (intentos==0){ //cuando los intentos llega a cero solo puede 3
				espacio(salto);
				Computacion.espera_porciento();
				System.out.println("                                                                                Intruso");
				System.exit(0);
				}	
			} //repitute 3 veces son los intentos el primer while	
			return null ;	
	}//fin metodo inicio

	public static String bienvenido(int salto) throws InterruptedException{
		Computacion.espera_porciento();
		System.out.println ("\n\n\n\n\n╔═══════════════════════════════════════ ஜ۩۞۩ஜ ══════════════════════════════════════╗");
		System.out.println ("║     *********   *****   ***    **                  BIENVENIDOS  C++            **    ***    *****   *********     ║");
		System.out.println ("╚═══════════════════════════════════════ ஜ۩۞۩ஜ ══════════════════════════════════════╝");
		System.out.println("\n\n\n\n              ►   Menú del sistema   ◄ ");
		menu(salto);
		return null;
	}
	
	public static String menu(int salto) throws InterruptedException{
		System.out.println("\n\n\n              ►   1. Programación   ");
		System.out.println("              ►   2. Computación    ");
		System.out.println("              ►   3. Contabilidad   ");
		System.out.println("              ►   4. Salir          ");
		Computacion.espera_porciento();
		System.out.print("\nSeleccione una opción para continuar:  ");
		opcion=dato.next();
		while (!isNumber1(opcion)){
			System.out.println("\nSolo puede ingresar datos numéricos");
			Computacion.espera_porciento();
			System.out.print("Seleccione una opción, por favor: ");
			opcion=dato.next();
			}
		if (opcion.equals("1")){espacio(salto);menu_pro(salto); }
			 if (opcion.equals("2")){ espacio(salto);menu_comp(salto);}
			 	if (opcion.equals("3")){espacio(salto);menu_conta(salto);}
			 	if (opcion.equals("4")){espacio(salto);Salir(salto);}
			 else { System.out.println("\nOpción no válida...") ; }
		//hacer salir 
			 	espacio(salto);espacio(salto);
		return null;
	}
	
	public static String menu_pro(int salto) throws InterruptedException{
		espacio(salto);
		ing_programacion++;
		Computacion.espera_porciento();
		System.out.println("                                              ╔════════════   ஜ۩۞۩ஜ   ════════════╗");
		System.out.println("                                              ║               Área de Programación            ║");
		System.out.println("                                              ╚════════════   ஜ۩۞۩ஜ   ════════════╝");
		Computacion esperar =new Computacion();
		Computacion.espera_porciento();
		System.out.println("\n\n     1.1 Acumuladores y contadores de cesión");
		
		int opcion_valida = 0;
		do{	
			try{
			System.out.print("\nSeleccione una opción para continuar:  ");
			opcion=dato.next();
			opcion_valida=Integer.parseInt(opcion);
			}catch(Exception e){
			if(opcion_valida>=2|opcion_valida<=1){
				System.out.println("Solo puede ingresar datos numéricos");}
			}
		}while(!opcion.equals("1.1"));////////Chekar
		espacio(salto);espacio(salto);
		submenu_pro(salto);
		
		return null;
	}	
	
	public static String menu_comp(int salto) throws InterruptedException{
		espacio(salto);
		ing_computacion++;
		Computacion.espera_porciento();
		System.out.println("                                              ╔════════════ ஜ۩۞۩ஜ   ════════════╗");
		System.out.println("                                              ║                 Área de Computacón           ║");
		System.out.println("                                              ╚════════════ ஜ۩۞۩ஜ   ════════════╝");
		Computacion esperar =new Computacion();
		Computacion.espera_porciento();
		System.out.println("\n\n      2.1 Ejemplos con conjuntos   ");
		System.out.println("      2.2 Lógica Proposicional     ");
		System.out.print("\nSeleccione una opción para continuar:  ");
		opcion=dato.next();
		if(opcion.equals("2.1")){
			espacio(salto);espacio(salto);espacio(salto);
			submenu_comp(salto);
		}
		if(opcion.equals("2.2")){
			espacio(salto);espacio(salto);espacio(salto);
			submenu_comp(salto);
		}
	while(!isNumber10()){
		System.out.println("\nSolo puede ingresar datos numéricos");
		System.out.print("Seleccione una opción para continuar:  ");
		opcion=dato.next();
	}
	espacio(salto);espacio(salto);	
	submenu_comp(salto);
		
		return null;
	}
	
	private static boolean isNumber10() {
		try{
			double opcion_conta=Double.parseDouble(opcion);
			return true;
		}catch(Exception e){
		return false;}
	}


	public static String menu_conta(int salto) throws InterruptedException{
		espacio(salto);
		espacio(salto);
		ing_contabilidad++;
		Computacion.espera_porciento();
		System.out.println("                                              ╔════════════ ஜ۩۞۩ஜ   ════════════╗");
		System.out.println("                                              ║               Área de Contabilidad             ║");
		System.out.println("                                              ╚════════════ ஜ۩۞۩ஜ   ════════════╝");
		Computacion esperar =new Computacion();
		Computacion.espera_porciento();
		System.out.println("\n\n      3.1 Ingreso de inventario de costos de producción   ");
		System.out.println("      3.2 Ver Estados De Costos De Producción             ");
		
			System.out.print("\nSeleccione una opción para continuar:  ");
			opcion=dato.next();
			if(opcion.equals("3.1")){
				espacio(salto);
				submenu_conta(salto);
			}
			if(opcion.equals("3.2")){
				espacio(salto);
				submenu_conta(salto);
			}
		while(!isNumber9()){
			System.out.println("\nSolo puede ingresar datos numéricos");
			System.out.print("Seleccione una opción para continuar:  ");
			opcion=dato.next();
		}
		
		espacio(salto);espacio(salto);
		submenu_conta(salto);
		
		return null;
	}
	
	
	private static boolean isNumber9() {
		try{
			double opcion_conta=Double.parseDouble(opcion);
			return true;
		}catch(Exception e){
		return false;}
	}


	public static String submenu_pro(int salto) throws InterruptedException{
		switch (opcion){
		case "1.1":
			//mostrar acumuladores de computacion
			espacio(salto);
			System.out.println("                                              ╔══════════════════════  ஜ۩۞۩ஜ  ══════════════════════╗");
			System.out.println("                                              ║         Valores acumulados y contadores de cada menú         ║");
			System.out.println("                                              ╚══════════════════════  ஜ۩۞۩ஜ  ══════════════════════╝");
			Contabilidad acumuladores=new Contabilidad();
			 Contabilidad.acumulador_programacion(salto);
			 System.out.println("                                       Total ingreso en area programación:  "+ing_programacion);
			 System.out.println("                                       Total ingreso al área compuatión:       "+ing_computacion);
			 System.out.println("                                       Total ingreso en área contabilidad:     "+ing_contabilidad);
			break;
			default:
				System.out.println("Opción no válida");
				break;
		}
		
		System.out.println("\n1. Volver al menú principal\n2. Volver al menú programación");
		System.out.print("Seleccione una opción:  ");
		opcion=dato.next();
		while (!isNumber1(opcion)){
			System.out.println("\nSolo puede ingresar datos numéricos");
			System.out.print("Seleccione una opción, por favor: ");
			opcion=dato.next();
			}
		if (opcion.equals("1")){espacio(salto);espacio(salto);bienvenido(salto);menu(salto); }
		 if (opcion.equals("2")){ espacio(salto);espacio(salto);menu_pro(salto);}
		 espacio(salto);espacio(salto);
		return null;
	}
	
	
	public static String submenu_comp(int salto) throws InterruptedException{
			 switch (opcion){
			 case "2.1":espacio(salto);
				 Computacion conjuntos =new Computacion();
				 Computacion.conjuntos(salto);
				 break;
			 case "2.2":espacio(salto);
				 Computacion logica =new Computacion();
				 Computacion.proposicion(salto);
				 break;
			 default:
				 //System.out.println("Opción no válida");
				 break;
			 }
			 System.out.println("\n1. Volver al menú principal\n2. Volver al menú computación");
				System.out.print("Seleccione una opción: ");
				opcion=dato.next();
				while (!isNumber1(opcion)){
					System.out.println("\nSolo puede ingresar datos numéricos");
					System.out.print("Seleccione una opción, por favor: ");
					opcion=dato.next();
					}
				if (opcion.equals("1")){espacio(salto);espacio(salto);bienvenido(salto);menu(salto); }
				 if (opcion.equals("2")){ espacio(salto);espacio(salto);menu_comp(salto);}
				 espacio(salto);espacio(salto);
		return null;
	}
	
	//ya instanciado
	public static String submenu_conta(int salto) throws InterruptedException{
			 switch (opcion){
			 case "3.1":espacio(salto);
				 Contabilidad contabilidad=new Contabilidad();
				 Contabilidad.ingreso_inventario(salto);
				 
				 break;
			 case "3.2":espacio(salto);
				Contabilidad estadocosto=new Contabilidad();
				Contabilidad.estado_costo(salto);
				 
				 break;
			 }
			 System.out.println("\n1. Volver al menú principal\n2. Volver al menú contabilidad");
				System.out.println("Seleccione una opción: ");
				opcion=dato.next();
				while (!isNumber1(opcion)){
					System.out.println("\nSolo puede ingresar datos numéricos");
					System.out.print("Seleccione una opción, por favor: ");
					opcion=dato.next();
					}
				if (opcion.equals("1")){espacio(salto);espacio(salto);bienvenido(salto);menu(salto); }
				 if (opcion.equals("2")){ espacio(salto);espacio(salto);menu_conta(salto);}
				 espacio(salto);espacio(salto);
		 return null;
	}
	
	
	//validar contraseña
	private static boolean isNumber(String con) {
		try{
			Integer.parseInt(con);
			return true;
			}catch (NumberFormatException nfe){
			return false;}
		}

	public static boolean isNumber1(String opcion) {
		try{
			Integer.parseInt(opcion);
			return true;
			}catch (NumberFormatException nfe){
			return false;}
		}
	
	
	//validar usuario
		private static boolean isString(String user) {
			try{
				Integer.parseInt(user);
				return false;
				}catch (NumberFormatException nfe){
				return true;}
			}

		private static boolean isString1(String respuesta) {
			try{
				Integer.parseInt(respuesta);
				return false;
				}catch (NumberFormatException nfe){
				return true;}
			}
				

		
		public static String Salir(int salto) throws InterruptedException{
			Computacion.espera_porciento();Computacion.espera_porciento();
			espacio(salto);
			System.out.println("\n\n\n\n\n                                         ╔═══════════════  ೋღ❤ღೋ   ═══════════════╗");
			System.out.println("                                         ║   GRACIAS POR UTILIZAR EL SISTEMA   ║ ");
			System.out.println("                                         ╚═══════════════  ೋღ❤ღೋ   ═══════════════╝");
			Computacion.espera_porciento();Computacion.espera_porciento();Computacion.espera_porciento();Computacion.espera_porciento();
			System.exit(0);
			return null;
		}

		
		public static String cargando(int porciento,int salto) throws InterruptedException{
			
			for(porciento=0;porciento<=100;++porciento){
				espacio(salto);
				
				if (porciento==0){
					System.out.println("                                                          Espere");
					System.out.println("                                                          Cargando...");}
				
				if (porciento==10){
				System.out.println("                                                          ████ 10%");}
				
				if (porciento==20){
				System.out.println("                                                          ██████ 20%");}
				
				if (porciento==30){
				System.out.println("                                                          ████████ 30%");}
				
				if (porciento==40){
				System.out.println("                                                          ██████████ 40%");}
				
				if (porciento==50){
				System.out.println("                                                          ████████████ 50%");}
				
				if (porciento==60){
				System.out.println("                                                          ██████████████ 60%");}
				
				if (porciento==70){
				System.out.println("                                                          ████████████████ 70%");}
				
				if (porciento==80){
				System.out.println("                                                          ██████████████████ 80%");}
				
				if (porciento==90){
				System.out.println("                                                          ████████████████████ 90%");}
				
				if (porciento==100){
				System.out.println("                                                          ██████████████████████ 100%");}
				espacio(salto);
				porciento=porciento+9;
				Computacion espera =new Computacion();
				Computacion.espera_porciento();
			}espacio(salto);espacio(salto);espacio(salto);
			return null;
		}
		
		
		public static String espacio(int salto){	
			for(salto=0;salto<=85;++salto){
				System.out.println("    ");
				salto=salto+4;
			}
			return null;
		}
	
		
}