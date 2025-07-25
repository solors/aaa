package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.ULongArray;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.l2 */
/* loaded from: classes8.dex */
public final class C39518l2 extends AbstractC39539r1<ULongArray> {
    @NotNull

    /* renamed from: a */
    private long[] f103877a;

    /* renamed from: b */
    private int f103878b;

    public /* synthetic */ C39518l2(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ ULongArray mo12306a() {
        return ULongArray.m14610a(m12386f());
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        if (ULongArray.m14601m(this.f103877a) < i) {
            long[] jArr = this.f103877a;
            m16917e = _Ranges.m16917e(i, ULongArray.m14601m(jArr) * 2);
            long[] copyOf = Arrays.copyOf(jArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103877a = ULongArray.m14608d(copyOf);
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103878b;
    }

    /* renamed from: e */
    public final void m12387e(long j) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        long[] jArr = this.f103877a;
        int mo12304d = mo12304d();
        this.f103878b = mo12304d + 1;
        ULongArray.m14597q(jArr, mo12304d, j);
    }

    @NotNull
    /* renamed from: f */
    public long[] m12386f() {
        long[] copyOf = Arrays.copyOf(this.f103877a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return ULongArray.m14608d(copyOf);
    }

    private C39518l2(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103877a = bufferWithData;
        this.f103878b = ULongArray.m14601m(bufferWithData);
        mo12305b(10);
    }
}
