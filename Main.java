
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Папка Games уже создана в проекте. Все данные будут записаны по относительному пути в эту папку.
        StringBuilder sb = new StringBuilder();
        List<String> listDir = Arrays.asList("src","res","savegames","temp","src/main", "src/test",
                "res/drawables", "res/vectors", "res/icons");
        List<String> listFiles = Arrays.asList("src/main/Main.java", "src/main/Utils.java",
                "temp/temp.txt");

        sb.append("Установка игры :");

        for (String elem:listDir) {
            File dir = new File("./Games/" + elem);
            if (dir.mkdir()){
                sb.append("Добавлен каталог " + "./Games/" + elem + "\n");
            }
            else {
                sb.append("Папка " + "./Games/" + elem + " не создана!" + "\n");
            }
        }

        for (String elem:listFiles) {
            File file = new File("./Games/" + elem);
            try {
                if (file.createNewFile()){
                    sb.append("Добавлен каталог " + "./Games/" + elem + "\n");
                }
                else {
                    sb.append("Папка " + "./Games/" + elem + " не создана!" + "\n");
                }
            }
            catch (IOException ex) {
                sb.append("При создании файла " + "./Games/" + elem + " произошла критическая ошибка!\n"
                        + ex.getMessage() + "\n");
            }
        }

        System.out.println(sb);

    }
}
