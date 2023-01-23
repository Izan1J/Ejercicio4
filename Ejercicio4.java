public class Ejercicio4 {

    static class Forma{
        private String nombre;
        private int area=0;

        public Forma(String nombre){
            this.nombre=nombre;
        }

        public double Area(){
            return 0;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
    static class Esfera extends Forma{
        private double radio;
        public Esfera(double radio){
            super("Esfera");
            this.radio=radio;
        }

        @Override
        public double Area() {
            return super.Area()+(4+Math.PI+Math.pow(radio,2));
        }

        @Override
        public String toString() {
            return super.toString()+"\nArea = "+Area();
        }
    }
    static class Rectangulo extends Forma{
        private double longitud;
        private double ancho;
        public Rectangulo(double longitud,double ancho){
            super("Rectangulo");
            this.longitud=longitud;
            this.ancho=ancho;
        }

        @Override
        public double Area() {
            return super.Area()+(longitud*ancho);
        }

        @Override
        public String toString() {
            return super.toString()+"\nArea = "+Area();
        }
    }

    static class Cilindro extends Forma{
        private double radio;
        private double altura;
        public Cilindro(double radio, double altura){
            super("Cilindro");
            this.altura=altura;
            this.radio=radio;
        }

        @Override
        public double Area() {
            return super.Area()+(Math.PI*Math.pow(radio,2)*altura);
        }

        @Override
        public String toString() {
            return super.toString()+"\nArea = "+Area();
        }
    }

    static class Pintura{
        private double cobertura;

        public Pintura(double cobertura){
            this.cobertura=cobertura;
        }
        public String getCobertura(Forma obj){
            return "Cobertura = "+obj.Area()/ cobertura;
        }
    }

    static class MainPintura{
        public static void main(String[] args) {
            Pintura p=new Pintura(250);
            Rectangulo r=new Rectangulo(20,35);
            Esfera e=new Esfera(15);
            Cilindro c=new Cilindro(10,30);

            System.out.println(r.toString());
            System.out.println(p.getCobertura(r));
            System.out.println();
            System.out.println(e.toString());
            System.out.println(p.getCobertura(e));
            System.out.println();
            System.out.println(c.toString());
            System.out.println(p.getCobertura(c));
        }
    }

}
