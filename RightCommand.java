public class RightCommand implements Command {
    public void Execute() {
        BrainFuck.index++;
        BrainFuck.index %= BrainFuck.memorySize;
    }
}
