package codenotesforjava;

class ThisAndSuper {
    public static void main(String[] args) {
        SpanishMan jose = new SpanishMan();
        jose.speak();
        // jose.super.speak(); // Error - super can only be used within the subclass
    }
}

