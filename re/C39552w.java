package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.w */
/* loaded from: classes8.dex */
public final class C39552w extends AbstractC39539r1<double[]> {
    @NotNull

    /* renamed from: a */
    private double[] f103921a;

    /* renamed from: b */
    private int f103922b;

    public C39552w(@NotNull double[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103921a = bufferWithData;
        this.f103922b = bufferWithData.length;
        mo12305b(10);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        double[] dArr = this.f103921a;
        if (dArr.length < i) {
            m16917e = _Ranges.m16917e(i, dArr.length * 2);
            double[] copyOf = Arrays.copyOf(dArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103921a = copyOf;
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103922b;
    }

    /* renamed from: e */
    public final void m12308e(double d) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        double[] dArr = this.f103921a;
        int mo12304d = mo12304d();
        this.f103922b = mo12304d + 1;
        dArr[mo12304d] = d;
    }

    @Override // re.AbstractC39539r1
    @NotNull
    /* renamed from: f */
    public double[] mo12306a() {
        double[] copyOf = Arrays.copyOf(this.f103921a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
