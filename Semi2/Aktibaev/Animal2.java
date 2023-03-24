package Semi2.Aktibaev;

public abstract class Animal2 implements Speakable {
   private Writable writable;

    public void setWritable(Writable writable) {
        this.writable = writable;
    }

    public abstract void Speak();

    public void save() {
        writable.save(this);
    }

    public void reAni(){}
}
