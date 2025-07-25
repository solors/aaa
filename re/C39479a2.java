package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.a2 */
/* loaded from: classes8.dex */
public final class C39479a2 extends AbstractC39539r1<short[]> {
    @NotNull

    /* renamed from: a */
    private short[] f103805a;

    /* renamed from: b */
    private int f103806b;

    public C39479a2(@NotNull short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103805a = bufferWithData;
        this.f103806b = bufferWithData.length;
        mo12305b(10);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        short[] sArr = this.f103805a;
        if (sArr.length < i) {
            m16917e = _Ranges.m16917e(i, sArr.length * 2);
            short[] copyOf = Arrays.copyOf(sArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103805a = copyOf;
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103806b;
    }

    /* renamed from: e */
    public final void m12512e(short s) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        short[] sArr = this.f103805a;
        int mo12304d = mo12304d();
        this.f103806b = mo12304d + 1;
        sArr[mo12304d] = s;
    }

    @Override // re.AbstractC39539r1
    @NotNull
    /* renamed from: f */
    public short[] mo12306a() {
        short[] copyOf = Arrays.copyOf(this.f103805a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
