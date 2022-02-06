import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args){
        /*String[] array = { "Aaa" , "Bbbbb" , "Cc" };
        System.out.println(Arrays.stream(array)
                .collect(Collectors.averagingInt(s -> s.length())));
*/

        String[] array = { "Aaa" , "Bbbbb" , "Cc" , "Aa" };
        System.out.println(Arrays.stream(array)
                .filter(str -> str.startsWith( "A" ))
                .collect(Collectors.joining( " и " , "Перечисленные слова [" , "] начинаются на букву A" )));


        Stream<Integer> stream = Stream.of( 1 , 2 , 3 , 24 , 5 , 6 );
        stream.reduce((i1, i2) -> i1 > i2 ? i1 : i2)
                .ifPresent(System.out::println);

    }

}
