package p690h0;

/* renamed from: h0.h */
/* loaded from: classes2.dex */
public class MeanCalculator {

    /* renamed from: a */
    private float f91297a;

    /* renamed from: b */
    private int f91298b;

    /* renamed from: a */
    public void m23876a(float f) {
        float f2 = this.f91297a + f;
        this.f91297a = f2;
        int i = this.f91298b + 1;
        this.f91298b = i;
        if (i == Integer.MAX_VALUE) {
            this.f91297a = f2 / 2.0f;
            this.f91298b = i / 2;
        }
    }
}
