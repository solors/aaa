package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.m0 */
/* loaded from: classes8.dex */
public final class C39520m0 extends AbstractC39539r1<int[]> {
    @NotNull

    /* renamed from: a */
    private int[] f103880a;

    /* renamed from: b */
    private int f103881b;

    public C39520m0(@NotNull int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103880a = bufferWithData;
        this.f103881b = bufferWithData.length;
        mo12305b(10);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        int[] iArr = this.f103880a;
        if (iArr.length < i) {
            m16917e = _Ranges.m16917e(i, iArr.length * 2);
            int[] copyOf = Arrays.copyOf(iArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103880a = copyOf;
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103881b;
    }

    /* renamed from: e */
    public final void m12383e(int i) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        int[] iArr = this.f103880a;
        int mo12304d = mo12304d();
        this.f103881b = mo12304d + 1;
        iArr[mo12304d] = i;
    }

    @Override // re.AbstractC39539r1
    @NotNull
    /* renamed from: f */
    public int[] mo12306a() {
        int[] copyOf = Arrays.copyOf(this.f103880a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
