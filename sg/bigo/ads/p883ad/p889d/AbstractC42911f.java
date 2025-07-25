package sg.bigo.ads.p883ad.p889d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.core.InterfaceC43573o;
import sg.bigo.ads.api.p903a.InterfaceC43529m;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.AbstractC43831n;
import sg.bigo.ads.common.utils.C43819d;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.core.adview.InterfaceC44124g;
import sg.bigo.ads.p883ad.interstitial.AdCountDownButton;
import sg.bigo.ads.p883ad.interstitial.C42994c;
import sg.bigo.ads.p883ad.interstitial.C43341r;
import sg.bigo.ads.p883ad.interstitial.C43349t;
import sg.bigo.ads.p883ad.interstitial.p895c.C43066w;
import sg.bigo.ads.p883ad.p885b.C42791a;
import sg.bigo.ads.p883ad.p885b.C42819c;

/* renamed from: sg.bigo.ads.ad.d.f */
/* loaded from: classes10.dex */
public abstract class AbstractC42911f extends C43349t {

    /* renamed from: p */
    public static final InterfaceC44124g f112373p = new InterfaceC44124g() { // from class: sg.bigo.ads.ad.d.f.1
        @Override // sg.bigo.ads.core.adview.InterfaceC44124g
        /* renamed from: a */
        public final void mo3931a(int i, int i2, int i3, int i4, int i5, int i6) {
            C43782a.m5010a(0, 4, "emptyClick", "emptyClick stop event Propagation");
        }
    };

    /* renamed from: l */
    protected InterfaceC43529m f112374l;

    /* renamed from: m */
    protected C42917b f112375m;

    /* renamed from: n */
    protected Bitmap f112376n;

    /* renamed from: o */
    protected C42907d f112377o;

    /* renamed from: sg.bigo.ads.ad.d.f$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC42916a {
        /* renamed from: c_ */
        void mo6362c_();
    }

    /* renamed from: sg.bigo.ads.ad.d.f$b */
    /* loaded from: classes10.dex */
    public static class C42917b extends ImageView {

        /* renamed from: a */
        private View f112385a;

        public C42917b(Context context, View view) {
            super(context);
            this.f112385a = view;
        }

        @Override // android.widget.ImageView, android.view.View
        protected final void onMeasure(int i, int i2) {
            View view = this.f112385a;
            if (view == null) {
                super.onMeasure(i, i2);
            } else {
                setMeasuredDimension(view.getWidth(), this.f112385a.getHeight());
            }
        }
    }

    public AbstractC42911f(@NonNull C42819c c42819c) {
        super(c42819c);
    }

    /* renamed from: a */
    private Bitmap m6378a(Context context, boolean z) {
        Bitmap m4922a;
        Bitmap m4917a = C43819d.m4917a(context.getResources(), z ? C42750R.C42752drawable.layer_gift_shadow : C42750R.C42752drawable.layer_heart_shadow);
        if (m4917a == null || m4917a.getHeight() <= 0 || m4917a.getWidth() <= 0 || (m4922a = C43819d.m4922a(m4917a.getWidth(), m4917a.getHeight(), m4917a.getConfig())) == null) {
            return null;
        }
        Canvas canvas = new Canvas(m4922a);
        int m4906a = C43822e.m4906a(context, 1);
        canvas.drawBitmap(m4917a, z ? m4906a : -m4906a, m4906a, (Paint) null);
        Color.colorToHSV(C43341r.m5751a(((C43349t) this).f113639c, 3, null), r5);
        float[] fArr = {0.0f, 75.0f, 85.0f};
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColorFilter(new PorterDuffColorFilter(Color.HSVToColor(fArr), PorterDuff.Mode.SRC_IN));
        Bitmap m4917a2 = C43819d.m4917a(context.getResources(), z ? C42750R.C42752drawable.layer_gift_color : C42750R.C42752drawable.layer_heart_color);
        if (m4917a2 != null && m4917a2.getHeight() > 0 && m4917a2.getWidth() > 0) {
            canvas.drawBitmap(m4917a2, 0.0f, 0.0f, paint);
            Bitmap m4917a3 = C43819d.m4917a(context.getResources(), z ? C42750R.C42752drawable.bigo_ad_gift_widget : C42750R.C42752drawable.bigo_ad_heart_widget);
            if (m4917a3 != null) {
                canvas.drawBitmap(m4917a3, 0.0f, 0.0f, (Paint) null);
            }
            return m4922a;
        }
        return null;
    }

    /* renamed from: a */
    protected abstract void mo6006a(Context context, ViewGroup viewGroup);

    @Override // sg.bigo.ads.p883ad.interstitial.C43349t
    /* renamed from: b */
    public final void mo5715b(@NonNull final ViewGroup viewGroup) {
        viewGroup.post(new Runnable() { // from class: sg.bigo.ads.ad.d.f.4
            @Override // java.lang.Runnable
            public final void run() {
                View findViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (findViewWithTag instanceof ImageView) {
                    AbstractC42911f.this.f112375m = (C42917b) findViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        AbstractC42911f.this.f112375m = new C42917b(context, viewGroup);
                        AbstractC42911f.this.f112375m.setTag("adview_background_main_tag");
                        AbstractC42911f.this.f112375m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        C43841u.m4801a(AbstractC42911f.this.f112375m, viewGroup, null, 0);
                        AbstractC42911f.this.mo6006a(context, viewGroup);
                    }
                }
                C42917b c42917b = AbstractC42911f.this.f112375m;
                if (c42917b != null) {
                    c42917b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    if (AbstractC42911f.m6375a(AbstractC42911f.this) != null) {
                        C42917b c42917b2 = AbstractC42911f.this.f112375m;
                        c42917b2.setImageBitmap(C43819d.m4919a(c42917b2.getContext(), AbstractC42911f.m6375a(AbstractC42911f.this)));
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public void mo6130d(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        final TextView textView = (TextView) viewGroup.findViewById(C42750R.C42753id.inter_warning);
        final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C42750R.C42753id.media_layout);
        if (textView != null && viewGroup2 != null) {
            C43841u.m4800a(viewGroup2, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.d.f.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    textView.getLayoutParams().height = Math.round(viewGroup2.getHeight() * 15 * 0.01f);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m6374f(ViewGroup viewGroup) {
        final View view;
        if (viewGroup != null) {
            view = viewGroup.findViewById(C42750R.C42753id.inter_btn_cta_layout);
        } else {
            view = null;
        }
        if (view == null) {
            return;
        }
        C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.ad.d.f.2
            @Override // java.lang.Runnable
            public final void run() {
                if (AbstractC42911f.this.mo6000l()) {
                    C42994c.m6200e(view);
                } else {
                    view.clearAnimation();
                }
            }
        });
    }

    /* renamed from: g */
    public final void m6373g(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        m6377a(viewGroup, (ImageView) viewGroup.findViewById(C42750R.C42753id.gift_widget), true);
        m6377a(viewGroup, (ImageView) viewGroup.findViewById(C42750R.C42753id.heart_widget), false);
    }

    /* renamed from: h */
    public final void m6372h(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(C42750R.C42753id.inter_title);
        TextView textView2 = (TextView) viewGroup.findViewById(C42750R.C42753id.inter_description);
        if (C43836q.m4837a((CharSequence) ((C43349t) this).f113639c.getDescription())) {
            if (textView != null) {
                textView.setLines(2);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    /* renamed from: j */
    protected abstract boolean mo6002j();

    /* renamed from: k */
    protected abstract int mo6001k();

    /* renamed from: l */
    protected abstract boolean mo6000l();

    /* renamed from: p */
    public final void m6371p() {
        AbstractC43831n abstractC43831n;
        C42907d c42907d = this.f112377o;
        if (c42907d != null && (abstractC43831n = c42907d.f112369e) != null) {
            abstractC43831n.m4860d();
        }
    }

    /* renamed from: q */
    public final void m6370q() {
        AbstractC43831n abstractC43831n;
        C42907d c42907d = this.f112377o;
        if (c42907d != null && !c42907d.f112370f && (abstractC43831n = c42907d.f112369e) != null && abstractC43831n.m4859e()) {
            c42907d.f112369e.m4861c();
        }
    }

    public AbstractC42911f(@NonNull C42819c c42819c, InterfaceC43529m interfaceC43529m) {
        this(c42819c);
        this.f112374l = interfaceC43529m;
    }

    /* renamed from: a */
    static /* synthetic */ Bitmap m6375a(AbstractC42911f abstractC42911f) {
        Bitmap bitmap = abstractC42911f.f113643g;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = abstractC42911f.f112376n;
        if (bitmap2 != null) {
            return bitmap2;
        }
        InterfaceC43573o interfaceC43573o = (InterfaceC43573o) ((C43349t) abstractC42911f).f113639c.mo5439f();
        if (interfaceC43573o.mo4240bj() != null) {
            Bitmap bitmap3 = (Bitmap) interfaceC43573o.mo4240bj().first;
            abstractC42911f.f112376n = bitmap3;
            return bitmap3;
        }
        return null;
    }

    /* renamed from: a */
    private void m6377a(ViewGroup viewGroup, ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (!mo6002j()) {
            imageView.clearAnimation();
            imageView.setVisibility(4);
            return;
        }
        imageView.setImageBitmap(m6378a(imageView.getContext(), z));
        C42994c.m6209a(imageView, z);
        imageView.setVisibility(0);
        imageView.setTag(32);
        int i = this instanceof C43066w ? 9 : 8;
        C42819c c42819c = ((C43349t) this).f113639c;
        C42791a.m6588a(viewGroup, imageView, i, c42819c, c42819c.f112105D);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m6376a(@NonNull ViewGroup viewGroup, boolean z, boolean z2, boolean z3, int i) {
        int i2 = this instanceof C43066w ? 9 : 8;
        MediaView mediaView = (MediaView) viewGroup.findViewById(C42750R.C42753id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (mediaView != null) {
            C42791a.m6588a(viewGroup, mediaView, i2, ((C43349t) this).f113639c, i);
            if (z) {
                mediaView.setMediaAreaClickable(true);
                mediaView.m5479b().mo3936a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                mediaView.m5479b().mo3936a(true);
            }
        }
        viewGroup.setTag(31);
        C42791a.m6588a(viewGroup, viewGroup, i2, z3 ? ((C43349t) this).f113639c : f112373p, i);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C42750R.C42753id.inter_ad_info);
        if (viewGroup2 != null) {
            viewGroup2.setTag(18);
            if (z2) {
                C42791a.m6588a(viewGroup, viewGroup2, i2, ((C43349t) this).f113639c, i);
            } else {
                C42791a.m6588a(viewGroup, viewGroup2, i2, f112373p, i);
            }
        }
    }

    /* renamed from: a */
    public void mo5997a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, InterfaceC42916a interfaceC42916a) {
        if (adCountDownButton == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int mo6001k = mo6001k();
        if (mo6001k == 1) {
            layoutParams.addRule(2, C42750R.C42753id.media_layout);
            layoutParams.addRule(14, -1);
        } else if (mo6001k != 3) {
            if (mo6001k != 4) {
                return;
            }
            int i = C42750R.C42753id.media_layout;
            layoutParams.addRule(7, i);
            layoutParams.addRule(6, i);
            layoutParams.rightMargin = C43822e.m4906a(adCountDownButton.getContext(), 12);
            layoutParams.topMargin = C43822e.m4906a(adCountDownButton.getContext(), 12);
            adCountDownButton.setLayoutParams(layoutParams);
        } else {
            int i2 = C42750R.C42753id.media_layout;
            layoutParams.addRule(7, i2);
            layoutParams.addRule(2, i2);
        }
        layoutParams.bottomMargin = C43822e.m4906a(adCountDownButton.getContext(), -84);
        adCountDownButton.setLayoutParams(layoutParams);
    }
}
