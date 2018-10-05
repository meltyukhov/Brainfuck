import java.util.ArrayList;

class BrainFuck {
    static final int memorySize = 30000;
    static final int maxVal = 256;
    static char[] arr;
    static int index;
    private static String str;
    static int i;
    static ArrayList<Command> commands;

    static void run(String line) {
        commands = new ArrayList<>();
        str = line;
        arr = new char[memorySize];
        index = 0;

        if (!checkBrackets()) return;
        for(int j = 0; j < str.length(); j++) {
            switch (str.charAt(j)) {
                case '>':
                    commands.add(new RightCommand());
                    break;
                case '<':
                    commands.add(new LeftCommand());
                    break;
                case '+':
                    commands.add(new PlusCommand());
                    break;
                case '-':
                    commands.add(new MinusCommand());
                    break;
                case '.':
                    commands.add(new DotCommand());
                    break;
                case '[':
                    commands.add(new OBCommand());
                    break;
                case ']':
                    commands.add(new CBCommand());
                    break;
            }
        }

        for(i = 0; i < commands.size(); i++)
            commands.get(i).Execute();
    }

    private static boolean checkBrackets() {
        int ob = 0, cb = 0;
        for(int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '[')
                ob++;
            else if (str.charAt(j) == ']') {
                cb++;
                if (cb > ob) {
                    System.out.println("Missing opening bracket!");
                    return false;
                }
            }
        }
        if (ob > cb) {
            System.out.println("Missing closing brackets!");
            return false;
        }
        else
            return true;
    }
}
