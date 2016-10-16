package es.upm.miw.pd.command.calculator;

public class ResetCommand implements Comando {
    private Calculator calculator;

    
    public ResetCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
       this.calculator.reset();
        
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "ResetComando";
    }

}
