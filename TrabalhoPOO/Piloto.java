public class Piloto {
    String responsavel;
    String concentracao;
    String conhecimentoTecnico;
    String decisaoRapida;

    public void pilotarAeronave(){
        System.out.println(concentracao + " e pilota uma aeronave...");
    }

    public void verificarSeguranca(){
        System.out.println(responsavel + " e verifica as condições de segurança do voo...");
    }
}