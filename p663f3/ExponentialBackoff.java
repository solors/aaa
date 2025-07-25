package p663f3;

/* renamed from: f3.b */
/* loaded from: classes5.dex */
public class ExponentialBackoff {

    /* renamed from: a */
    private int f90293a;

    /* renamed from: b */
    private int f90294b;

    /* renamed from: c */
    private int f90295c;

    public ExponentialBackoff(int i, int i2) {
        this.f90293a = i;
        this.f90294b = i2;
        this.f90295c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m24955a(int i) {
        if (i == 0) {
            return this.f90295c;
        }
        if ((i >= 200 && i < 400) || i >= 500) {
            int i2 = this.f90295c;
            int i3 = i2 * 2;
            int i4 = this.f90294b;
            if (i3 <= i4) {
                i4 = i2 * 2;
            }
            this.f90295c = i4;
        } else {
            this.f90295c = -1;
        }
        return this.f90295c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m24954b(int i, int i2) {
        if (this.f90293a == i && this.f90294b == i2) {
            return;
        }
        this.f90293a = i;
        this.f90294b = i2;
        this.f90295c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m24953c() {
        this.f90295c = this.f90293a;
    }
}
