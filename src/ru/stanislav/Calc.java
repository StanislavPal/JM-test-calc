package ru.stanislav;

public class Calc {
        int a;
        int b;
        String op;

        public Calc(int a, int b, String op) {
            this.a = a;
            this.b = b;
            this.op = op;
        }

        public void set(int a, int b, String op) {
            this.a = a;
            this.b = b;
            this.op = op;
        }

        private int add() {
            return this.a + this.b;
        }

        private int sub() {
            return this.a - this.b;
        }

        private float div() {
            return this.a / this.b;
        }

        private int mult() {
            return this.a * this.b;
        }
        float calculate() {

            switch (this.op) {
                case "+" -> {
                    return this.add();
                }
                case "-" -> {
                    return this.sub();
                }
                case "*" -> {
                    return this.mult();
                }
                case "/" -> {
                    return this.div();
                }
            }

        return -1;

        }

}
