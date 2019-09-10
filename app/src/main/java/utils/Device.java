package utils;

public class Device {

        private String nome;
        private String MAC;

        public Device(String nome, String MAC) {
            this.nome = nome;
            this.MAC = MAC;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMAC() {
            return MAC;
        }

        public void setMAC(String MAC) {
            this.MAC = MAC;
        }

}