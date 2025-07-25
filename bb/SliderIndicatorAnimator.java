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
/* renamed from: bb.d */
/* loaded from: classes8.dex */
public final class SliderIndicatorAnimator implements IndicatorAnimator {
    @NotNull

    /* renamed from: a */
    private final C29817e f1653a;

    /* renamed from: b */
    private int f1654b;

    /* renamed from: c */
    private float f1655c;

    /* renamed from: d */
    private int f1656d;
    @NotNull

    /* renamed from: e */
    private final RectF f1657e;

    /* renamed from: f */
    private float f1658f;

    /* renamed from: g */
    private float f1659g;
    @NotNull

    /* renamed from: h */
    private final AbstractC29811c f1660h;

    public SliderIndicatorAnimator(@NotNull C29817e styleParams) {
        AbstractC29811c m36334d;
        Intrinsics.checkNotNullParameter(styleParams, "styleParams");
        this.f1653a = styleParams;
        this.f1657e = new RectF();
        AbstractC29814d m36320c = styleParams.m36320c();
        if (m36320c instanceof AbstractC29814d.C29815a) {
            m36334d = ((AbstractC29814d.C29815a) m36320c).mo36326d();
        } else if (m36320c instanceof AbstractC29814d.C29816b) {
            AbstractC29814d.C29816b c29816b = (AbstractC29814d.C29816b) m36320c;
            m36334d = AbstractC29811c.C29813b.m36334d(c29816b.mo36326d(), c29816b.mo36326d().m36331g() + c29816b.m36323g(), c29816b.mo36326d().m36332f() + c29816b.m36323g(), 0.0f, 4, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f1660h = m36334d;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: a */
    public void mo103841a(float f) {
        this.f1658f = f;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: b */
    public void mo103840b(int i) {
        this.f1656d = i;
    }

    @Override // bb.IndicatorAnimator
    @NotNull
    /* renamed from: c */
    public RectF mo103839c(float f, float f2, float f3, boolean z) {
        boolean z2;
        float m16918d;
        float m16913i;
        float m16913i2;
        float m16918d2;
        float f4 = this.f1659g;
        if (f4 == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f4 = this.f1653a.m36322a().mo36326d().m36338b();
        }
        if (z) {
            RectF rectF = this.f1657e;
            float f5 = this.f1658f;
            m16913i2 = _Ranges.m16913i(this.f1655c * f5, f5);
            float f6 = f4 / 2.0f;
            rectF.left = (f - m16913i2) - f6;
            RectF rectF2 = this.f1657e;
            m16918d2 = _Ranges.m16918d(this.f1658f * this.f1655c, 0.0f);
            rectF2.right = (f - m16918d2) + f6;
        } else {
            RectF rectF3 = this.f1657e;
            m16918d = _Ranges.m16918d(this.f1658f * this.f1655c, 0.0f);
            float f7 = f4 / 2.0f;
            rectF3.left = (m16918d + f) - f7;
            RectF rectF4 = this.f1657e;
            float f8 = this.f1658f;
            m16913i = _Ranges.m16913i(this.f1655c * f8, f8);
            rectF4.right = f + m16913i + f7;
        }
        this.f1657e.top = f2 - (this.f1653a.m36322a().mo36326d().m36339a() / 2.0f);
        this.f1657e.bottom = f2 + (this.f1653a.m36322a().mo36326d().m36339a() / 2.0f);
        RectF rectF5 = this.f1657e;
        float f9 = rectF5.left;
        if (f9 < 0.0f) {
            rectF5.offset(-f9, 0.0f);
        }
        RectF rectF6 = this.f1657e;
        float f10 = rectF6.right;
        if (f10 > f3) {
            rectF6.offset(-(f10 - f3), 0.0f);
        }
        return this.f1657e;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: d */
    public void mo103838d(float f) {
        this.f1659g = f;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: e */
    public float mo103837e(int i) {
        return this.f1653a.m36320c().m36329b();
    }

    @Override // bb.IndicatorAnimator
    @NotNull
    /* renamed from: f */
    public AbstractC29811c mo103836f(int i) {
        return this.f1660h;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: g */
    public int mo103835g(int i) {
        return this.f1653a.m36320c().m36330a();
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: h */
    public void mo103834h(int i, float f) {
        this.f1654b = i;
        this.f1655c = f;
    }

    @Override // bb.IndicatorAnimator
    /* renamed from: i */
    public int mo103833i(int i) {
        return this.f1653a.m36320c().mo36327c();
    }

    @Override // bb.IndicatorAnimator
    public void onPageSelected(int i) {
        this.f1654b = i;
    }
}
