import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxnumber = 13;
        String start = "ゲームを始めますか？";
        String stop = "ゲームを終了";
        System.out.print(start);
        // ユーザーがゲームを始めるか否かの入力欄
        String input_text = scanner.nextLine();

        // ゲームスタートor終了
        if (input_text.equals("")) {
            System.out.println("1から" + maxnumber + "のうちどれかを選んでください。");
            gamelogic game = new gamelogic();
            game.game();

        } else {
            System.out.print(stop);
            System.exit(0);
        }

    }

    static class gamelogic {
        public void game() {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            // ユーザーが入力した数字 13が上限
            int num = scanner.nextInt();
            // ランダムカード生成
            int card = random.nextInt(12) + 1;

            // カード処理
            if (card < num) {
                System.out.println("あなたの勝ち相手は" + card);
            } else {
                System.out.println("あなたの負け相手は" + card);
            }
        }
    }
}