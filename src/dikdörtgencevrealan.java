public class dikdörtgencevrealan {



        private double uzunKenar;
        private double kisaKenar;


        public dikdörtgencevrealan(double uzunKenar, double kisaKenar) {
            this.uzunKenar = uzunKenar;
            this.kisaKenar = kisaKenar;
        }


        public double getUzunKenar() {
            return uzunKenar;
        }

        public void setUzunKenar(double uzunKenar) {
            this.uzunKenar = uzunKenar;
        }

        public double getKisaKenar() {
            return kisaKenar;
        }

        public void setKisaKenar(double kisaKenar) {
            this.kisaKenar = kisaKenar;
        }


        public double alanHesapla() {
            return uzunKenar * kisaKenar;
        }


        public double cevreHesapla() {
            return 2 * (uzunKenar + kisaKenar);
        }



}
