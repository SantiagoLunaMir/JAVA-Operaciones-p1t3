public class Main {//clases se nombran con UpperCammelCase
    public static void main(String[] args) {//Variables y metodos con lowercammelcase
        int operationIndex=0;
        do {
            String operation = args[operationIndex];
            int p1 = Integer.parseInt(args[operationIndex + 1]);
            int p2 = Integer.parseInt(args[operationIndex + 2]);
            int resultado = 0;

            System.out.print(p1);
            switch (operation) {
                case "SUMA" -> {
                    System.out.print(" + ");
                    resultado = p1 + p2;
                }
                case "RESTA" -> {
                    System.out.print(" - ");
                    resultado = p1 - p2;
                }
                case "DIVISION" -> {
                    System.out.print(" / ");
                    resultado = p1 / p2;
                }
                case "MULTIPLICACION" -> {
                    System.out.print(" x ");
                    resultado = p1 * p2;
                }
                default -> throw new IllegalStateException("Valor que creo es un error: " + operation);
            }
            System.out.println(p2 + " = " + resultado);
            operationIndex +=3;
        }while(operationIndex< args.length);
    }
}