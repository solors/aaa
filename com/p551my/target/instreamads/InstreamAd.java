package com.p551my.target.instreamads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25742f0;
import com.p551my.target.AbstractC25795h5;
import com.p551my.target.AbstractC25846ja;
import com.p551my.target.AbstractC25877l;
import com.p551my.target.AbstractC26019q;
import com.p551my.target.C25726e1;
import com.p551my.target.C25790h1;
import com.p551my.target.C25802h9;
import com.p551my.target.C25837j3;
import com.p551my.target.C25902m;
import com.p551my.target.C25906m3;
import com.p551my.target.C25927n3;
import com.p551my.target.C26002p3;
import com.p551my.target.C26022q2;
import com.p551my.target.C26027q3;
import com.p551my.target.C26052r2;
import com.p551my.target.C26122ta;
import com.p551my.target.C26132u2;
import com.p551my.target.C26208x2;
import com.p551my.target.common.BaseAd;
import com.p551my.target.common.menu.MenuFactory;
import com.p551my.target.common.models.IAdLoadingError;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.common.models.ShoppableAdsItem;
import com.p551my.target.common.models.videomotion.Disclaimer;
import com.p551my.target.common.models.videomotion.Header;
import com.p551my.target.common.models.videomotion.VideoMotionData;
import com.p551my.target.common.models.videomotion.VideoMotionItem;
import com.p551my.target.instreamads.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.instreamads.InstreamAd */
/* loaded from: classes7.dex */
public final class InstreamAd extends BaseAd {
    private static final int DEFAULT_LOADING_TIMEOUT_SECONDS = 10;
    private static final int MIN_LOADING_TIMEOUT_SECONDS = 5;
    @NonNull
    private final MenuFactory adChoicesMenuFactory;
    @NonNull
    private final Context context;
    @Nullable
    private C26022q2 engine;
    private boolean isFullscreen;
    @Nullable
    private InstreamAdListener listener;
    private int loadingTimeoutSeconds;
    @Nullable
    private float[] midpoints;
    @Nullable
    private InstreamAdPlayer player;
    @Nullable
    private C26132u2 section;
    @Nullable
    private float[] userMidpoints;
    private float videoDuration;
    @Nullable
    private InstreamAdVideoMotionPlayer videoMotionPlayer;
    private float volume;

    /* renamed from: com.my.target.instreamads.InstreamAd$InstreamAdBanner */
    /* loaded from: classes7.dex */
    public static final class InstreamAdBanner {
        @Nullable
        public final ImageData adChoicesIcon;
        @NonNull
        public final String advertisingLabel;
        @NonNull
        public final String ageRestrictions;
        public final boolean allowClose;
        public final float allowCloseDelay;
        public final boolean allowPause;
        @Nullable
        public final String bundleId;
        @NonNull
        public final List<InstreamAdCompanionBanner> companionBanners;
        @Nullable
        public final String ctaText;
        @NonNull
        public final String disclaimer;
        public final float duration;
        public final boolean hasAdChoices;
        public final boolean hasShoppable;
        @NonNull

        /* renamed from: id */
        public final String f67021id;
        @Nullable
        public final List<ShoppableAdsItem> shoppableAdsItems;
        public final int videoHeight;
        public final int videoWidth;

        private InstreamAdBanner(@NonNull String str, boolean z, float f, float f2, int i, int i2, @Nullable String str2, boolean z2, boolean z3, @NonNull List<InstreamAdCompanionBanner> list, boolean z4, @NonNull String str3, @Nullable ImageData imageData, @Nullable List<ShoppableAdsItem> list2, @Nullable String str4, @NonNull String str5, @NonNull String str6) {
            this.f67021id = str;
            this.allowClose = z;
            this.allowCloseDelay = f;
            this.duration = f2;
            this.videoHeight = i2;
            this.videoWidth = i;
            this.ctaText = str2;
            this.allowPause = z2;
            this.hasShoppable = z3;
            this.companionBanners = list;
            this.hasAdChoices = z4;
            this.advertisingLabel = str3;
            this.adChoicesIcon = imageData;
            this.shoppableAdsItems = list2;
            this.bundleId = str4;
            this.disclaimer = str5;
            this.ageRestrictions = str6;
        }

        @NonNull
        public static InstreamAdBanner newBanner(@NonNull AbstractC25742f0 abstractC25742f0) {
            boolean z;
            ImageData imageData;
            boolean z2;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < abstractC25742f0.getCompanionBanners().size(); i++) {
                arrayList.add(InstreamAdCompanionBanner.newBanner(abstractC25742f0.getCompanionBanners().get(i)));
            }
            ArrayList arrayList2 = null;
            if (abstractC25742f0.getAdChoices() != null) {
                imageData = abstractC25742f0.getAdChoices().m44130c();
                z = true;
            } else {
                z = false;
                imageData = null;
            }
            C25802h9 shoppableAdsData = abstractC25742f0.getShoppableAdsData();
            if (shoppableAdsData != null) {
                arrayList2 = new ArrayList(shoppableAdsData.m43786a());
            }
            ArrayList arrayList3 = arrayList2;
            String id2 = abstractC25742f0.getId();
            boolean isAllowClose = abstractC25742f0.isAllowClose();
            float allowCloseDelay = abstractC25742f0.getAllowCloseDelay();
            float duration = abstractC25742f0.getDuration();
            int width = abstractC25742f0.getWidth();
            int height = abstractC25742f0.getHeight();
            String ctaText = abstractC25742f0.getCtaText();
            boolean isAllowPause = abstractC25742f0.isAllowPause();
            if (abstractC25742f0.getShoppableBanner() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new InstreamAdBanner(id2, isAllowClose, allowCloseDelay, duration, width, height, ctaText, isAllowPause, z2, arrayList, z, abstractC25742f0.getAdvertisingLabel(), imageData, arrayList3, abstractC25742f0.getBundleId(), abstractC25742f0.getDisclaimer(), abstractC25742f0.getAgeRestrictions());
        }

        @NonNull
        public String toString() {
            return "InstreamAdBanner{duration=" + this.duration + ", allowClose=" + this.allowClose + ", allowCloseDelay=" + this.allowCloseDelay + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", hasAdChoices=" + this.hasAdChoices + ", allowPause=" + this.allowPause + ", hasShoppable=" + this.hasShoppable + ", id='" + this.f67021id + "', advertisingLabel='" + this.advertisingLabel + "', companionBanners=" + this.companionBanners + ", ctaText='" + this.ctaText + "', bundleId='" + this.bundleId + "', disclaimer='" + this.disclaimer + "', ageRestrictions='" + this.ageRestrictions + "', adChoicesIcon=" + this.adChoicesIcon + ", shoppableAdsItems=" + this.shoppableAdsItems + '}';
        }
    }

    /* renamed from: com.my.target.instreamads.InstreamAd$InstreamAdCompanionBanner */
    /* loaded from: classes7.dex */
    public static final class InstreamAdCompanionBanner {
        @Nullable
        public final String adSlotID;
        @Nullable
        public final String apiFramework;
        public final int assetHeight;
        public final int assetWidth;
        @Nullable
        public final String bundleId;
        public final int expandedHeight;
        public final int expandedWidth;
        public final int height;
        @Nullable
        public final String htmlResource;
        @Nullable
        public final String iframeResource;
        public final boolean isClickable;
        @Nullable
        public final String required;
        @Nullable
        public final String staticResource;
        public final int width;

        private InstreamAdCompanionBanner(int i, int i2, int i3, int i4, int i5, int i6, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.width = i;
            this.height = i2;
            this.assetWidth = i3;
            this.assetHeight = i4;
            this.expandedWidth = i5;
            this.expandedHeight = i6;
            this.isClickable = z;
            this.staticResource = str;
            this.iframeResource = str2;
            this.htmlResource = str3;
            this.apiFramework = str4;
            this.adSlotID = str5;
            this.required = str6;
            this.bundleId = str7;
        }

        @NonNull
        public static InstreamAdCompanionBanner newBanner(@NonNull C25726e1 c25726e1) {
            return new InstreamAdCompanionBanner(c25726e1.getWidth(), c25726e1.getHeight(), c25726e1.getAssetWidth(), c25726e1.getAssetHeight(), c25726e1.getExpandedWidth(), c25726e1.getExpandedHeight(), !TextUtils.isEmpty(c25726e1.getTrackingLink()), c25726e1.getStaticResource(), c25726e1.getIframeResource(), c25726e1.getHtmlResource(), c25726e1.getApiFramework(), c25726e1.getAdSlotID(), c25726e1.getRequired(), c25726e1.getBundleId());
        }

        @NonNull
        public String toString() {
            return "InstreamAdCompanionBanner{width=" + this.width + ", height=" + this.height + ", assetWidth=" + this.assetWidth + ", assetHeight=" + this.assetHeight + ", expandedWidth=" + this.expandedWidth + ", expandedHeight=" + this.expandedHeight + ", isClickable=" + this.isClickable + ", staticResource='" + this.staticResource + "', iframeResource='" + this.iframeResource + "', htmlResource='" + this.htmlResource + "', apiFramework='" + this.apiFramework + "', adSlotID='" + this.adSlotID + "', required='" + this.required + "', bundleId='" + this.bundleId + "'}";
        }
    }

    /* renamed from: com.my.target.instreamads.InstreamAd$InstreamAdListener */
    /* loaded from: classes7.dex */
    public interface InstreamAdListener {
        void onBannerComplete(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerPause(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerResume(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerShouldClose();

        void onBannerStart(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerTimeLeftChange(float f, float f2, @NonNull InstreamAd instreamAd);

        void onComplete(@NonNull String str, @NonNull InstreamAd instreamAd);

        void onError(@NonNull String str, @NonNull InstreamAd instreamAd);

        void onLoad(@NonNull InstreamAd instreamAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InstreamAd instreamAd);

        void onVideoMotionBannerComplete(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

        void onVideoMotionBannerShouldClose(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

        void onVideoMotionBannerStart(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);
    }

    /* renamed from: com.my.target.instreamads.InstreamAd$InstreamAdVideoMotionBanner */
    /* loaded from: classes7.dex */
    public static final class InstreamAdVideoMotionBanner {
        @Nullable
        public final ImageData adChoicesIcon;
        public final boolean allowClose;
        public final float allowCloseDelay;
        @Nullable
        public final String bundleId;
        public final float duration;
        public final boolean hasAdChoices;
        @NonNull

        /* renamed from: id */
        public final String f67022id;
        @NonNull
        public final VideoMotionData videoMotionData;

        private InstreamAdVideoMotionBanner(@NonNull String str, boolean z, float f, float f2, boolean z2, @Nullable ImageData imageData, @NonNull VideoMotionData videoMotionData, @Nullable String str2) {
            this.f67022id = str;
            this.allowClose = z;
            this.allowCloseDelay = f;
            this.duration = f2;
            this.hasAdChoices = z2;
            this.adChoicesIcon = imageData;
            this.videoMotionData = videoMotionData;
            this.bundleId = str2;
        }

        @Nullable
        public static InstreamAdVideoMotionBanner newBanner(@NonNull C26122ta c26122ta) {
            boolean z;
            ImageData imageData;
            Disclaimer disclaimer = null;
            if (c26122ta.getAdChoices() != null) {
                z = true;
                imageData = c26122ta.getAdChoices().m44130c();
            } else {
                z = false;
                imageData = null;
            }
            boolean z2 = z;
            C26002p3 internalVideoMotionData = c26122ta.getInternalVideoMotionData();
            if (internalVideoMotionData == null) {
                AbstractC25846ja.m43680a("InstreamAdVideoMotionBanner: internalVideoMotionData is null");
                return null;
            }
            C25927n3 c25927n3 = internalVideoMotionData.f67540a;
            Header header = new Header(c25927n3.f67294a, c25927n3.f67295b, c25927n3.f67296c, c25927n3.f67297d, c25927n3.f67298e);
            List<C26027q3> list = internalVideoMotionData.f67541b;
            ArrayList arrayList = new ArrayList();
            for (C26027q3 c26027q3 : list) {
                arrayList.add(new VideoMotionItem(c26027q3.f67619a, c26027q3.f67625g, c26027q3.f67626h, c26027q3.f67620b, c26027q3.f67621c, c26027q3.f67622d, c26027q3.f67623e));
            }
            C25906m3 c25906m3 = internalVideoMotionData.f67542c;
            if (c25906m3 != null) {
                disclaimer = new Disclaimer(c25906m3.f67255a);
            }
            return new InstreamAdVideoMotionBanner(c26122ta.getId(), c26122ta.isAllowClose(), c26122ta.getAllowCloseDelay(), c26122ta.getDuration(), z2, imageData, new VideoMotionData(header, arrayList, disclaimer), c26122ta.getBundleId());
        }

        @NonNull
        public String toString() {
            return "InstreamAdVideoMotionBanner{duration=" + this.duration + ", allowClose=" + this.allowClose + ", allowCloseDelay=" + this.allowCloseDelay + ", hasAdChoices=" + this.hasAdChoices + ", id='" + this.f67022id + "', videoMotionData=" + this.videoMotionData + ", adChoicesIcon=" + this.adChoicesIcon + ", bundleId='" + this.bundleId + "'}";
        }
    }

    public InstreamAd(int i, @NonNull Context context) {
        super(i, "instreamads");
        this.loadingTimeoutSeconds = 10;
        this.volume = 1.0f;
        this.context = context;
        this.adChoicesMenuFactory = new C25790h1();
        AbstractC25846ja.m43676c("Instream ad created. Version - 5.22.1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(@Nullable C26132u2 c26132u2, @Nullable IAdLoadingError iAdLoadingError) {
        InstreamAdListener instreamAdListener = this.listener;
        if (instreamAdListener == null) {
            return;
        }
        if (c26132u2 == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = C25902m.f67233o;
            }
            instreamAdListener.onNoAd(iAdLoadingError, this);
        } else if (!c26132u2.m42794d()) {
            InstreamAdListener instreamAdListener2 = this.listener;
            if (iAdLoadingError == null) {
                iAdLoadingError = C25902m.f67236r;
            }
            instreamAdListener2.onNoAd(iAdLoadingError, this);
        } else {
            this.section = c26132u2;
            C26022q2 m43178a = C26022q2.m43178a(this, c26132u2, this.adConfig, this.metricFactory, this.adChoicesMenuFactory);
            this.engine = m43178a;
            m43178a.m43183a(this.loadingTimeoutSeconds);
            this.engine.m43184a(this.volume);
            InstreamAdPlayer instreamAdPlayer = this.player;
            if (instreamAdPlayer != null) {
                this.engine.m43177a(instreamAdPlayer);
            }
            InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer = this.videoMotionPlayer;
            if (instreamAdVideoMotionPlayer != null) {
                this.engine.m43176a(instreamAdVideoMotionPlayer);
            }
            configureMidpoints(this.videoDuration, this.userMidpoints);
            this.listener.onLoad(this);
        }
    }

    private void start(@NonNull String str) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 == null) {
            AbstractC25846ja.m43680a("InstreamAd: Unable to start ad - not loaded yet");
        } else if (c26022q2.m43155c() == null) {
            AbstractC25846ja.m43680a("InstreamAd: Unable to start ad - player has not set");
        } else {
            this.engine.m43153c(str);
        }
    }

    public void configureMidpoints(float f) {
        configureMidpoints(f, null);
    }

    public void configureMidpointsPercents(float f, @Nullable float[] fArr) {
        if (fArr == null) {
            configureMidpoints(f);
        } else {
            configureMidpoints(f, AbstractC25795h5.m43801a(f, fArr));
        }
    }

    public void destroy() {
        this.listener = null;
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43185a();
        }
    }

    @Nullable
    public InstreamAdListener getListener() {
        return this.listener;
    }

    public int getLoadingTimeout() {
        return this.loadingTimeoutSeconds;
    }

    @NonNull
    public float[] getMidPoints() {
        float[] fArr = this.midpoints;
        if (fArr == null) {
            return new float[0];
        }
        return (float[]) fArr.clone();
    }

    @Nullable
    public InstreamAdPlayer getPlayer() {
        return this.player;
    }

    @Nullable
    public View getShoppableView(Context context) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 == null) {
            return null;
        }
        return c26022q2.m43182a(context);
    }

    public int getVideoQuality() {
        return this.adConfig.getVideoQuality();
    }

    @NonNull
    public List<String> getVideoSectionNames() {
        if (this.section == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList m42795c = this.section.m42795c();
        if (m42795c.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Iterator it = m42795c.iterator();
        while (it.hasNext()) {
            C25837j3 c25837j3 = (C25837j3) it.next();
            if (c25837j3.mo42296a() > 0 || c25837j3.m43718i()) {
                arrayList.add(c25837j3.m43719h());
            }
        }
        return arrayList;
    }

    public float getVolume() {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            return c26022q2.m43152d();
        }
        return this.volume;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 == null) {
            return;
        }
        c26022q2.m43162b(context);
    }

    public void handleClick() {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43151e();
        }
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43161b(instreamAdCompanionBanner);
        }
    }

    public void handleCompanionShow(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43154c(instreamAdCompanionBanner);
        }
    }

    public boolean isFullscreen() {
        return this.isFullscreen;
    }

    public boolean isShoppablePresented() {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            return c26022q2.m43150f();
        }
        return false;
    }

    public void load() {
        if (isLoadCalled()) {
            AbstractC25846ja.m43680a("InstreamAd: Doesn't support multiple load");
            handleResult(null, C25902m.f67238t);
            return;
        }
        C26052r2.m43089a(this.adConfig, this.metricFactory, this.loadingTimeoutSeconds).m43581a(new AbstractC25877l.InterfaceC25879b() { // from class: k7.a
            @Override // com.p551my.target.AbstractC25877l.InterfaceC25879b
            /* renamed from: a */
            public final void mo18137a(AbstractC26019q abstractC26019q, C25902m c25902m) {
                InstreamAd.this.handleResult((C26132u2) abstractC26019q, c25902m);
            }
        }).mo42269a(this.metricFactory.m42906a(), this.context);
    }

    public void pause() {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43149g();
        }
    }

    public void resume() {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43147i();
        }
    }

    public void setFullscreen(boolean z) {
        this.isFullscreen = z;
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43166a(z);
        }
    }

    public void setListener(@Nullable InstreamAdListener instreamAdListener) {
        this.listener = instreamAdListener;
    }

    public void setLoadingTimeout(int i) {
        if (i < 5) {
            AbstractC25846ja.m43680a("InstreamAd: Unable to set ad loading timeout < 5, set to 5 seconds");
            this.loadingTimeoutSeconds = 5;
        } else {
            AbstractC25846ja.m43680a("InstreamAd: Ad loading timeout set to " + i + " seconds");
            this.loadingTimeoutSeconds = i;
        }
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43183a(this.loadingTimeoutSeconds);
        }
    }

    public void setPlayer(@Nullable InstreamAdPlayer instreamAdPlayer) {
        this.player = instreamAdPlayer;
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43177a(instreamAdPlayer);
        }
    }

    public void setShoppablePresented(boolean z) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43156b(z);
        }
    }

    public void setVideoMotionPlayer(@Nullable InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        if (instreamAdVideoMotionPlayer == null) {
            return;
        }
        this.videoMotionPlayer = instreamAdVideoMotionPlayer;
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43176a(instreamAdVideoMotionPlayer);
        }
    }

    public void setVideoQuality(int i) {
        this.adConfig.setVideoQuality(i);
    }

    public void setVolume(float f) {
        if (Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0) {
            this.volume = f;
            C26022q2 c26022q2 = this.engine;
            if (c26022q2 != null) {
                c26022q2.m43184a(f);
                return;
            }
            return;
        }
        AbstractC25846ja.m43680a("InstreamAd: Unable to set volume" + f + ", volume must be in range [0..1]");
    }

    public void shoppableAdsItemClick(@NonNull String str) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43169a(str);
        }
    }

    public void shoppableAdsItemShow(@NonNull String str) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43157b(str);
        }
    }

    public void skip() {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43146j();
        }
    }

    public void skipBanner() {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43145k();
        }
    }

    public void startMidroll(float f) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 == null) {
            AbstractC25846ja.m43680a("InstreamAd: Unable to start ad: not loaded yet");
        } else if (c26022q2.m43155c() == null) {
            AbstractC25846ja.m43680a("InstreamAd: Unable to start ad: player has not set");
        } else {
            this.engine.m43163b(f);
        }
    }

    public void startPauseroll() {
        start(InstreamAdBreakType.PAUSEROLL);
    }

    public void startPostroll() {
        start(InstreamAdBreakType.POSTROLL);
    }

    public void startPreroll() {
        start(InstreamAdBreakType.PREROLL);
    }

    public void stop() {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43144l();
        }
    }

    public void swapPlayer(@Nullable InstreamAdPlayer instreamAdPlayer) {
        this.player = instreamAdPlayer;
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43160b(instreamAdPlayer);
        }
    }

    public void useDefaultPlayer() {
        useDefaultPlayer(true);
    }

    public InstreamAd(int i, @NonNull MenuFactory menuFactory, @NonNull Context context) {
        super(i, "instreamads");
        this.loadingTimeoutSeconds = 10;
        this.volume = 1.0f;
        this.context = context;
        this.adChoicesMenuFactory = menuFactory;
        AbstractC25846ja.m43676c("Instream ad created. Version - 5.22.1");
    }

    public void configureMidpoints(float f, @Nullable float[] fArr) {
        C25837j3 m42796a;
        String str;
        if (f <= 0.0f) {
            str = "InstreamAd: Midpoints are not configured, duration is not set or <= zero";
        } else if (this.midpoints == null) {
            this.userMidpoints = fArr;
            this.videoDuration = f;
            C26132u2 c26132u2 = this.section;
            if (c26132u2 == null || (m42796a = c26132u2.m42796a(InstreamAdBreakType.MIDROLL)) == null) {
                return;
            }
            float[] m43797a = AbstractC25795h5.m43797a(m42796a, this.userMidpoints, f);
            this.midpoints = m43797a;
            C26022q2 c26022q2 = this.engine;
            if (c26022q2 != null) {
                c26022q2.m43165a(m43797a);
                return;
            }
            return;
        } else {
            str = "InstreamAd: Midpoints already configured";
        }
        AbstractC25846ja.m43680a(str);
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner, @NonNull Context context) {
        C26022q2 c26022q2 = this.engine;
        if (c26022q2 != null) {
            c26022q2.m43179a(instreamAdCompanionBanner, context);
        }
    }

    public void useDefaultPlayer(boolean z) {
        C26208x2 c26208x2 = new C26208x2(this.context);
        c26208x2.setUseExoPlayer(z);
        setPlayer(c26208x2);
    }
}
