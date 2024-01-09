package hf.dp.Command;

public class Button
{
    private  Command theCommand;

    public Button(Command theCommand)
    {
        setCommend(theCommand);
    }

    public void setCommend(Command newCommand)
    {
        this.theCommand  = newCommand;
    }

    public void pressed()
    {
        theCommand.execute();
    }
}
