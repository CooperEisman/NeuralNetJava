public class MultiLayerPerceptron {
    private static int numLayers;
    private Neuron[][] Net;


    //Initializer with number of inputs and number of outputs. Creates 2 Hidden layers with 10 Neurons
    public MultiLayerPerceptron(int numInputs, int numOutputs) {
        this(numInputs,numOutputs,10,2);
    }

    //Initializer with number of inputs, number of outputs, and amount of hidden layer neurons.
    public MultiLayerPerceptron(int numInputs, int numOutputs, int numHiddenNeurons, int numHiddenLayers) {
        //Initialize Instance
        numLayers = numHiddenLayers + 2;
        Net = new Neuron[numLayers][];

        //Initialize Neuron Net
        Net[0] = new Neuron[numInputs];
        Net[numLayers -1] = new Neuron[numOutputs];
        for (int x = 1; x < numLayers -1; x++) {
            Net[x] = new Neuron[numHiddenNeurons];
        }

        //Initialize all Neurons
        for (int x = 0; x < numLayers; x++) {
            for (int y = 0; y < Net[x].length; y++) {
                Net[x][y] = new Neuron();
            }
        }
    }
}
