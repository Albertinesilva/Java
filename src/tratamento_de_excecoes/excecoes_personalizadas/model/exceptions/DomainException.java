package tratamento_de_excecoes.excecoes_personalizadas.model.exceptions;

public class DomainException extends Exception {
  private static final long serialVersionUID = 1L;

  public DomainException(String msg) {
    super(msg);
  }
}
