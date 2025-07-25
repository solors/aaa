package sg.bigo.ads.p883ad.interstitial;

import android.webkit.ValueCallback;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.common.p940w.C43887b;

/* renamed from: sg.bigo.ads.ad.interstitial.d */
/* loaded from: classes10.dex */
public final class C43076d {

    /* renamed from: a */
    public static int f112766a = -1;

    /* renamed from: b */
    public static int f112767b = -14671580;

    /* renamed from: d */
    private final WeakHashMap<TextView, C43076d> f112769d = new WeakHashMap<>();

    /* renamed from: e */
    private final WeakHashMap<ValueCallback<Double>, C43076d> f112770e = new WeakHashMap<>();

    /* renamed from: f */
    private double f112771f = Double.NaN;

    /* renamed from: c */
    int f112768c = f112767b;

    /* renamed from: sg.bigo.ads.ad.interstitial.d$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43078a {
        /* renamed from: a */
        int m6121a();
    }

    /* renamed from: a */
    public final int m6129a(int i) {
        int m4672b = C43887b.m4672b(i);
        this.f112771f = C43887b.m4687a(m4672b);
        for (Map.Entry<TextView, C43076d> entry : this.f112769d.entrySet()) {
            TextView key = entry.getKey();
            if (key != null) {
                m6126a(key, this.f112771f);
                this.f112768c = this.f112771f <= 3.0d ? f112767b : f112766a;
            }
        }
        for (Map.Entry<ValueCallback<Double>, C43076d> entry2 : this.f112770e.entrySet()) {
            ValueCallback<Double> key2 = entry2.getKey();
            if (key2 != null) {
                key2.onReceiveValue(Double.valueOf(this.f112771f));
            }
        }
        return m4672b;
    }

    /* renamed from: b */
    public final void m6123b(TextView textView) {
        if (textView == null) {
            return;
        }
        this.f112769d.put(textView, this);
        double d = this.f112771f;
        if (d != Double.NaN) {
            m6126a(textView, d);
        }
    }

    /* renamed from: b */
    public static void m6122b(@NonNull TextView textView, int i) {
        m6124a(textView, i, null);
    }

    /* renamed from: a */
    public final void m6128a(ValueCallback<Double> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        this.f112770e.put(valueCallback, this);
        double d = this.f112771f;
        if (d != Double.MIN_VALUE) {
            valueCallback.onReceiveValue(Double.valueOf(d));
        }
    }

    /* renamed from: a */
    public final void m6127a(TextView textView) {
        if (textView == null) {
            return;
        }
        this.f112769d.remove(textView);
    }

    /* renamed from: a */
    public static void m6126a(@NonNull TextView textView, double d) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(d <= 3.0d ? f112767b : f112766a);
    }

    /* renamed from: a */
    public static void m6125a(@NonNull TextView textView, int i) {
        if (textView == null) {
            return;
        }
        m6126a(textView, C43887b.m4687a(i));
    }

    /* renamed from: a */
    public static void m6124a(@NonNull final TextView textView, int i, @Nullable final C43887b.C43895a c43895a) {
        if (textView == null) {
            return;
        }
        C43887b.m4675a(textView, i, new C43887b.C43895a() { // from class: sg.bigo.ads.ad.interstitial.d.1
            @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
            /* renamed from: a */
            public final long mo4671a() {
                C43887b.C43895a c43895a2 = c43895a;
                if (c43895a2 != null) {
                    return c43895a2.mo4671a();
                }
                return 0L;
            }

            @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
            /* renamed from: b */
            public final void mo4669b(int i2) {
                C43887b.C43895a c43895a2 = c43895a;
                if (c43895a2 != null) {
                    c43895a2.mo4669b(i2);
                }
            }

            @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
            /* renamed from: a */
            public final boolean mo4670a(int i2) {
                C43076d.m6126a(textView, C43887b.m4687a(i2));
                C43887b.C43895a c43895a2 = c43895a;
                if (c43895a2 != null) {
                    c43895a2.mo4670a(i2);
                    return false;
                }
                return false;
            }
        });
    }
}
