package banksim;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.Collections;
import banksim.parameters.Parameters;
import banksim.utils.*;
import sim.engine.SimState;

import static java.lang.Math.abs;

public class BankSimCash extends SimState {
public static final double BANKSIM_VERSION = 1.0;
private static final String[] DEFAULT_ARGS = new String[]{"", "-file", "PaySim.properties", "5"};

public final String simulatorName;
private long startTime = 0;
private int totalTransactionsMade = 0;
private int stepParticipated = 0;


/*private ArrayList<Client> clients = new ArrayList<>();
private ArrayList<Merchant> merchants = new ArrayList<>();
private ArrayList<Fraudster> fraudsters = new ArrayList<>();
private ArrayList<Bank> banks = new ArrayList<>();

private ArrayList<Transaction> transactions = new ArrayList<>();

private ArrayList<Integer> countAssignedTransactions;
private Map<String, Integer> countCallAction = new HashMap<>();
private Map<Repetition, Integer> countCallRepetition = new HashMap<>();*/

    public BankSimCash() {
        super(Parameters.getSeed());

        Date d = new Date();
        simulatorName = "PS_" + (d.getYear() + 1900) + (d.getMonth() + 1) + d.getDate() + d.getHours() + d.getMinutes()
                + d.getSeconds() + "_" + seed();
        File f = new File(Parameters.outputPath + simulatorName);
        f.mkdirs();
        Parameters.initOutputFilenames(simulatorName);
        Output.createLogFile(Parameters.filenameLog);
    }

    public static void main(String args[]) {
        if (args.length < 4) {
        args = DEFAULT_ARGS;
        }
        int nbTimesRepeat = Integer.parseInt(args[3]);
        String propertiesFile = "";
        for (int x = 0; x < args.length - 1; x++) {
        if (args[x].equals("-file")) {
        propertiesFile = args[x + 1];
        }
        }
        Parameters.initParameters(propertiesFile);
        for (int i = 0; i < nbTimesRepeat; i++) {
        BankSimCash p = new BankSimCash();
      //  p.runSimulation();
        }
        }
        }