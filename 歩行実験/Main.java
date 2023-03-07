//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int mapHeight = sc.nextInt();
        int mapWidth = sc.nextInt();
        int commandLength = sc.nextInt();
        String command = sc.next();
        
        char[][] map = new char[mapHeight][mapWidth];
        // 0番目がheight, 1番目がwidth
        int[] start = new int[2];
        int[] robot = new int[2];
        String mapLine;
        char mapPoint;
        
        for (int i = 0; i < mapHeight; i++) {
            mapLine = sc.next();
            for (int j = 0; j < mapWidth; j++) {
                mapPoint = mapLine.charAt(j);
                map[i][j] = mapPoint;
                if (map[i][j] == 's') {
                    start[0] = i;
                    start[1] = j;
                    robot[0] = i;
                    robot[1] = j;
                }
            }
        }
        
        char commandIdx;
        boolean skip = false;
        String out = "";
        
        for (int i = 0; i < commandLength; i++) {
            
            commandIdx = command.charAt(i);
            
            try {
                if (commandIdx != '!' && command.charAt(i - 1) == '!' && command.charAt(i + 1) == '!' && skip == true) {
                    continue;
                } else if (commandIdx != '!' && command.charAt(i + 1) != '!') {
                    skip = false;
                }
            } catch (Exception e) {
                // ignore
            }
            
            if (commandIdx == '!' && skip) {
                skip = false;
                continue;
            }
            
            // 後で消す
//            if (map[robot[0]][robot[1]] != 's') {
//                map[robot[0]][robot[1]] = '.';
//            }
            
            if (commandIdx == '!' && skip == false) {
                commandIdx = command.charAt(i - 1);
                skip = true;
            }
            
            try {
                
                move(commandIdx, robot, map);
                
                // 後で消す
//                printBoard(mapHeight, mapWidth, map);
                
            } catch (ArrayIndexOutOfBoundsException e) {
                out = "mistake";
                break;
            }
            
            if (map[robot[0]][robot[1]] == 's') {
                    out = "here";
            } else {
                out = getDistance(start, robot);
            }
            
        }
        
        System.out.println(out);
        
    }
    
    static String getDistance(int[] start, int[] robot) {
        
        int[] distance = new int[2];
        String output;
        
        distance[0] = start[1] - robot[1];
        distance[1] = start[0] - robot[0];
        
        if (distance[0] == 0) {
            output = "I";
        } else if (distance[0] < 0) {
            output = "E" + Math.abs(distance[0]);
        } else {
            output = "W" + distance[0];
        }
        
        if (distance[1] == 0) {
            output += "I";
        } else if (distance[1] < 0) {
            output += "S" + Math.abs(distance[1]);
        } else {
            output += "N" + distance[1];
        }
        
        return output;
        
    }
    
    static void move(char commandIdx, int[] robot, char[][] map) {
        
        switch (commandIdx) {
            case 'N':
                robot[0] -= 1;
                break;
            case 'E':
                robot[1] +=1;
                break;
            case 'S':
                robot[0] += 1;
                break;
            case 'W':
                robot[1] -=1;
                break;
        }

        if (map[robot[0]][robot[1]] != 's') {
            map[robot[0]][robot[1]] = 'r';
        }
        
    }
    
//    static void printBoard(int mapHeight, int mapWidth, char[][] map) {
//        
//        for (int i = 0; i < mapHeight; i++) {
//            for (int j = 0; j < mapWidth; j++) {
//                System.out.print(map[i][j]);
//            }
//            System.out.println("");
//        }
//        
//    }
    
}