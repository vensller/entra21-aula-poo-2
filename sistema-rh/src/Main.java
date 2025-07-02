public class Main {
    public static void main(String[] args) {
        Rh recursosHumanos = new Rh();
        Funcionario programador = new Programador(
                "William",
                10000.0,
                20.0
        );
        Funcionario estagiario = new Estagiario(
                "Alexandre",
                400.0
        );
        Funcionario gerente = new Gerente(
                "Maria",
                20000.0
        );

        recursosHumanos.processarFuncionario(programador);
        recursosHumanos.processarFuncionario(estagiario);
        recursosHumanos.processarFuncionario(gerente);
    }
}