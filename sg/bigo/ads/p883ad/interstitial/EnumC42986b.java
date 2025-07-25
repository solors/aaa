package sg.bigo.ads.p883ad.interstitial;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.common.p907ab.C43594b;
import sg.bigo.ads.common.p911e.C43612a;
import sg.bigo.ads.common.p940w.C43887b;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum b uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: sg.bigo.ads.ad.interstitial.b */
/* loaded from: classes10.dex */
public final class EnumC42986b {

    /* renamed from: a */
    public static final EnumC42986b f112564a;

    /* renamed from: b */
    public static final EnumC42986b f112565b;

    /* renamed from: c */
    public static final EnumC42986b f112566c;

    /* renamed from: d */
    public static final EnumC42986b f112567d;

    /* renamed from: e */
    public static final EnumC42986b f112568e;

    /* renamed from: p */
    private static final /* synthetic */ EnumC42986b[] f112569p;
    @ColorInt

    /* renamed from: f */
    public final int f112570f;
    @ColorInt

    /* renamed from: g */
    public final int f112571g;

    /* renamed from: h */
    private final int f112572h;
    @Nullable

    /* renamed from: i */
    private final C43594b f112573i;

    /* renamed from: j */
    private final int f112574j;

    /* renamed from: k */
    private final int f112575k;
    @ColorInt

    /* renamed from: l */
    private final int f112576l = -1;
    @ColorInt

    /* renamed from: m */
    private final int f112577m = 134217728;

    /* renamed from: n */
    private final int f112578n = 1;

    /* renamed from: o */
    private final int f112579o = 8;

    static {
        EnumC42986b enumC42986b = new EnumC42986b("WHITE", 0, null, C43076d.f112767b, -10525849, 2, 1, 1);
        f112564a = enumC42986b;
        C43594b m5330a = C43594b.m5330a(1, 1, C43887b.m4686a((int) ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i = C43076d.f112766a;
        EnumC42986b enumC42986b2 = new EnumC42986b("DKGRAY_TRANSLUCENT", 1, m5330a, i, i, 0, 2, 2);
        f112565b = enumC42986b2;
        C43594b m5330a2 = C43594b.m5330a(1, 1, C43887b.m4686a((int) ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i2 = C43076d.f112766a;
        EnumC42986b enumC42986b3 = new EnumC42986b("MAIN_COLOR_TRANSLUCENT", 2, m5330a2, i2, i2, 0, 2, 2);
        f112566c = enumC42986b3;
        C43594b m5330a3 = C43594b.m5330a(4, 2, C43887b.m4686a((int) ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i3 = C43076d.f112766a;
        EnumC42986b enumC42986b4 = new EnumC42986b("LTGRAY_BLUR", 3, m5330a3, i3, i3, 0, 2, 2);
        f112567d = enumC42986b4;
        C43594b m5330a4 = C43594b.m5330a(4, 2, C43887b.m4686a((int) ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i4 = C43076d.f112766a;
        EnumC42986b enumC42986b5 = new EnumC42986b("MAIN_COLOR_BLUR", 4, m5330a4, i4, i4, 0, 2, 2);
        f112568e = enumC42986b5;
        f112569p = new EnumC42986b[]{enumC42986b, enumC42986b2, enumC42986b3, enumC42986b4, enumC42986b5};
    }

    /* JADX WARN: Incorrect types in method signature: (Lsg/bigo/ads/common/ab/b;IIIIIII)V */
    private EnumC42986b(String str, int i, @Nullable C43594b c43594b, int i2, int i3, int i4, int i5, int i6) {
        this.f112573i = c43594b;
        this.f112570f = i2;
        this.f112571g = i3;
        this.f112572h = i4;
        this.f112574j = i5;
        this.f112575k = i6;
    }

    public static EnumC42986b valueOf(String str) {
        return (EnumC42986b) Enum.valueOf(EnumC42986b.class, str);
    }

    public static EnumC42986b[] values() {
        return (EnumC42986b[]) f112569p.clone();
    }

    /* renamed from: a */
    public final void m6227a(View view) {
        if (view != null) {
            C43612a.m5311a(view, C43822e.m4906a(view.getContext(), this.f112574j));
        }
    }

    /* renamed from: b */
    public final void m6224b(View view) {
        if (view != null) {
            C43612a.m5311a(view, C43822e.m4906a(view.getContext(), this.f112572h));
        }
    }

    /* renamed from: a */
    public final void m6226a(TextView textView, TextView textView2) {
        Context context;
        if (textView == null && textView2 == null) {
            return;
        }
        if (textView != null) {
            context = textView.getContext();
            textView.setTextColor(this.f112570f);
        } else {
            context = null;
        }
        if (textView2 != null) {
            if (context == null) {
                context = textView2.getContext();
            }
            textView2.setTextColor(this.f112571g);
        }
        C43594b c43594b = this.f112573i;
        if (c43594b == null) {
            if (textView != null) {
                textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            if (textView2 != null) {
                textView2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            return;
        }
        int m4906a = C43822e.m4906a(context, c43594b.f114159a);
        int m4906a2 = C43822e.m4906a(context, c43594b.f114160b);
        int m4906a3 = C43822e.m4906a(context, c43594b.f114161c);
        if (textView != null) {
            textView.setShadowLayer(m4906a, m4906a2, m4906a3, c43594b.f114162d);
        }
        if (textView2 != null) {
            textView2.setShadowLayer(m4906a, m4906a2, m4906a3, c43594b.f114162d);
        }
    }

    /* renamed from: a */
    public final void m6225a(RoundedImageView roundedImageView) {
        if (roundedImageView == null) {
            return;
        }
        roundedImageView.setCornerRadius(C43822e.m4906a(roundedImageView.getContext(), this.f112579o));
    }
}
