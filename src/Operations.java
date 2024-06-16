public class Operations {

    String operation;
    double num1;
    double num2;
    double calculatedNumber;
    String calculatedNumbertoString;

    public Operations() {
        this.operation = "";

    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation(){
        return operation;
    }

    public void add(String num1) {
        this.operation = "add";
        this.num1 = Double.parseDouble(num1);
    }

    public void subtract(String num1) {
        this.operation = "subtract";
        this.num1 = Double.parseDouble(num1);
    }

    public void multiply(String num1) {
        this.operation = "multiply";
        this.num1 = Double.parseDouble(num1);
    }

    public void divide(String num1) {
        this.operation = "divide";
        this.num1 = Double.parseDouble(num1);
    }

    public String square(String num1){
        if(num1.isEmpty()){
            return "";
        }
        else {
            this.num1 = Double.parseDouble(num1);
            calculatedNumber = this.num1*this.num1;
            calculatedNumbertoString = String.valueOf(calculatedNumber);
            return calculatedNumbertoString;
        }

    }

    public String equals(String num2) {
        if (operation.equals("add")) {
            operation = "";
            this.num2 = Double.parseDouble(num2);
            calculatedNumber = num1 + this.num2;
            calculatedNumbertoString = String.valueOf(calculatedNumber);
            return calculatedNumbertoString;
        }
        if (operation.equals("subtract")) {
            operation = "";
            this.num2 = Double.parseDouble(num2);
            calculatedNumber = num1 - this.num2;
            calculatedNumbertoString = String.valueOf(calculatedNumber);
            return calculatedNumbertoString;
        }
        if (operation.equals("multiply")) {
            operation = "";
            this.num2 = Double.parseDouble(num2);
            calculatedNumber = num1 * this.num2;
            calculatedNumbertoString = String.valueOf(calculatedNumber);
            return calculatedNumbertoString;
        }
        if (operation.equals("divide")) {
            operation = "";
            this.num2 = Double.parseDouble(num2);
            if(num2.equals("0")){
                calculatedNumbertoString = "You Cannot Divide by 0!";
                return calculatedNumbertoString;
            }
            else {
                calculatedNumber = num1 / this.num2;
                calculatedNumbertoString = String.valueOf(calculatedNumber);
                return calculatedNumbertoString;
            }
        }
        return calculatedNumbertoString;
    }
}