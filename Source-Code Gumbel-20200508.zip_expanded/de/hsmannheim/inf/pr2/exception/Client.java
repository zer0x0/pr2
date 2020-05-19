package de.hsmannheim.inf.pr2.exception;

public class Client {

  public void doIt() {

    try {
      Server.connect("server1", 22);
    } catch (ServerException e1) {
      System.err.println("Keine Verbindung zum server "
              + e1.getHost() + " auf Port " + e1.getPort());

      try {
        Server.connect("server2", 22);
      } catch (ServerException e2) {
        System.err.println("Ersatzserver geht auch nicht: "
                + e2.getHost() + " auf Port " + e2.getPort());
      }
    }
  }
}
