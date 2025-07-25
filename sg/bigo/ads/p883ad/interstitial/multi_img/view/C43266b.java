package sg.bigo.ads.p883ad.interstitial.multi_img.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Button;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.p883ad.interstitial.multi_img.EnumC43253c;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.b */
/* loaded from: classes10.dex */
public final class C43266b extends AbstractC43269d<MediaView> {

    /* renamed from: a */
    public final Button f113303a;

    public C43266b(Context context, EnumC43253c enumC43253c, boolean z, int i, int i2) {
        super(context, enumC43253c, z, i, i2, C42750R.C42754layout.bigo_ad_activity_interstitial_rich_video_multi_img_media_layout, C42750R.C42753id.inter_media_layout, C42750R.C42753id.inter_media, C42750R.C42753id.inter_media_main_background);
        this.f113303a = (Button) this.f113319j.findViewById(C42750R.C42753id.inter_btn_mute);
    }

    /* renamed from: a */
    public final void m5847a(final Bitmap bitmap) {
        ((MediaView) this.f113321l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.b.1
            @Override // java.lang.Runnable
            public final void run() {
                C43266b.this.m5834b(bitmap);
            }
        });
    }

    /* renamed from: b */
    public final boolean m5846b() {
        int i;
        int i2 = this.f113318i;
        if (i2 != 4 && i2 != 3 && (i = this.f113317h) != 4 && i != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m5845c() {
        int i;
        int i2 = this.f113318i;
        if (i2 != 5 && i2 != 4 && (i = this.f113317h) != 5 && i != 4) {
            return false;
        }
        return true;
    }

    @Override // sg.bigo.ads.p883ad.interstitial.multi_img.view.AbstractC43269d
    /* renamed from: a */
    public final boolean mo5843a() {
        if (super.mo5843a()) {
            return true;
        }
        EnumC43253c enumC43253c = this.f113316g;
        return enumC43253c != null && enumC43253c.f113258d == 3;
    }
}
