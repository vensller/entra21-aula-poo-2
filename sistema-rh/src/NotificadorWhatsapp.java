public class NotificadorWhatsapp implements INotificador {
    @Override
    public void notificar(String mensagem, Funcionario funcionario) {
        System.out.println("Enviando mensagem no Whatsapp para: " +
                funcionario.getNome() +
                ". Conteúdo: " +
                mensagem);
    }
}
