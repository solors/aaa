package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.hb */
/* loaded from: classes6.dex */
public final class C20040hb {
    @NotNull

    /* renamed from: a */
    public static final C20040hb f50441a = new C20040hb();

    private C20040hb() {
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m58202a() {
        return m58199a(this, EnumC19767df.ISErrorInitDecryptionFailure, null, 2, null);
    }

    @NotNull
    /* renamed from: b */
    public final IronSourceError m58195b() {
        return m58199a(this, EnumC19767df.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    @NotNull
    /* renamed from: c */
    public final IronSourceError m58191c() {
        return m58199a(this, EnumC19767df.ISErrorInitInvalidResponse, null, 2, null);
    }

    @NotNull
    /* renamed from: d */
    public final IronSourceError m58187d() {
        return m58199a(this, EnumC19767df.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    @NotNull
    /* renamed from: e */
    public final IronSourceError m58185e() {
        return m58199a(this, EnumC19767df.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    @NotNull
    /* renamed from: f */
    public final IronSourceError m58184f() {
        return m58199a(this, EnumC19767df.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    @NotNull
    /* renamed from: g */
    public final IronSourceError m58183g() {
        return m58199a(this, EnumC19767df.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    /* renamed from: h */
    public final IronSourceError m58182h() {
        return m58199a(this, EnumC19767df.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    @NotNull
    /* renamed from: i */
    public final IronSourceError m58181i() {
        return m58199a(this, EnumC19767df.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    @NotNull
    /* renamed from: j */
    public final IronSourceError m58180j() {
        return m58199a(this, EnumC19767df.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    /* renamed from: k */
    public final IronSourceError m58179k() {
        return m58199a(this, EnumC19767df.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    @NotNull
    /* renamed from: l */
    public final IronSourceError m58178l() {
        return m58199a(this, EnumC19767df.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    @NotNull
    /* renamed from: m */
    public final IronSourceError m58177m() {
        return m58199a(this, EnumC19767df.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    @NotNull
    /* renamed from: n */
    public final IronSourceError m58176n() {
        return m58199a(this, EnumC19767df.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    @NotNull
    /* renamed from: o */
    public final IronSourceError m58175o() {
        return m58199a(this, EnumC19767df.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    @NotNull
    /* renamed from: p */
    public final IronSourceError m58174p() {
        return m58199a(this, EnumC19767df.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    @NotNull
    /* renamed from: q */
    public final IronSourceError m58173q() {
        return m58199a(this, EnumC19767df.ISErrorLoadNullADM, null, 2, null);
    }

    @NotNull
    /* renamed from: r */
    public final IronSourceError m58172r() {
        return m58199a(this, EnumC19767df.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    @NotNull
    /* renamed from: s */
    public final IronSourceError m58171s() {
        return m58199a(this, EnumC19767df.ISErrorLoadTimedOut, null, 2, null);
    }

    @NotNull
    /* renamed from: t */
    public final IronSourceError m58170t() {
        return m58199a(this, EnumC19767df.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    /* renamed from: a */
    private final IronSourceError m58201a(EnumC19767df enumC19767df, IronSourceError ironSourceError) {
        String m58944c;
        if (ironSourceError != null) {
            m58944c = enumC19767df.m58944c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ':' + ironSourceError.getErrorMessage() + '\'';
        } else {
            m58944c = enumC19767df.m58944c();
        }
        return new IronSourceError(enumC19767df.m58945b(), m58944c);
    }

    /* renamed from: b */
    public static /* synthetic */ IronSourceError m58194b(C20040hb c20040hb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c20040hb.m58192b(str);
    }

    /* renamed from: c */
    public static /* synthetic */ IronSourceError m58190c(C20040hb c20040hb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c20040hb.m58186d(str);
    }

    @NotNull
    /* renamed from: d */
    public final IronSourceError m58186d(@Nullable String str) {
        return m58200a(EnumC19767df.ISErrorRewardedLoadNoConfig, str);
    }

    /* renamed from: a */
    private final IronSourceError m58200a(EnumC19767df enumC19767df, String str) {
        if (str == null || str.length() == 0) {
            str = enumC19767df.m58944c();
        }
        return new IronSourceError(enumC19767df.m58945b(), str);
    }

    @NotNull
    /* renamed from: b */
    public final IronSourceError m58193b(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return m58201a(EnumC19767df.ISErrorLoadNetworkFailed, error);
    }

    @NotNull
    /* renamed from: c */
    public final IronSourceError m58189c(@NotNull IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return m58201a(EnumC19767df.ISErrorShowNetworkFailed, networkError);
    }

    /* renamed from: a */
    static /* synthetic */ IronSourceError m58199a(C20040hb c20040hb, EnumC19767df enumC19767df, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c20040hb.m58201a(enumC19767df, ironSourceError);
    }

    @NotNull
    /* renamed from: b */
    public final IronSourceError m58192b(@Nullable String str) {
        return m58200a(EnumC19767df.ISErrorInterstitialLoadNoConfig, str);
    }

    @NotNull
    /* renamed from: c */
    public final IronSourceError m58188c(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return m58200a(EnumC19767df.ISErrorLoadNetworkFailed, description);
    }

    /* renamed from: a */
    public static /* synthetic */ IronSourceError m58198a(C20040hb c20040hb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c20040hb.m58196a(str);
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m58197a(@NotNull IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return m58201a(EnumC19767df.ISErrorInitNetworkFailed, networkError);
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m58196a(@Nullable String str) {
        return m58200a(EnumC19767df.ISErrorBannerLoadNoConfig, str);
    }
}
