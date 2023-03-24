package Leksii.L5.Ex001Calc;

public class SubModel extends CalcModel {
    private String title;
    public SubModel (String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int result() {
        return x - y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;

    }
}
