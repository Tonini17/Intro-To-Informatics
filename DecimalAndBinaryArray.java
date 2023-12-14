public class DecimalAndBinaryArray {
    public static void main(String[] args) {
        
        String[][] decimalAndBinaryArray = new String[10][2];

        for (int i = 0; i < 10; i++) {
            int decimalValue = i;
            String binaryValue = Integer.toBinaryString(decimalValue);

            
            decimalAndBinaryArray[i][0] = String.valueOf(decimalValue);
            decimalAndBinaryArray[i][1] = binaryValue;
        }

        System.out.println("Decimal\tBinary");
        for (String[] row : decimalAndBinaryArray) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}

