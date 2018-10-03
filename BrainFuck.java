import java.util.ArrayList;

class BrainFuck {
    static final int memorySize = 30000;
    static final int maxVal = 256;
    static char[] arr;
    static int index;
    private static String[] str;
    static int i;
    static ArrayList<Command> commands;

    static void run(String line) {
        commands = new ArrayList<>();
        str = line.split("");
        arr = new char[memorySize];
        index = 0;

        if (!checkBrackets()) return;
        for(String command : str) {
            switch (command) {
                case ">":
                    commands.add(new RightCommand());
                    break;
                case "<":
                    commands.add(new LeftCommand());
                    break;
                case "+":
                    commands.add(new PlusCommand());
                    break;
                case "-":
                    commands.add(new MinusCommand());
                    break;
                case ".":
                    commands.add(new DotCommand());
                    break;
                case "[":
                    commands.add(new OBCommand());
                    break;
                case "]":
                    commands.add(new CBCommand());
                    break;
            }
        }

        for(i = 0; i < commands.size(); i++)
            commands.get(i).Execute();
    }

    private static boolean checkBrackets() {
        return true;
    }
}
