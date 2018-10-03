public class DotCommand implements Command {
    public void Execute() {
        System.out.print(BrainFuck.arr[BrainFuck.index]);
    }
}
