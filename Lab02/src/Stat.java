public class Stat implements StatADT {
    private double[] number = new double[100];
    private int total = 0;
    @Override

    // Setter
    public void setData(int element, double input) {
        // TODO Auto-generated method stub
        number[element] = input;
    }

    @Override
    public void setTotal(int t) {
        // TODO Auto-generated method stub
        total = t;
    }

    @Override
    public double getData(int element) {
        // TODO Auto-generated method stub
        return number[element];
    }

    @Override
    public int getTotal() {
        // TODO Auto-generated method stub
        return total;
    }

    // Getter and Calculator

    @Override
    public double getMean() {
        // TODO Auto-generated method stub
        double sum;
        sum = 0;
        for (int i = 0; i < total; i++) {
            sum += number[i];
        }
        return sum / (double)total;
    }

    @Override
    public double getSD() {
        // TODO Auto-generated method stub
        double sum = 0;
        double mean = getMean();
        for (int i = 0; i < total; i++) {
            sum += (number[i] - mean) * (number[i] - mean);
        }
        return Math.sqrt(sum / (double)total);
    }

    @Override
    public double getMax() {
        // TODO Auto-generated method stub
        double max = number[0];
        for (int i = 0; i < total; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    @Override
    public double getMin() {
        // TODO Auto-generated method stub
        double min = number[0];
        for (int i = 0; i < total; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        return min;
    }
}