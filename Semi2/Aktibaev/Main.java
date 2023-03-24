package Semi2.Aktibaev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        Leo leo = new Leo();
        Radio rai = new Radio();
        cat.setWritable(new FileHandler());
        cat.save();
        List<Speakable> ani = new ArrayList<>(Arrays.asList(cat, leo, rai));
        SpeakAll(ani);

        Animal2 aniCat = new Cat2();
        Cat2 cat2 = new Cat2();
        cat2.reCat();
        aniCat.reAni();

    }

    public static void SpeakAll(List<Speakable> ani) {
        for (Speakable el : ani) {
                el.Speak();
        }
    }
}
