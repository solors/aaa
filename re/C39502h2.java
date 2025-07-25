package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.UByteArray;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.h2 */
/* loaded from: classes8.dex */
public final class C39502h2 extends AbstractC39539r1<UByteArray> {
    @NotNull

    /* renamed from: a */
    private byte[] f103851a;

    /* renamed from: b */
    private int f103852b;

    public /* synthetic */ C39502h2(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ UByteArray mo12306a() {
        return UByteArray.m14525a(m12413f());
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        if (UByteArray.m14516m(this.f103851a) < i) {
            byte[] bArr = this.f103851a;
            m16917e = _Ranges.m16917e(i, UByteArray.m14516m(bArr) * 2);
            byte[] copyOf = Arrays.copyOf(bArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103851a = UByteArray.m14523d(copyOf);
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103852b;
    }

    /* renamed from: e */
    public final void m12414e(byte b) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        byte[] bArr = this.f103851a;
        int mo12304d = mo12304d();
        this.f103852b = mo12304d + 1;
        UByteArray.m14512q(bArr, mo12304d, b);
    }

    @NotNull
    /* renamed from: f */
    public byte[] m12413f() {
        byte[] copyOf = Arrays.copyOf(this.f103851a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UByteArray.m14523d(copyOf);
    }

    private C39502h2(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103851a = bufferWithData;
        this.f103852b = UByteArray.m14516m(bufferWithData);
        mo12305b(10);
    }
}
