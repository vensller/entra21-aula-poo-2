public class NotificadorEmail implements INotificador {
    @Override
    public void notificar(String mensagem, Funcionario funcionario) {
        System.out.println("Enviando email para " +
                funcionario.getNome() +
                ". Conteúdo: " + mensagem);
    }
}
