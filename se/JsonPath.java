package se;

import com.ironsource.C21114v8;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p851qe.AbstractC39411i;

@Metadata
/* renamed from: se.m0 */
/* loaded from: classes8.dex */
public final class JsonPath {
    @NotNull

    /* renamed from: a */
    private Object[] f111863a = new Object[8];
    @NotNull

    /* renamed from: b */
    private int[] f111864b;

    /* renamed from: c */
    private int f111865c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JsonPath.kt */
    @Metadata
    /* renamed from: se.m0$a */
    /* loaded from: classes8.dex */
    public static final class C42716a {
        @NotNull

        /* renamed from: a */
        public static final C42716a f111866a = new C42716a();

        private C42716a() {
        }
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f111864b = iArr;
        this.f111865c = -1;
    }

    /* renamed from: e */
    private final void m6723e() {
        int i = this.f111865c * 2;
        Object[] copyOf = Arrays.copyOf(this.f111863a, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        this.f111863a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f111864b, i);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        this.f111864b = copyOf2;
    }

    @NotNull
    /* renamed from: a */
    public final String m6727a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i = this.f111865c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f111863a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.m17075f(serialDescriptor.getKind(), AbstractC39411i.C39413b.f103626a)) {
                    if (this.f111864b[i2] != -1) {
                        sb2.append(C21114v8.C21123i.f54137d);
                        sb2.append(this.f111864b[i2]);
                        sb2.append(C21114v8.C21123i.f54139e);
                    }
                } else {
                    int i3 = this.f111864b[i2];
                    if (i3 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.mo12261f(i3));
                    }
                }
            } else if (obj != C42716a.f111866a) {
                sb2.append(C21114v8.C21123i.f54137d);
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append(C21114v8.C21123i.f54139e);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: b */
    public final void m6726b() {
        int i = this.f111865c;
        int[] iArr = this.f111864b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.f111865c = i - 1;
        }
        int i2 = this.f111865c;
        if (i2 != -1) {
            this.f111865c = i2 - 1;
        }
    }

    /* renamed from: c */
    public final void m6725c(@NotNull SerialDescriptor sd2) {
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i = this.f111865c + 1;
        this.f111865c = i;
        if (i == this.f111863a.length) {
            m6723e();
        }
        this.f111863a[i] = sd2;
    }

    /* renamed from: d */
    public final void m6724d() {
        int[] iArr = this.f111864b;
        int i = this.f111865c;
        if (iArr[i] == -2) {
            this.f111863a[i] = C42716a.f111866a;
        }
    }

    /* renamed from: f */
    public final void m6722f(@Nullable Object obj) {
        int[] iArr = this.f111864b;
        int i = this.f111865c;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.f111865c = i2;
            if (i2 == this.f111863a.length) {
                m6723e();
            }
        }
        Object[] objArr = this.f111863a;
        int i3 = this.f111865c;
        objArr[i3] = obj;
        this.f111864b[i3] = -2;
    }

    /* renamed from: g */
    public final void m6721g(int i) {
        this.f111864b[this.f111865c] = i;
    }

    @NotNull
    public String toString() {
        return m6727a();
    }
}
