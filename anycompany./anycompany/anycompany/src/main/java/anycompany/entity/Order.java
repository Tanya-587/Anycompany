package anycompany.entity;

import jakarta.persistence.*;


    @Entity
    @Table(name = "order")
    public class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private double amount;
        private double vat;
        private double VAT;

        // Getters and setters


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getVat() {
            return vat;
        }

        public void setVat(double vat) {
            this.vat = vat;
        }

        public void setVAT(double vat) {
            this.VAT = vat;
        }

        public double getVAT() {
            return VAT;
        }
    }
