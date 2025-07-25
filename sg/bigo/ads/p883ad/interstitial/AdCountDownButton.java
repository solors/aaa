package sg.bigo.ads.p883ad.interstitial;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.timepicker.TimeModel;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.AbstractC43831n;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.ad.interstitial.AdCountDownButton */
/* loaded from: classes10.dex */
public class AdCountDownButton extends FrameLayout {

    /* renamed from: a */
    protected final Context f112416a;

    /* renamed from: b */
    AbstractC43831n f112417b;

    /* renamed from: c */
    public boolean f112418c;

    /* renamed from: d */
    boolean f112419d;

    /* renamed from: e */
    public boolean f112420e;

    /* renamed from: f */
    public View f112421f;

    /* renamed from: g */
    public View f112422g;

    /* renamed from: h */
    public TextView f112423h;

    /* renamed from: i */
    private boolean f112424i;

    /* renamed from: j */
    private boolean f112425j;

    /* renamed from: sg.bigo.ads.ad.interstitial.AdCountDownButton$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC42938a {
        /* renamed from: a */
        void mo5499a();
    }

    /* renamed from: sg.bigo.ads.ad.interstitial.AdCountDownButton$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC42939b {
        /* renamed from: a */
        void mo5498a();
    }

    public AdCountDownButton(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m6308f() {
        this.f112421f.setVisibility(0);
        this.f112421f.setClickable(true);
        this.f112421f.setAlpha(1.0f);
    }

    /* renamed from: a */
    public final void m6321a(@LayoutRes int i) {
        removeAllViews();
        C43810a.m4954a(this.f112416a, i, this, true);
        this.f112421f = findViewById(C42750R.C42753id.btn_close);
        this.f112422g = findViewById(C42750R.C42753id.view_stroke);
        this.f112423h = (TextView) findViewById(C42750R.C42753id.text_countdown);
    }

    /* renamed from: b */
    public final void m6314b() {
        AbstractC43831n abstractC43831n = this.f112417b;
        if (abstractC43831n != null) {
            abstractC43831n.m4860d();
        }
    }

    /* renamed from: c */
    public final void m6311c() {
        AbstractC43831n abstractC43831n = this.f112417b;
        if (abstractC43831n != null && abstractC43831n.m4859e()) {
            this.f112417b.m4861c();
        }
    }

    /* renamed from: d */
    public final void m6310d() {
        AbstractC43831n abstractC43831n = this.f112417b;
        if (abstractC43831n != null) {
            abstractC43831n.m4862b();
        }
        this.f112418c = true;
        m6315a(false);
    }

    /* renamed from: e */
    public final void m6309e() {
        this.f112421f.setVisibility(0);
        this.f112421f.setAlpha(0.2f);
        this.f112421f.setClickable(false);
    }

    public void setCloseImageResource(@DrawableRes int i) {
        View view = this.f112421f;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(i);
        }
    }

    public void setOnCloseListener(@Nullable final InterfaceC42938a interfaceC42938a) {
        View view = this.f112421f;
        if (view == null) {
            return;
        }
        if (interfaceC42938a == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.AdCountDownButton.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    interfaceC42938a.mo5499a();
                }
            });
        }
    }

    public void setShowCloseButtonInCountdown(boolean z) {
        this.f112424i = z;
        TextView textView = this.f112423h;
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setPadding(C43822e.m4906a(getContext(), 2), 0, 0, 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
    }

    public void setTakeoverTickEvent(boolean z) {
        this.f112419d = z;
    }

    public void setWithUnit(boolean z) {
        this.f112425j = z;
    }

    public AdCountDownButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6313b(long j) {
        if (!this.f112420e) {
            TextView textView = this.f112423h;
            StringBuilder sb2 = new StringBuilder(TimeModel.NUMBER_FORMAT);
            sb2.append(this.f112425j ? "s" : "");
            textView.setText(C43836q.m4830a(sb2.toString(), Integer.valueOf(Math.round(((float) j) / 1000.0f))));
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C43810a.m4952a(this.f112416a, C42750R.C42755string.bigo_ad_splash_skip_after, new Object[0]));
        sb3.append(" %d");
        sb3.append(this.f112425j ? "s" : "");
        this.f112423h.setText(C43836q.m4830a(sb3.toString(), Integer.valueOf(Math.round(((float) j) / 1000.0f))));
    }

    /* renamed from: a */
    public final void m6320a(int i, @Nullable final InterfaceC42939b interfaceC42939b) {
        this.f112423h.setVisibility(0);
        this.f112422g.setVisibility(8);
        this.f112421f.setVisibility(8);
        if (this.f112424i) {
            this.f112422g.setVisibility(0);
            m6309e();
        }
        if (i == 0) {
            m6315a(this.f112419d);
            if (interfaceC42939b != null) {
                interfaceC42939b.mo5498a();
                return;
            }
            return;
        }
        this.f112418c = false;
        if (i < 0) {
            return;
        }
        AbstractC43831n abstractC43831n = new AbstractC43831n(i * 1000) { // from class: sg.bigo.ads.ad.interstitial.AdCountDownButton.2
            @Override // sg.bigo.ads.common.utils.AbstractC43831n
            /* renamed from: a */
            public final void mo4864a() {
                AdCountDownButton adCountDownButton = AdCountDownButton.this;
                adCountDownButton.m6315a(adCountDownButton.f112419d);
                InterfaceC42939b interfaceC42939b2 = interfaceC42939b;
                if (interfaceC42939b2 != null) {
                    interfaceC42939b2.mo5498a();
                }
                AdCountDownButton.m6312b(AdCountDownButton.this);
            }

            @Override // sg.bigo.ads.common.utils.AbstractC43831n
            /* renamed from: a */
            public final void mo4863a(long j) {
                if (AdCountDownButton.this.f112419d) {
                    return;
                }
                AdCountDownButton.this.m6313b(j);
            }
        };
        this.f112417b = abstractC43831n;
        abstractC43831n.m4861c();
    }

    public AdCountDownButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112418c = true;
        this.f112424i = false;
        this.f112425j = false;
        this.f112420e = false;
        this.f112416a = context;
        setClickable(true);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, C42750R.styleable.AdCountDownButton);
            int resourceId = typedArray.getResourceId(C42750R.styleable.AdCountDownButton_customLayout, 0);
            typedArray.recycle();
            C43810a.m4954a(context, resourceId, this, true);
            this.f112421f = findViewById(C42750R.C42753id.btn_close);
            this.f112422g = findViewById(C42750R.C42753id.view_stroke);
            this.f112423h = (TextView) findViewById(C42750R.C42753id.text_countdown);
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    /* renamed from: b */
    static /* synthetic */ boolean m6312b(AdCountDownButton adCountDownButton) {
        adCountDownButton.f112418c = true;
        return true;
    }

    /* renamed from: a */
    public final void m6319a(long j) {
        if (this.f112419d) {
            m6313b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6315a(boolean z) {
        View view;
        View view2;
        m6308f();
        int i = 8;
        if (this.f112420e) {
            this.f112423h.setVisibility(8);
            view2 = this.f112422g;
        } else {
            this.f112423h.setVisibility(z ? 0 : 8);
            view = this.f112422g;
            if (z) {
                i = 0;
                view.setVisibility(i);
            }
            view2 = view;
        }
        view = view2;
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final boolean m6322a() {
        View view = this.f112421f;
        return view != null && view.performClick();
    }
}
