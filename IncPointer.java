public class IncPointer implements Command {
    public void execute() {
        BrainFuck.index++;
        BrainFuck.index %= BrainFuck.memorySize;
    }

    public char character() {
        return '>';
    }
}
