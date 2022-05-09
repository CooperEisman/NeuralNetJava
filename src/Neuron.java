public class Neuron {
    private double[] weights;
    private double bias;

    //Constructor with amount of inputs. Sets Bias to 1
    public Neuron(int numInputs) {
        this(numInputs, 1.0);
    }

    //Constructor with amount of inputs and bias
    public Neuron(int numInputs, double bias) {
        weights = new double[numInputs];
        this.bias = bias;
    }
}
