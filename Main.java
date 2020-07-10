package tictactoe;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void drawerField(char[] game) {
        System.out.println("---------");
        for (int i = 0; i <= 6; i = i + 3) {
            System.out.println("| " + game[i] + " " + game[i + 1] + " " +  game[i + 2] + " |");
        }
        System.out.println("---------");
    }

    public static int randomForEasyLevel(char[] game) {
        List<Integer> blank = new ArrayList<>();
        for (int i = 0; i < game.length; i++) {
            if(game[i] == ' ') {
                blank.add(i);
            }
        }
        int min = 0;
        int max = 0;
        if(blank.get(0) % 2 == 0) {
            for (int i = 0; i < blank.size()-1; i++) {
                min = Math.min(blank.get(i), blank.get(i+1));
            }
            return min;
        } else {
            for (int i = 0; i < blank.size() - 1; i++) {
                max = Math.max(blank.get(i), blank.get(i + 1));
            }
            return max;
        }
    }

    public static int mediumLevelFirst(char[] game, int xORO) {
        if(xORO % 2 == 0) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == ' ') return 2;
            if(game[3] == 'X' && game[4] == 'X' && game[5] == ' ') return 5;
            if(game[6] == 'X' && game[7] == 'X' && game[8] == ' ') return 8;

            if(game[1] == 'X' && game[2] == 'X' && game[0] == ' ') return 0;
            if(game[4] == 'X' && game[5] == 'X' && game[3] == ' ') return 3;
            if(game[7] == 'X' && game[8] == 'X' && game[6] == ' ') return 6;

            if(game[0] == 'X' && game[3] == 'X' && game[6] == ' ') return 6;
            if(game[1] == 'X' && game[4] == 'X' && game[7] == ' ') return 7;
            if(game[2] == 'X' && game[5] == 'X' && game[8] == ' ') return 8;

            if(game[3] == 'X' && game[6] == 'X' && game[0] == ' ') return 0;
            if(game[4] == 'X' && game[7] == 'X' && game[1] == ' ') return 1;
            if(game[5] == 'X' && game[8] == 'X' && game[2] == ' ') return 2;

            if(game[0] == 'X' && game[4] == 'X' && game[8] == ' ') return 8;
            if(game[8] == 'X' && game[4] == 'X' && game[0] == ' ') return 0;
            if(game[6] == 'X' && game[4] == 'X' && game[2] == ' ') return 2;
            if(game[2] == 'X' && game[4] == 'X' && game[6] == ' ') return 6;
        } else {
            if(game[0] == 'O' && game[1] == 'O' && game[2] == ' ') return 2;
            if(game[3] == 'O' && game[4] == 'O' && game[5] == ' ') return 5;
            if(game[6] == 'O' && game[7] == 'O' && game[8] == ' ') return 8;

            if(game[1] == 'O' && game[2] == 'O' && game[0] == ' ') return 0;
            if(game[4] == 'O' && game[5] == 'O' && game[3] == ' ') return 3;
            if(game[7] == 'O' && game[8] == 'O' && game[6] == ' ') return 6;

            if(game[0] == 'O' && game[3] == 'O' && game[6] == ' ') return 6;
            if(game[1] == 'O' && game[4] == 'O' && game[7] == ' ') return 7;
            if(game[2] == 'O' && game[5] == 'O' && game[8] == ' ') return 8;

            if(game[3] == 'O' && game[6] == 'O' && game[0] == ' ') return 0;
            if(game[4] == 'O' && game[7] == 'O' && game[1] == ' ') return 1;
            if(game[5] == 'O' && game[8] == 'O' && game[2] == ' ') return 2;

            if(game[0] == 'O' && game[4] == 'O' && game[8] == ' ') return 8;
            if(game[8] == 'O' && game[4] == 'O' && game[0] == ' ') return 0;
            if(game[6] == 'O' && game[4] == 'O' && game[2] == ' ') return 2;
            if(game[2] == 'O' && game[4] == 'O' && game[6] == ' ') return 6;
        }
        return randomForEasyLevel(game);
    }

    public static int mediumLevelSecond(char[] game, int xORO) {
        if(xORO % 2 != 0) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == ' ') return 2;
            if(game[3] == 'X' && game[4] == 'X' && game[5] == ' ') return 5;
            if(game[6] == 'X' && game[7] == 'X' && game[8] == ' ') return 8;

            if(game[1] == 'X' && game[2] == 'X' && game[0] == ' ') return 0;
            if(game[4] == 'X' && game[5] == 'X' && game[3] == ' ') return 3;
            if(game[7] == 'X' && game[8] == 'X' && game[6] == ' ') return 6;

            if(game[0] == 'X' && game[3] == 'X' && game[6] == ' ') return 6;
            if(game[1] == 'X' && game[4] == 'X' && game[7] == ' ') return 7;
            if(game[2] == 'X' && game[5] == 'X' && game[8] == ' ') return 8;

            if(game[3] == 'X' && game[6] == 'X' && game[0] == ' ') return 0;
            if(game[4] == 'X' && game[7] == 'X' && game[1] == ' ') return 1;
            if(game[5] == 'X' && game[8] == 'X' && game[2] == ' ') return 2;

            if(game[0] == 'X' && game[4] == 'X' && game[8] == ' ') return 8;
            if(game[8] == 'X' && game[4] == 'X' && game[0] == ' ') return 0;
            if(game[6] == 'X' && game[4] == 'X' && game[2] == ' ') return 2;
            if(game[2] == 'X' && game[4] == 'X' && game[6] == ' ') return 6;
        } else {
            if(game[0] == 'O' && game[1] == 'O' && game[2] == ' ') return 2;
            if(game[3] == 'O' && game[4] == 'O' && game[5] == ' ') return 5;
            if(game[6] == 'O' && game[7] == 'O' && game[8] == ' ') return 8;

            if(game[1] == 'O' && game[2] == 'O' && game[0] == ' ') return 0;
            if(game[4] == 'O' && game[5] == 'O' && game[3] == ' ') return 3;
            if(game[7] == 'O' && game[8] == 'O' && game[6] == ' ') return 6;

            if(game[0] == 'O' && game[3] == 'O' && game[6] == ' ') return 6;
            if(game[1] == 'O' && game[4] == 'O' && game[7] == ' ') return 7;
            if(game[2] == 'O' && game[5] == 'O' && game[8] == ' ') return 8;

            if(game[3] == 'O' && game[6] == 'O' && game[0] == ' ') return 0;
            if(game[4] == 'O' && game[7] == 'O' && game[1] == ' ') return 1;
            if(game[5] == 'O' && game[8] == 'O' && game[2] == ' ') return 2;

            if(game[0] == 'O' && game[4] == 'O' && game[8] == ' ') return 8;
            if(game[8] == 'O' && game[4] == 'O' && game[0] == ' ') return 0;
            if(game[6] == 'O' && game[4] == 'O' && game[2] == ' ') return 2;
            if(game[2] == 'O' && game[4] == 'O' && game[6] == ' ') return 6;
        }
        return randomForEasyLevel(game);
    }

    public static void startMediumUser(char[] game, int xORO) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"medium\"");
                    game[mediumLevelSecond(game, xORO)] = 'X';
                    drawerField(game);
                } else {
                    String nums = "";
                    System.out.print("Enter the coordinates: ");
                    if(scanner.hasNextInt()) {
                        int num1 = scanner.nextInt();
                        int num2 = scanner.nextInt();
                        String num1str = Integer.toString(num1);
                        String num2str = Integer.toString(num2);
                        nums += num1str + num2str;
                    } else if(scanner.hasNextLine()) {
                        String fake = scanner.nextLine();
                        nums  += fake;
                    }
                    if(!Character.isDigit(nums.charAt(0))) {
                        System.out.println("You should enter numbers!");
                    } else if(nums.contains("4") ||
                            nums.contains("5") ||
                            nums.contains("6") ||
                            nums.contains("7") ||
                            nums.contains("8") ||
                            nums.contains("9") ) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else {
                        switch (nums) {
                            case "13":
                                if(game[0] == ' ') {
                                    game[0] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "23":
                                if(game[1] == ' ') {
                                    game[1] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "33":
                                if(game[2] == ' ') {
                                    game[2] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "12":
                                if(game[3] == ' ') {
                                    game[3] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "22":
                                if(game[4] == ' ') {
                                    game[4] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "32":
                                if(game[5] == ' ') {
                                    game[5] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "11":
                                if(game[6] == ' ') {
                                    game[6] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "21":
                                if(game[7] == ' ') {
                                    game[7] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "31":
                                if(game[8] == ' ') {
                                    game[8] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public static void startEasyUser(char[] game, int xORO) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"easy\"");
                    game[randomForEasyLevel(game)] = 'X';
                    drawerField(game);
                } else {
                    String nums = "";
                    System.out.print("Enter the coordinates: ");
                    if(scanner.hasNextInt()) {
                        int num1 = scanner.nextInt();
                        int num2 = scanner.nextInt();
                        String num1str = Integer.toString(num1);
                        String num2str = Integer.toString(num2);
                        nums += num1str + num2str;
                    } else if(scanner.hasNextLine()) {
                        String fake = scanner.nextLine();
                        nums  += fake;
                    }
                    if(!Character.isDigit(nums.charAt(0))) {
                        System.out.println("You should enter numbers!");
                    } else if(nums.contains("4") ||
                            nums.contains("5") ||
                            nums.contains("6") ||
                            nums.contains("7") ||
                            nums.contains("8") ||
                            nums.contains("9") ) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else {
                        switch (nums) {
                            case "13":
                                if(game[0] == ' ') {
                                    game[0] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "23":
                                if(game[1] == ' ') {
                                    game[1] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "33":
                                if(game[2] == ' ') {
                                    game[2] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "12":
                                if(game[3] == ' ') {
                                    game[3] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "22":
                                if(game[4] == ' ') {
                                    game[4] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "32":
                                if(game[5] == ' ') {
                                    game[5] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "11":
                                if(game[6] == ' ') {
                                    game[6] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "21":
                                if(game[7] == ' ') {
                                    game[7] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "31":
                                if(game[8] == ' ') {
                                    game[8] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public static void startEasyEasy(char[] game, int xORO) {
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"easy\"");
                    game[randomForEasyLevel(game)] = 'X';
                    drawerField(game);
                    xORO++;
                } else {
                    System.out.println("Making move level \"easy\"");
                    game[randomForEasyLevel(game)] = 'O';
                    drawerField(game);
                    xORO++;
                }
            }
        }
    }

    public static void startMediumEasy(char[] game, int xORO) {
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"medium\"");
                    game[mediumLevelFirst(game, xORO)] = 'X';
                    drawerField(game);
                    xORO++;
                } else {
                    System.out.println("Making move level \"easy\"");
                    game[randomForEasyLevel(game)] = 'O';
                    drawerField(game);
                    xORO++;
                }
            }
        }
    }

    public static void startEasyMedium(char[] game, int xORO) {
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"easy\"");
                    game[randomForEasyLevel(game)] = 'X';
                    drawerField(game);
                    xORO++;
                } else {
                    System.out.println("Making move level \"medium\"");
                    game[mediumLevelFirst(game, xORO)] = 'O';
                    drawerField(game);
                    xORO++;
                }
            }
        }
    }

    public static void startMediumMedium(char[] game, int xORO) {
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"medium\"");
                    game[mediumLevelFirst(game, xORO)] = 'X';
                    drawerField(game);
                    xORO++;
                } else {
                    System.out.println("Making move level \"medium\"");
                    game[mediumLevelFirst(game, xORO)] = 'O';
                    drawerField(game);
                    xORO++;
                }
            }
        }
    }

    public static void startUserUser(char[] game, int xORO) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char x : game) {
                    if(x != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                } else {
                    String nums = "";
                    System.out.print("Enter the coordinates: ");
                    if(scanner.hasNextInt()) {
                        int num1 = scanner.nextInt();
                        int num2 = scanner.nextInt();
                        String num1str = Integer.toString(num1);
                        String num2str = Integer.toString(num2);
                        nums += num1str + num2str;
                    } else if(scanner.hasNextLine()) {
                        String fake = scanner.nextLine();
                        nums  += fake;
                    }
                    if(!Character.isDigit(nums.charAt(0))) {
                        System.out.println("You should enter numbers!");
                    } else if(nums.contains("4") ||
                            nums.contains("5") ||
                            nums.contains("6") ||
                            nums.contains("7") ||
                            nums.contains("8") ||
                            nums.contains("9") ) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else {
                        switch (nums) {
                            case "13":
                                if(game[0] == ' ') {
                                    if(xORO % 2 != 0) game[0] = 'X';
                                    else game[0] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "23":
                                if(game[1] == ' ') {
                                    if(xORO % 2 != 0) game[1] = 'X';
                                    else game[1] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "33":
                                if(game[2] == ' ') {
                                    if(xORO % 2 != 0) game[2] = 'X';
                                    else game[2] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "12":
                                if(game[3] == ' ') {
                                    if(xORO % 2 != 0) game[3] = 'X';
                                    else game[3] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "22":
                                if(game[4] == ' ') {
                                    if(xORO % 2 != 0) game[4] = 'X';
                                    else game[4] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "32":
                                if(game[5] == ' ') {
                                    if(xORO % 2 != 0) game[5] = 'X';
                                    else game[5] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "11":
                                if(game[6] == ' ') {
                                    if(xORO % 2 != 0) game[6] = 'X';
                                    else game[6] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "21":
                                if(game[7] == ' ') {
                                    if(xORO % 2 != 0) game[7] = 'X';
                                    else game[7] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "31":
                                if(game[8] == ' ') {
                                    if(xORO % 2 != 0) game[8] = 'X';
                                    else game[8] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public static int bestMove(char[] game, int xORO) {
        int score;
        int bestScore = Integer.MIN_VALUE;
        int move = mediumLevelFirst(game, xORO);
        if(xORO % 2 == 0) {
            for (int i = 0; i < game.length; i++) {
                if(game[i] == ' ') {
                    game[i] = 'X';
                    score = minimax(game, 0, false);
                    game[i] = ' ';
                    if(score > bestScore) {
                        bestScore = score;
                        move = i;
                    }
                }
            }
        } else {
            for (int i = 0; i < game.length; i++) {
                if(game[i] == ' ') {
                    game[i] = 'O';
                    score = minimax(game, 0, false);
                    game[i] = ' ';
                    if(score > bestScore) {
                        bestScore = score;
                        move = i;
                    }
                }
            }
        }
        return move;
    }

    public static int minimax(char[] game, int depth, boolean isMaximizing) {
        char xOry;
        int score;
        int bestScore;
        int[] availableSpots = getAvailableSpotsInArray(game);
        if(isMaximizing) {
            xOry = 'X';
            bestScore = Integer.MIN_VALUE;
            for (int point : availableSpots) {
                game[point] = xOry;
                score = minimax(game, depth + 1, false);
                game[point] = ' ';
                bestScore = Math.max(score, bestScore);
            }
        } else {
            xOry = 'O';
            bestScore = Integer.MAX_VALUE;
            for (int point : availableSpots) {
                game[point] = xOry;
                score = minimax(game, depth + 1, true);
                game[point] = ' ';
                bestScore = Math.min(score, bestScore);
            }
        }
        return bestScore;
    }

    public static void startUserHard(char[] game, int xORO) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"hard\"");
                    game[bestMove(game, xORO)] = 'X';
                    drawerField(game);
                } else {
                    String nums = "";
                    System.out.print("Enter the coordinates: ");
                    if(scanner.hasNextInt()) {
                        int num1 = scanner.nextInt();
                        int num2 = scanner.nextInt();
                        String num1str = Integer.toString(num1);
                        String num2str = Integer.toString(num2);
                        nums += num1str + num2str;
                    } else if(scanner.hasNextLine()) {
                        String fake = scanner.nextLine();
                        nums  += fake;
                    }
                    if(!Character.isDigit(nums.charAt(0))) {
                        System.out.println("You should enter numbers!");
                    } else if(nums.contains("4") ||
                            nums.contains("5") ||
                            nums.contains("6") ||
                            nums.contains("7") ||
                            nums.contains("8") ||
                            nums.contains("9") ) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else {
                        switch (nums) {
                            case "13":
                                if(game[0] == ' ') {
                                    game[0] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "23":
                                if(game[1] == ' ') {
                                    game[1] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "33":
                                if(game[2] == ' ') {
                                    game[2] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "12":
                                if(game[3] == ' ') {
                                    game[3] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "22":
                                if(game[4] == ' ') {
                                    game[4] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "32":
                                if(game[5] == ' ') {
                                    game[5] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "11":
                                if(game[6] == ' ') {
                                    game[6] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "21":
                                if(game[7] == ' ') {
                                    game[7] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            case "31":
                                if(game[8] == ' ') {
                                    game[8] = 'O';
                                    drawerField(game);
                                    xORO++;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public static int[] getAvailableSpotsInArray(char[] game) {
        List<Integer> blank = new ArrayList<>();
        for (int i = 0; i < game.length; i++) {
            if(game[i] == ' ') {
                blank.add(i);
            }
        }
        int[] finalArray = new int[blank.size()];
        for (int i = 0; i < blank.size(); i++) {
            finalArray[i] = blank.get(i);
        }
        return finalArray;
    }

    public static void startHardHard(char[] game, int xORO) {
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"hard\"");
                    game[bestMove(game, xORO)] = 'X';
                    drawerField(game);
                    xORO++;
                } else {
                    System.out.println("Making move level \"hard\"");
                    game[bestMove(game, xORO)] = 'O';
                    drawerField(game);
                    xORO++;
                }
            }
        }
    }

    public static void startMediumHard(char[] game, int xORO) {
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"medium\"");
                    game[mediumLevelFirst(game, xORO)] = 'X';
                    drawerField(game);
                    xORO++;
                } else {
                    System.out.println("Making move level \"hard\"");
                    game[bestMove(game, xORO)] = 'O';
                    drawerField(game);
                    xORO++;
                }
            }
        }
    }

    public static void startEasyHard(char[] game, int xORO) {
        while(true) {
            if(game[0] == 'X' && game[1] == 'X' && game[2] == 'X' ||
                    game[3] == 'X' && game[4] == 'X' && game[5] == 'X' ||
                    game[6] == 'X' && game[7] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[3] == 'X' && game[6] == 'X' ||
                    game[1] == 'X' && game[4] == 'X' && game[7] == 'X' ||
                    game[2] == 'X' && game[5] == 'X' && game[8] == 'X' ||
                    game[0] == 'X' && game[4] == 'X' && game[8] == 'X' ||
                    game[2] == 'X' && game[4] == 'X' && game[6] == 'X') {
                System.out.println("X wins");
                break;
            } else if (game[0] == 'O' && game[1] == 'O' && game[2] == 'O' ||
                    game[3] == 'O' && game[4] == 'O' && game[5] == 'O' ||
                    game[6] == 'O' && game[7] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[3] == 'O' && game[6] == 'O' ||
                    game[1] == 'O' && game[4] == 'O' && game[7] == 'O' ||
                    game[2] == 'O' && game[5] == 'O' && game[8] == 'O' ||
                    game[0] == 'O' && game[4] == 'O' && game[8] == 'O' ||
                    game[2] == 'O' && game[4] == 'O' && game[6] == 'O') {
                System.out.println("O wins");
                break;
            } else {
                int cnt = 0;
                for(char element : game) {
                    if(element != ' ') cnt++;
                }
                if(cnt == 9) {
                    System.out.println("Draw");
                    break;
                }else if(xORO % 2  == 0) {
                    System.out.println("Making move level \"easy\"");
                    game[randomForEasyLevel(game)] = 'X';
                    drawerField(game);
                    xORO++;
                } else {
                    System.out.println("Making move level \"hard\"");
                    game[bestMove(game, xORO)] = 'O';
                    drawerField(game);
                    xORO++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xORO = 0;
        char[] game = new char[9];
        boolean trueOrFalse = true;
        Arrays.fill(game, ' ');

        while(trueOrFalse) {
            System.out.print("Input command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "exit":
                    trueOrFalse = false;
                    break;
                case "start easy user":
                    drawerField(game);
                    startEasyUser(game, xORO);
                    break;
                case "start user easy":
                    xORO = 1;
                    drawerField(game);
                    startEasyUser(game, xORO);
                    break;
                case "start easy easy":
                    drawerField(game);
                    startEasyEasy(game, xORO);
                    break;
                case "start user user":
                    drawerField(game);
                    startUserUser(game, xORO);
                    break;
                case "start user medium":
                    xORO = 1;
                    drawerField(game);
                    startMediumUser(game, xORO);
                    break;
                case "start medium user":
                    drawerField(game);
                    startMediumUser(game, xORO);
                    break;
                case "start medium medium":
                    drawerField(game);
                    startMediumMedium(game,xORO);
                    break;
                case "start medium easy":
                    drawerField(game);
                    startMediumEasy(game, xORO);
                    break;
                case "start easy medium":
                    drawerField(game);
                    startEasyMedium(game, xORO);
                    break;
                case "start user hard":
                    drawerField(game);
                    startUserHard(game, xORO);
                    break;
                case "start hard user":
                    xORO = 1;
                    drawerField(game);
                    startUserHard(game, xORO);
                    break;
                case "start hard hard":
                    drawerField(game);
                    startHardHard(game, xORO);
                    break;
                case "start medium hard":
                    drawerField(game);
                    startMediumHard(game, xORO);
                    break;
                case "start hard medium":
                    xORO = 1;
                    drawerField(game);
                    startMediumHard(game, xORO);
                    break;
                case "start easy hard":
                    drawerField(game);
                    startEasyHard(game, xORO);
                    break;
                case "start hard easy":
                    xORO = 1;
                    drawerField(game);
                    startEasyHard(game, xORO);
                    break;
                default:
                    System.out.println("Bad parameters!");
                    break;
            }
        }
    }
}
