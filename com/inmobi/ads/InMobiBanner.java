package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.AbstractC19187Z5;
import com.inmobi.media.AbstractC19220bb;
import com.inmobi.media.AbstractC19338k3;
import com.inmobi.media.AbstractC19350l1;
import com.inmobi.media.C18864B4;
import com.inmobi.media.C18954Ha;
import com.inmobi.media.C18968Ia;
import com.inmobi.media.C19352l3;
import com.inmobi.media.C19364m1;
import com.inmobi.media.C19448s1;
import com.inmobi.media.C19456s9;
import com.inmobi.media.C19465t4;
import com.inmobi.media.C19479u4;
import com.inmobi.media.C19490v1;
import com.inmobi.media.EnumC19294h1;
import com.inmobi.media.HandlerC19462t1;
import com.inmobi.media.InterfaceC18850A4;
import com.inmobi.media.ViewTreeObserver$OnGlobalLayoutListenerC19493v4;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;
import td.EnumEntries;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiBanner extends RelativeLayout {
    @NotNull
    public static final C19465t4 Companion = new C19465t4();

    /* renamed from: a */
    public AbstractC19350l1 f47007a;

    /* renamed from: b */
    public AudioListener f47008b;

    /* renamed from: c */
    public EnumC19294h1 f47009c;

    /* renamed from: d */
    public C19490v1 f47010d;

    /* renamed from: e */
    public final C18829a f47011e;

    /* renamed from: f */
    public int f47012f;

    /* renamed from: g */
    public boolean f47013g;

    /* renamed from: h */
    public final HandlerC19462t1 f47014h;

    /* renamed from: i */
    public int f47015i;

    /* renamed from: j */
    public int f47016j;

    /* renamed from: k */
    public AnimationType f47017k;

    /* renamed from: l */
    public long f47018l;

    /* renamed from: m */
    public WeakReference f47019m;

    /* renamed from: n */
    public final C19456s9 f47020n;

    /* renamed from: o */
    public final C18837e f47021o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes6.dex */
    public static final class AnimationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ANIMATION_OFF = new AnimationType("ANIMATION_OFF", 0);
        public static final AnimationType ROTATE_HORIZONTAL_AXIS = new AnimationType("ROTATE_HORIZONTAL_AXIS", 1);
        public static final AnimationType ANIMATION_ALPHA = new AnimationType("ANIMATION_ALPHA", 2);
        public static final AnimationType ROTATE_VERTICAL_AXIS = new AnimationType("ROTATE_VERTICAL_AXIS", 3);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ANIMATION_OFF, ROTATE_HORIZONTAL_AXIS, ANIMATION_ALPHA, ROTATE_VERTICAL_AXIS};
        }

        static {
            AnimationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C44401b.m3113a($values);
        }

        private AnimationType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<AnimationType> getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    @Metadata
    /* renamed from: com.inmobi.ads.InMobiBanner$a */
    /* loaded from: classes6.dex */
    public static final class C18829a extends C19448s1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18829a(@NotNull InMobiBanner banner) {
            super(banner);
            Intrinsics.checkNotNullParameter(banner, "banner");
        }

        @Override // com.inmobi.media.C19448s1, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C19448s1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiBanner inMobiBanner = m59915a().get();
            if (inMobiBanner == null) {
                return;
            }
            AbstractC19350l1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.onAdLoadFailed(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.C19448s1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = m59915a().get();
            if (inMobiBanner != null) {
                try {
                    C19490v1 mAdManager$media_release = inMobiBanner.getMAdManager$media_release();
                    if (mAdManager$media_release != null) {
                        mAdManager$media_release.m59852G();
                    }
                } catch (IllegalStateException e) {
                    String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
                    AbstractC19187Z5.m60514a((byte) 1, access$getTAG$cp, e.getMessage());
                    AbstractC19350l1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
                    if (mPubListener$media_release != null) {
                        mPubListener$media_release.onAdLoadFailed(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InMobiBanner(@org.jetbrains.annotations.NotNull android.content.Context r14, @org.jetbrains.annotations.NotNull android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiBanner.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static final boolean access$checkForRefreshRate(InMobiBanner inMobiBanner) {
        C19490v1 c19490v1;
        long j = inMobiBanner.f47018l;
        if (j != 0 && (c19490v1 = inMobiBanner.f47010d) != null && !c19490v1.m59845a(j)) {
            return false;
        }
        inMobiBanner.f47018l = SystemClock.elapsedRealtime();
        return true;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFrameSizeString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f47015i);
        sb2.append('x');
        sb2.append(this.f47016j);
        return sb2.toString();
    }

    /* renamed from: a */
    public final boolean m61292a(boolean z) {
        InterfaceC18850A4 m60943p;
        InterfaceC18850A4 m60943p2;
        C19490v1 c19490v1 = this.f47010d;
        if (c19490v1 != null && (m60943p2 = c19490v1.m60943p()) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((C18864B4) m60943p2).m61254c("InMobiBanner", "checkStateAndLogError");
        }
        if (z && this.f47007a == null) {
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61255b("InMobiBanner", "Listener supplied is null, Ignoring your call.");
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m61291b() {
        if (this.f47015i > 0 && this.f47016j > 0) {
            return true;
        }
        return false;
    }

    @UiThread
    public final void destroy() {
        m61298a();
        removeAllViews();
        C19490v1 c19490v1 = this.f47010d;
        if (c19490v1 != null) {
            c19490v1.m59826z();
        }
        this.f47007a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f47020n.f48666d = true;
    }

    @NotNull
    public final EnumC19294h1 getAudioStatusInternal$media_release() {
        return this.f47009c;
    }

    @Nullable
    public final C19490v1 getMAdManager$media_release() {
        return this.f47010d;
    }

    @Nullable
    public final AudioListener getMAudioListener$media_release() {
        return this.f47008b;
    }

    @Nullable
    public final AbstractC19350l1 getMPubListener$media_release() {
        return this.f47007a;
    }

    @NotNull
    public final C19456s9 getMPubSettings$media_release() {
        return this.f47020n;
    }

    public final long getPlacementId() {
        return this.f47020n.f48663a;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f47021o;
    }

    public final void getSignals() {
        InterfaceC18850A4 m60943p;
        if (m61292a(true)) {
            if (m61294a("getSignals()")) {
                C19490v1 c19490v1 = this.f47010d;
                if (c19490v1 == null || !c19490v1.m59855D()) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    m61297a(context, "getToken");
                }
                C19490v1 c19490v12 = this.f47010d;
                if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    ((C18864B4) m60943p).m61259a("InMobiBanner", "getSignals");
                }
                setEnableAutoRefresh(false);
                C19490v1 c19490v13 = this.f47010d;
                if (c19490v13 != null) {
                    c19490v13.m60970a(this.f47011e);
                    return;
                }
                return;
            }
            this.f47011e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
        }
    }

    public final boolean isAudioAd() {
        C19490v1 c19490v1 = this.f47010d;
        if (c19490v1 != null) {
            return c19490v1.m59856C();
        }
        return false;
    }

    public final void load(@Nullable byte[] bArr) {
        C19490v1 c19490v1;
        C19490v1 c19490v12;
        if (m61292a(false)) {
            this.f47020n.f48667e = "AB";
            if (getLayoutParams() != null) {
                this.f47015i = AbstractC19338k3.m60140a(getLayoutParams().width);
                this.f47016j = AbstractC19338k3.m60140a(getLayoutParams().height);
            }
            C19490v1 c19490v13 = this.f47010d;
            if (c19490v13 == null || !c19490v13.m59855D() || ((c19490v1 = this.f47010d) != null && c19490v1.m59855D() && (c19490v12 = this.f47010d) != null && c19490v12.m60942q() == 0)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                m61297a(context, "banner");
            }
            C19490v1 c19490v14 = this.f47010d;
            if (c19490v14 != null) {
                c19490v14.mo60258w();
            }
            m61293a("load(byte[])", new C18836d(this, bArr));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        InterfaceC18850A4 m60943p;
        try {
            super.onAttachedToWindow();
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null) {
                c19490v1.m59853F();
            }
            if (getLayoutParams() != null) {
                this.f47015i = AbstractC19338k3.m60140a(getLayoutParams().width);
                this.f47016j = AbstractC19338k3.m60140a(getLayoutParams().height);
            }
            if (!m61291b()) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                C19352l3 c19352l3 = AbstractC19338k3.f48430a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                Intrinsics.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC19338k3.m60137a(rootWindowInsets, context);
            }
        } catch (Exception e) {
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC18850A4 m60943p;
        try {
            super.onDetachedFromWindow();
            m61298a();
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null) {
                c19490v1.m59848K();
            }
        } catch (Exception e) {
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i) {
        InterfaceC18850A4 m60943p;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, i);
            if (i == 0) {
                scheduleRefresh$media_release();
            } else {
                m61298a();
            }
        } catch (Exception e) {
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null && (m60943p = c19490v1.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e);
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        InterfaceC18850A4 m60943p;
        try {
            super.onWindowFocusChanged(z);
            if (z) {
                scheduleRefresh$media_release();
            } else {
                m61298a();
            }
        } catch (Exception e) {
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null && (m60943p = c19490v1.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e);
            }
        }
    }

    public final void pause() {
        InterfaceC18850A4 m60943p;
        C19490v1 c19490v1;
        try {
            if (this.f47019m == null && (c19490v1 = this.f47010d) != null) {
                c19490v1.m59854E();
            }
        } catch (Exception e) {
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e);
            }
        }
    }

    public final void refreshBanner$media_release() {
        m61295a(this.f47011e, "NonAB", true);
    }

    public final void resume() {
        InterfaceC18850A4 m60943p;
        C19490v1 c19490v1;
        try {
            if (this.f47019m == null && (c19490v1 = this.f47010d) != null) {
                c19490v1.m59851H();
            }
        } catch (Exception e) {
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e);
            }
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC19462t1 handlerC19462t1;
        if (isShown() && hasWindowFocus()) {
            HandlerC19462t1 handlerC19462t12 = this.f47014h;
            if (handlerC19462t12 != null) {
                handlerC19462t12.removeMessages(1);
            }
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null && c19490v1.m59828y() && this.f47013g && (handlerC19462t1 = this.f47014h) != null) {
                handlerC19462t1.sendEmptyMessageDelayed(1, this.f47012f * 1000);
            }
        }
    }

    public final void setAnimationType(@NotNull AnimationType animationType) {
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.f47017k = animationType;
    }

    public final void setAudioListener(@NotNull AudioListener audioListener) {
        AudioStatus audioStatus;
        Intrinsics.checkNotNullParameter(audioListener, "audioListener");
        this.f47008b = audioListener;
        EnumC19294h1 item = this.f47009c;
        if (item != EnumC19294h1.f48278d && audioListener != null) {
            EnumC19294h1.f48276b.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            int ordinal = item.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    audioStatus = AudioStatus.COMPLETED;
                } else {
                    audioStatus = AudioStatus.PAUSED;
                }
            } else {
                audioStatus = AudioStatus.PLAYING;
            }
            audioListener.onAudioStatusChanged(this, audioStatus);
        }
    }

    public final void setAudioStatusInternal$media_release(@NotNull EnumC19294h1 enumC19294h1) {
        Intrinsics.checkNotNullParameter(enumC19294h1, "<set-?>");
        this.f47009c = enumC19294h1;
    }

    public final void setBannerSize(@IntRange(from = 1) int i, @IntRange(from = 1) int i2) {
        this.f47015i = i;
        this.f47016j = i2;
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.f47020n.f48668f = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean z) {
        InterfaceC18850A4 m60943p;
        try {
            if (this.f47013g == z) {
                return;
            }
            this.f47013g = z;
            if (z) {
                scheduleRefresh$media_release();
            } else {
                m61298a();
            }
        } catch (Exception e) {
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null && (m60943p = c19490v1.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e);
            }
        }
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            C18968Ia.m61030a(map.get("tp"));
            C18968Ia.m61027b(map.get("tp-v"));
        }
        this.f47020n.f48665c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f47020n.f48664b = str;
    }

    public final void setListener(@NotNull BannerAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47007a = new C19364m1(listener);
    }

    public final void setMAdManager$media_release(@Nullable C19490v1 c19490v1) {
        this.f47010d = c19490v1;
    }

    public final void setMAudioListener$media_release(@Nullable AudioListener audioListener) {
        this.f47008b = audioListener;
    }

    public final void setMPubListener$media_release(@Nullable AbstractC19350l1 abstractC19350l1) {
        this.f47007a = abstractC19350l1;
    }

    public final void setRefreshInterval(int i) {
        InterfaceC18850A4 m60943p;
        int i2;
        try {
            this.f47020n.f48667e = "NonAB";
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            m61297a(context, "banner");
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null) {
                i2 = c19490v1.m59847a(i, this.f47012f);
            } else {
                i2 = 0;
            }
            this.f47012f = i2;
        } catch (Exception e) {
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e);
            }
        }
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        C19490v1 c19490v1 = this.f47010d;
        if (c19490v1 != null) {
            c19490v1.mo59842a(watermarkData);
        }
    }

    @TargetApi(16)
    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC19493v4(this));
    }

    @UiThread
    public final void swapAdUnitsAndDisplayAd$media_release() {
        InterfaceC18850A4 m60943p;
        C19490v1 c19490v1 = this.f47010d;
        if (c19490v1 != null) {
            c19490v1.m59849J();
        }
        try {
            Animation m61289a = AbstractC18834b.m61289a(this.f47017k, getWidth(), getHeight());
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null) {
                c19490v12.m59843a(this);
            }
            if (m61289a != null) {
                startAnimation(m61289a);
            }
        } catch (Exception e) {
            C19490v1 c19490v13 = this.f47010d;
            if (c19490v13 != null && (m60943p = c19490v13.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61258a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e);
            }
        }
    }

    /* renamed from: a */
    public final void m61295a(PublisherCallbacks publisherCallbacks, String str, boolean z) {
        InterfaceC18850A4 m60943p;
        InterfaceC18850A4 m60943p2;
        InterfaceC18850A4 m60943p3;
        InterfaceC18850A4 m60943p4;
        InterfaceC18850A4 m60943p5;
        try {
            this.f47020n.f48667e = str;
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null && c19490v1.m59857B()) {
                C19490v1 c19490v12 = this.f47010d;
                if (c19490v12 != null) {
                    c19490v12.mo60258w();
                }
                C19490v1 c19490v13 = this.f47010d;
                if (c19490v13 != null && (m60943p5 = c19490v13.m60943p()) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    ((C18864B4) m60943p5).m61259a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
                }
                C19490v1 c19490v14 = this.f47010d;
                if (c19490v14 != null && (m60943p4 = c19490v14.m60943p()) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    ((C18864B4) m60943p4).m61255b("InMobiBanner", "load already in progress");
                }
                C19490v1 c19490v15 = this.f47010d;
                if (c19490v15 != null) {
                    c19490v15.m59833b((short) 2169);
                }
                AbstractC19350l1 abstractC19350l1 = this.f47007a;
                if (abstractC19350l1 != null) {
                    abstractC19350l1.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                C19490v1 c19490v16 = this.f47010d;
                if (c19490v16 != null && (m60943p3 = c19490v16.m60943p()) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    ((C18864B4) m60943p3).m61255b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                AbstractC19187Z5.m60514a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            m61297a(context, "banner");
            C19490v1 c19490v17 = this.f47010d;
            if (c19490v17 != null) {
                c19490v17.mo60258w();
            }
            C19490v1 c19490v18 = this.f47010d;
            if (c19490v18 != null && (m60943p2 = c19490v18.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p2).m61259a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
            }
            m61293a("load", new C19479u4(this, publisherCallbacks, z));
        } catch (Exception e) {
            C19490v1 c19490v19 = this.f47010d;
            if (c19490v19 != null) {
                c19490v19.mo60262a((short) 2172);
            }
            AbstractC19350l1 abstractC19350l12 = this.f47007a;
            if (abstractC19350l12 != null) {
                abstractC19350l12.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C19490v1 c19490v110 = this.f47010d;
            if (c19490v110 == null || (m60943p = c19490v110.m60943p()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((C18864B4) m60943p).m61258a("InMobiBanner", "Load failed with unexpected error: ", e);
        }
    }

    @UiThread
    public final void load() {
        if (m61292a(false)) {
            m61295a(this.f47011e, "NonAB", false);
        }
    }

    @UiThread
    public final void load(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (m61292a(false)) {
            this.f47019m = context instanceof Activity ? new WeakReference(context) : null;
            m61295a(this.f47011e, "NonAB", false);
        }
    }

    /* renamed from: a */
    public final void m61293a(String str, final Functions functions) {
        InterfaceC18850A4 m60943p;
        InterfaceC18850A4 m60943p2;
        C19490v1 c19490v1 = this.f47010d;
        if (c19490v1 != null && (m60943p2 = c19490v1.m60943p()) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((C18864B4) m60943p2).m61254c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!m61294a(str)) {
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61255b("InMobiBanner", "invalid banner size. fail.");
            }
            C19490v1 c19490v13 = this.f47010d;
            if (c19490v13 != null) {
                c19490v13.mo60262a((short) 2170);
            }
            AbstractC19350l1 abstractC19350l1 = this.f47007a;
            if (abstractC19350l1 != null) {
                abstractC19350l1.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } else if (!m61291b()) {
            AbstractC19220bb.m60431a(new Runnable() { // from class: m3.b
                {
                    InMobiBanner.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InMobiBanner.m61296a(InMobiBanner.this, functions);
                }
            }, 200L);
        } else {
            functions.invoke();
        }
    }

    /* renamed from: a */
    public static final void m61296a(InMobiBanner this$0, Functions onSuccess) {
        InterfaceC18850A4 m60943p;
        InterfaceC18850A4 m60943p2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        try {
            if (this$0.m61291b()) {
                onSuccess.invoke();
                return;
            }
            C19490v1 c19490v1 = this$0.f47010d;
            if (c19490v1 != null && (m60943p2 = c19490v1.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p2).m61255b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            C19490v1 c19490v12 = this$0.f47010d;
            if (c19490v12 != null) {
                c19490v12.mo60262a((short) 2171);
            }
            AbstractC19350l1 abstractC19350l1 = this$0.f47007a;
            if (abstractC19350l1 != null) {
                abstractC19350l1.onAdLoadFailed(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e) {
            C19490v1 c19490v13 = this$0.f47010d;
            if (c19490v13 != null) {
                c19490v13.mo60262a((short) 2172);
            }
            AbstractC19350l1 abstractC19350l12 = this$0.f47007a;
            if (abstractC19350l12 != null) {
                abstractC19350l12.onAdLoadFailed(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C19490v1 c19490v14 = this$0.f47010d;
            if (c19490v14 == null || (m60943p = c19490v14.m60943p()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((C18864B4) m60943p).m61258a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e);
        }
    }

    /* renamed from: a */
    public final boolean m61294a(String str) {
        InterfaceC18850A4 m60943p;
        InterfaceC18850A4 m60943p2;
        if (m61291b()) {
            return true;
        }
        if (getLayoutParams() == null) {
            C19490v1 c19490v1 = this.f47010d;
            if (c19490v1 != null && (m60943p2 = c19490v1.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p2).m61255b("InMobiBanner", "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
            }
            return false;
        } else if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() != null) {
                this.f47015i = AbstractC19338k3.m60140a(getLayoutParams().width);
                this.f47016j = AbstractC19338k3.m60140a(getLayoutParams().height);
                return true;
            }
            return true;
        } else {
            C19490v1 c19490v12 = this.f47010d;
            if (c19490v12 != null && (m60943p = c19490v12.m60943p()) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((C18864B4) m60943p).m61255b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(str));
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, long j) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47009c = EnumC19294h1.f48278d;
        this.f47011e = new C18829a(this);
        this.f47013g = true;
        this.f47017k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C19456s9 c19456s9 = new C19456s9();
        this.f47020n = c19456s9;
        this.f47021o = new C18837e(this);
        if (C18954Ha.m61055q()) {
            if (context instanceof Activity) {
                this.f47019m = new WeakReference(context);
            }
            this.f47010d = new C19490v1();
            c19456s9.f48663a = j;
            m61297a(context, "banner");
            C19490v1 c19490v1 = this.f47010d;
            this.f47012f = c19490v1 != null ? c19490v1.m59858A() : 0;
            this.f47014h = new HandlerC19462t1(this);
            return;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
        throw new SdkNotInitializedException("InMobiBanner");
    }

    /* renamed from: a */
    public final void m61297a(Context context, String str) {
        int i;
        C19490v1 c19490v1 = this.f47010d;
        if (c19490v1 != null) {
            c19490v1.m59844a(context, this.f47020n, getFrameSizeString(), str);
        }
        C19490v1 c19490v12 = this.f47010d;
        if (c19490v12 != null) {
            int i2 = this.f47012f;
            i = c19490v12.m59847a(i2, i2);
        } else {
            i = 0;
        }
        this.f47012f = i;
    }

    /* renamed from: a */
    public final void m61298a() {
        HandlerC19462t1 handlerC19462t1 = this.f47014h;
        if (handlerC19462t1 != null) {
            handlerC19462t1.removeMessages(1);
        }
    }
}
