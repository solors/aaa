package sg.bigo.ads.api;

/* loaded from: classes10.dex */
public interface RewardVideoAd extends InterstitialAd {
    @Override // sg.bigo.ads.api.InterfaceC43501Ad, sg.bigo.ads.api.IconAds
    @Deprecated
    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener);
}
