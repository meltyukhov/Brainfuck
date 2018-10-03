public class LeftCommand implements Command {
    public void Execute() {
        BrainFuck.index--;
        if(BrainFuck.index < 0)
            BrainFuck.index += BrainFuck.memorySize;
    }
}
