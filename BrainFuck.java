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
            if (str.charAt(j) == '>')
                commands.add(new IncPointer());
            else if (str.charAt(j) == '<')
                commands.add(new DecPointer());
            else if (str.charAt(j) == '+')
                commands.add(new IncValue());
            else if (str.charAt(j) == '-')
                commands.add(new DecValue());
            else if (str.charAt(j) == '.')
                commands.add(new Output());
            else if (str.charAt(j) == '[')
                commands.add(new LoopBegin());
            else if (str.charAt(j) == ']')
                commands.add(new LoopEnd());
        }

        for(i = 0; i < commands.size(); i++)
            commands.get(i).execute();
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
