public class Araba {
  private int yas;
  private boolean klima;
  private boolean ekran;
  private boolean abs;

  public static class Builder {
    
    private int yas;
    private boolean klima = false;
    private boolean ekran = false;
    private boolean abs = false;

    public Builder(int yas) {
      this.yas = yas;
    }

    public Builder klima(boolean b) {
      klima = b;
      return this;
    }

    public Builder ekran(boolean b) {
      ekran = b;
      return this;
    }

    public Builder abs(boolean b) {
      abs = b;
      return this;
    }

    public Araba build() {
      return new Araba(this);
    }
  }

  private Araba(Builder builder) {
    yas = builder.yas;
    klima = builder.klima;
    ekran = builder.ekran;
    abs = builder.abs;
  }
}