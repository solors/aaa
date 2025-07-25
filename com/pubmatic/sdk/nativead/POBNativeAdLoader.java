package com.pubmatic.sdk.nativead;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBDataType$POBAdState;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.nativead.POBNativeAdManager;
import com.pubmatic.sdk.nativead.datatype.POBNativeTemplateType;
import com.pubmatic.sdk.nativead.request.POBBaseNativeRequestAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestDataAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestEventTracker;
import com.pubmatic.sdk.nativead.request.POBNativeRequestImageAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestTitleAsset;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBaseAd;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes7.dex */
public class POBNativeAdLoader implements POBBaseAd, POBNativeAdManager.POBNativeAdManagerListener, POBNativeAdManager.InterfaceC26768c {
    @NonNull

    /* renamed from: a */
    private final Context f70397a;
    @NonNull

    /* renamed from: b */
    private final POBNativeTemplateType f70398b;
    @Nullable

    /* renamed from: c */
    private POBNativeAdEvent f70399c;
    @Nullable

    /* renamed from: d */
    private POBNativeAdLoaderListener f70400d;
    @Nullable

    /* renamed from: e */
    private POBRequest f70401e;
    @Nullable

    /* renamed from: f */
    private POBCacheManager f70402f;
    @Nullable

    /* renamed from: g */
    private POBTimeoutHandler f70403g;

    /* renamed from: h */
    private final Set<Object> f70404h;

    /* renamed from: i */
    private int f70405i;

    /* renamed from: j */
    private boolean f70406j;

    /* renamed from: k */
    private boolean f70407k;
    @NonNull

    /* renamed from: l */
    private final POBNativeAdLoaderConfig f70408l;
    @Nullable

    /* renamed from: m */
    private POBNativeBuilder f70409m;
    @Nullable

    /* renamed from: n */
    private POBBidEventListener f70410n;
    @NonNull

    /* renamed from: o */
    private POBDataType$POBAdState f70411o;

    /* renamed from: com.pubmatic.sdk.nativead.POBNativeAdLoader$a */
    /* loaded from: classes7.dex */
    class RunnableC26763a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ POBError f70412a;

        RunnableC26763a(POBError pOBError) {
            this.f70412a = pOBError;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBNativeAdLoader.this.m40486a(this.f70412a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.nativead.POBNativeAdLoader$b */
    /* loaded from: classes7.dex */
    public class C26764b implements POBTimeoutHandler.POBTimeoutHandlerListener {
        C26764b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBNativeAdLoader.this.m40474d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.nativead.POBNativeAdLoader$c */
    /* loaded from: classes7.dex */
    public class C26765c implements OpenWrapSDKInitializer.Listener {
        C26765c() {
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onFailure(@NonNull POBError pOBError) {
            POBNativeAdLoader.this.f70406j = true;
            POBLog.error("POBNativeAdLoader", "OpenWrap SDK initialization failed with error : " + pOBError, new Object[0]);
            if (POBNativeAdLoader.this.f70411o == POBDataType$POBAdState.LOAD_DEFERRED) {
                POBNativeAdLoader.this.m40486a(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onSuccess() {
            POBNativeAdLoader.this.f70406j = true;
            POBLog.verbose("POBNativeAdLoader", "OpenWrap SDK initialization successful", new Object[0]);
            if (POBNativeAdLoader.this.f70411o == POBDataType$POBAdState.LOAD_DEFERRED) {
                POBNativeAdLoader.this.m40473e();
                POBNativeAdLoader.this.m40474d();
            }
        }
    }

    public POBNativeAdLoader(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @NonNull POBNativeTemplateType pOBNativeTemplateType, @NonNull POBNativeAdEvent pOBNativeAdEvent) {
        this.f70406j = false;
        this.f70407k = false;
        this.f70411o = POBDataType$POBAdState.DEFAULT;
        this.f70397a = context;
        this.f70398b = pOBNativeTemplateType;
        this.f70408l = new POBNativeAdLoaderConfig();
        this.f70404h = Collections.synchronizedSet(new LinkedHashSet(5));
        m40487a(context, str, i, str2, pOBNativeTemplateType, pOBNativeAdEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m40474d() {
        if (this.f70411o == POBDataType$POBAdState.LOAD_DEFERRED) {
            for (int i = 0; i < this.f70405i; i++) {
                m40476c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: e */
    public void m40473e() {
        POBTimeoutHandler pOBTimeoutHandler = this.f70403g;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.f70403g = null;
    }

    /* renamed from: f */
    private void m40472f() {
        POBLog.debug("POBNativeAdLoader", "scheduleDelay until init completed.", new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new C26764b());
        this.f70403g = pOBTimeoutHandler;
        pOBTimeoutHandler.start(500L);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    public void destroy() {
        this.f70411o = POBDataType$POBAdState.DEFAULT;
        this.f70407k = false;
        m40473e();
        this.f70404h.clear();
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @Nullable
    public POBRequest getAdRequest() {
        POBRequest pOBRequest = this.f70401e;
        if (pOBRequest != null) {
            return pOBRequest;
        }
        POBLog.warn("POBNativeAdLoader", "Please check if you have provided valid details while constructing an Ad object", new Object[0]);
        return null;
    }

    @NonNull
    public POBNativeAdLoaderConfig getConfig() {
        return this.f70408l;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.f70401e);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @RequiresPermission("android.permission.INTERNET")
    public void loadAd() {
        Trace.beginSection("POB Native Load Ad");
        Trace.beginSection("POB Request Building");
        if (this.f70409m == null) {
            m40486a(new POBError(1001, POBNativeConstants.CUSTOM_TEMPLATE_NULL_ASSETS));
        } else if (getAdRequest() != null && this.f70399c != null) {
            int i = this.f70405i;
            if (i >= 5) {
                POBUtils.runOnMainThread(new RunnableC26763a(new POBError(1012, String.format(Locale.ENGLISH, "You can only request a maximum of %s native ads at a time.", 5))));
                return;
            }
            this.f70405i = i + 1;
            if (this.f70406j) {
                m40476c();
                return;
            }
            this.f70411o = POBDataType$POBAdState.LOAD_DEFERRED;
            if (!this.f70407k) {
                m40472f();
                this.f70407k = true;
            }
        } else {
            m40486a(new POBError(1001, "Missing ad request parameters. Please check input parameters."));
        }
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdManager.POBNativeAdManagerListener
    public void onAdReceived(@NonNull POBNativeAdManager pOBNativeAdManager, @NonNull POBNativeAd pOBNativeAd) {
        Trace.endSection();
        m40482a(pOBNativeAdManager);
        POBNativeAdLoaderListener pOBNativeAdLoaderListener = this.f70400d;
        if (pOBNativeAdLoaderListener != null) {
            pOBNativeAdLoaderListener.onAdReceived(this, pOBNativeAd);
        }
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdManager.InterfaceC26768c
    public void onBidFailure(@NonNull POBNativeAdManager pOBNativeAdManager) {
        this.f70411o = POBDataType$POBAdState.BID_FAILED;
        m40482a(pOBNativeAdManager);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdManager.POBNativeAdManagerListener
    public void onFailedToLoad(@NonNull POBNativeAdManager pOBNativeAdManager, @NonNull POBError pOBError) {
        Trace.endSection();
        m40482a(pOBNativeAdManager);
        POBNativeAdLoaderListener pOBNativeAdLoaderListener = this.f70400d;
        if (pOBNativeAdLoaderListener != null) {
            pOBNativeAdLoaderListener.onFailedToLoad(this, pOBError);
        }
    }

    public void setAdLoaderListener(@Nullable POBNativeAdLoaderListener pOBNativeAdLoaderListener) {
        this.f70400d = pOBNativeAdLoaderListener;
    }

    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
        this.f70410n = pOBBidEventListener;
    }

    public void setNativeCustomAssets(@NonNull List<POBBaseNativeRequestAsset> list) {
        if (POBNativeTemplateType.CUSTOM.equals(this.f70398b)) {
            if (!POBUtils.isListNullOrEmpty(list)) {
                m40479a(list);
                return;
            }
            return;
        }
        POBLog.warn("POBNativeAdLoader", "Failed to set custom assets as the given template type is not custom.", new Object[0]);
    }

    /* renamed from: b */
    private String m40478b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    private void m40476c() {
        POBNativeAdEvent pOBNativeAdEvent;
        this.f70411o = POBDataType$POBAdState.LOADING;
        if (this.f70401e != null && (pOBNativeAdEvent = this.f70399c) != null) {
            m40480a(this.f70401e, pOBNativeAdEvent.createNativeAdEventBridge());
        } else {
            m40486a(new POBError(1001, "Missing ad request parameters. Please check input parameters."));
        }
    }

    /* renamed from: a */
    private void m40480a(@NonNull POBRequest pOBRequest, @NonNull POBNativeAdEventBridge pOBNativeAdEventBridge) {
        POBProfileInfo pOBProfileInfo;
        if (this.f70402f != null) {
            pOBProfileInfo = this.f70402f.getProfileInfo(POBUtils.getMappingKey(pOBRequest.getProfileId(), pOBRequest.getVersionId()));
        } else {
            pOBProfileInfo = null;
        }
        POBNativeAdManager pOBNativeAdManager = new POBNativeAdManager(this.f70397a, this.f70398b, pOBNativeAdEventBridge);
        pOBNativeAdManager.setListener(this);
        POBBidEventListener pOBBidEventListener = this.f70410n;
        if (pOBBidEventListener != null) {
            pOBNativeAdManager.setBidEventListener(pOBBidEventListener);
            pOBNativeAdManager.m40469a(this);
        }
        this.f70404h.add(pOBNativeAdManager);
        pOBNativeAdManager.loadAd(pOBRequest, pOBProfileInfo);
    }

    public POBNativeAdLoader(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @NonNull POBNativeTemplateType pOBNativeTemplateType) {
        this(context, str, i, str2, pOBNativeTemplateType, new POBDefaultNativeEventHandler());
    }

    /* renamed from: a */
    private void m40487a(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @Nullable POBNativeTemplateType pOBNativeTemplateType, @NonNull POBNativeAdEvent pOBNativeAdEvent) {
        if (POBAdsHelper.validate(context, str, str2, pOBNativeAdEvent) && pOBNativeTemplateType != null) {
            if (!this.f70406j) {
                OpenWrapSDK.initialize(context, new OpenWrapSDKConfig.Builder(str, new ArrayList(Collections.singletonList(Integer.valueOf(i)))).build(), new C26765c());
            }
            this.f70399c = pOBNativeAdEvent;
            this.f70401e = POBRequest.createInstance(str, i, POBAdFormat.NATIVE, new POBImpression(m40478b(), str2, false, false));
            this.f70402f = POBInstanceProvider.getCacheManager(context.getApplicationContext());
            if (POBNativeTemplateType.CUSTOM.equals(pOBNativeTemplateType)) {
                return;
            }
            m40479a(m40481a(pOBNativeTemplateType));
            return;
        }
        m40486a(new POBError(1001, "Missing ad request parameters. Please check input parameters."));
    }

    /* renamed from: a */
    private void m40479a(@NonNull List<POBBaseNativeRequestAsset> list) {
        HashSet hashSet = new HashSet();
        if (POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBNativeMeasurement") != null) {
            hashSet.add(Integer.valueOf(POBRequest.API.OMSDK.getValue()));
        }
        POBNativeBuilder pOBNativeBuilder = new POBNativeBuilder(list, m40488a(), hashSet);
        this.f70409m = pOBNativeBuilder;
        pOBNativeBuilder.setConfig(this.f70408l);
        POBImpression impression = getImpression();
        if (impression != null) {
            impression.setNative(this.f70409m);
        }
    }

    /* renamed from: a */
    private List<POBNativeRequestEventTracker> m40488a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(POBNativeEventTrackingMethod.IMAGE);
        arrayList.add(POBNativeEventTrackingMethod.JAVASCRIPT);
        POBNativeRequestEventTracker pOBNativeRequestEventTracker = new POBNativeRequestEventTracker(POBNativeEventType.IMPRESSION, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(pOBNativeRequestEventTracker);
        return arrayList2;
    }

    @NonNull
    /* renamed from: a */
    private List<POBBaseNativeRequestAsset> m40481a(@Nullable POBNativeTemplateType pOBNativeTemplateType) {
        POBNativeRequestTitleAsset pOBNativeRequestTitleAsset = new POBNativeRequestTitleAsset(1, true, 25);
        POBNativeRequestDataAsset pOBNativeRequestDataAsset = new POBNativeRequestDataAsset(3, true, POBNativeDataAssetType.DESCRIPTION);
        pOBNativeRequestDataAsset.setLength(90);
        POBNativeRequestImageAsset pOBNativeRequestImageAsset = new POBNativeRequestImageAsset(2, true, POBNativeImageAssetType.ICON, 50, 50);
        POBNativeRequestDataAsset pOBNativeRequestDataAsset2 = new POBNativeRequestDataAsset(4, true, POBNativeDataAssetType.CTA_TEXT);
        pOBNativeRequestDataAsset2.setLength(15);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pOBNativeRequestTitleAsset);
        arrayList.add(pOBNativeRequestDataAsset);
        arrayList.add(pOBNativeRequestImageAsset);
        arrayList.add(pOBNativeRequestDataAsset2);
        if (pOBNativeTemplateType == POBNativeTemplateType.MEDIUM) {
            arrayList.add(new POBNativeRequestImageAsset(5, true, POBNativeImageAssetType.MAIN, 278, 146));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40486a(@NonNull POBError pOBError) {
        Trace.endSection();
        Trace.endSection();
        POBLog.error("POBNativeAdLoader", pOBError.toString(), new Object[0]);
        POBNativeAdLoaderListener pOBNativeAdLoaderListener = this.f70400d;
        if (pOBNativeAdLoaderListener != null) {
            pOBNativeAdLoaderListener.onFailedToLoad(this, pOBError);
        }
    }

    /* renamed from: a */
    private void m40482a(@NonNull POBNativeAdManager pOBNativeAdManager) {
        this.f70405i--;
        this.f70404h.remove(pOBNativeAdManager);
    }
}
