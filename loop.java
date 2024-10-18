public class Loop {
    public static voi main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("diga sua avaliacao para o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("media de avaliações" + mediaAvaliacao/3);


    }
}