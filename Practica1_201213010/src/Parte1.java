import java.util.Scanner;
public class Parte1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1=0;
		int num2=0;
		System.out.println("MENÙ");
//Opcion de seleccin de Nivel de programasll		
		System.out.println("Introdusca 1 para ver el primer nivel de problemas, 2 para ver el segundo nivel de problemas");
		num1=entrada.nextInt();
//Menù Programas Nivel1		
		if(num1==1){
		
			System.out.println("Problema 1 .... Figura de asteriscos");
			System.out.println("Problema 2 .... Mediana y tipo de promedio");
			System.out.println("Problema 3 .... Notaciòn de 12 horas");
			System.out.println("Problema 4 .... Area,perimetro y radio de un cìrculo");
			System.out.println("Problema 5 .... Ingreso de fechas");	
			System.out.println("Escriba el numero de problema que desea ejecutar (1-5)");
			num2=entrada.nextInt();
//Programa1 Nivel1
			if (num2==1){

				System.out.println("Programa 1 (Figura de asteriscos)");
				System.out.println(" ");

			System.out.println("    *");
			System.out.println("   ***");
			System.out.println("  *****");
			System.out.println(" *******");
			System.out.println("*********");
			System.out.println(" *******");
			System.out.println("  *****");
			System.out.println("   ***");
			System.out.println("    *");

	}
//Programa2 Nvivel1
	if (num2==2){
		System.out.println("Programa 2");
		System.out.println(" ");
		
		int n1,n2,n3,n4,n5,n6;
		double promedio=0;
		
			Scanner inicio = new Scanner(System.in);
		System.out.println("Ingrese 6 calificaciones enteras de 0 a 100 ");
		System.out.println("Ingrese la calificaciòn 1");
		n1=inicio.nextInt();
		System.out.println("Ingrese la calificaciòn 2");
		n2=inicio.nextInt();
		System.out.println("Ingrese la calificaciòn 3");
		n3=inicio.nextInt();
		System.out.println("Ingrese la calificaciòn 4");
		n4=inicio.nextInt();
		System.out.println("ingrese la calificaciòn 5");
		n5=inicio.nextInt();
		System.out.println("Ingrese la calificaciòn 6");
		n6=inicio.nextInt();
		
		promedio=(n1+n2+n3+n4+n5+n6)/6;
		
			if(promedio>=90&promedio<=100)
				System.out.println("El promedio es " +promedio+ " es una puntuaciòn A" );
			if(promedio>=80 & promedio<=89)
				System.out.println("El promedio es " +promedio+ " es una puntuaciòn B");
			if(promedio>=70 & promedio<=79)
				System.out.println("El promedio es " +promedio+ " es una puntuaciòn C");
			if(promedio>=60&promedio<=69)
				System.out.println("El promedio es " +promedio+ " es una puntuaciòn D");
			if(promedio>=0&promedio<=59)
				System.out.println("El promedio es " +promedio+ " es una puntuaciòn E");
	}
//Programa3 Nivel1
	if (num2==3){
		System.out.println("Programa 3");
		System.out.println(" ");
		
		String h="", dìa="";
		char prim=' ',seg =' ';
		boolean iniciar=true;
		int a;
		Scanner empezar = new Scanner(System.in);
		
		do{
		System.out.println("Ingrese  hora Deseada en Formato de 24hrs, ejemplo: 19:30");
		h= empezar.next();
		a= h.length();
		if (a!=5 || h.charAt(2)!=':' || (h.charAt(0)!='0' & h.charAt(0)!='1' & h.charAt(0)!='2')){iniciar=true; System.out.println("Error en hora, vuelta a intentarlo");}
		else{iniciar=false;}
		
		}
		while(iniciar);
		
		if (h.charAt(0)=='0' & h.charAt(1)=='0'){prim='1'; seg='2'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='1'){prim='0'; seg='1'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='2'){prim='0'; seg='2'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='3'){prim='0'; seg='3'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='4'){prim='0'; seg='4'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='5'){prim='0'; seg='5'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='6'){prim='0'; seg='6'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='7'){prim='0'; seg='7'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='8'){prim='0'; seg='8'; dìa="am.";}
		if (h.charAt(0)=='0' & h.charAt(1)=='9'){prim='0'; seg='9'; dìa="am.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='0'){prim='1'; seg='0'; dìa="am.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='1'){prim='1'; seg='1'; dìa="am.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='2'){prim='1'; seg='2'; dìa="pm.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='3'){prim='0'; seg='1'; dìa="pm.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='4'){prim='0'; seg='2'; dìa="pm.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='5'){prim='0'; seg='3'; dìa="pm.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='6'){prim='0'; seg='4'; dìa="pm.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='7'){prim='0'; seg='5'; dìa="pm.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='8'){prim='0'; seg='6'; dìa="pm.";}
		if (h.charAt(0)=='1' & h.charAt(1)=='9'){prim='0'; seg='7'; dìa="pm.";}
		if (h.charAt(0)=='2' & h.charAt(1)=='0'){prim='0'; seg='8'; dìa="pm.";}
		if (h.charAt(0)=='2' & h.charAt(1)=='1'){prim='0'; seg='9'; dìa="pm.";}
		if (h.charAt(0)=='2' & h.charAt(1)=='2'){prim='1'; seg='0'; dìa="pm.";}
		if (h.charAt(0)=='2' & h.charAt(1)=='3'){prim='1'; seg='1'; dìa="pm.";}
		System.out.println("La hora es: "+prim+seg+h.charAt(2)+h.charAt(3)+h.charAt(4)+dìa);	
						
		
		}
//Programa4 Nivel1
	if (num2==4){
		System.out.println("Programa 4");
		System.out.println(" ");
		
		Scanner inicio=new Scanner(System.in);
		char x;
		double n1,area,perimetro,radio,altura;
		boolean salida=true;
		Scanner empezar = new Scanner(System.in);
		
		do{
			

			System.out.println("C (Area y perimetro de un circulo)");
			System.out.println("U (Area y perimetro de un cuadrado)");
			System.out.println("T (Area y perimetro de un triangulo)");
			System.out.println("Ingrese letra mayuscula para ejecutar el programa que desee");
			System.out.println("");
			x = empezar.next().charAt(0);
			if (x=='C') salida= false;
			if (x=='U') salida= false;
			if (x=='T') salida= false;
		}
		while(salida);
		

		
		if (x=='C'){
			System.out.println("Ingrese diámetro el CÌRCULO");
			n1= entrada.nextDouble();
			area=((3.14)*(n1/2)*(n1/2));
			perimetro=(2*3.141592*(n1/2));
			radio=((n1/2));
			System.out.println("El àREA del CIRCULO es "+area+ " unidades cuadradas.");
			System.out.println("El PERIMETRO del CIRCULO es "+perimetro+ " unidades." );
			System.out.println("El RADIO del CIRCULO es " +radio+" unidades.");
		}
		
		if (x=='U'){
			System.out.println("Ingrese lado el CUADRADO ");
			n1= entrada.nextDouble();
			area=(n1*n1);
			perimetro=(4*n1);
			System.out.println ("El AREA del CUADRADO es "+area+" uidades.");
		System.out.println("El PERIMETRO del CUADRADO es "+perimetro+ " unidades.");
		}
		
		if (x=='T'){
			double b=0;
			System.out.println("Ingrese Base del TRIANGULO ");
			n1= empezar.nextDouble();
			b=(Math.sqrt((n1*n1)-((n1/2)*(n1/2))));
			area=((n1*b)/2);
			perimetro=(3*n1);
			altura=b;
			System.out.println ("El AREA del TRIANGULO es "+area+" unidades cuadradas.");
			System.out.println("El perimetro del TRIANGULO es "+perimetro+ " unidades.");
			System.out.println("La ALTURA del TRIANGULO es " +altura +" unidades.");
		}
		
		}
			
//Programa5 Nivel1
	if (num2==5){
		System.out.println("Programa 5");
		System.out.println(" ");
		
	
		
	}		
	}	
//Menu Programas Nivel2		
		if(num1==2) {
			System.out.println("Problemas Nivel 2");
			System.out.println("Problema 6 ....Calculadora simple");
			System.out.println("Problema 7 ....Tabla de multiplicar de 0 a 10");
			System.out.println("Problema 8 ....Nùmero aleatorio");
			System.out.println("Problema 9 ....Aràbigo a Romano");
			System.out.println("Problema 10 ....Piramide de numeros invertidos");
			System.out.println("Problema 11 ....Numero romano a letra");
			System.out.println("Problema 12 ....Cadena de texto");
			System.out.println("Problema 13 ....Letra del abecedario");
			System.out.println("Problema 14 ....Dibujo cuadro");
			System.out.println("Problema 15 ....Ingreso de numero y verificar cuantos numeros primos hay entre el numero ingresado");
			
			System.out.println("Escriba el nùmero de problemas que desea ejecutar (6-15)");
			num2=entrada.nextInt();
//Programa 6 Nivel2
			if (num2==6){
				System.out.println("Programa 6");
				System.out.println(" ");
				int n1=0;
				int n2=0;
				int suma = 0;
				int resta = 0;
				int multi = 0;
				int cociente = 0;
				String operacion=" ";
				
				Scanner entrada1 = new Scanner(System.in);
				
				System.out.println("Ingrese un numero entero ");
				n1= entrada1.nextInt();
				System.out.println("Ingrese el segundo numero entero");
				n2= entrada1.nextInt();
				System.out.println(" ");
				
				System.out.println("Ingrese una letra minùscula para la operacin deseada");
				System.out.println("Sumar numeros = s");
				System.out.println("Restar numeros = r");
				System.out.println("Multiplicacion de numeros = m ");
				System.out.println("Cociente de numeros = d");
				operacion= entrada1.next();
				suma=(n1+n2);
				resta=(n1-n2);
				multi=(n1*n2);
				cociente=n1%n2;
				if (operacion.charAt(0)=='s' )
				System.out.println ("La suma de los numeros ingresados es "+suma);
				if (operacion.charAt(0)=='r' ) 
				System.out.println ("La resta de los muneros ingresados es "+resta);
				if (operacion.charAt(0)=='m' )
				System.out.println ("El producto de los numeros ingresados es "+multi);
				if (operacion.charAt(0)=='d')
					System.out.println ("El Resultado Del Cociente Es: "+cociente);
				
	}
			if(num2==7){
				System.out.println("Problema 7");
				System.out.println(" ");
			}
			if (num2==8){
				System.out.println("Problema 8");
				System.out.println(" ");
			}
			if(num1>2){
				System.out.print("Numero invalido");
			}
//Si el numero indicado no es 1 o 2
		
			}
	}
}
		

	




		