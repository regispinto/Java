public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticacao au){

        boolean autenticou = au.autentica(au.autentica());

        if(autenticou){
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }
}
