package p707i0;

/* renamed from: i0.d */
/* loaded from: classes2.dex */
public class ScaleXY {

    /* renamed from: a */
    private float f91856a;

    /* renamed from: b */
    private float f91857b;

    public ScaleXY(float f, float f2) {
        this.f91856a = f;
        this.f91857b = f2;
    }

    /* renamed from: a */
    public boolean m23244a(float f, float f2) {
        if (this.f91856a == f && this.f91857b == f2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public float m23243b() {
        return this.f91856a;
    }

    /* renamed from: c */
    public float m23242c() {
        return this.f91857b;
    }

    /* renamed from: d */
    public void m23241d(float f, float f2) {
        this.f91856a = f;
        this.f91857b = f2;
    }

    public String toString() {
        return m23243b() + "x" + m23242c();
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }
}
