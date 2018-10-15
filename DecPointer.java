public class DecPointer implements Command {
    public void execute() {
        BrainFuck.index--;
        if(BrainFuck.index < 0)
            BrainFuck.index += BrainFuck.memorySize;
    }

    public char character() {
        return '<';
    }
}
