package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.w0 */
/* loaded from: classes8.dex */
public final class C39553w0 extends AbstractC39539r1<long[]> {
    @NotNull

    /* renamed from: a */
    private long[] f103923a;

    /* renamed from: b */
    private int f103924b;

    public C39553w0(@NotNull long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103923a = bufferWithData;
        this.f103924b = bufferWithData.length;
        mo12305b(10);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        long[] jArr = this.f103923a;
        if (jArr.length < i) {
            m16917e = _Ranges.m16917e(i, jArr.length * 2);
            long[] copyOf = Arrays.copyOf(jArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103923a = copyOf;
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103924b;
    }

    /* renamed from: e */
    public final void m12303e(long j) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        long[] jArr = this.f103923a;
        int mo12304d = mo12304d();
        this.f103924b = mo12304d + 1;
        jArr[mo12304d] = j;
    }

    @Override // re.AbstractC39539r1
    @NotNull
    /* renamed from: f */
    public long[] mo12306a() {
        long[] copyOf = Arrays.copyOf(this.f103923a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
