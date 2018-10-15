public class DecValue implements Command {
    public void execute() {
        BrainFuck.arr[BrainFuck.index]--;
        BrainFuck.arr[BrainFuck.index] %= BrainFuck.maxVal;
    }

    public char character() {
        return '-';
    }
}
