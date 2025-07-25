package sg.bigo.ads.api;

import androidx.annotation.Nullable;

/* renamed from: sg.bigo.ads.api.Ad */
/* loaded from: classes10.dex */
public interface InterfaceC43501Ad extends Comparable<InterfaceC43501Ad> {
    public static final int CLICK_ACTY_SOURCE_FROM_CURRENT_ACTIVITY = 2;
    public static final int CLICK_ACTY_SOURCE_FROM_SHOW = 1;
    public static final int CLICK_ACTY_SOURCE_FROM_VIEW = 3;
    public static final int INTERSTITIAL_SHOW_METHOD_NON_NULL_ACTIVITY = 2;
    public static final int INTERSTITIAL_SHOW_METHOD_NULL_ACTIVITY = 3;
    public static final int INTERSTITIAL_SHOW_METHOD_OLD = 1;

    void destroy();

    @Nullable
    AdBid getBid();

    @Nullable
    String getCreativeId();

    @Nullable
    String getExtraInfo(String str);

    boolean isExpired();

    void setAdInteractionListener(AdInteractionListener adInteractionListener);
}
