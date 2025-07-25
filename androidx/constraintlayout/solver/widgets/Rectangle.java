package androidx.constraintlayout.solver.widgets;

/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f543x;

    /* renamed from: y */
    public int f544y;

    public boolean contains(int i, int i2) {
        int i3;
        int i4 = this.f543x;
        if (i >= i4 && i < i4 + this.width && i2 >= (i3 = this.f544y) && i2 < i3 + this.height) {
            return true;
        }
        return false;
    }

    public int getCenterX() {
        return (this.f543x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f544y + this.height) / 2;
    }

    void grow(int i, int i2) {
        this.f543x -= i;
        this.f544y -= i2;
        this.width += i * 2;
        this.height += i2 * 2;
    }

    boolean intersects(Rectangle rectangle) {
        int i;
        int i2;
        int i3 = this.f543x;
        int i4 = rectangle.f543x;
        if (i3 >= i4 && i3 < i4 + rectangle.width && (i = this.f544y) >= (i2 = rectangle.f544y) && i < i2 + rectangle.height) {
            return true;
        }
        return false;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f543x = i;
        this.f544y = i2;
        this.width = i3;
        this.height = i4;
    }
}
