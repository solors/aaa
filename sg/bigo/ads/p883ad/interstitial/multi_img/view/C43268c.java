package sg.bigo.ads.p883ad.interstitial.multi_img.view;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43822e;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.c */
/* loaded from: classes10.dex */
public final class C43268c {

    /* renamed from: a */
    public final LinearLayout f113306a;

    /* renamed from: b */
    public final TextView f113307b;

    /* renamed from: c */
    public final ImageView f113308c;

    /* renamed from: d */
    public final boolean f113309d;

    public C43268c(Context context, boolean z) {
        LinearLayout linearLayout = (LinearLayout) C43810a.m4954a(context, C42750R.C42754layout.bigo_ad_layout_more, null, false);
        this.f113306a = linearLayout;
        this.f113307b = (TextView) linearLayout.findViewById(C42750R.C42753id.bigo_ad_more_txt);
        this.f113308c = (ImageView) linearLayout.findViewById(C42750R.C42753id.bigo_ad_more_img);
        this.f113309d = z;
        int m4906a = C43822e.m4906a(context, 20);
        if (z) {
            linearLayout.setPadding(m4906a, 0, 0, 0);
        } else {
            linearLayout.setPadding(0, 0, m4906a, 0);
        }
        m5844a(true);
    }

    /* renamed from: a */
    public final void m5844a(boolean z) {
        int i;
        int i2;
        if (z) {
            this.f113307b.setTextColor(-1);
            ImageView imageView = this.f113308c;
            if (this.f113309d) {
                i2 = C42750R.C42752drawable.bigo_ad_ic_right_round_white;
            } else {
                i2 = C42750R.C42752drawable.bigo_ad_ic_left_round_white;
            }
            imageView.setImageResource(i2);
            return;
        }
        this.f113307b.setTextColor(-14275021);
        ImageView imageView2 = this.f113308c;
        if (this.f113309d) {
            i = C42750R.C42752drawable.bigo_ad_ic_right_round_black;
        } else {
            i = C42750R.C42752drawable.bigo_ad_ic_left_round_black;
        }
        imageView2.setImageResource(i);
    }
}
