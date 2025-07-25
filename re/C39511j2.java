package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.UIntArray;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.j2 */
/* loaded from: classes8.dex */
public final class C39511j2 extends AbstractC39539r1<UIntArray> {
    @NotNull

    /* renamed from: a */
    private int[] f103869a;

    /* renamed from: b */
    private int f103870b;

    public /* synthetic */ C39511j2(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ UIntArray mo12306a() {
        return UIntArray.m14502a(m12392f());
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        if (UIntArray.m14493m(this.f103869a) < i) {
            int[] iArr = this.f103869a;
            m16917e = _Ranges.m16917e(i, UIntArray.m14493m(iArr) * 2);
            int[] copyOf = Arrays.copyOf(iArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103869a = UIntArray.m14500d(copyOf);
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103870b;
    }

    /* renamed from: e */
    public final void m12393e(int i) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        int[] iArr = this.f103869a;
        int mo12304d = mo12304d();
        this.f103870b = mo12304d + 1;
        UIntArray.m14489q(iArr, mo12304d, i);
    }

    @NotNull
    /* renamed from: f */
    public int[] m12392f() {
        int[] copyOf = Arrays.copyOf(this.f103869a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UIntArray.m14500d(copyOf);
    }

    private C39511j2(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103869a = bufferWithData;
        this.f103870b = UIntArray.m14493m(bufferWithData);
        mo12305b(10);
    }
}
