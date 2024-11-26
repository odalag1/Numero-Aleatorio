public class condicional {
    public static void main(String[] args) {
        int anoDeLançamentoDoFilme;
        anoDeLançamentoDoFilme = 2021;
        String tipoPlano = "plus";
        boolean IncludeNoPlano = true;
        if (IncludeNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("filme Liberado");
        } else {
            System.out.println("Pague a locação");
        }

}
}