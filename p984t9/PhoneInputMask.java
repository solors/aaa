package p984t9;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p984t9.BaseInputMask;
import p984t9.TextDiff;

@Metadata
/* renamed from: t9.d */
/* loaded from: classes8.dex */
public final class PhoneInputMask extends BaseInputMask {
    @NotNull

    /* renamed from: e */
    private final Function1<Exception, Unit> f116527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneInputMask(@NotNull Function1<? super Exception, Unit> onError) {
        super(C44393e.m3176b());
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f116527e = onError;
    }

    /* renamed from: A */
    private final void m3184A(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < m3216m().size() && i3 < i) {
            int i4 = i2 + 1;
            if (m3216m().get(i2) instanceof BaseInputMask.AbstractC44387a.C44388a) {
                i3++;
            }
            i2 = i4;
        }
        m3208w(m3218k(i2));
    }

    /* renamed from: B */
    private final String m3183B(String str) {
        String m3175c = C44393e.m3175c(str);
        if (Intrinsics.m17075f(m3175c, m3214o().m3197c())) {
            return null;
        }
        return m3175c;
    }

    /* renamed from: C */
    private final Unit m3182C(String str) {
        String m3183B = m3183B(str);
        if (m3183B != null) {
            m3181D(m3183B);
            return Unit.f99208a;
        }
        return null;
    }

    /* renamed from: D */
    private final void m3181D(String str) {
        m3206y(new BaseInputMask.C44390b(str, C44393e.m3177a(), m3214o().m3199a()), false);
    }

    @Override // p984t9.BaseInputMask
    /* renamed from: a */
    public void mo3180a(@NotNull String newValue, @Nullable Integer num) {
        int m16917e;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        TextDiff.C44394a c44394a = TextDiff.f116530d;
        TextDiff m3171a = c44394a.m3171a(m3212q(), newValue);
        if (num != null) {
            m16917e = _Ranges.m16917e(num.intValue() - m3171a.m3174a(), 0);
            m3171a = new TextDiff(m16917e, m3171a.m3174a(), m3171a.m3173b());
        }
        String m3213p = m3213p();
        int m3211t = m3211t(m3171a, newValue);
        String m3213p2 = m3213p();
        String m3183B = m3183B(m3213p2);
        if (m3183B == null) {
            m3224e(m3171a, m3211t);
            return;
        }
        m3181D(m3183B);
        BaseInputMask.m3209v(this, m3213p2, 0, null, 4, null);
        TextDiff m3171a2 = c44394a.m3171a(m3213p, m3213p2);
        m3184A(m3171a2.m3172c() + m3171a2.m3174a());
    }

    @Override // p984t9.BaseInputMask
    /* renamed from: r */
    public void mo3179r(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f116527e.invoke(exception);
    }

    @Override // p984t9.BaseInputMask
    /* renamed from: s */
    public void mo3178s(@NotNull String newRawValue) {
        Intrinsics.checkNotNullParameter(newRawValue, "newRawValue");
        m3182C(newRawValue);
        super.mo3178s(newRawValue);
    }
}
