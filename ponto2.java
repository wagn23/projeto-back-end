public class Main {
    public static void main(String[] args)  {
        System.out.println("Esse � o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
    
        
        int anoDeLancamento = 2022;
        System.out.println("Ano de lan�amento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse; 
        sinopse = """
               Filme Top Gun
               Filmr de aventura com gal� dos anos 80
               Muito bom!
               Ano de lan�amento
               """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificcao = (int) (media /2);
        System.out.println(classificacao);
    
    }
}