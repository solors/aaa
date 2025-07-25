package bb;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.AbstractC29811c;
import com.yandex.div.internal.widget.indicator.AbstractC29814d;
import com.yandex.div.internal.widget.indicator.C29817e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: bb.e */
/* loaded from: classes8.dex */
public final class WormIndicatorAnimator implements IndicatorAnimator {
    @NotNull

    /* renamed from: a */
    private final C29817e f1661a;

    /* renamed from: b */
    private int f1662b;

    /* renamed from: c */
    private float f1663c;

    /* renamed from: d */
    private int f1664d;
    @NotNull

    /* renamed from: e */
    private final RectF f1665e;

    /* renamed from: f */
    private float f1666f;

    /* renamed from: g */
    private float f1667g;
    @NotNull

    /* renamed from: h */
    private final AbstractC29811c f1668h;

    public WormIndicatorAnimator(@NotNull C29817e styleParams) {
        AbstractC29811c m36334d;
        Intrinsics.checkNotNullParameter(styleParams, "styleParams");
        this.f1661a = styleParams;
        this.f1665e = new RectF();
        AbstractC29814d m36320c = styleParams.m36320c();
        if (m36320c instanceof AbstractC29814d.C29815a) {
            m36334d = ((AbstractC29814d.C29815a) m36320c).mo36326d();
        } else if (m36320c instanceof AbstractC29814d.C29816b) {
            AbstractC29814d.C29816b c29816b = (AbstractC29814d.C29816b) m36320c;
            m36334d = AbstractC29811c.C29813b.m36334d(c29816b.mo36326d(), c29816b.mo36326d().m36331g() + c29816b.m36323g(), c29816b.mo36326d().m36332f() + c29816b.m36323g(), 0.0f, 4, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f1668h = m36334d;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: a */
    public void mo103841a(float f) {
        this.f1666f = f;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: b */
    public void mo103840b(int i) {
        this.f1664d = i;
    }

    @Override // bb.IndicatorAnimator
    @NotNull
    /* renamed from: c */
    public RectF mo103839c(float f, float f2, float f3, boolean z) {
        boolean z2;
        float m16913i;
        float m16918d;
        float m16918d2;
        float m16913i2;
        float f4 = this.f1667g;
        if (f4 == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f4 = this.f1661a.m36322a().mo36326d().m36338b();
        }
        this.f1665e.top = f2 - (this.f1661a.m36322a().mo36326d().m36339a() / 2.0f);
        if (z) {
            RectF rectF = this.f1665e;
            m16918d2 = _Ranges.m16918d(this.f1666f * (this.f1663c - 0.5f) * 2.0f, 0.0f);
            float f5 = f4 / 2.0f;
            rectF.right = (f - m16918d2) + f5;
            RectF rectF2 = this.f1665e;
            float f6 = this.f1666f;
            m16913i2 = _Ranges.m16913i(this.f1663c * f6 * 2.0f, f6);
            rectF2.left = (f - m16913i2) - f5;
        } else {
            RectF rectF3 = this.f1665e;
            float f7 = this.f1666f;
            m16913i = _Ranges.m16913i(this.f1663c * f7 * 2.0f, f7);
            float f8 = f4 / 2.0f;
            rectF3.right = m16913i + f + f8;
            RectF rectF4 = this.f1665e;
            m16918d = _Ranges.m16918d(this.f1666f * (this.f1663c - 0.5f) * 2.0f, 0.0f);
            rectF4.left = (f + m16918d) - f8;
        }
        this.f1665e.bottom = f2 + (this.f1661a.m36322a().mo36326d().m36339a() / 2.0f);
        RectF rectF5 = this.f1665e;
        float f9 = rectF5.left;
        if (f9 < 0.0f) {
            rectF5.offset(-f9, 0.0f);
        }
        RectF rectF6 = this.f1665e;
        float f10 = rectF6.right;
        if (f10 > f3) {
            rectF6.offset(-(f10 - f3), 0.0f);
        }
        return this.f1665e;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: d */
    public void mo103838d(float f) {
        this.f1667g = f;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: e */
    public float mo103837e(int i) {
        return this.f1661a.m36320c().m36329b();
    }

    @Override // bb.IndicatorAnimator
    @NotNull
    /* renamed from: f */
    public AbstractC29811c mo103836f(int i) {
        return this.f1668h;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: g */
    public int mo103835g(int i) {
        return this.f1661a.m36320c().m36330a();
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: h */
    public void mo103834h(int i, float f) {
        this.f1662b = i;
        this.f1663c = f;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: i */
    public int mo103833i(int i) {
        return this.f1661a.m36320c().mo36327c();
    }

    @Override // bb.IndicatorAnimator
    public void onPageSelected(int i) {
        this.f1662b = i;
    }
}
