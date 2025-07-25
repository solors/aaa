package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.g */
/* loaded from: classes8.dex */
public final class C39497g extends AbstractC39539r1<boolean[]> {
    @NotNull

    /* renamed from: a */
    private boolean[] f103841a;

    /* renamed from: b */
    private int f103842b;

    public C39497g(@NotNull boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103841a = bufferWithData;
        this.f103842b = bufferWithData.length;
        mo12305b(10);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        boolean[] zArr = this.f103841a;
        if (zArr.length < i) {
            m16917e = _Ranges.m16917e(i, zArr.length * 2);
            boolean[] copyOf = Arrays.copyOf(zArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103841a = copyOf;
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103842b;
    }

    /* renamed from: e */
    public final void m12428e(boolean z) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        boolean[] zArr = this.f103841a;
        int mo12304d = mo12304d();
        this.f103842b = mo12304d + 1;
        zArr[mo12304d] = z;
    }

    @Override // re.AbstractC39539r1
    @NotNull
    /* renamed from: f */
    public boolean[] mo12306a() {
        boolean[] copyOf = Arrays.copyOf(this.f103841a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
