package com.applovin.exoplayer2.p132ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.applovin.impl.AbstractC5863xp;
import com.applovin.impl.C3989a5;
import com.applovin.impl.C5815x2;
import com.applovin.impl.InterfaceC5193qh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.ui.SubtitleView */
/* loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout implements InterfaceC5193qh.InterfaceC5199e {

    /* renamed from: a */
    private List f4250a;

    /* renamed from: b */
    private C5815x2 f4251b;

    /* renamed from: c */
    private int f4252c;

    /* renamed from: d */
    private float f4253d;

    /* renamed from: f */
    private float f4254f;

    /* renamed from: g */
    private boolean f4255g;

    /* renamed from: h */
    private boolean f4256h;

    /* renamed from: i */
    private int f4257i;

    /* renamed from: j */
    private InterfaceC3945a f4258j;

    /* renamed from: k */
    private View f4259k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.exoplayer2.ui.SubtitleView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3945a {
        /* renamed from: a */
        void mo101094a(List list, C5815x2 c5815x2, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private C3989a5 m101255a(C3989a5 c3989a5) {
        C3989a5.C3991b m101054a = c3989a5.m101054a();
        if (!this.f4255g) {
            AbstractC3963h.m101111a(m101054a);
        } else if (!this.f4256h) {
            AbstractC3963h.m101109b(m101054a);
        }
        return m101054a.m101050a();
    }

    /* renamed from: e */
    private void m101252e() {
        this.f4258j.mo101094a(getCuesWithStylingPreferencesApplied(), this.f4251b, this.f4253d, this.f4252c, this.f4254f);
    }

    private List<C3989a5> getCuesWithStylingPreferencesApplied() {
        if (this.f4255g && this.f4256h) {
            return this.f4250a;
        }
        ArrayList arrayList = new ArrayList(this.f4250a.size());
        for (int i = 0; i < this.f4250a.size(); i++) {
            arrayList.add(m101255a((C3989a5) this.f4250a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (AbstractC5863xp.f12151a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C5815x2 getUserCaptionStyle() {
        if (AbstractC5863xp.f12151a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return C5815x2.m93321a(captioningManager.getUserStyle());
            }
            return C5815x2.f11863g;
        }
        return C5815x2.f11863g;
    }

    private <T extends View & InterfaceC3945a> void setView(T t) {
        removeView(this.f4259k);
        View view = this.f4259k;
        if (view instanceof C3966j) {
            ((C3966j) view).m101100a();
        }
        this.f4259k = t;
        this.f4258j = t;
        addView(t);
    }

    /* renamed from: c */
    public void m101254c() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: d */
    public void m101253d() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f4256h = z;
        m101252e();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f4255g = z;
        m101252e();
    }

    public void setBottomPaddingFraction(float f) {
        this.f4254f = f;
        m101252e();
    }

    public void setCues(@Nullable List<C3989a5> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f4250a = list;
        m101252e();
    }

    public void setFractionalTextSize(float f) {
        m101257a(f, false);
    }

    public void setStyle(C5815x2 c5815x2) {
        this.f4251b = c5815x2;
        m101252e();
    }

    public void setViewType(int i) {
        if (this.f4257i == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                setView(new C3966j(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new C3946a(getContext()));
        }
        this.f4257i = i;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4250a = Collections.emptyList();
        this.f4251b = C5815x2.f11863g;
        this.f4252c = 0;
        this.f4253d = 0.0533f;
        this.f4254f = 0.08f;
        this.f4255g = true;
        this.f4256h = true;
        C3946a c3946a = new C3946a(context);
        this.f4258j = c3946a;
        this.f4259k = c3946a;
        addView(c3946a);
        this.f4257i = 1;
    }

    @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5199e
    /* renamed from: a */
    public void mo96308a(List list) {
        setCues(list);
    }

    /* renamed from: a */
    public void m101257a(float f, boolean z) {
        m101256a(z ? 1 : 0, f);
    }

    /* renamed from: a */
    private void m101256a(int i, float f) {
        this.f4252c = i;
        this.f4253d = f;
        m101252e();
    }
}
