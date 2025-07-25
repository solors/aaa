package sg.bigo.ads.p883ad.interstitial.multi_img;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.p883ad.interstitial.multi_img.view.AbstractC43269d;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.f */
/* loaded from: classes10.dex */
public final class C43257f implements ViewFlow.InterfaceC43869c {
    @NonNull

    /* renamed from: a */
    private final EnumC43254d f113276a;
    @Nullable

    /* renamed from: b */
    private final Indicator f113277b;
    @Nullable

    /* renamed from: c */
    private final C43247a f113278c;

    /* renamed from: d */
    private ValueCallback<Integer> f113279d;

    /* renamed from: e */
    private boolean f113280e = false;

    /* renamed from: f */
    private int f113281f;

    public C43257f(@NonNull EnumC43254d enumC43254d, @Nullable Indicator indicator, @Nullable C43247a c43247a) {
        this.f113276a = enumC43254d;
        this.f113277b = indicator;
        this.f113278c = c43247a;
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.InterfaceC43869c
    /* renamed from: a */
    public final void mo4734a(int i) {
        Indicator indicator = this.f113277b;
        if (indicator == null || i <= 1) {
            return;
        }
        if (indicator.getType() != 1) {
            this.f113277b.setNum(i);
        } else {
            Indicator indicator2 = this.f113277b;
            indicator2.setLineLength(Indicator.m4778a(i, indicator2.getDistance(), this.f113277b.getRadius(), this.f113277b.getLengthSelected()));
        }
        this.f113277b.setVisibility(0);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.InterfaceC43869c
    /* renamed from: a */
    public final void mo4733a(int i, int i2) {
        Indicator indicator = this.f113277b;
        if (indicator == null || indicator.getType() != 1) {
            return;
        }
        float min = Math.min(1.0f, Math.max(0.0f, (i * 1.0f) / i2));
        Indicator indicator2 = this.f113277b;
        if (indicator2.f114720a != min) {
            indicator2.f114720a = Math.max(0.0f, Math.min(1.0f, min));
            indicator2.invalidate();
        }
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.InterfaceC43869c
    /* renamed from: a */
    public final void mo4732a(@NonNull View view, int i) {
        Indicator indicator = this.f113277b;
        if (indicator != null && indicator.getType() != 1) {
            this.f113277b.m4779a(i);
        }
        this.f113281f = i;
        C43247a c43247a = this.f113278c;
        if (c43247a != null) {
            c43247a.m5869b(i);
        }
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.InterfaceC43869c
    /* renamed from: a */
    public final void mo4731a(@NonNull View view, int i, float f) {
        ValueCallback<Integer> valueCallback;
        Bitmap bitmap;
        int i2;
        AbstractC43269d abstractC43269d;
        int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f2 = this.f113276a.f113268h;
        float f3 = ((i3 < 0 ? 1.0f - f2 : f2 - 1.0f) * f) + 1.0f;
        float f4 = this.f113276a.f113267g;
        float f5 = ((i3 < 0 ? 1.0f - f4 : f4 - 1.0f) * f) + 1.0f;
        if (i3 < 0) {
            view.setPivotX(view.getWidth());
        } else {
            view.setPivotX(0.0f);
        }
        view.setPivotY(view.getHeight() / 2);
        view.setScaleX(f3);
        view.setScaleY(f3);
        view.setAlpha(Math.abs(f5));
        Indicator indicator = this.f113277b;
        boolean z = true;
        if (indicator != null && indicator.getType() != 1) {
            this.f113277b.m4780a(f, i);
        }
        C43247a c43247a = this.f113278c;
        if (c43247a != null && c43247a.f113233f) {
            int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i4 == 0) {
                c43247a.m5869b(i);
            } else {
                Object tag = c43247a.f113231d.m4750a(i).getTag(AbstractC43269d.f113313e);
                if (tag instanceof AbstractC43269d) {
                    AbstractC43269d abstractC43269d2 = (AbstractC43269d) tag;
                    if (!abstractC43269d2.m5829d(c43247a.f113232e)) {
                        if (abstractC43269d2.m5831c(c43247a.f113232e)) {
                            if (i == c43247a.f113229b) {
                                c43247a.f113234g = f;
                                float max = Math.max(Math.min(Math.abs(f), 1.0f), 0.0f);
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(c43247a.f113231d.getResources(), abstractC43269d2.f113325p);
                                bitmapDrawable.setAlpha((int) (abstractC43269d2.f113326q * (1.0f - max)));
                                c43247a.f113230c = i4 > 0 ? i - 1 : i + 1;
                                View m4750a = c43247a.f113231d.m4750a(c43247a.f113230c);
                                if (m4750a != null) {
                                    Object tag2 = m4750a.getTag(AbstractC43269d.f113313e);
                                    if (tag2 instanceof AbstractC43269d) {
                                        bitmap = ((AbstractC43269d) tag2).f113325p;
                                        i2 = (int) (abstractC43269d.f113326q * max);
                                        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(c43247a.f113231d.getResources(), bitmap);
                                        bitmapDrawable2.setAlpha(i2);
                                        C43247a.m5872a(c43247a.f113228a, bitmapDrawable, bitmapDrawable2);
                                    }
                                }
                                bitmap = null;
                                i2 = 0;
                                BitmapDrawable bitmapDrawable22 = new BitmapDrawable(c43247a.f113231d.getResources(), bitmap);
                                bitmapDrawable22.setAlpha(i2);
                                C43247a.m5872a(c43247a.f113228a, bitmapDrawable, bitmapDrawable22);
                            }
                        }
                    }
                    c43247a.m5870a(abstractC43269d2, f, i);
                }
            }
        }
        if (this.f113281f != i || f == 0.0f) {
            z = false;
        }
        this.f113280e = z;
        if (f != 0.0f || (valueCallback = this.f113279d) == null) {
            return;
        }
        valueCallback.onReceiveValue(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m5854a(ViewFlow viewFlow, ValueCallback<Integer> valueCallback) {
        if (viewFlow == null || valueCallback == null) {
            return;
        }
        ViewFlow.InterfaceC43869c onItemChangeListener = viewFlow.getOnItemChangeListener();
        if (onItemChangeListener instanceof C43257f) {
            ((C43257f) onItemChangeListener).f113279d = valueCallback;
        }
    }

    /* renamed from: a */
    public static boolean m5855a(ViewFlow viewFlow) {
        ViewFlow.InterfaceC43869c onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if (onItemChangeListener == null || !(onItemChangeListener instanceof C43257f)) {
            return false;
        }
        return ((C43257f) onItemChangeListener).f113280e;
    }
}
