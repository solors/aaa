package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.UShortArray;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.n2 */
/* loaded from: classes8.dex */
public final class C39526n2 extends AbstractC39539r1<UShortArray> {
    @NotNull

    /* renamed from: a */
    private short[] f103889a;

    /* renamed from: b */
    private int f103890b;

    public /* synthetic */ C39526n2(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ UShortArray mo12306a() {
        return UShortArray.m14583a(m12355f());
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        if (UShortArray.m14574m(this.f103889a) < i) {
            short[] sArr = this.f103889a;
            m16917e = _Ranges.m16917e(i, UShortArray.m14574m(sArr) * 2);
            short[] copyOf = Arrays.copyOf(sArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103889a = UShortArray.m14581d(copyOf);
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103890b;
    }

    /* renamed from: e */
    public final void m12356e(short s) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        short[] sArr = this.f103889a;
        int mo12304d = mo12304d();
        this.f103890b = mo12304d + 1;
        UShortArray.m14570q(sArr, mo12304d, s);
    }

    @NotNull
    /* renamed from: f */
    public short[] m12355f() {
        short[] copyOf = Arrays.copyOf(this.f103889a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UShortArray.m14581d(copyOf);
    }

    private C39526n2(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103889a = bufferWithData;
        this.f103890b = UShortArray.m14574m(bufferWithData);
        mo12305b(10);
    }
}
