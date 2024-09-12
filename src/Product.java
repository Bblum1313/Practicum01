public class Product
    {
        private String ID;
        private String name;
        private String desc;
        private double cost;

        /**
         *
         * @param ID: product ID
         * @param cost: product cost
         * @param desc: product description
         * @param name: product name
         */
        public Product(String ID, String name, String desc,  double cost) {
            this.ID = ID;
            this.cost = cost;
            this.desc = desc;
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
        public String toCSV()
        {

            final char DQ = '\"';

            return(DQ + ID + DQ + ", " + DQ + name + DQ + ", " +  DQ + desc +  DQ + ", " +  DQ + cost);

        }



    }
