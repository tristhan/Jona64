package Proyecto;
import java.awt.Color;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Computacion extends Inicio {
	
	public static int respuesta=0;
	public static int valor;
	public static String nombre=" ";
	public static Scanner dato=new Scanner (System.in);
	
	
	public static void main(String[] args,int salto) throws InterruptedException {
		
		conjuntos(salto);
		
		}
		
	public static String bienvenido(){
		System.out.println("                                       ╔═════════════════  ೋღ❤ღೋ   ═════════════════╗");
		System.out.println("                                       ║            *****   **   *        Conjuntos         *   **   *****         ║");
		System.out.println("                                       ╚═════════════════  ೋღ❤ღೋ   ═════════════════╝");
		System.out.println("\n\n");
		return  null;
	}
	
	 public static String conjuntos(int salto) throws InterruptedException{
		bienvenido();
		 Set a=new TreeSet();
		 Set b=new TreeSet();
			a.add(2);
			a.add(4);
			a.add(6);
			a.add(8);
			b.add(6);
			b.add(8);
			b.add(10);
			b.add(12);
			
			System.out.println("\n\n\n             Número de elementos en A { "+a.size()+" }");
			System.out.println("             Elementos del conjunto A  "+a+" ");
			espera_porciento();
			System.out.println("\n             Número de elementos en B  "+b.size()+" ");
			System.out.println("             Elementos del conjunto B { "+b+" }");
			espera_porciento();
			a.retainAll(b);
			System.out.println("\n             Conjunto A intersección B  "+a);
			espera_porciento();
			a.add(2);
			a.add(4);
			a.addAll(b);
			System.out.println("\n             Conjunto A Unión B  "+a);
			espera_porciento();
			a.add(2);
			a.add(4);
			a.removeAll(b);
			System.out.println("\n             Conjunto A diferencia de B  "+a);
			espera_porciento();
			
			
			a.addAll(b);
			a.retainAll(b);
			System.out.println("\n             Diferencia simetrica a b: "+a);
			espera_porciento();
			
			
			System.out.println("\n1. Volver al menú principal\n2. Volver al menú computación");
			System.out.print("Seleccione una opción:  ");
			opcion=dato.next();
			while (!isNumber1(opcion)){
				System.out.println("\nSolo puede ingresar datos numéricos");
				System.out.print("Seleccione una opción, por favor: ");
				opcion=dato.next();
				}
			if (opcion.equals("1")){menu(salto); }
			 if (opcion.equals("2")){ menu_comp(salto);}
		 return null;
	 }
	
	
	public static String proposicion(int salto) throws InterruptedException{
		int acierto=0;
		int error=0;
		String compara;
		
		System.out.println ("╔════════════════════════════  ೋღ❤ღೋ   ═════════════════════════════╗");
		System.out.println ("║ *****  ***    BIENVENIDOS A LA LÓGICA PROPOSICIONAL    ***   *****║");
		System.out.println ("╚════════════════════════════  ೋღ❤ღೋ   ═════════════════════════════╝");
		espera_porciento();
		System.out.print("\n\nIngrese su nombre, por favor:  ");
		nombre=dato.next();
		while (!isString3()){//checaar
			System.out.println("Solo puede ingresar cadenas de letras");
			System.out.print("Ingrese su nombre, por favor: ");
			nombre=dato.next();	
			}
		
		espera_porciento();
		System.out.println("\n\n\n                ** * Se le recuerda que solo debe seleccionar solo las opciones de test * **");
		System.out.println("                Si ingresa opciones que no estan, se le repetira la pregunta");
		espera_porciento();
		do{
		System.out.println("\nSi como entonces no tengo hambre");
		System.out.println("1. Proposición\n2. No es proposición");
		System.out.print("Seleccione una opción:  ");
		try{
		compara=dato.next();
		valor=Integer.parseInt(compara);
		}catch(NumberFormatException e){System.out.println("++ + Solo puede ingresar datos numéricos + ++");}
		respuesta=valor;
		}while(respuesta<0|respuesta>3);
		if (respuesta==1){
			acierto++;
		}else{error++;}
		espacio(salto);espacio(salto);espacio(salto);
		espera_porciento();
		do{
		System.out.println("\nIndica el lenguaje coloquial de los Operadores Lógicos");
		System.out.println("1. Bueno\n2. Si... entonces\n3. O\n4. Y");
		System.out.print("Seleccione una opción:  ");
		try{
		compara=dato.next();
		respuesta=Integer.parseInt(compara);
		}catch(NumberFormatException e){System.out.println("++ + Solo puede ingresar datos numéricos + ++");}
		}while(respuesta<0|respuesta>=4);
		if (respuesta==2){
			acierto++;
		}else{error++;}
		espacio(salto);espacio(salto);espacio(salto);
		espera_porciento();
		do{
		System.out.println("\nIndica la clase de proposición de: La selección bien gana o pierde.");
		System.out.println("1. Proposición simple o atómica\n2. Proposición compuesta o molecular");
		System.out.print("Seleccione una opción:  ");
		try{
			compara=dato.next();
			respuesta=Integer.parseInt(compara);
			}catch(NumberFormatException e){System.out.println("++ + Solo puede ingresar datos numéricos + ++");}
		}while(respuesta<0|respuesta>3);
		if (respuesta==2){
			acierto++;
		}else{error++;}
		espacio(salto);espacio(salto);espacio(salto);
		espera_porciento();
		do{
		System.out.println("\nf(x)= { (x,y)/ y=2x+1 }\n   R= (2,5)");
		System.out.println("1. Si\n2. No");
		System.out.print("Seleccione una opción:  ");
		try{
			compara=dato.next();
			respuesta=Integer.parseInt(compara);
			}catch(NumberFormatException e){System.out.println("++ + Solo puede ingresar datos numéricos + ++");}
		}while(respuesta<0|respuesta>3);
		if (respuesta==1){
			acierto++;
		}else{error++;}
		espacio(salto);espacio(salto);espacio(salto);
		espera_porciento();
		do{
		System.out.println("\n¿Qué día es hoy?\n1. Es proposición\n2. No es proposición");
		System.out.print("Seleccione una opción:  ");
		try{
			compara=dato.next();
			respuesta=Integer.parseInt(compara);
			}catch(NumberFormatException e){System.out.println("++ + Solo puede ingresar datos numéricos + ++");}
		}while(respuesta<0|respuesta>3);
		if (respuesta==2){
			acierto++;
		}else{error++;}
		espacio(salto);espacio(salto);espacio(salto);
		espera_porciento();
		do{
		System.out.println("\nIndica la clase de proposición de: 18 y 24 son múltiplos de 6 ");
		System.out.println("1. Proposición simple o atómica\n2. Proposición compuesta o molecular");
		System.out.print("Seleccione una opción:  ");
		try{
			compara=dato.next();
			respuesta=Integer.parseInt(compara);
			}catch(NumberFormatException e){System.out.println("++ + Solo puede ingresar datos numéricos + ++");}
		}while(respuesta<0|respuesta>3);
			if (respuesta==2){
				acierto++;
			}else{error++;}
			espacio(salto);espacio(salto);espacio(salto);
			espera_porciento();
		do{
		System.out.println("\nDeterminar cuales son proposiciones");
		System.out.println("1. 4 + 8 = 12\n2. ¿ Eres estudiante de química?\n3. 8 < 5");
		System.out.print("Seleccione una opción:  ");
		try{
			compara=dato.next();
			respuesta=Integer.parseInt(compara);
			}catch(NumberFormatException e){System.out.println("++ + Solo puede ingresar datos numéricos + ++");}
		}while(respuesta<0|respuesta>4);
			if (respuesta==3){
				acierto++;
			}else{error++;}
			espacio(salto);espacio(salto);espacio(salto);
			espera_porciento();
		do{
		System.out.println("\nSi A={1,2} y B={2} entonces B esta contenido en A\n1. Si\n2. No");
		System.out.print("Seleccione una opción:  ");
		try{
			compara=dato.next();
			respuesta=Integer.parseInt(compara);
			}catch(NumberFormatException e){System.out.println("++ + Solo puede ingresar datos numéricos + ++");}
		}while(respuesta<0|respuesta>3);
			if (respuesta==1){
				acierto++;
			}else{error++;}
			espera_porciento();
		acier_error(acierto,error,salto);
		//votar los aciertos si es > 5 te ganastes un chupete sino siga participando
		
		System.out.println("\n1. Volver al menú principal\n2. Volver al menú computación");
		System.out.print("Seleccione una opción:  ");
		opcion=dato.next();
		while (!isNumber1(opcion)){
			System.out.println("\nSolo puede ingresar datos numéricos");
			System.out.print("Seleccione una opción, por favor: ");
			opcion=dato.next();
			}
		if (opcion.equals("1")){espacio(salto);espacio(salto);bienvenido(salto);menu(salto); }
		 if (opcion.equals("2")){espacio(salto);espacio(salto); menu_comp(salto);}
		
		return null;
	}

	
	public static String acier_error(int acierto,int error,int salto) throws InterruptedException{
		espera_porciento();
	
		
		
		if(acierto>=5){espacio(salto);espacio(salto);espera_porciento();
			System.out.println("\n\n\n\n\n                                                             ╔════════════════  ೋღ❤ღೋ   ═══════════════╗");
			System.out.println("                                                                •*´¨`*•.¸¸.•*´¨`*•.¸¸.•*´¨`*•.¸¸.•*´¨`*•.¸¸.•");
			System.out.println("                                                                :::   (L_(L  ...*...*...*...*...*...*...*...*...*...*...*...*");
			System.out.println("                                                                *:    (=' :')  :::::::: Ganastes  "+nombre+"  :::::::::::");
			System.out.println("                                                                •..  (,('')('') ¤...*...*...*...*...*...*...*...*...*...*...*");
			System.out.println("                                                                ¸.•*´¨`*•.¸¸.•*´¨`*•.¸¸.•*´¨`*•.¸¸.•*´¨`*•.¸");
			System.out.println("                                                             ╚════════════════  ೋღ❤ღೋ   ════════════════╝");

			System.out.println("\n                                                                                           Total de aciertos:  "+acierto);
			System.out.println("\n                                                                                           Total de errores :  "+error);
		}else{espacio(salto);espacio(salto);espera_porciento();
			System.out.println("                                                             ┌─┐　─┐☆");
			System.out.println("                                                             │▒│ /▒/");
			System.out.println("                                                             │▒│/▒/"+"        Lo siento perdistes ");
			System.out.println("                                                             │▒ /▒/─┬─┐");
			System.out.println("                                                             │▒│▒|▒│▒│"+"          "+nombre);
			System.out.println("                                                              ┌┴─┴─┐-┘─┘ ");
			System.out.println("                                                              │▒┌──┘▒▒▒│"+"      Sigue participando");
			System.out.println("                                                              └┐▒▒▒▒▒▒┌┘ ");
			System.out.println("                                                               └┐▒▒▒▒┌");
		System.out.println("\n                                                                                            Total de errores: "+error);
		System.out.println("\n                                                                                           Total de aciertos:  "+acierto);
		}
		espera_porciento();
		return null;
	}



	public static void espera_porciento()throws InterruptedException{
		try{
			Thread.sleep(1000);
		}catch(InputMismatchException e){ }
	}
	
	
	public static boolean isString3()throws InterruptedException {
		try{
			Integer.parseInt(nombre);
			return false;
			}catch (NumberFormatException nfe){
			return true;}
		}
}
