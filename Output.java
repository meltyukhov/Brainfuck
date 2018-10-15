public class Output implements Command {
    public void execute() {
        System.out.print(BrainFuck.arr[BrainFuck.index]);
    }

    public char character() {
        return '.';
    }
}
