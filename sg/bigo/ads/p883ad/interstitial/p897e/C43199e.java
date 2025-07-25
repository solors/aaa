package sg.bigo.ads.p883ad.interstitial.p897e;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.p883ad.interstitial.p897e.p898a.AbstractC43181b;
import sg.bigo.ads.p883ad.interstitial.p897e.p899b.C43185a;

/* renamed from: sg.bigo.ads.ad.interstitial.e.e */
/* loaded from: classes10.dex */
public class C43199e extends AbstractC43198d {
    public C43199e(@NonNull C43185a c43185a, @NonNull List<NativeAd> list, @NonNull AbstractC43181b abstractC43181b) {
        super(c43185a, list, abstractC43181b);
    }

    @Override // sg.bigo.ads.p883ad.interstitial.p897e.AbstractC43198d
    /* renamed from: a */
    protected final C43184b mo5955a() {
        return new C43184b(C43822e.m4906a(this.f113070d, 8), this.f113074h, this.f113073g);
    }

    @Override // sg.bigo.ads.p883ad.interstitial.p897e.AbstractC43198d
    @Nullable
    /* renamed from: b */
    protected final List<View> mo5953b(@NonNull C43179a c43179a) {
        ArrayList arrayList;
        C43185a c43185a;
        Space space;
        LinearLayout.LayoutParams layoutParams;
        m5956c();
        this.f113067a.setOrientation(0);
        int size = this.f113068b.size();
        if (size != 0) {
            if (size == 1) {
                this.f113072f = true;
                View m4954a = C43810a.m4954a(this.f113070d, C42750R.C42754layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f113067a, false);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(m4954a);
                m5963a(16, 10, 16, 14);
                this.f113067a.addView(m4954a, new LinearLayout.LayoutParams(-1, C43822e.m4906a(this.f113070d, 60)));
                return arrayList2;
            } else if (size == 2) {
                Context context = this.f113070d;
                int i = C42750R.C42754layout.bigo_ad_layout_interstitial_icon_item_cta_style1;
                View m4954a2 = C43810a.m4954a(context, i, this.f113067a, false);
                View m4954a3 = C43810a.m4954a(this.f113070d, i, this.f113067a, false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(m4954a2);
                arrayList3.add(m4954a3);
                m5963a(16, 12, 16, 12);
                int m4906a = C43822e.m4906a(this.f113070d, 60);
                this.f113067a.addView(m4954a2, new LinearLayout.LayoutParams(0, m4906a, 1.0f));
                this.f113067a.addView(new Space(this.f113070d), new LinearLayout.LayoutParams(C43822e.m4906a(this.f113070d, 15), m4906a));
                this.f113067a.addView(m4954a3, new LinearLayout.LayoutParams(0, m4906a, 1.0f));
                return arrayList3;
            } else {
                if (size != 3) {
                    Context context2 = this.f113070d;
                    int i2 = C42750R.C42754layout.bigo_ad_layout_interstitial_icon_item_style;
                    View m4954a4 = C43810a.m4954a(context2, i2, this.f113067a, false);
                    View m4954a5 = C43810a.m4954a(this.f113070d, i2, this.f113067a, false);
                    View m4954a6 = C43810a.m4954a(this.f113070d, i2, this.f113067a, false);
                    View m4954a7 = C43810a.m4954a(this.f113070d, i2, this.f113067a, false);
                    arrayList = new ArrayList();
                    arrayList.add(m4954a4);
                    arrayList.add(m4954a5);
                    arrayList.add(m4954a6);
                    arrayList.add(m4954a7);
                    m5963a(0, 12, 0, 8);
                    int m4906a2 = C43822e.m4906a(this.f113070d, 72);
                    this.f113067a.addView(new Space(this.f113070d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                    this.f113067a.addView(m4954a4, new LinearLayout.LayoutParams(m4906a2, -2));
                    this.f113067a.addView(new Space(this.f113070d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                    this.f113067a.addView(m4954a5, new LinearLayout.LayoutParams(m4906a2, -2));
                    this.f113067a.addView(new Space(this.f113070d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                    this.f113067a.addView(m4954a6, new LinearLayout.LayoutParams(m4906a2, -2));
                    this.f113067a.addView(new Space(this.f113070d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                    this.f113067a.addView(m4954a7, new LinearLayout.LayoutParams(m4906a2, -2));
                    c43185a = this.f113067a;
                    space = new Space(this.f113070d);
                    layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
                } else {
                    Context context3 = this.f113070d;
                    int i3 = C42750R.C42754layout.bigo_ad_layout_interstitial_icon_item_style;
                    View m4954a8 = C43810a.m4954a(context3, i3, this.f113067a, false);
                    View m4954a9 = C43810a.m4954a(this.f113070d, i3, this.f113067a, false);
                    View m4954a10 = C43810a.m4954a(this.f113070d, i3, this.f113067a, false);
                    arrayList = new ArrayList();
                    arrayList.add(m4954a8);
                    arrayList.add(m4954a9);
                    arrayList.add(m4954a10);
                    m5963a(0, 12, 0, 8);
                    int m4906a3 = C43822e.m4906a(this.f113070d, 72);
                    this.f113067a.addView(new Space(this.f113070d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                    this.f113067a.addView(m4954a8, new LinearLayout.LayoutParams(m4906a3, -2));
                    this.f113067a.addView(new Space(this.f113070d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                    this.f113067a.addView(m4954a9, new LinearLayout.LayoutParams(m4906a3, -2));
                    this.f113067a.addView(new Space(this.f113070d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                    this.f113067a.addView(m4954a10, new LinearLayout.LayoutParams(m4906a3, -2));
                    c43185a = this.f113067a;
                    space = new Space(this.f113070d);
                    layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
                }
                c43185a.addView(space, layoutParams);
                return arrayList;
            }
        }
        return new ArrayList();
    }
}
