public class MinusCommand implements Command {
    public void Execute() {
        BrainFuck.arr[BrainFuck.index]--;
        BrainFuck.arr[BrainFuck.index] %= BrainFuck.maxVal;
    }
}
