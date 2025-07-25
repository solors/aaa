package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.i */
/* loaded from: classes8.dex */
public final class C39503i extends AbstractC39539r1<byte[]> {
    @NotNull

    /* renamed from: a */
    private byte[] f103853a;

    /* renamed from: b */
    private int f103854b;

    public C39503i(@NotNull byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103853a = bufferWithData;
        this.f103854b = bufferWithData.length;
        mo12305b(10);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        byte[] bArr = this.f103853a;
        if (bArr.length < i) {
            m16917e = _Ranges.m16917e(i, bArr.length * 2);
            byte[] copyOf = Arrays.copyOf(bArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103853a = copyOf;
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103854b;
    }

    /* renamed from: e */
    public final void m12412e(byte b) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        byte[] bArr = this.f103853a;
        int mo12304d = mo12304d();
        this.f103854b = mo12304d + 1;
        bArr[mo12304d] = b;
    }

    @Override // re.AbstractC39539r1
    @NotNull
    /* renamed from: f */
    public byte[] mo12306a() {
        byte[] copyOf = Arrays.copyOf(this.f103853a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
