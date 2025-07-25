package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC19187Z5;
import com.inmobi.media.AbstractC19256e5;
import com.inmobi.media.AbstractC19338k3;
import com.inmobi.media.AbstractC19521x4;
import com.inmobi.media.C18954Ha;
import com.inmobi.media.C18968Ia;
import com.inmobi.media.C19070Q4;
import com.inmobi.media.C19270f5;
import com.inmobi.media.C19326j5;
import com.inmobi.media.C19340k5;
import com.inmobi.media.C19456s9;
import com.inmobi.media.C19535y4;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiInterstitial {
    @NotNull
    public static final C19535y4 Companion = new C19535y4();

    /* renamed from: a */
    public final Context f47022a;

    /* renamed from: b */
    public boolean f47023b;

    /* renamed from: c */
    public final WeakReference f47024c;

    /* renamed from: d */
    public final C19456s9 f47025d;

    /* renamed from: e */
    public final C18830a f47026e;

    /* renamed from: f */
    public final C18838f f47027f;
    public C19340k5 mAdManager;
    public AbstractC19256e5 mPubListener;

    @Metadata
    /* renamed from: com.inmobi.ads.InMobiInterstitial$a */
    /* loaded from: classes6.dex */
    public static final class C18830a extends C19326j5 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18830a(@NotNull InMobiInterstitial interstitial) {
            super(interstitial);
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        }

        @Override // com.inmobi.media.C19326j5, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C19326j5, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AbstractC19256e5 mPubListener$media_release;
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiInterstitial inMobiInterstitial = this.f48388a.get();
            if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
                mPubListener$media_release.onAdLoadFailed(inMobiInterstitial, status);
            }
        }

        @Override // com.inmobi.media.C19326j5, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.f48388a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().m60117D();
                } catch (IllegalStateException e) {
                    String access$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
                    AbstractC19187Z5.m60514a((byte) 1, access$getTAG$cp, e.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().onAdLoadFailed(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(@NotNull Context context, long j, @NotNull InterstitialAdEventListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C19456s9 c19456s9 = new C19456s9();
        this.f47025d = c19456s9;
        this.f47026e = new C18830a(this);
        this.f47027f = new C18838f(this);
        if (C18954Ha.m61055q()) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.f47022a = applicationContext;
            c19456s9.f48663a = j;
            this.f47024c = new WeakReference(context);
            setMPubListener$media_release(new C19270f5(listener));
            setMAdManager$media_release(new C19340k5());
            return;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
        throw new SdkNotInitializedException("InMobiInterstitial");
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public final void disableHardwareAcceleration() {
        this.f47025d.f48666d = true;
    }

    @NotNull
    public final C19340k5 getMAdManager$media_release() {
        C19340k5 c19340k5 = this.mAdManager;
        if (c19340k5 != null) {
            return c19340k5;
        }
        Intrinsics.m17056y("mAdManager");
        return null;
    }

    @NotNull
    public final AbstractC19256e5 getMPubListener$media_release() {
        AbstractC19256e5 abstractC19256e5 = this.mPubListener;
        if (abstractC19256e5 != null) {
            return abstractC19256e5;
        }
        Intrinsics.m17056y("mPubListener");
        return null;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f47027f;
    }

    public final void getSignals() {
        this.f47025d.f48667e = "AB";
        C19340k5 mAdManager$media_release = getMAdManager$media_release();
        C19456s9 c19456s9 = this.f47025d;
        Context context = this.f47022a;
        if (context == null) {
            Intrinsics.m17056y("mContext");
            context = null;
        }
        mAdManager$media_release.m60109a(c19456s9, context, false, "getToken");
        getMAdManager$media_release().m60970a(this.f47026e);
    }

    public final boolean isReady() {
        boolean m60120B = getMAdManager$media_release().m60120B();
        if (!m60120B) {
            getMAdManager$media_release().m60116E();
        }
        return m60120B;
    }

    public final void load(@Nullable byte[] bArr) {
        this.f47023b = true;
        this.f47025d.f48667e = "AB";
        C19340k5 mAdManager$media_release = getMAdManager$media_release();
        C19456s9 c19456s9 = this.f47025d;
        Context context = this.f47022a;
        if (context == null) {
            Intrinsics.m17056y("mContext");
            context = null;
        }
        C19340k5.m60110a(mAdManager$media_release, c19456s9, context, false, null, 12, null);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC19338k3.m60128c((Context) this.f47024c.get());
        }
        getMAdManager$media_release().mo59838a(bArr, this.f47026e);
    }

    @VisibleForTesting
    public final void loadAdUnit() {
        getMAdManager$media_release().m60105c(this.f47026e);
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.f47025d.f48668f = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            C18968Ia.m61030a(map.get("tp"));
            C18968Ia.m61027b(map.get("tp-v"));
        }
        this.f47025d.f48665c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f47025d.f48664b = str;
    }

    public final void setListener(@NotNull InterstitialAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setMPubListener$media_release(new C19270f5(listener));
    }

    public final void setMAdManager$media_release(@NotNull C19340k5 c19340k5) {
        Intrinsics.checkNotNullParameter(c19340k5, "<set-?>");
        this.mAdManager = c19340k5;
    }

    public final void setMPubListener$media_release(@NotNull AbstractC19256e5 abstractC19256e5) {
        Intrinsics.checkNotNullParameter(abstractC19256e5, "<set-?>");
        this.mPubListener = abstractC19256e5;
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        getMAdManager$media_release().mo59842a(watermarkData);
    }

    @UiThread
    public final void show() {
        try {
            if (!this.f47023b) {
                Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
                AbstractC19187Z5.m60514a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
                return;
            }
            getMAdManager$media_release().m60115F();
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            AbstractC19187Z5.m60514a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
        }
    }

    @UiThread
    public final void load() {
        try {
            this.f47023b = true;
            this.f47025d.f48667e = "NonAB";
            C19340k5 mAdManager$media_release = getMAdManager$media_release();
            C19456s9 c19456s9 = this.f47025d;
            Context context = this.f47022a;
            if (context == null) {
                Intrinsics.m17056y("mContext");
                context = null;
            }
            C19340k5.m60110a(mAdManager$media_release, c19456s9, context, false, null, 12, null);
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC19338k3.m60128c((Context) this.f47024c.get());
            }
            loadAdUnit();
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            AbstractC19187Z5.m60514a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            getMAdManager$media_release().mo60262a((short) 2000);
            getMAdManager$media_release().mo60155a(getMAdManager$media_release().mo59831j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
        }
    }
}
