package sg.bigo.ads.p883ad.interstitial.multi_img;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.p883ad.interstitial.C43076d;
import sg.bigo.ads.p883ad.interstitial.multi_img.view.AbstractC43269d;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.a */
/* loaded from: classes10.dex */
public final class C43247a {

    /* renamed from: a */
    final ViewGroup f113228a;

    /* renamed from: d */
    final ViewFlow f113231d;

    /* renamed from: e */
    final int f113232e;

    /* renamed from: h */
    private final C43076d f113235h;

    /* renamed from: b */
    int f113229b = -1;

    /* renamed from: c */
    int f113230c = -1;

    /* renamed from: f */
    public boolean f113233f = true;

    /* renamed from: g */
    float f113234g = Float.MIN_VALUE;

    public C43247a(ViewGroup viewGroup, ViewFlow viewFlow, C43076d c43076d, int i) {
        this.f113228a = viewGroup;
        this.f113231d = viewFlow;
        this.f113235h = c43076d;
        this.f113232e = i;
    }

    /* renamed from: a */
    public final void m5873a(final int i) {
        if (this.f113233f) {
            C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    C43247a c43247a = C43247a.this;
                    int i2 = i;
                    if (i2 == c43247a.f113229b && i2 == c43247a.f113230c) {
                        c43247a.m5869b(i2);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void m5869b(int i) {
        if (!this.f113233f) {
            return;
        }
        View m4750a = this.f113231d.m4750a(i);
        Object tag = m4750a.getTag(AbstractC43269d.f113313e);
        if (tag instanceof AbstractC43269d) {
            AbstractC43269d abstractC43269d = (AbstractC43269d) tag;
            this.f113229b = i;
            this.f113234g = Float.MIN_VALUE;
            this.f113230c = i;
            if (abstractC43269d.m5829d(this.f113232e)) {
                this.f113228a.setBackgroundColor(this.f113235h.m6129a(abstractC43269d.f113323n));
            } else if (abstractC43269d.m5831c(this.f113232e)) {
                this.f113235h.m6129a(abstractC43269d.f113324o);
                Bitmap bitmap = abstractC43269d.f113325p;
                int i2 = abstractC43269d.f113326q;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(m4750a.getResources(), bitmap);
                bitmapDrawable.setAlpha(i2);
                ViewGroup viewGroup = this.f113228a;
                if (bitmap == null) {
                    bitmapDrawable = null;
                }
                m5872a(viewGroup, bitmapDrawable, (BitmapDrawable) null);
            }
        }
    }

    /* renamed from: a */
    public static void m5872a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        m5871a(viewGroup, "adview_background_main_tag", bitmapDrawable);
        m5871a(viewGroup, "adview_background_second_tag", bitmapDrawable2);
    }

    /* renamed from: a */
    public static void m5871a(ViewGroup viewGroup, Object obj, BitmapDrawable bitmapDrawable) {
        ImageView imageView;
        View findViewWithTag = viewGroup.findViewWithTag(obj);
        if (findViewWithTag instanceof ImageView) {
            imageView = (ImageView) findViewWithTag;
        } else {
            Context context = viewGroup.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag(obj);
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                C43841u.m4801a(imageView2, viewGroup, null, 0);
                imageView = imageView2;
            } else {
                imageView = null;
            }
        }
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5870a(sg.bigo.ads.p883ad.interstitial.multi_img.view.AbstractC43269d r3, float r4, int r5) {
        /*
            r2 = this;
            int r0 = r2.f113229b
            if (r5 == r0) goto L5
            return
        L5:
            int r0 = r2.f113232e
            boolean r0 = r3.m5829d(r0)
            if (r0 == 0) goto L10
            int r3 = r3.f113323n
            goto L12
        L10:
            int r3 = r3.f113324o
        L12:
            r2.f113234g = r4
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            int r5 = r5 + (-1)
            goto L1e
        L1c:
            int r5 = r5 + 1
        L1e:
            r2.f113230c = r5
            sg.bigo.ads.common.view.ViewFlow r5 = r2.f113231d
            int r1 = r2.f113230c
            android.view.View r5 = r5.m4750a(r1)
            if (r5 == 0) goto L42
            int r1 = sg.bigo.ads.p883ad.interstitial.multi_img.view.AbstractC43269d.f113313e
            java.lang.Object r5 = r5.getTag(r1)
            boolean r1 = r5 instanceof sg.bigo.ads.p883ad.interstitial.multi_img.view.AbstractC43269d
            if (r1 == 0) goto L42
            sg.bigo.ads.ad.interstitial.multi_img.view.d r5 = (sg.bigo.ads.p883ad.interstitial.multi_img.view.AbstractC43269d) r5
            if (r0 == 0) goto L3b
            int r5 = r5.f113323n
            goto L3d
        L3b:
            int r5 = r5.f113324o
        L3d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L43
        L42:
            r5 = 0
        L43:
            float r4 = java.lang.Math.abs(r4)
            if (r5 != 0) goto L4b
            r5 = r3
            goto L4f
        L4b:
            int r5 = r5.intValue()
        L4f:
            int r3 = sg.bigo.ads.common.p940w.C43887b.m4688a(r4, r3, r5)
            sg.bigo.ads.ad.interstitial.d r4 = r2.f113235h
            int r3 = r4.m6129a(r3)
            if (r0 == 0) goto L60
            android.view.ViewGroup r4 = r2.f113228a
            r4.setBackgroundColor(r3)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.p883ad.interstitial.multi_img.C43247a.m5870a(sg.bigo.ads.ad.interstitial.multi_img.view.d, float, int):void");
    }
}
