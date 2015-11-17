package Proyecto;
import java.util.*;


import java.text.*;
public class Contabilidad extends Inicio {

	public static String inventario_inicial_de_materia_prima_directa; 
	public static String inventario_inicial_de_suministros_y_materiales;
	public static String inventario_inicial_de_productos_en_proceso;
	public static String inventario_inicial_de_productos_terminados;
	public static String compras_de_materia_prima_directa;
	public static String compras_de_suministros_y_materiales;
	public static String otros_costos_fabricacion;
	public static String mano_obra_directa;
	public static String inventario_final_de_materia_prima_directa;
	public static String inventario_final_de_suministros_y_materiales;
	public static String inventario_final_de_productos_en_proceso;
	public static String inventario_final_de_productos_terminados;
	public static double m_p_disponible, m_p_utilizada, m_d_produccion, sumi_mate_utilizados, cost_ind_fabri,
	mat_disp_produ, sumi_mate_utili, cost_produc, produ_proces, cost_produc1, produc_termin, cost_venta;
	
	public static Scanner dato=new Scanner(System.in); 
	
	public static double acum_materia_prima_disponible=0;
	public static double acum_materia_prima_utilizada=0;
	public static double acum_mano_obra_directa=0;
	public static double acum_materiales_disponibles=0;
	public static double acum_suministros_utilizados=0;
	public static double acum_costo_produccion=0;
	public static double acum_total_productos_proceso=0;
	public static double acum_productos_terminados=0;
	public static double acum_costo_venta=0;
	public static double acum_costo_indirecto_fabricacion=0;
	public static int acum_numero_inventarios=0;
	
	private static double a;
	private static double b;
	private static double c;
	private static double d;
	private static double e;
	private static double f;
	private static double g;
	private static double h;
	private static double i;
	private static double j;
	private static double k;
	private static double l;
	
    
	public static void main(String[] args,int salto) {
		
		ingreso_inventario(salto);
		acum_numero_inventarios++;
		try {
			estado_costo(salto);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String bienvenido(int salto){
		//aqui mensaje
		System.out.println("                                       ============================================");
		System.out.println("                                                    Área de Contabilidad           ");
		System.out.println("                                       ============================================");
		
		ingreso_inventario(salto);
		return null;
	}
	
	
	
	
	public static String ingreso_inventario(int salto){
		espacio(salto);
		System.out.println("                                      ╔═════════════════════════  ೋღ❤ღೋ   ═════════════════════════╗");
		System.out.println("                                      ║   INGRESO DE INVENTARIO DE COSTO DE PRODUCCION  ║");
		System.out.println("                                      ╚═════════════════════════  ೋღ❤ღೋ   ═════════════════════════╝");
		
		System.out.print("                    Ingrese Inv. Inicial de Materia prima directa:                      ");
		inventario_inicial_de_materia_prima_directa =dato.next();
		while (!isNumber(inventario_inicial_de_materia_prima_directa)){
			System.out.println("\n-- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Inv. Inicial de Materia prima directa:                      ");
			inventario_inicial_de_materia_prima_directa=dato.next();	
			}
		
		
		System.out.print("                    Ingrese Inv. Inicial de Suministros y Materiales:                ");
		inventario_inicial_de_suministros_y_materiales=dato.next();
		while (!isNumber1(inventario_inicial_de_suministros_y_materiales)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Inv. Inicial de Suministros y Materiales:               ");
			inventario_inicial_de_suministros_y_materiales=dato.next();	
			}
		
		
		System.out.print("                    Ingrese Inv. Inicial de Productos en proceso:                       ");
		inventario_inicial_de_productos_en_proceso=dato.next();
		while (!isNumber2(inventario_inicial_de_productos_en_proceso)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Inv. Inicial de Productos en proceso:                            ");
			inventario_inicial_de_productos_en_proceso=dato.next();	
			}
		
		
		System.out.print("                    Ingrese Inv. Inicial de Productos terminados:                     ");
		inventario_inicial_de_productos_terminados=dato.next();	
		while (!isNumber3(inventario_inicial_de_productos_terminados)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Inv. Inicial de Productos terminados:                   ");
			inventario_inicial_de_productos_terminados=dato.next();	
			}
		
		
		System.out.print("                    Ingrese compras de materia directa:                                       ");
		compras_de_materia_prima_directa=dato.next();
		while (!isNumber4(compras_de_materia_prima_directa)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese compras de materia directa:                                           ");
			compras_de_materia_prima_directa=dato.next();	
			}
		
		
		System.out.print("                    Ingrese compras de sumninistros y materiales:                    ");
		compras_de_suministros_y_materiales=dato.next();
		while (!isNumber5(compras_de_suministros_y_materiales)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese compras de sumninistros y materiales:                            ");
			compras_de_suministros_y_materiales=dato.next();	
			}
		
		
		System.out.print("                    Ingrese Otros costos de fabricación:                                       ");
		otros_costos_fabricacion=dato.next();
		while (!isNumber6(otros_costos_fabricacion)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Otros costos de fabricación:                                                  ");
			otros_costos_fabricacion=dato.next();	
			}
		
		
		System.out.print("                    Ingrese Mano de obra directa:                                                  ");
		mano_obra_directa=dato.next();
		while (!isNumber7(mano_obra_directa)){ 
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Mano de obra directa:                                                               ");
			mano_obra_directa=dato.next();	
			}
		
		
		System.out.print("\n                    Ingrese Inv. Final de Materia prima directa:                       ");
		inventario_final_de_materia_prima_directa=dato.next();
		while (!isNumber8(inventario_final_de_materia_prima_directa)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("\n                     Ingrese Inv. Final de Materia prima directa:                                ");
			inventario_final_de_materia_prima_directa=dato.next();	
			}
		
		
		System.out.print("                    Ingrese Inv. Final de Suministros y Materiales:                 ");
		inventario_final_de_suministros_y_materiales=dato.next();
		while (!isNumber9(inventario_final_de_suministros_y_materiales)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Inv. Final de Suministros y Materiales:                                 ");
			inventario_final_de_suministros_y_materiales=dato.next();	
			}
		
		
		System.out.print("                    Ingrese Inv. Final de Productos en proceso:                       ");
		inventario_final_de_productos_en_proceso=dato.next();
		while (!isNumber10(inventario_final_de_productos_en_proceso)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Inv. Final de Productos en proceso:                                         ");
			inventario_final_de_productos_en_proceso=dato.next();	
			}
		
		
		System.out.print("                    Ingrese Inv. Final de Productos terminados:                       ");
		inventario_final_de_productos_terminados=dato.next();		
		while (!isNumber11(inventario_final_de_productos_terminados)){
			System.out.println("\n                    -- SOLO PUEDE INGRESAR DATOS NUMERICOS --");
			System.out.print("                    Ingrese Inv. Final de Productos terminados:                                       ");
			inventario_final_de_productos_terminados=dato.next();	
			}
		
		return null;
	}

	public static String estado_costo(int salto)throws InterruptedException{
		
		DecimalFormat decimales=new DecimalFormat("0.00");
		
		decimales.format (acum_materia_prima_disponible=acum_materia_prima_disponible+a+e);
		decimales.format (acum_materia_prima_utilizada=acum_materia_prima_utilizada+acum_materia_prima_disponible-i);
		decimales.format(acum_mano_obra_directa=acum_mano_obra_directa+h);
		decimales.format(acum_costo_indirecto_fabricacion=acum_costo_indirecto_fabricacion+b+f-j+g);
		decimales.format(acum_suministros_utilizados=acum_suministros_utilizados+b+f-j);
		decimales.format(acum_costo_produccion=acum_costo_produccion+h+b+f-j+g);
		decimales.format(acum_total_productos_proceso=acum_total_productos_proceso+b+f+h-j+g+d);
		decimales.format(acum_productos_terminados=acum_productos_terminados+b+f+h-j+g+d-k+c);
		decimales.format(acum_costo_venta=acum_costo_venta+b+h+f-j+g+d-k+c-l);
		
		decimales.format(m_p_disponible=a+e);
		decimales.format(m_p_utilizada=m_p_disponible-i);
		decimales.format(m_d_produccion=b+f);
		decimales.format(sumi_mate_utilizados=m_d_produccion-j);
		decimales.format(cost_ind_fabri=g+sumi_mate_utilizados);
		decimales.format(mat_disp_produ=b+f);
		decimales.format(sumi_mate_utili=mat_disp_produ-j);
		decimales.format(cost_produc=m_p_utilizada+h+cost_ind_fabri);
		decimales.format(produ_proces=cost_produc+d);
		decimales.format(cost_produc1=produ_proces-k);
		decimales.format(produc_termin=cost_produc1+c);
		decimales.format(cost_venta=produc_termin-l);
		espacio(salto);
		espera_porciento();
		
		
		System.out.println ("                                                         EMPRESA C++");
		espera_porciento();
		System.out.println("                ESTADO DE COSTO DE PRODUCCION Y VENTAS");
		System.out.println("                                                  AL 31 DE DIC. DEL 2015");
		espera_porciento();
		System.out.println("\n\n\n         1       --  Materia prima directa  --");
		espera_porciento();
		System.out.printf("\n                                     Inventario incial de materia prima directa                                                "+(a),"%.2f%n");
		System.out.printf("\n                             (+) Compra de materia prima directa                                                                 "+(e),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=) Materia prima directa disponible para la producción                             "+(m_p_disponible),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (-) Inventario final de materia prima directa                                                    "+(i),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=) Materia prima directa utilizada                                                                    "+(m_p_utilizada),"%.2f%n");
		System.out.printf("\n                   2       --  Mano de obra directa  --                                                                                       "+(h),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                                     Costo indirecto de fabricación                                                                       "+(cost_ind_fabri),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                                     Inventario incial de suministros y materiales                                           "+(b),"%.2f%n");
		System.out.printf("\n                             (+) Compra de suministros y materiales                                                            "+(f),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=)  Materiales disponibles para la producción                                                "+(mat_disp_produ),"%.2f%n");
		System.out.printf("\n                             (-)    Inventario final y suministros y materiales                                               "+(j),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=)  Suministro y material  utilizados                                                                 "+(sumi_mate_utili),"%.2f%n");
		System.out.printf("\n                             (+)  Otros costos indirectos  de fabricación                                                       "+(g),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=)  Costo de producción                                                                                         "+(cost_produc),"%.2f%n");
		System.out.printf("\n                                      Inventario inicial de productos en proceso                                               "+(d),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=)  Total de productos en proceso                                                                      "+(produ_proces),"%.2f%n");
		System.out.printf("\n                             (-)    Inventario final de productos en proceso                                                   "+(k),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=)  Costo de producción                                                                                         "+(cost_produc1),"%.2f%n");
		System.out.printf("\n                             (+)   inventario inicial  de productos terminados                                              "+(c),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=)   Total  de productos terminados                                                                    "+(produc_termin),"%.2f%n");
		System.out.printf("\n                             (-)     Inventario final de productos terminados                                                 "+(l),"%.2f%n");
		espera_porciento();
		System.out.printf("\n                             (=)  Costos de ventas                                                                                                "+(cost_venta),"%.2f%n");
		espera_porciento();
		System.out.printf("\n\n\n\n                             1. Volver al menú principal\n                             2. Volver al menú Contabilidad");
		System.out.print("\n                                 --  Seleccione una opción  --");
		opcion=dato.next();
		while (!isNumber1(opcion)){
			System.out.println("\n                       Solo puede ingresar datos numéricos");
			System.out.print("                                 Seleccione una opción, por favor: ");
			opcion=dato.next();
			}
		if (opcion.equals("1")){menu(salto); }
		 if (opcion.equals("2")){ menu_conta(salto);}
		//pregunta si quiere seguir
		//acumulador_programacion();
		return null;
	}
	
	public static String ir_venir(){
		try{
			System.out.println("Desea visualizar el estado de costos de producción\nSI\nsi");
			System.out.println("Solo puede digitar cualquiera de lo escrito anterior");
			
		}catch(NumberFormatException e){
			System.out.print("+++ +  Solo puede ingresar datos numéricos:  ");
		}
		return ir_venir();
	}
	
	//validacion
	public static boolean isNumber(String inventario_inicial_de_materia_prima_directa){
		 try{
		 a = Double.parseDouble(inventario_inicial_de_materia_prima_directa);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber1(String inventario_inicial_de_suministros_y_materiales){
		 try{
		 b = Double.parseDouble(inventario_inicial_de_suministros_y_materiales);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber2(String inventario_inicial_de_productos_en_proceso){
		 try{
		 c = Double.parseDouble(inventario_inicial_de_productos_en_proceso);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber3(String inventario_inicial_de_productos_terminados){
		 try{
		 d = Double.parseDouble(inventario_inicial_de_productos_terminados);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber4(String compras_de_materia_prima_directa){
		 try{
		 e = Double.parseDouble(compras_de_materia_prima_directa);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber5(String compras_de_suministros_y_materiales){
		 try{
		 f = Double.parseDouble(compras_de_suministros_y_materiales);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber6(String otros_costos_fabricacion){
		 try{
		 g = Double.parseDouble(otros_costos_fabricacion);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber7(String mano_obra_directa){
		 try{
		 h = Double.parseDouble(mano_obra_directa);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber8(String inventario_final_de_materia_prima_directa){
		 try{
		 i = Double.parseDouble(inventario_final_de_materia_prima_directa);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber9(String inventario_final_de_suministros_y_materiales){
		 try{
		 j = Double.parseDouble(inventario_final_de_suministros_y_materiales);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber10(String inventario_final_de_productos_en_proceso){
		 try{
		 k = Double.parseDouble(inventario_final_de_productos_en_proceso);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	public static boolean isNumber11(String inventario_final_de_productos_terminados){
		 try{
		 l = Double.parseDouble(inventario_final_de_productos_terminados);
		 return true;
		 }catch(NumberFormatException e){
		 return false;
		 }
	}
	
	
	
	public static void espera_porciento()throws InterruptedException{
		try{
			Thread.sleep(1000);
		}catch(InputMismatchException e){ }
	}

	
	public static void espacio(){
		for(int salto=0;salto<=85;++salto){
			System.out.println("");
			salto=salto+4;
		}
	}
	
	public static String acumulador_programacion(int salto){
		System.out.println("\n\n                                       Total de materia prima acumulada:                        "+"$  "+acum_materia_prima_disponible);
		System.out.println("                                       Total de materia prima utilizada acumulada:          "+"$  "+acum_materia_prima_utilizada);
		System.out.println("                                       Total de mano de obra directa acumulada:               "+"$  "+acum_mano_obra_directa);
		System.out.println("                                       Total de materiales disponibles:                                   "+"$  "+acum_materiales_disponibles);
		System.out.println("                                       Total de suministros utilizados acumulado:              "+"$  "+acum_suministros_utilizados);
		System.out.println("                                       Total de costo de produccion acumulado:                  "+"$  "+acum_costo_produccion);
		System.out.println("                                       Total de productos en proceso acumulado:                "+"$  "+acum_total_productos_proceso);
		System.out.println("                                       Total de productos terminados acumulado:               "+"$  "+acum_productos_terminados);
		System.out.println("                                       Total de costo de venta acumulada:                              "+"$  "+acum_costo_venta);
		System.out.println("                                       Total de costo indirecto de fabricacion acumulada: " +"$  "+acum_costo_indirecto_fabricacion);
	//main(null);  vuelve al principiodel menu contabilidad
		return null;
	}
	
}