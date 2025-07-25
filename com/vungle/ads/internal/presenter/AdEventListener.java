package com.vungle.ads.internal.presenter;

import com.vungle.ads.AbstractC29537l2;
import com.vungle.ads.internal.model.C29338j;
import com.vungle.ads.internal.util.C29518o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.presenter.a */
/* loaded from: classes7.dex */
public class AdEventListener {
    @NotNull
    public static final C29394a Companion = new C29394a(null);
    @NotNull
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    @Nullable
    private C29338j placement;
    @Nullable
    private final AdPlayCallback playAdCallback;

    /* compiled from: AdEventListener.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.presenter.a$a */
    /* loaded from: classes7.dex */
    public static final class C29394a {
        private C29394a() {
        }

        public /* synthetic */ C29394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdEventListener(@Nullable AdPlayCallback adPlayCallback, @Nullable C29338j c29338j) {
        this.playAdCallback = adPlayCallback;
        this.placement = c29338j;
    }

    public final void onError(@NotNull AbstractC29537l2 error, @Nullable String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        AdPlayCallback adPlayCallback = this.playAdCallback;
        if (adPlayCallback != null) {
            adPlayCallback.onFailure(error);
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37466e(TAG, "AdEventListener#PlayAdCallback " + str, error);
        }
    }

    public final void onNext(@NotNull String s, @Nullable String str, @Nullable String str2) {
        AdPlayCallback adPlayCallback;
        AdPlayCallback adPlayCallback2;
        AdPlayCallback adPlayCallback3;
        AdPlayCallback adPlayCallback4;
        Intrinsics.checkNotNullParameter(s, "s");
        C29518o.Companion.m37468d(TAG, "s=" + s + ", value=" + str + ", id=" + str2);
        switch (s.hashCode()) {
            case -1912374177:
                if (s.equals(MRAIDPresenter.SUCCESSFUL_VIEW)) {
                    C29338j c29338j = this.placement;
                    boolean z = false;
                    if (c29338j != null && c29338j.isRewardedVideo()) {
                        z = true;
                    }
                    if (z && !this.adRewarded) {
                        this.adRewarded = true;
                        AdPlayCallback adPlayCallback5 = this.playAdCallback;
                        if (adPlayCallback5 != null) {
                            adPlayCallback5.onAdRewarded(str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case -1627831289:
                if (s.equals("adViewed") && (adPlayCallback = this.playAdCallback) != null) {
                    adPlayCallback.onAdImpression(str2);
                    return;
                }
                return;
            case 100571:
                if (s.equals("end") && (adPlayCallback2 = this.playAdCallback) != null) {
                    adPlayCallback2.onAdEnd(str2);
                    return;
                }
                return;
            case 3417674:
                if (s.equals("open")) {
                    if (Intrinsics.m17075f(str, "adClick")) {
                        AdPlayCallback adPlayCallback6 = this.playAdCallback;
                        if (adPlayCallback6 != null) {
                            adPlayCallback6.onAdClick(str2);
                            return;
                        }
                        return;
                    } else if (Intrinsics.m17075f(str, "adLeftApplication") && (adPlayCallback3 = this.playAdCallback) != null) {
                        adPlayCallback3.onAdLeftApplication(str2);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 109757538:
                if (s.equals("start") && (adPlayCallback4 = this.playAdCallback) != null) {
                    adPlayCallback4.onAdStart(str2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
