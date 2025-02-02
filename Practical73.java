public class Practical73 {
    public static void main(String[] args) {
        int size = 8;
        
     String[] c = Practicalc(size).split("\n");
        String[] h = Practicalh(size).split("\n");
        String[] i = Practicali(size).split("\n");
        String[] n = Practicaln(size).split("\n");
        String[] m = Practicalm(size).split("\n");
        String[] a = Practicala(size).split("\n");
        String[] y = PracticalY(size).split("\n");

        int height = size * 2 - 1;

        String result = "";

        for (int line = 0; line < height; line++) {
            result += c[line] + "  " + h[line] + "  " + i[line] + "  " + n[line] + "  " + m[line] + "  " + a[line] + "  " + y[line] + "\n";
        }

        System.out.println(result);
    }
    

    public static String Practicalc(int size) {
        String result = "";
        for (int line = 1; line <= size * 2 - 1; line++) {
            for (int element = 1; element <= size; element++) {
                if ((line == 1 || line == size * 2 - 1) && element <= size - 1) {
                    result += " * ";
                } else if (line >= 2 && line < size * 2 - 1 && element == 1) {
                    result += " * ";
                } else {
                    result += "   ";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String Practicalh(int size) {
        String result = "";
        for (int line = 1; line <= size * 2 - 1; line++) {
            for (int element = 1; element <= size * 2 - 1; element++) {
                if (element == 1 || element == size * 2 - 1 || line == size) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String Practicali(int size) {
        String result = "";
        for (int line = 1; line <= size * 2 - 1; line++) {
            for (int element = 1; element <= size; element++) {
                if (line == 1 || line == size * 2 - 1 || element == size / 2 + 1) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String Practicaln(int size) {
        String result = "";
        for (int line = 1; line <= size * 2 - 1; line++) {
            for (int element = 1; element <= size * 2 - 1; element++) {
                if (element == 1 || element == size * 2 - 1 || element == line) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String Practicalm(int size) {
        String result = "";
        for (int line = 1; line <= size * 2 - 1; line++) {
            for (int element = 1; element <= size; element++) {
                if (element == 1 || (element == line && line <= size)) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            for (int element = size; element >= 1; element--) {
                if (element == 1 || (element == line && line <= size)) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String Practicala(int size) {
        String result = "";
        for (int line = 1; line <= size * 2 - 1; line++) {
            for (int element = 1; element <= size * 2 - 1; element++) {
                if (line == 1 || line == size || element == 1 || element == size * 2 - 1) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String PracticalY(int size) {
        String result = "";
        for (int line = 1; line <= size * 2 - 1; line++) {
            for (int element = 1; element <= size * 2 - 1; element++) {
                if ((element == line && line <= size) || (element == size * 2 - line && line <= size) || (line >= size && element == size)) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            result += "\n";
        }
        return result;
    }
}

