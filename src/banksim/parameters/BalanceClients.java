package banksim.parameters;

import banksim.BankSimCash;
import banksim.base.BalanceGenerator;
import banksim.utils.CSVReader;
import banksim.utils.RandomCollection;

import java.util.ArrayList;
import java.util.Random;

public class BalanceClients {
    private static final int COLUMN_LOW = 0, COLUMN_HIGH = 1, COLUMN_PROB = 2;

    private static RandomCollection<BalanceGenerator> balanceGeneratorPicker;

    public static void initBalanceClients(String filename) {
        // TODO : check what type of Random management do we want
        balanceGeneratorPicker = new RandomCollection<>(new Random(Parameters.getSeed()));
        ArrayList<String[]> parameters = CSVReader.read(filename);
        for (String[] paramLine : parameters) {
            BalanceGenerator balanceGenerator = new BalanceGenerator(Double.parseDouble(paramLine[COLUMN_LOW]),
                    Double.parseDouble(paramLine[COLUMN_HIGH]));
            balanceGeneratorPicker.add(Double.parseDouble(paramLine[COLUMN_PROB]), balanceGenerator);
        }
    }


}
