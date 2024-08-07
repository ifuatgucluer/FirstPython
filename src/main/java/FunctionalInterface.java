    interface MesajVer {
  void merhaba(String mesaj); // abstract metot
   default void bye() { // Default metot
            System.out.println("Güle Güle");
        }
    }

    public class FunctionalInterface {
        public static void main(String[] args) {
            MesajVer mesajVer = (msg) -> System.out.println(msg);
            mesajVer.merhaba("Merhaba fonksiyonel arayüzler.");
            mesajVer.bye();
        }
    }


