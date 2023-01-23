public class Carro {
    public static void main(String[] args) {
        String cor = "Amarelo"; //cor do carro
        String modelo = "Ford"; //marca do carro
        int capacidadeTotalCarro = 60; //capacidade total do carro em litros
        
        Carro(String cor, String modelo, int capacidadetotalCarro){
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeTotalCarro = capacidadeTotalCarro;
        }

        public void setCor(){
            return this.cor;
        }

        public String getCor(){
            this.cor = cor;
        }

        public void setModelo(){
            return this.modelo;
        }

        public String getModelo(){
            this.modelo = modelo;
        }

        public void setCapacidadeTotalCarro(){
            return this.capacidadeTotalCarro;
        }

        public int getCapacidadeTotalCarro(){
            this.capacidadeTotalCarro = capacidadeTotalCarro;
        }
    }
}
