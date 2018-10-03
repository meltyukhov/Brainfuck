public class CBCommand implements Command {
    private int skip;
    private int i;

    CBCommand() {
        skip = 0;
    }

    public void Execute() {
        if((int)BrainFuck.arr[BrainFuck.index] != 0) {
            i = BrainFuck.i;
            for(i--; skip > 0 || !(BrainFuck.commands.get(i) instanceof OBCommand); i--){
                if(BrainFuck.commands.get(i) instanceof CBCommand)
                    skip++;
                else if(BrainFuck.commands.get(i) instanceof OBCommand)
                    skip--;
            }
            BrainFuck.i = i - 1;
        }
    }
}
