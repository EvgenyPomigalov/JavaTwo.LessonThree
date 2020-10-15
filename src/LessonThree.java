import java.util.*;

public class LessonThree {
    private static final String TEXT =  "Проказница Мартышка, " +
            "Осел, " +
            "Козел " +
            "Да косолапый Мишка " +
            "Затеяли сыграть Квартет. " +
            "Достали нот, баса, альта, две скрипки " +
            "И сели на лужок под липки, — " +
            "Пленять своим искусством свет. " +
            "Ударили в смычки, дерут, а толку нет. " +
            "«Стой, братцы, стой! — кричит Мартышка. — Погодите! " +
            "Как музыке идти? Ведь вы не так сидите. " +
            "Ты с басом, Мишенька, садись против альта, " +
            "Я, прима, сяду против вторы; " +
            "Тогда пойдет уж музыка не та: " +
            "У нас запляшут лес и горы!» " +
            "Расселись, начали Квартет; " +
            "Он все-таки на лад нейдет. " +
            "«Постойте ж, я сыскал секрет! — " +
            "Кричит Осел, — мы, верно, уж поладим, " +
            "Коль рядом сядем». " +
            "Послушались Осла: уселись чинно в ряд; " +
            "А все-таки Квартет нейдет на лад. ";
    public static void main(String[] args){
        //Все слова в массиве
        ArrayList <String> arrL = new ArrayList<String>(Arrays.asList(TEXT.toLowerCase().split("([\\w\\d\\,\\.\\!\\;\\?\\:\\—\\»\\«]*\\s+)")));
        System.out.println(arrL);
        //Все слова по одному разу
        HashSet unicWords = new HashSet(Arrays.asList(TEXT.toLowerCase().split("([\\w\\d\\,\\.\\!\\;\\?\\:\\—\\»\\«]*\\s+)")));
        System.out.println(unicWords);
        //Количество каждого из слов
        HashMap<String, Integer> numberAppear = new HashMap<>();
       for (int i = 0 ; i < arrL.size(); i++) {
           if (numberAppear.containsKey(arrL.get(i))) {
               numberAppear.put(arrL.get(i),numberAppear.get(arrL.get(i)) + 1);
           }
           else {
               numberAppear.put(arrL.get(i), 1);
           }
       }
        System.out.println(numberAppear);
        Person a = new Person("sfafsd","135433121", "asdfasdf");
        a.addPhone("25345355");
        System.out.println(a.name + a.getPhone() + a.email);

    }


}
