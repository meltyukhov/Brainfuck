public class OBCommand implements Command {
    private int skip;
    private int i;

    OBCommand() {
        skip = 0;
    }

    public void Execute() {
        if((int)BrainFuck.arr[BrainFuck.index] == 0) {
            i = BrainFuck.i;
            for(i++; skip > 0 || !(BrainFuck.commands.get(i) instanceof CBCommand); i++){
                if(BrainFuck.commands.get(i) instanceof OBCommand)
                    skip++;
                else if(BrainFuck.commands.get(i) instanceof CBCommand)
                    skip--;
            }
            BrainFuck.i = i;
        }
    }
}
