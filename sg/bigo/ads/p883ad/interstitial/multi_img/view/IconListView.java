package sg.bigo.ads.p883ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.p883ad.interstitial.C43205f;
import sg.bigo.ads.p883ad.p885b.C42835f;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.IconListView */
/* loaded from: classes10.dex */
public class IconListView extends LinearLayout {

    /* renamed from: a */
    private boolean f113282a;

    /* renamed from: b */
    private List<C43258a> f113283b;

    /* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a */
    /* loaded from: classes10.dex */
    public static class C43258a {

        /* renamed from: a */
        public final Context f113284a;

        /* renamed from: b */
        public final View f113285b;

        /* renamed from: c */
        public boolean f113286c;

        /* renamed from: d */
        public final LinearLayout f113287d;

        /* renamed from: e */
        public final TextView f113288e;

        /* renamed from: f */
        public final ImageView f113289f;

        /* renamed from: g */
        public final LinearLayout f113290g;

        /* renamed from: h */
        public final TextView f113291h;

        /* renamed from: i */
        public final ImageView f113292i;

        /* renamed from: j */
        public final C43205f.EnumC43206a f113293j;

        /* renamed from: k */
        public final String f113294k;

        public C43258a(Context context, C43205f.EnumC43206a enumC43206a, String str, boolean z) {
            this.f113284a = context;
            View m4954a = C43810a.m4954a(context, C42750R.C42754layout.bigo_ad_layout_ic_item, null, false);
            this.f113285b = m4954a;
            this.f113286c = z;
            LinearLayout linearLayout = (LinearLayout) m4954a.findViewById(C42750R.C42753id.bigo_ad_ic_title_layout);
            this.f113287d = linearLayout;
            this.f113288e = (TextView) m4954a.findViewById(C42750R.C42753id.bigo_ad_ic_title_txt);
            this.f113289f = (ImageView) m4954a.findViewById(C42750R.C42753id.bigo_ad_ic_title_iv);
            linearLayout.setTag(26);
            LinearLayout linearLayout2 = (LinearLayout) m4954a.findViewById(C42750R.C42753id.bigo_ad_ic_desc_layout);
            this.f113290g = linearLayout2;
            this.f113291h = (TextView) m4954a.findViewById(C42750R.C42753id.bigo_ad_ic_desc_txt);
            this.f113292i = (ImageView) m4954a.findViewById(C42750R.C42753id.bigo_ad_ic_desc_iv);
            linearLayout2.setTag(26);
            this.f113293j = enumC43206a;
            this.f113294k = str;
            mo5851a();
        }

        /* renamed from: a */
        public void mo5851a() {
            if (this.f113293j.f113100r == 0) {
                this.f113288e.setVisibility(8);
            } else {
                this.f113288e.setVisibility(0);
                this.f113288e.setText(this.f113293j.f113100r);
                if (this.f113286c) {
                    this.f113288e.setTextColor(-1);
                }
            }
            if (this.f113293j.f113101s == 0) {
                this.f113289f.setVisibility(8);
            } else {
                this.f113289f.setVisibility(0);
                this.f113289f.setImageResource(this.f113293j.f113101s);
            }
            if (this.f113293j.f113102t == 0) {
                this.f113291h.setVisibility(8);
            } else {
                this.f113291h.setVisibility(0);
                this.f113291h.setText(this.f113293j.f113102t);
                if (this.f113286c) {
                    this.f113291h.setTextColor(C43836q.m4825b("#9AFFFFFF", -1));
                }
            }
            if (this.f113293j.f113103u == 0) {
                this.f113292i.setVisibility(8);
                return;
            }
            this.f113292i.setVisibility(0);
            this.f113292i.setImageResource(this.f113293j.f113103u);
        }
    }

    /* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$b */
    /* loaded from: classes10.dex */
    public static class C43259b extends C43258a {
        public C43259b(Context context, C43205f.EnumC43206a enumC43206a, String str, boolean z) {
            super(context, enumC43206a, str, z);
        }

        @Override // sg.bigo.ads.p883ad.interstitial.multi_img.view.IconListView.C43258a
        /* renamed from: a */
        public final void mo5851a() {
            this.f113288e.setVisibility(0);
            this.f113288e.setText(C43810a.m4952a(this.f113284a, this.f113293j.f113100r, C42835f.m6522a(this.f113294k)));
            if (this.f113286c) {
                this.f113288e.setTextColor(-1);
            }
            this.f113289f.setVisibility(8);
            this.f113291h.setVisibility(0);
            this.f113291h.setText(this.f113293j.f113102t);
            if (this.f113286c) {
                this.f113291h.setTextColor(C43836q.m4825b("#9AFFFFFF", -1));
            }
            this.f113292i.setVisibility(8);
        }
    }

    /* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$c */
    /* loaded from: classes10.dex */
    public static class C43260c extends C43258a {
        public C43260c(Context context, C43205f.EnumC43206a enumC43206a, String str, boolean z) {
            super(context, enumC43206a, str, z);
        }

        @Override // sg.bigo.ads.p883ad.interstitial.multi_img.view.IconListView.C43258a
        /* renamed from: a */
        public final void mo5851a() {
            this.f113288e.setVisibility(8);
            this.f113289f.setVisibility(0);
            this.f113289f.setImageResource(this.f113293j.f113101s);
            this.f113291h.setVisibility(0);
            this.f113291h.setText(this.f113293j.f113102t);
            if (this.f113286c) {
                this.f113291h.setTextColor(C43836q.m4825b("#9AFFFFFF", -1));
            }
            this.f113292i.setVisibility(0);
            this.f113292i.setImageResource(this.f113293j.f113103u);
        }
    }

    /* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$d */
    /* loaded from: classes10.dex */
    public static class C43261d extends C43258a {
        public C43261d(Context context, C43205f.EnumC43206a enumC43206a, String str, boolean z) {
            super(context, enumC43206a, str, z);
        }

        @Override // sg.bigo.ads.p883ad.interstitial.multi_img.view.IconListView.C43258a
        /* renamed from: a */
        public final void mo5851a() {
            this.f113288e.setVisibility(0);
            this.f113288e.setText(C43810a.m4952a(this.f113284a, this.f113293j.f113100r, C42835f.m6519c(this.f113294k)));
            if (this.f113286c) {
                this.f113288e.setTextColor(-1);
            }
            this.f113289f.setVisibility(0);
            this.f113289f.setImageResource(this.f113293j.f113101s);
            this.f113291h.setVisibility(0);
            this.f113291h.setText(C42835f.m6520b(this.f113294k) + " " + C43810a.m4952a(this.f113284a, this.f113293j.f113102t, new Object[0]));
            if (this.f113286c) {
                this.f113291h.setTextColor(C43836q.m4825b("#9AFFFFFF", -1));
            }
            this.f113292i.setVisibility(8);
        }
    }

    public IconListView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private List<C43258a> m5853a(Context context, int i, String str) {
        C43260c c43260c;
        ArrayList arrayList = new ArrayList();
        if (i == 1 || i == 2 || i == 4 || i == 8) {
            List<C43205f.EnumC43206a> m5951a = C43205f.EnumC43206a.m5951a(i);
            Random random = new Random();
            while (!m5951a.isEmpty()) {
                arrayList.add(new C43258a(context, m5951a.remove(random.nextInt(m5951a.size())), str, this.f113282a));
            }
        } else {
            boolean z = this.f113282a;
            if (z) {
                arrayList.add(new C43261d(context, C43205f.EnumC43206a.f113090i, str, z));
                arrayList.add(new C43259b(context, C43205f.EnumC43206a.f113091j, str, this.f113282a));
                c43260c = new C43260c(context, C43205f.EnumC43206a.f113092k, str, this.f113282a);
            } else {
                arrayList.add(new C43261d(context, C43205f.EnumC43206a.f113082a, str, z));
                arrayList.add(new C43259b(context, C43205f.EnumC43206a.f113083b, str, this.f113282a));
                c43260c = new C43260c(context, C43205f.EnumC43206a.f113084c, str, this.f113282a);
            }
            arrayList.add(c43260c);
        }
        return arrayList;
    }

    public List<C43258a> getItems() {
        return this.f113283b;
    }

    public void setThemeWhite(boolean z) {
        this.f113282a = z;
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
        if (r8.f113282a != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
        if (r8.f113282a != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
        r4 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5852a(sg.bigo.ads.p883ad.interstitial.C43205f r9) {
        /*
            r8 = this;
            r8.removeAllViews()
            if (r9 != 0) goto L6
            return
        L6:
            android.content.Context r0 = r8.getContext()
            int r1 = r9.f113078a
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L50
            r4 = 4
            r5 = 2
            if (r1 == r5) goto L3e
            r6 = 3
            r7 = 8
            if (r1 == r6) goto L2d
            if (r1 == r4) goto L1c
            return
        L1c:
            boolean r1 = r9.f113081d
            if (r1 == 0) goto L2c
            boolean r1 = r8.f113282a
            if (r1 == 0) goto L25
            r5 = r7
        L25:
            java.lang.String r9 = r9.f113080c
            java.util.List r9 = r8.m5853a(r0, r5, r9)
            goto L5a
        L2c:
            return
        L2d:
            boolean r1 = r9.f113081d
            if (r1 == 0) goto L39
            boolean r1 = r8.f113282a
            if (r1 == 0) goto L37
            r4 = r7
            goto L49
        L37:
            r4 = r5
            goto L49
        L39:
            boolean r1 = r8.f113282a
            if (r1 == 0) goto L48
            goto L49
        L3e:
            boolean r1 = r9.f113081d
            if (r1 == 0) goto L43
            goto L54
        L43:
            boolean r1 = r8.f113282a
            if (r1 == 0) goto L48
            goto L49
        L48:
            r4 = r3
        L49:
            java.lang.String r9 = r9.f113080c
            java.util.List r9 = r8.m5853a(r0, r4, r9)
            goto L5a
        L50:
            boolean r1 = r9.f113081d
            if (r1 == 0) goto L9a
        L54:
            java.lang.String r9 = r9.f113080c
            java.util.List r9 = r8.m5853a(r0, r2, r9)
        L5a:
            r8.f113283b = r9
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r9 = r8.f113283b
            boolean r9 = sg.bigo.ads.common.utils.C43828k.m4877a(r9)
            if (r9 == 0) goto L65
            return
        L65:
            r9 = r2
        L66:
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r0 = r8.f113283b
            int r0 = r0.size()
            if (r9 >= r0) goto L9a
            if (r9 <= 0) goto L80
            android.content.Context r0 = r8.getContext()
            boolean r1 = r8.f113282a
            if (r1 == 0) goto L7b
            int r1 = sg.bigo.ads.C42750R.C42754layout.bigo_ad_layout_space
            goto L7d
        L7b:
            int r1 = sg.bigo.ads.C42750R.C42754layout.bigo_ad_layout_space_black
        L7d:
            sg.bigo.ads.common.utils.C43810a.m4954a(r0, r1, r8, r3)
        L80:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r2, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.weight = r1
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r1 = r8.f113283b
            java.lang.Object r1 = r1.get(r9)
            sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a r1 = (sg.bigo.ads.p883ad.interstitial.multi_img.view.IconListView.C43258a) r1
            android.view.View r1 = r1.f113285b
            r8.addView(r1, r0)
            int r9 = r9 + 1
            goto L66
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.p883ad.interstitial.multi_img.view.IconListView.m5852a(sg.bigo.ads.ad.interstitial.f):void");
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113282a = false;
        setOrientation(0);
        setGravity(17);
    }
}
