public class LoopBegin implements Command {
    private int skip;

    LoopBegin() {
        skip = 0;
    }

    public void execute() {
        if((int)BrainFuck.arr[BrainFuck.index] == 0) {
            int i = BrainFuck.i;
            for(i++; skip > 0 || BrainFuck.commands.get(i).character() != ']'; i++){
                if(BrainFuck.commands.get(i).character() == '[')
                    skip++;
                else if(BrainFuck.commands.get(i).character() == ']')
                    skip--;
            }
            BrainFuck.i = i;
        }
    }

    public char character() {
        return '[';
    }
}
