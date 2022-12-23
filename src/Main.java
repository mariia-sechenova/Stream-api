import java.util.Arrays;

class Answer {

    public static void main(String[] args) {
        String[] words = {"ball", "pineapple", "mermaid", "job", "jelly"};
        Arrays.stream(words)


                .filter(str -> str.length() > 5)

                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase())

                .forEach(System.out::println);

    }

}