package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.p904b.InterfaceC43538d;

/* loaded from: classes10.dex */
public interface InnerBannerAd extends BannerAd {
    InterfaceC43550c getInnerBannerAdData();

    void handleInnerBannerAdResponse(@NonNull InterfaceC43538d.InterfaceC43539a<InnerBannerAd> interfaceC43539a);

    boolean isInnerBannerAdFromAutoRefresh();

    void markFromAutoFresh(InterfaceC43550c interfaceC43550c);

    int updateFormOpenTimes();
}
