package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.PrintCommand;
import es.upm.miw.pd.command.calculator.ResetCommand;
import es.upm.miw.pd.command.calculator.SubtractCommand;
import es.upm.miw.pd.command.calculator.AddCommand;
import upm.jbb.IO;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        Calculator calculator = new Calculator();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }
}
