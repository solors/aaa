package sg.bigo.ads.p883ad.interstitial.multi_img;

import android.view.View;
import android.widget.TextView;
import sg.bigo.ads.common.p940w.C43887b;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.p883ad.interstitial.C42994c;
import sg.bigo.ads.p883ad.interstitial.C43076d;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.e */
/* loaded from: classes10.dex */
public final class C43255e {
    /* renamed from: a */
    public static int m5858a(int i) {
        return i;
    }

    /* renamed from: a */
    public static void m5857a(final View view, TextView textView, int i, final boolean[] zArr, final boolean z, final long j) {
        if (C43828k.m4871a(zArr) || zArr.length < 2) {
            return;
        }
        C43076d.m6124a(textView, i, new C43887b.C43895a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.e.1
            @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
            /* renamed from: a */
            public final long mo4671a() {
                return j;
            }

            @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
            /* renamed from: b */
            public final void mo4669b(int i2) {
                boolean[] zArr2 = zArr;
                zArr2[1] = true;
                C43255e.m5856a(view, zArr2[0], true, z);
            }
        });
    }

    /* renamed from: a */
    public static void m5856a(View view, boolean z, boolean z2, boolean z3) {
        if (z3 && z && z2 && view != null) {
            C42994c.m6200e(view);
        }
    }
}
