public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("This program requires a brainfuck program as an argument");
        }
        else
            BrainFuck.run(args[0]);
    }
}
