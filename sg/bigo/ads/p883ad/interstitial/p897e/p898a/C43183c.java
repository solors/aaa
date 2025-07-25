package sg.bigo.ads.p883ad.interstitial.p897e.p898a;

import androidx.annotation.NonNull;
import sg.bigo.ads.api.p903a.InterfaceC43529m;

/* renamed from: sg.bigo.ads.ad.interstitial.e.a.c */
/* loaded from: classes10.dex */
public final class C43183c extends AbstractC43181b {

    /* renamed from: a */
    protected final boolean f113021a;

    public C43183c(@NonNull InterfaceC43529m interfaceC43529m, boolean z) {
        super(interfaceC43529m.mo4412a("icon_ads.is_display_layer", 0), interfaceC43529m.mo4412a("icon_ads.ad_component_layout_layer", 1), interfaceC43529m.mo4412a("icon_ads.cta_color_layer", 1), interfaceC43529m.mo4412a("icon_ads.icon_color_layer", 1), interfaceC43529m.mo4412a("icon_ads.icon_num_layer", 20), interfaceC43529m.mo4412a("icon_ads.ad_component_show_time_layer", 0), interfaceC43529m.mo4412a("icon_ads.rotate_time_layer", 2), interfaceC43529m.mo4412a("icon_ads.click_type_layer", 3));
        this.f113021a = z;
    }

    @Override // sg.bigo.ads.p883ad.interstitial.p897e.p898a.AbstractC43181b
    /* renamed from: c */
    public final int mo5982c() {
        if (!this.f113021a) {
            return super.mo5982c();
        }
        int i = this.f113001c;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return i;
            default:
                return 1;
        }
    }
}
