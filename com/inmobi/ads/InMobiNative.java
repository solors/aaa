package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC18867B7;
import com.inmobi.media.AbstractC19033N6;
import com.inmobi.media.AbstractC19187Z5;
import com.inmobi.media.AbstractC19338k3;
import com.inmobi.media.AbstractC19521x4;
import com.inmobi.media.C18864B4;
import com.inmobi.media.C18954Ha;
import com.inmobi.media.C18968Ia;
import com.inmobi.media.C19046O6;
import com.inmobi.media.C19070Q4;
import com.inmobi.media.C19073Q7;
import com.inmobi.media.C19136V6;
import com.inmobi.media.C19430qb;
import com.inmobi.media.C19456s9;
import com.inmobi.media.InterfaceC18850A4;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiNative {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: j */
    public static final String f47033j = "InMobiNative";

    /* renamed from: a */
    public final C19073Q7 f47034a;

    /* renamed from: b */
    public final NativeCallbacks f47035b;

    /* renamed from: c */
    public AbstractC19033N6 f47036c;

    /* renamed from: d */
    public VideoEventListener f47037d;

    /* renamed from: e */
    public WeakReference f47038e;

    /* renamed from: f */
    public boolean f47039f;

    /* renamed from: g */
    public final C19456s9 f47040g;

    /* renamed from: h */
    public WeakReference f47041h;

    /* renamed from: i */
    public LockScreenListener f47042i;

    @Metadata
    /* loaded from: classes6.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata
    /* loaded from: classes6.dex */
    public interface LockScreenListener {
        void onActionRequired(@Nullable InMobiNative inMobiNative);
    }

    @Metadata
    /* loaded from: classes6.dex */
    public static final class NativeCallbacks extends AbstractC18867B7 {

        /* renamed from: b */
        private boolean f47043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeCallbacks(@NotNull InMobiNative inMobiNative) {
            super(inMobiNative);
            Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
            this.f47043b = true;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdClicked(@NotNull Map<Object, ? extends Object> params) {
            Intrinsics.checkNotNullParameter(params, "params");
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            AbstractC19033N6 mPubListener = ad2.getMPubListener();
            if (mPubListener != null) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                ((C19046O6) mPubListener).f47578a.onAdClicked(ad2);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdDismissed() {
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            AbstractC19033N6 mPubListener = ad2.getMPubListener();
            if (mPubListener != null) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                ((C19046O6) mPubListener).f47578a.onAdFullScreenDismissed(ad2);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdDisplayed(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            AbstractC19033N6 mPubListener = ad2.getMPubListener();
            if (mPubListener != null) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                ((C19046O6) mPubListener).f47578a.onAdFullScreenDisplayed(ad2);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            onAdLoadFailed(status);
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            AbstractC19033N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                mPubListener.onAdFetchSuccessful(inMobiNative, info);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdImpressed() {
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            AbstractC19033N6 mPubListener = ad2.getMPubListener();
            if (mPubListener != null) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                ((C19046O6) mPubListener).f47578a.onAdImpressed(ad2);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdImpression(@Nullable C19430qb c19430qb) {
            AbstractC19033N6 abstractC19033N6;
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative != null) {
                abstractC19033N6 = inMobiNative.getMPubListener();
            } else {
                abstractC19033N6 = null;
            }
            if (abstractC19033N6 == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                if (c19430qb != null) {
                    c19430qb.m59927c();
                    return;
                }
                return;
            }
            abstractC19033N6.onAdImpression(inMobiNative);
            if (c19430qb != null) {
                c19430qb.m59926d();
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdLoadFailed(@NotNull InMobiAdRequestStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f47043b) {
                this.f47043b = true;
                AbstractC19033N6 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadFailed(inMobiNative, status);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdLoadSucceeded(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f47043b) {
                this.f47043b = true;
                AbstractC19033N6 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadSucceeded(inMobiNative, info);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdWillDisplay() {
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            LockScreenListener lockScreenListener = ad2.f47042i;
            if (lockScreenListener != null) {
                lockScreenListener.onActionRequired(ad2);
            }
            AbstractC19033N6 mPubListener = ad2.getMPubListener();
            if (mPubListener != null) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                ((C19046O6) mPubListener).f47578a.onAdFullScreenWillDisplay(ad2);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAudioStateChanged(boolean z) {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            VideoEventListener videoEventListener = inMobiNative.f47037d;
            if (videoEventListener != null) {
                videoEventListener.onAudioStateChanged(inMobiNative, z);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onRequestPayloadCreated(@NotNull byte[] request) {
            Intrinsics.checkNotNullParameter(request, "request");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            AbstractC19033N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((C19046O6) mPubListener).f47578a.onRequestPayloadCreated(request);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus status) {
            Intrinsics.checkNotNullParameter(status, "reason");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            AbstractC19033N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                Intrinsics.checkNotNullParameter(status, "status");
                ((C19046O6) mPubListener).f47578a.onRequestPayloadCreationFailed(status);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onUserLeftApplication() {
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            LockScreenListener lockScreenListener = ad2.f47042i;
            if (lockScreenListener != null) {
                lockScreenListener.onActionRequired(ad2);
            }
            AbstractC19033N6 mPubListener = ad2.getMPubListener();
            if (mPubListener != null) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                ((C19046O6) mPubListener).f47578a.onUserWillLeaveApplication(ad2);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onVideoCompleted() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            VideoEventListener videoEventListener = inMobiNative.f47037d;
            if (videoEventListener != null) {
                videoEventListener.onVideoCompleted(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onVideoSkipped() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f47033j;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC19187Z5.m60514a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            VideoEventListener videoEventListener = inMobiNative.f47037d;
            if (videoEventListener != null) {
                videoEventListener.onVideoSkipped(inMobiNative);
            }
        }

        public final void resetHasGivenCallbackFlag() {
            this.f47043b = false;
        }
    }

    public InMobiNative(@NotNull Context context, long j, @NotNull NativeAdEventListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C19456s9 c19456s9 = new C19456s9();
        this.f47040g = c19456s9;
        if (C18954Ha.m61055q()) {
            c19456s9.f48663a = j;
            this.f47041h = new WeakReference(context);
            this.f47036c = new C19046O6(listener);
            NativeCallbacks nativeCallbacks = new NativeCallbacks(this);
            this.f47035b = nativeCallbacks;
            this.f47034a = new C19073Q7(nativeCallbacks);
            return;
        }
        String TAG = f47033j;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        throw new SdkNotInitializedException(TAG);
    }

    /* renamed from: a */
    public final boolean m61290a(boolean z) {
        if (!z && this.f47036c == null) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Listener supplied is null, your call is ignored.");
            return false;
        } else if (this.f47041h.get() != null) {
            return true;
        } else {
            String TAG2 = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG2, "Context supplied is null, your call is ignored.");
            return false;
        }
    }

    public final void destroy() {
        View view;
        try {
            WeakReference weakReference = this.f47038e;
            if (weakReference == null) {
                view = null;
            } else {
                Intrinsics.m17074g(weakReference);
                view = (View) weakReference.get();
            }
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
            }
            this.f47034a.m60764x();
            this.f47036c = null;
            this.f47037d = null;
            this.f47039f = false;
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Failed to destroy ad; SDK encountered an unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
        }
    }

    @Nullable
    public final String getAdCtaText() {
        try {
            return this.f47034a.m60762y();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not get the ctaText; SDK encountered unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            return null;
        }
    }

    @Nullable
    public final String getAdDescription() {
        try {
            return this.f47034a.m60760z();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not get the description; SDK encountered unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            return null;
        }
    }

    @Nullable
    public final String getAdIconUrl() {
        try {
            return this.f47034a.m60790A();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not get the iconUrl; SDK encountered unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            return null;
        }
    }

    @Nullable
    public final String getAdLandingPageUrl() {
        try {
            return this.f47034a.m60788B();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not get the adLandingPageUrl; SDK encountered unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            return null;
        }
    }

    public final float getAdRating() {
        try {
            return this.f47034a.m60786C();
        } catch (Exception e) {
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            AbstractC19187Z5.m60514a((byte) 1, "InMobi", "Could not get rating; SDK encountered an unexpected error");
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return 0.0f;
        }
    }

    @Nullable
    public final String getAdTitle() {
        try {
            return this.f47034a.m60784D();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not get the ad title; SDK encountered unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            return null;
        }
    }

    @Nullable
    public final JSONObject getCustomAdContent() {
        try {
            return this.f47034a.m60783E();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not get the ad customJson ; SDK encountered unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            return null;
        }
    }

    @Nullable
    public final AbstractC19033N6 getMPubListener() {
        return this.f47036c;
    }

    @Nullable
    public final View getPrimaryViewOfWidth(@Nullable Context context, @Nullable View view, @Nullable ViewGroup viewGroup, int i) {
        C19136V6 c19136v6;
        try {
            if (context == null) {
                String TAG = f47033j;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                AbstractC19187Z5.m60514a((byte) 1, TAG, "View can not be rendered using null context");
                return null;
            }
            if (this.f47034a.mo59831j() == null) {
                c19136v6 = null;
            } else {
                c19136v6 = (C19136V6) this.f47034a.mo59831j();
            }
            if (c19136v6 == null) {
                String TAG2 = f47033j;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                AbstractC19187Z5.m60514a((byte) 1, TAG2, "InMobiNative is not initialized. Ignoring InMobiNative.getPrimaryView()");
                return null;
            }
            this.f47041h = new WeakReference(context);
            c19136v6.mo59783a(context);
            Intrinsics.m17074g(viewGroup);
            WeakReference weakReference = new WeakReference(c19136v6.m60633a(view, viewGroup, i));
            this.f47038e = weakReference;
            View view2 = (View) weakReference.get();
            if (view2 == null) {
                String TAG3 = f47033j;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                return null;
            }
            this.f47039f = true;
            return view2;
        } catch (Exception e) {
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            AbstractC19187Z5.m60514a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            String TAG4 = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            return null;
        }
    }

    public final void getSignals() {
        if (m61290a(false)) {
            this.f47035b.resetHasGivenCallbackFlag();
            Context context = (Context) this.f47041h.get();
            if (context != null) {
                this.f47034a.m60768a(this.f47040g, context, false, "getToken");
            }
            this.f47034a.m60970a(this.f47035b);
        }
    }

    public final boolean isAppDownload() {
        try {
            return this.f47034a.m60781G();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not get isAppDownload; SDK encountered unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            return false;
        }
    }

    public final boolean isReady() {
        return this.f47034a.m60782F();
    }

    @Nullable
    public final Boolean isVideo() {
        try {
            return this.f47034a.m60779I();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not get isVideo; SDK encountered unexpected error");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            return null;
        }
    }

    public final void load(@Nullable byte[] bArr) {
        if (m61290a(false)) {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC19338k3.m60128c((Context) this.f47041h.get());
            }
            this.f47040g.f48667e = "AB";
            Context context = (Context) this.f47041h.get();
            if (context != null) {
                this.f47034a.m60768a(this.f47040g, context, true, "native");
            }
            this.f47035b.resetHasGivenCallbackFlag();
            this.f47034a.mo59838a(bArr, this.f47035b);
        }
    }

    public final void pause() {
        try {
            this.f47034a.m60777K();
        } catch (Exception unused) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not pause ad; SDK encountered an unexpected error");
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        }
    }

    public final void reportAdClickAndOpenLandingPage() {
        try {
            this.f47034a.m60776L();
        } catch (Exception e) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "reportAdClickAndOpenLandingPage failed; SDK encountered unexpected error");
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
        }
    }

    public final void resume() {
        try {
            this.f47034a.m60775M();
        } catch (Exception unused) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "Could not resume ad; SDK encountered an unexpected error");
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        }
    }

    public final void setContentUrl(@Nullable String str) {
        this.f47040g.f48668f = str;
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            C18968Ia.m61030a(map.get("tp"));
            C18968Ia.m61027b(map.get("tp-v"));
        }
        this.f47040g.f48665c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f47040g.f48664b = str;
    }

    public final void setListener(@NotNull NativeAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47036c = new C19046O6(listener);
    }

    public final void setMPubListener(@Nullable AbstractC19033N6 abstractC19033N6) {
        this.f47036c = abstractC19033N6;
    }

    @VisibleForTesting
    public final void setPrimaryViewReturned(boolean z) {
        this.f47039f = z;
    }

    public final void setVideoEventListener(@NotNull VideoEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47037d = listener;
    }

    public final void showOnLockScreen(@NotNull LockScreenListener lockScreenListener) {
        Intrinsics.checkNotNullParameter(lockScreenListener, "lockScreenListener");
        if (this.f47041h.get() == null) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "InMobiNative is not initialized. Provided context is null. Ignoring showOnLockScreen");
            return;
        }
        try {
            C19073Q7 c19073q7 = this.f47034a;
            C19456s9 c19456s9 = this.f47040g;
            Object obj = this.f47041h.get();
            Intrinsics.m17074g(obj);
            c19073q7.m60769a(c19456s9, (Context) obj);
            this.f47042i = lockScreenListener;
        } catch (Exception unused) {
            String TAG2 = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG2, "SDK encountered unexpected error in showOnLockScreen");
        }
    }

    public final void takeAction() {
        try {
            this.f47034a.m60774N();
        } catch (Exception unused) {
            String TAG = f47033j;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG, "SDK encountered unexpected error in takeAction");
        }
    }

    public final void load() {
        try {
            if (m61290a(true)) {
                this.f47035b.resetHasGivenCallbackFlag();
                if (this.f47039f) {
                    C19073Q7 c19073q7 = this.f47034a;
                    c19073q7.mo60155a(c19073q7.mo59831j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
                    String TAG = f47033j;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    AbstractC19187Z5.m60514a((byte) 1, TAG, "You can call load() on an instance of InMobiNative only once if the ad request has been successful. Ignoring InMobiNative.load()");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC19338k3.m60128c((Context) this.f47041h.get());
                }
                this.f47040g.f48667e = "NonAB";
                Context context = (Context) this.f47041h.get();
                if (context != null) {
                    this.f47034a.m60768a(this.f47040g, context, true, "native");
                }
                this.f47034a.m60778J();
            }
        } catch (Exception e) {
            this.f47034a.mo60262a((short) 2192);
            AbstractC19033N6 abstractC19033N6 = this.f47036c;
            if (abstractC19033N6 != null) {
                abstractC19033N6.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            InterfaceC18850A4 m60943p = this.f47034a.m60943p();
            if (m60943p != null) {
                String TAG2 = f47033j;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C18864B4) m60943p).m61258a(TAG2, "Load failed with unexpected error: ", e);
            }
        }
    }

    public final void load(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (m61290a(true)) {
            this.f47041h = new WeakReference(context);
            load();
        }
    }
}
