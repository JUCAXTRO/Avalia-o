/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import java.util.Scanner;
/**
 *
 * @author Usuário
 */
public class Metodos {

    
    public static void gasto(){
        double pc,  alt, i, geb, ge, g, f, m;
        Scanner s  = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o sexo(0-Masculino e 1-Feminino)");
        ge = s.nextDouble();
        System.out.println("Digite o peso corporal");
        pc = num.nextDouble();
        System.out.println("Digite a Altura");
        alt = num.nextDouble();
        System.out.println("Digite a idade em anos");
        i= num.nextDouble();
        if (ge==1)
        {
            System.out.printf("para as mulheres: GEB = 655.1 + (9.56 * PC) + (1.85 * Alt) - (4.67 * I)");
            geb =  (655.1 + (9.56 * pc) + (1.85 * alt) - (4.67 * i));
            System.out.println(geb);
        }
        else
            if(ge==0)
                {
                    geb = 655.1 + (9.56 * pc) + (1.85 * alt) -(4.67 * i);
                    System.out.println(geb);
                }
              else
                  System.out.println("Sexo inválido");       
            
    }

    /**
     *
     */
    public static void extenso(){
        int vlr, c,  d, u, j;
        Scanner num = new Scanner(System.in);
         System.out.println("Digite um número de 0 atpe 999");
         String extenso, cent ,dez ,uni;
         vlr = num.nextInt();
         c = vlr/100;
         d = vlr % 100/10;
         u = (vlr % 100)%10;
         j = vlr/1;
         if(c==1&&d==0&&u==0){
         System.out.println("cem");}
         else if(c==0&&d==0&&u==0){
         System.out.println("zero");
         }
         else
         {
            if(c>=1&&d==0&&u==0){
             
            switch(c){
            case 1 :System.out.println("Cento ");
            break;
            case 2 : System.out.println("Duzentos ");
            break;
            case 3 : System.out.println("Trezentos ");
            break;
            case 4 : System.out.println("Quatrocentos ");
            break;
            case 5 : System.out.println("Quinhentos ");
            break;
            case 6 : System.out.println("Seiscentos ");
            break;
            case 7 : System.out.println("Setecentos ");
            break;
            case 8 : System.out.println("Oitocentos ");
            break;
            case 9 : System.out.println("Novecentos ");
            break;
        }
      }
            else
   {
	switch(c)
	{
	case 1 : System.out.println("Cento e ");break;
	case 2 : System.out.println("Duzentos e ");break;
	case 3 : System.out.println("Trezentos e ");break;
	case 4 : System.out.println("Quatrocentos e");break;
	case 5 : System.out.println("Quinhentos e ");break;
	case 6 : System.out.println("Seiscentos e ");break;
	case 7 : System.out.println("Setecentos e ");break;
	case 8 : System.out.println("Oitocentos e ");break;
	case 9 : System.out.println("Novecentos e ");break;
	}
   }
   if(d==1)
   {
	switch(u)
	{
	case 0 : System.out.println("Dez ");break;
	case 1 : System.out.println("Onze ");break;
	case 2 : System.out.println("Doze ");break;
	case 3 : System.out.println("Treze ");break;
	case 4 : System.out.println("Quatorze ");break;
	case 5 : System.out.println("Quinze ");break;
	case 6 : System.out.println("Dezesseis ");break;
	case 7 : System.out.println("Dezessete ");break;
	case 8 : System.out.println("Dezoito ");break;
	case 9 : System.out.println("Dezenove ");break;
	}
   }
   else if(d>1)
   {
	switch (d)
	{
	case 2 : System.out.println("Vinte");break;
	case 3 : System.out.println("Trinta");break;
	case 4 : System.out.println("Quarenta");break;
	case 5 : System.out.println("Cinquenta");break;
	case 6 : System.out.println("Sessenta");break;
	case 7 : System.out.println("Setenta");break;
	case 8 : System.out.println("Oitenta");break;
	case 9 : System.out.println("Noventa");break;
	}
	switch (u)
	{
	case 1 : System.out.println(" e Um ");break;
	case 2 : System.out.println(" e Dois ");break;
	case 3 : System.out.println(" e Tres ");break;
	case 4 : System.out.println(" e Quatro ");break;
	case 5 : System.out.println(" e Cinco ");break;
	case 6 : System.out.println(" e Seis ");break;
	case 7 : System.out.println(" e Sete ");break;
	case 8 : System.out.println(" e Oito ");break;
	case 9 : System.out.println(" e Nove ");break;
	}
   }
   else
   {
	switch (u)
	{
	case 1 : System.out.println("Um ");break;
	case 2 : System.out.println("Dois ");break;
	case 3 : System.out.println("Tres ");break;
	case 4 : System.out.println("Quatro ");break;
	case 5 : System.out.println("Cinco ");break;
	case 6 : System.out.println("Seis ");break;
	case 7 : System.out.println("Sete ");break;
	case 8 : System.out.println("Oito ");break;
	case 9 : System.out.println("Nove ");break;
	}
   }
        
        System.out.println(extenso);
     }
   }
    public static void  valores (){
        Scanner scan = new Scanner (System.in);
        int a,b;
        System.out.print("Digite um número qualquer:");
         a = scan.nextInt();
        
        System.out.print("Digite um número que pode ser multiplo de "+a+" : ");
         b = scan.nextInt();
        
        if (a == 0)
        {
            System.out.println("Não existe Múltiplo de zero");
        }
        else{
            
        }
        if ((a==0)&&(b==0))
        {
        System.out.println(a+" e " +b+" São Multiplos");    
        }
        else
        {
            System.out.println(a+ "e" +b+ "Não são Multiplos");
        }
    }
    /**
     *
     * @param i
     */

    /**
     *
     * @param i
     * @param a
     */

    /**
     *
     * @param i
     * @param a
     * @param b
     */

    /**
     *
     * @param i
     * @param a
     * @param b
     * @param c
     */
    public static void digite(){
      Scanner scan = new Scanner(System.in);
        int i, a,  b, c;
        System.out.print("Digite 1 ou 2: ");
         i = scan.nextInt();
        
        System.out.print("Digite um numero real: ");
         a = scan.nextInt();
        
        System.out.print("Digite um numero real: ");
         b = scan.nextInt();
        
        System.out.print("Digite um numero real: ");
         c = scan.nextInt();
        
        if(i==1){
            if(a==b && a==c){
            System.out.println(a);
            System.out.println(a);
            System.out.println(a);
            }
        
            if (a!=b && a!=c){
                if(a<b && a<c){
                    if(b==c){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(b);
                    }
                    if(b<c){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                    if(b>c){
                        System.out.println(a);
                        System.out.println(c);
                        System.out.println(b);
                    }
                }
                if(a>b && a>c){
                    if(b==c){
                        System.out.println(b);
                        System.out.println(b);
                        System.out.println(a);
                    }
                    if(b<c){
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(a);
                    }
                    if(b>c){
                        System.out.println(c);
                        System.out.println(b);
                        System.out.println(a);
                    }
                }
            }

            if(a>c && a<b){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }

            if(a>b && a<c){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }
        }
        if(i==2){
            if(a==b && a==c){
                System.out.println(a);
                System.out.println(a);
                System.out.println(a);
            }
        
            if (a!=b && a!=c){
                if(a<b && a<c){
                    if(b==c){
                        System.out.println(b);
                        System.out.println(b);
                        System.out.println(a);
                    }
                    if(b<c){
                        System.out.println(c);
                        System.out.println(b);
                        System.out.println(a);
                    }
                    if(b>c){
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(a);
                    }
                }


                if(a>b && a>c){
                    if(b==c){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                    if(b<c){
                        System.out.println(a);
                        System.out.println(c);
                        System.out.println(b);
                    }
                    if(b>c){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                }
            }
        
            if(a>c && a<b){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }

            if(a>b && a<c){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
        else if(i!=1 && i!=2){
            System.out.println("Apenas aceita os numeros 1 e 2 na Primeira Pergunta!!!");
        }
    }
    public static void empresa (){
     Scanner scani = new Scanner (System.in);
     System.out.print("Digite a,ou as horas extras(Lógico que em minutos):");
     float ext = scani.nextInt();
    
     System.out.print("Digite as horas faltadas(Lógico que em minutos):");
     float faltt = scani.nextInt();
     
     float a = 2;
     float b = 3;
                     float sessenta = 60;
                             float h = ext- (a/b * (faltt));
                                     float nvextt = ext/sessenta;
                                     float nvfaltt = faltt/sessenta;
    
    if(h>2400){
    System.out.println("Voce fez" + (int)nvextt+ "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou restantes ,"
    +(double) h + "Seus pontos e a sua recompensa juntas foram de R$500"); 
              }
    else
     if(h>1800){
         System.out.println("Voce fez," + (int) nvextt + "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou Restantes ,"
         +(double) h+ "Seus pontos e suas recompensas juntas foram de R%400");
     }
    else
    if(h>1200){
        System.out.println("Voce fez," + (int) nvextt + "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou Restantes ,"
         +(double) h+ "Seus pontos e suas recompensas juntas foram de R%300");
    }
    else
    if(h>=600){
     System.out.println("Voce fez," + (int) nvextt + "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou Restantes ,"
         +(double) h+ "Seus pontos e suas recompensas juntas foram de R%200");
    }
    else
    {
       System.out.println("Voce fez," + (int) nvextt + "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou Restantes ,"
         +(double) h+ "Seus pontos e suas recompensas juntas foram de R%100");
    }
     }  
    
    public static void  turno (){
        Scanner scani = new Scanner (System.in);
        
        System.out.print("Digite o seu horário de entrada (entre 0 a 24h):");
        int entrada = scani.nextInt();
        int saida = entrada+6;
        int sd_especial = saida - 24;
        
        if(entrada>18){
            System.out.println("A sua saida é exatamente as" + sd_especial +"h");
        }
        else if(entrada>12){
            System.out.println("A sua saida é exatamente as" + sd_especial +"h");
        }
        else{
            System.out.println("A sua saida é exatamente as" + sd_especial +"h");
        }
    }
    public static void dogao(){
        Scanner ped = new Scanner(System.in);

        System.out.println("Digite o código do item. Cachorro quente:0 Refrigerante:1 Sobremesa:2");
        int cd = ped.nextInt();
        System.out.println("Digite a quantidade");
        int qt = ped.nextInt();
        System.out.println("Digite x para finalizar");
        String x = ped.next();
        if(x==x){
        if(cd==0){
            int result = (int) (2.00*qt);
            System.out.println("Valor total é:"+result);
        }
        else{
            if(cd==1){
                double result = 2.50*qt;
                System.out.println("Valor total é"+result);
            }
            else{
                if(cd==2){
                    int result = (int) (1.50 * qt);
                    System.out.println("Valor total é igual a:"+result);
                }
            }
        }
    }
    } 
    public static void sair(){
        System.exit(0);
    }
    public static void setimo(){
        Scanner scan = new Scanner(System.in);
        float i = 0;
        float fat= 1;
        float a = 1;
        
        while(a>0){
            System.out.println("Digite um número: ");
            a = scan.nextInt();
            fat +=a;
            i++;
        }
        System.out.println(fat/(i-1));

    }
    public static void nove(){
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um valor inteiro positivo");
         int n = num.nextInt();
         int i ;
         int soma; 
         soma = 0;
        i = 1;
  
        while (i <= n) {
        soma = soma + i;
        i = i + 1;
    }
        System.out.println("o resultado da soma é:"+ soma);
    }
    public static void dez(){
        Scanner numm = new Scanner(System.in);
        int i, a , soma, div;
        soma = 2;
        div=0;
        
        System.out.print("Digite um número inteiro e positivo");
        int num = numm.nextInt();
        for(i=3;i<num;i+=2){
            div=0;
            for(a=1;a<=i;a++){
                if(i%a==0){
                    div++;
                }
                if(div>2){
                    break;
                }
            }
        }
        if(div==2){
            soma+=i;
        }
       System.out.println("A soma dos primos é:"+soma);
      }
       
    public static void main(String[] args) {
      Scanner escolha = new Scanner(System.in);
      System.out.println("escolha o programa");
      Double e = escolha.nextDouble();
      
      Metodos m = new Metodos();
      if(e==0){
          Metodos.sair();
      }
      else{
            if(e==1){
                Metodos.gasto();
                }
             else{
                if(e==2){
                Metodos.extenso();
            }
          else{
              if(e==3){
                  Metodos.valores();
              }
              else{
                  if(e==4){
                      Metodos.digite();
                  }
                  else{
                      if(e==5){
                          Metodos.empresa();
                      }
                      else{
                          if(e==6){
                              Metodos.turno();
                          }
                          else{
                              if(e==7){
                                  Metodos.setimo();
                              }
                              else{
                                  if(e==8){
                                      Metodos.dogao();
                                  }
                                  else{
                                      if(e==9){
                                          Metodos.nove();
                                      }
                                      else{
                                          if(e==10){
                                              Metodos.dez();
                                          }
                                      }
                                  }
                              }
                          }
                      }
                  }
              }
          }
      }
      
    } 
  }
}

    

