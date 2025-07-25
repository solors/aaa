package p705hf;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Settings.kt */
@Metadata
/* renamed from: hf.m */
/* loaded from: classes10.dex */
public final class C33576m {
    @NotNull

    /* renamed from: c */
    public static final C33577a f91771c = new C33577a(null);

    /* renamed from: a */
    private int f91772a;
    @NotNull

    /* renamed from: b */
    private final int[] f91773b = new int[10];

    /* compiled from: Settings.kt */
    @Metadata
    /* renamed from: hf.m$a */
    /* loaded from: classes10.dex */
    public static final class C33577a {
        private C33577a() {
        }

        public /* synthetic */ C33577a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int m23333a(int i) {
        return this.f91773b[i];
    }

    /* renamed from: b */
    public final int m23332b() {
        if ((this.f91772a & 2) != 0) {
            return this.f91773b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m23331c() {
        if ((this.f91772a & 128) != 0) {
            return this.f91773b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m23330d() {
        if ((this.f91772a & 16) != 0) {
            return this.f91773b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int m23329e(int i) {
        if ((this.f91772a & 32) != 0) {
            return this.f91773b[5];
        }
        return i;
    }

    /* renamed from: f */
    public final boolean m23328f(int i) {
        if (((1 << i) & this.f91772a) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m23327g(@NotNull C33576m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            if (other.m23328f(i)) {
                m23326h(i, other.m23333a(i));
            }
            i = i2;
        }
    }

    @NotNull
    /* renamed from: h */
    public final C33576m m23326h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f91773b;
            if (i < iArr.length) {
                this.f91772a = (1 << i) | this.f91772a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m23325i() {
        return Integer.bitCount(this.f91772a);
    }
}
