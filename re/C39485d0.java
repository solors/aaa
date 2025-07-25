package re;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata
/* renamed from: re.d0 */
/* loaded from: classes8.dex */
public final class C39485d0 extends AbstractC39539r1<float[]> {
    @NotNull

    /* renamed from: a */
    private float[] f103817a;

    /* renamed from: b */
    private int f103818b;

    public C39485d0(@NotNull float[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f103817a = bufferWithData;
        this.f103818b = bufferWithData.length;
        mo12305b(10);
    }

    @Override // re.AbstractC39539r1
    /* renamed from: b */
    public void mo12305b(int i) {
        int m16917e;
        float[] fArr = this.f103817a;
        if (fArr.length < i) {
            m16917e = _Ranges.m16917e(i, fArr.length * 2);
            float[] copyOf = Arrays.copyOf(fArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f103817a = copyOf;
        }
    }

    @Override // re.AbstractC39539r1
    /* renamed from: d */
    public int mo12304d() {
        return this.f103818b;
    }

    /* renamed from: e */
    public final void m12489e(float f) {
        AbstractC39539r1.m12341c(this, 0, 1, null);
        float[] fArr = this.f103817a;
        int mo12304d = mo12304d();
        this.f103818b = mo12304d + 1;
        fArr[mo12304d] = f;
    }

    @Override // re.AbstractC39539r1
    @NotNull
    /* renamed from: f */
    public float[] mo12306a() {
        float[] copyOf = Arrays.copyOf(this.f103817a, mo12304d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
