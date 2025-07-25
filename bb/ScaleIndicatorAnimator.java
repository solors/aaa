package bb;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import com.yandex.div.internal.widget.indicator.AbstractC29811c;
import com.yandex.div.internal.widget.indicator.AbstractC29814d;
import com.yandex.div.internal.widget.indicator.C29817e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: bb.c */
/* loaded from: classes8.dex */
public final class ScaleIndicatorAnimator implements IndicatorAnimator {
    @NotNull

    /* renamed from: a */
    private final C29817e f1649a;
    @NotNull

    /* renamed from: b */
    private final ArgbEvaluator f1650b;
    @NotNull

    /* renamed from: c */
    private final SparseArray<Float> f1651c;

    /* renamed from: d */
    private int f1652d;

    public ScaleIndicatorAnimator(@NotNull C29817e styleParams) {
        Intrinsics.checkNotNullParameter(styleParams, "styleParams");
        this.f1649a = styleParams;
        this.f1650b = new ArgbEvaluator();
        this.f1651c = new SparseArray<>();
    }

    @ColorInt
    /* renamed from: j */
    private final int m103845j(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, int i, int i2) {
        Object evaluate = this.f1650b.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2));
        Intrinsics.m17073h(evaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) evaluate).intValue();
    }

    /* renamed from: k */
    private final float m103844k(int i) {
        Float f = this.f1651c.get(i, Float.valueOf(0.0f));
        Intrinsics.checkNotNullExpressionValue(f, "itemsScale.get(position, 0f)");
        return f.floatValue();
    }

    /* renamed from: l */
    private final float m103843l(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: m */
    private final void m103842m(int i, float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1651c.remove(i);
        } else {
            this.f1651c.put(i, Float.valueOf(Math.abs(f)));
        }
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: b */
    public void mo103840b(int i) {
        this.f1652d = i;
    }

    @Override // bb.IndicatorAnimator
    @Nullable
    /* renamed from: c */
    public RectF mo103839c(float f, float f2, float f3, boolean z) {
        return null;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: e */
    public float mo103837e(int i) {
        AbstractC29814d m36322a = this.f1649a.m36322a();
        if (m36322a instanceof AbstractC29814d.C29816b) {
            AbstractC29814d m36320c = this.f1649a.m36320c();
            Intrinsics.m17073h(m36320c, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
            AbstractC29814d.C29816b c29816b = (AbstractC29814d.C29816b) m36320c;
            return c29816b.m36323g() + ((((AbstractC29814d.C29816b) m36322a).m36323g() - c29816b.m36323g()) * m103844k(i));
        }
        return 0.0f;
    }

    @Override // bb.IndicatorAnimator
    @NotNull
    /* renamed from: f */
    public AbstractC29811c mo103836f(int i) {
        AbstractC29814d m36322a = this.f1649a.m36322a();
        if (m36322a instanceof AbstractC29814d.C29815a) {
            AbstractC29814d m36320c = this.f1649a.m36320c();
            Intrinsics.m17073h(m36320c, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.Circle");
            return new AbstractC29811c.C29812a(m103843l(((AbstractC29814d.C29815a) m36320c).mo36326d().m36336d(), ((AbstractC29814d.C29815a) m36322a).mo36326d().m36336d(), m103844k(i)));
        } else if (m36322a instanceof AbstractC29814d.C29816b) {
            AbstractC29814d m36320c2 = this.f1649a.m36320c();
            Intrinsics.m17073h(m36320c2, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
            AbstractC29814d.C29816b c29816b = (AbstractC29814d.C29816b) m36320c2;
            AbstractC29814d.C29816b c29816b2 = (AbstractC29814d.C29816b) m36322a;
            return new AbstractC29811c.C29813b(m103843l(c29816b.mo36326d().m36331g() + c29816b.m36323g(), c29816b2.mo36326d().m36331g() + c29816b2.m36323g(), m103844k(i)), m103843l(c29816b.mo36326d().m36332f() + c29816b.m36323g(), c29816b2.mo36326d().m36332f() + c29816b2.m36323g(), m103844k(i)), m103843l(c29816b.mo36326d().m36333e(), c29816b2.mo36326d().m36333e(), m103844k(i)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: g */
    public int mo103835g(int i) {
        AbstractC29814d m36322a = this.f1649a.m36322a();
        if (m36322a instanceof AbstractC29814d.C29816b) {
            AbstractC29814d m36320c = this.f1649a.m36320c();
            Intrinsics.m17073h(m36320c, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
            return m103845j(m103844k(i), ((AbstractC29814d.C29816b) m36320c).m36324f(), ((AbstractC29814d.C29816b) m36322a).m36324f());
        }
        return 0;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: h */
    public void mo103834h(int i, float f) {
        m103842m(i, 1.0f - f);
        if (i < this.f1652d - 1) {
            m103842m(i + 1, f);
        } else {
            m103842m(0, f);
        }
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: i */
    public int mo103833i(int i) {
        return m103845j(m103844k(i), this.f1649a.m36320c().mo36327c(), this.f1649a.m36322a().mo36327c());
    }

    @Override // bb.IndicatorAnimator
    public void onPageSelected(int i) {
        this.f1651c.clear();
        this.f1651c.put(i, Float.valueOf(1.0f));
    }
}
