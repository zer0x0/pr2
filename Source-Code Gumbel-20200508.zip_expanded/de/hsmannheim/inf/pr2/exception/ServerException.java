package de.hsmannheim.inf.pr2.exception;

public class ServerException extends Exception {

  private int port;
  private String host;

  public ServerException() {
  }

  public ServerException(String message) {
    super(message);
  }

  public ServerException(Throwable cause) {
    super(cause);
  }

  public ServerException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServerException(String message, String host, int port) {
    super(message);
    this.host = host;
    this.port = port;
  }

  public int getPort() {
    return port;
  }

  public String getHost() {
    return host;
  }
}
