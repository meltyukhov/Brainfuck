public class LoopEnd implements Command {
    private int skip;

    LoopEnd() {
        skip = 0;
    }

    public void execute() {
        if((int)BrainFuck.arr[BrainFuck.index] != 0) {
            int i = BrainFuck.i;
            for(i--; skip > 0 || BrainFuck.commands.get(i).character() != '['; i--){
                if(BrainFuck.commands.get(i).character() == ']')
                    skip++;
                else if(BrainFuck.commands.get(i).character() == '[')
                    skip--;
            }
            BrainFuck.i = i - 1;
        }
    }

    public char character() {
        return ']';
    }
}
