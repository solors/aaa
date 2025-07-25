package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.n */
/* loaded from: classes8.dex */
public final class C39523n extends AbstractC39539r1<char[]> {
    @NotNull

    /* renamed from: a */
    private char[] f103884a;

    /* renamed from: b */
    private int f103885b;

    public C39523n(@NotNull char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103884a = bufferWithData;
        this.f103885b = bufferWithData.length;
        mo12305b(10);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        char[] cArr = this.f103884a;
        if (cArr.length < i) {
            m16917e = _Ranges.m16917e(i, cArr.length * 2);
            char[] copyOf = Arrays.copyOf(cArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103884a = copyOf;
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103885b;
    }

    /* renamed from: e */
    public final void m12366e(char c) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        char[] cArr = this.f103884a;
        int mo12304d = mo12304d();
        this.f103885b = mo12304d + 1;
        cArr[mo12304d] = c;
    }

    @Override // re.AbstractC39539r1
    @NotNull
    /* renamed from: f */
    public char[] mo12306a() {
        char[] copyOf = Arrays.copyOf(this.f103884a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
