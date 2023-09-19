import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int intentos = 0;
        int intentosmax = 3;
        int opcion;
        int cantidadLados;
        double areaLateral, areaTotal, volumen;
        double  areaDeBase;
        double  area;
        double rMayor, rMenor, alt, generatriz, aLat, aTot;
        double altura;
        double arista, radio;
        double longitudLados;
        double perimetroBase, areaBase, apotema;

            while (intentos < intentosmax) {
            System.out.println("Selecciona una figura geométrica:");
            System.out.println("1. Cilindro");
            System.out.println("2. Cono");
            System.out.println("3. Dodecaedro");
            System.out.println("4. Esfera");
            System.out.println("5. Hexaedro");
            System.out.println("6. Icosaedro");
            System.out.println("7. Pirámide");
            System.out.println("8. Prisma");
            System.out.println("9. Tetraedro");
            System.out.println("10. Tronco de cono");
            System.out.println("11. Octaedro");
            System.out.println("12. tronco de piramide");
            System.out.println("13. Salir");
            System.out.print("Opción: ");

            if (lector.hasNextInt()) {
                opcion = lector.nextInt();
                lector.nextLine(); 
                if (opcion >= 0 && opcion <= 12) {
                    switch (opcion) {
                        case 1:
        
                             System.out.print("Ingrese la altura del cilindro: ");
                             altura = lector.nextDouble();
        
                             System.out.print("Ingrese el radio del cilindro: ");
                              radio = lector.nextDouble();
    
                             areaLateral = 2 * Math.PI * radio * altura;
                             areaTotal = 2 * Math.PI * radio * (altura + radio);
                             volumen = Math.PI * Math.pow(radio, 2) * altura;
    
                             System.out.println("El área lateral del cilindro es: " + areaLateral);
                             System.out.println("El área total del cilindro es: " + areaTotal);
                             System.out.println("El volumen del cilindro es: " + volumen);
                            break;
                        case 2:
                             System.out.print("Inserte la generatriz del cono: ");
                             generatriz = lector.nextDouble();
        
                             System.out.print("Inserte la altura del cono: ");
                             altura = lector.nextDouble();
        
                             System.out.print("Inserte el radio del cono: ");
                             radio = lector.nextDouble();
    
                             areaLateral = Math.PI * radio * generatriz;
                             areaTotal = Math.PI * radio * (generatriz + radio);
                             areaDeBase = Math.PI * Math.sin(radio);
                             volumen = areaDeBase * altura / 3;
        
                             System.out.println("El área lateral del cono es: " + areaLateral);
                             System.out.println("El área total del cono es: " + areaTotal);
                             System.out.println("El área de la base del cono es: " + areaDeBase);
                             System.out.println("El volumen del cono es: " + volumen);
                            break;
                        case 3:
                           
                           
                
                            System.out.print("ingrese la arista: ");
                              arista = lector.nextDouble();
                
            
                            area = -3*(arista = 2)*(25+10*(5));
        
                            volumen = -(15+7* (5)/4*(arista = 3));
               
                           System.out.println("Area : " + area + " unidades cuadradas.");
                           System.out.println("volumen : " + volumen+ " unidades cuadradas.");
                           
            
                            break;
                        case 4:
                           
                        System.out.print("Insertar el radio de la esfera: ");
                          double radi = lector.nextDouble();
                         area = 4 * Math.PI * Math.pow(radi, 2);
                         volumen = (4.0 / 3.0) * Math.PI * Math.pow(radi, 3);

                         System.out.println("El área de la esfera es: " + area);
                         System.out.println("El volumen de la esfera es: " + volumen);
                            break;
                        case 5:
                            
                             
        
                             System.out.print("Inserte la arista: ");
                              arista = lector.nextDouble();
        
                             area = 2 * Math.pow(arista, 2) * Math.sqrt(3);
                             volumen = Math.sqrt(2) * Math.pow(arista, 3) / 3;
        
                             System.out.println("El área del hexaedro es: " + area);
                             System.out.println("El volumen del hexaedro es: " + volumen);
                            break;
                        case 6:
                            
                            
        
                             System.out.print("Inserte la arista: ");
                             arista = lector.nextDouble();
    
                             area = 5 * arista * arista * Math.sin(Math.toRadians(60));
                             volumen = 0.417 * (3 + 2.24) * arista * arista * arista;
        
                             System.out.println("El área del icosaedro es: " + area);
                             System.out.println("El volumen del icosaedro es: " + volumen);
                            break;
                        case 7:
                            
                             

                             System.out.println("ingresa lado de la piramide :");
                             double lado = lector.nextDouble();
      
                             System.out.println("calcule el apotema de la piramide :");
                             apotema = lector.nextDouble();

                             System.out.println(" ingrese altura de la piramide: ");
                              altura = lector.nextDouble();
        
                             areaLateral = (lado * apotema) / 2;
                             areaBase = (lado * lado);
                             areaTotal = areaLateral + areaBase;
                             volumen = (areaBase * altura) / 3;
        
                             System.out.println("Área Lateral: " + areaLateral);
                             System.out.println("Área de la Base: " + areaBase);
                             System.out.println("Área Total: " + areaTotal);
                             System.out.println("Volumen: " + volumen);
                            break;
                        case 8:
                        
                        System.out.print("Cantidad de lados: ");
                        cantidadLados = lector.nextInt();
                        System.out.print("Altura: ");
                        altura = lector.nextDouble();
                        System.out.print("Longitud de los lados: ");
                        longitudLados = lector.nextDouble();
                        
                        perimetroBase = cantidadLados * longitudLados;
                        areaLateral = perimetroBase * altura;
                        double alfa = (Math.PI/180) * (360/cantidadLados);
                        apotema = longitudLados / (2 * Math.tan((alfa)/2));
                        areaBase = (perimetroBase * apotema)/2;
                        areaTotal = areaLateral + 2 * areaBase;
                        volumen = areaBase * altura;
                      
                        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
                        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
                        System.out.println("Volumen: " + volumen + " unidades cubicas.");
                            break;
                        case 9:
                            
                             System.out.print("Ingrese la longitud de la arista del tetraedro: ");
                             arista = lector.nextDouble();
                             areaDeBase = (3 * Math.sin(3) * arista * arista) / 4;
                             areaTotal = areaDeBase * 4;

                             volumen = (Math.sin(2) * arista * arista * arista) / 12;
                             altura = (Math.sin(6) * arista) / 3;
                             System.out.println("El área del tetraedro es: " + areaDeBase);
                             System.out.println("El área total del tetraedro es: " + areaTotal);
                             System.out.println("El volumen del tetraedro es: " + volumen);
                             System.out.println("La altura del tetraedro es: " + altura);

                            break;
                        case 10:
                       

                        System.out.println("Ingrese el radio mayor : ");
                        rMayor = lector.nextDouble();
                        System.out.println("Ingrese el radio menor : ");
                        rMenor = lector.nextDouble();
                        System.out.println("Ingrese la altura: ");
                        alt = lector.nextDouble();
                        
                        
                        generatriz = Math.sqrt(Math.pow(rMayor - rMenor, 2) + Math.pow(alt, 2));
                        
                        
                        aLat = Math.PI * (rMayor + rMenor) * generatriz;
                        
                       
                        double areaBaseMayor = Math.PI * Math.pow(rMayor, 2);
                        double areaBaseMenor = Math.PI * Math.pow(rMenor, 2);
                        
                        
                        aTot = areaBaseMayor + areaBaseMenor + aLat;
                        
                        
                        volumen = (Math.PI / 3) * (Math.pow(rMayor, 2) + rMayor * rMenor + Math.pow(rMenor, 2)) * alt;
                        
                        System.out.println("El Área Lateral: " + aLat);
                        System.out.println("El Área Total : " + aTot);
                        System.out.println("El Volumen : " + volumen);
                        break;
                        case 11:
                             
                            System.out.print("Inserte la arista: ");
                            arista = lector.nextDouble();

                             area = 2 *arista * 3;
                             volumen = 3*arista *2 / 3;

                             System.out.println("El área del octaedro es: " + area);
                             System.out.println("El volumen del octaedro es: " + volumen);
      
                            break;
                        case 12:

                        System.out.println("Ingrese el área de la base superior (A):");
                        double A = lector.nextDouble();
                
                        System.out.println("Ingrese el área de la base inferior (a):");
                        double a = lector.nextDouble();
                        System.out.println("Ingrese la altura (h):");
                        double h = lector.nextDouble();
                
                        volumen = (1.0/3.0) * h * (A + a + Math.sqrt(A * a));
                
                        System.out.println("El volumen del tronco de pirámide es: " + volumen);
                        break;
                    
                      
                        case 13:
                            System.out.println("Saliendo del programa.");
                            break;
                    }
                } else {
                    System.out.println("Opción no válida. Introduce una opción entre 0 y 12.");
                }  
                 } else {
                System.out.println("Entrada no válida. Introduce un número entero.");
                lector.nextLine(); 
                opcion = -1; 
                while (opcion != 0);

                if (intentos >= intentosmax) {
                    System.out.println("Se acabaron tus intentos.");
                    break; 
                } else {
                    intentos++;
                }
            }
        }

        lector.close();
        }
 
    

   
    }