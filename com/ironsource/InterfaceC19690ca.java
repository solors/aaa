package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ca */
/* loaded from: classes6.dex */
public interface InterfaceC19690ca {

    @Metadata
    /* renamed from: com.ironsource.ca$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC19691a {
        @Nullable
        /* renamed from: a */
        ISDemandOnlyBannerLayout mo56717a(@Nullable Activity activity, @Nullable ISBannerSize iSBannerSize);

        /* renamed from: a */
        void mo56716a(@Nullable Activity activity, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str);

        /* renamed from: a */
        void mo56715a(@Nullable Activity activity, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str, @Nullable String str2);

        /* renamed from: c */
        void mo56641c(@Nullable String str);
    }

    @Metadata
    /* renamed from: com.ironsource.ca$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC19692b {
        /* renamed from: a */
        void mo56714a(@Nullable Activity activity, @Nullable String str);

        /* renamed from: a */
        void mo56693a(@Nullable ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        /* renamed from: b */
        void mo56658b(@Nullable Activity activity, @Nullable String str, @Nullable String str2);

        /* renamed from: b */
        void mo56650b(@Nullable String str);

        /* renamed from: f */
        boolean mo56628f(@Nullable String str);
    }

    @Metadata
    /* renamed from: com.ironsource.ca$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC19693c {
        /* renamed from: a */
        void mo56713a(@Nullable Activity activity, @Nullable String str, @Nullable String str2);

        /* renamed from: a */
        void mo56692a(@Nullable ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        /* renamed from: a */
        void mo56678a(@Nullable String str);

        /* renamed from: b */
        void mo56659b(@Nullable Activity activity, @Nullable String str);

        /* renamed from: j */
        boolean mo56620j(@Nullable String str);
    }

    @Nullable
    /* renamed from: a */
    String mo56712a(@NotNull Context context);

    /* renamed from: a */
    void mo56706a(@NotNull Context context, @NotNull String str, @NotNull IronSource.AD_UNIT... ad_unitArr);
}
