package com.pubmatic.sdk.openwrap.banner;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidding;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.p565ui.POBBannerRendering;
import com.pubmatic.sdk.common.utility.POBLooper;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBanner;
import com.pubmatic.sdk.openwrap.core.POBBaseAdInteractionListener;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;
import com.pubmatic.sdk.openwrap.core.POBBidEventHelper;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBBiddingManager;
import com.pubmatic.sdk.openwrap.core.POBExtBidHandler;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBOWPartnerHelper;
import com.pubmatic.sdk.openwrap.core.POBRenderer;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

@MainThread
/* loaded from: classes7.dex */
public class POBBannerView extends FrameLayout implements POBBidEvent {

    /* renamed from: a */
    private static final POBAdSize f70533a = POBAdSize.BANNER_SIZE_300x250;

    /* renamed from: b */
    private static boolean f70534b;
    @NonNull

    /* renamed from: c */
    private static final FrameLayout.LayoutParams f70535c;
    @NonNull

    /* renamed from: A */
    private POBAdFormat f70536A;
    @Nullable

    /* renamed from: B */
    private View f70537B;

    /* renamed from: C */
    private boolean f70538C;
    @Nullable

    /* renamed from: D */
    private POBCacheManager f70539D;

    /* renamed from: d */
    private boolean f70540d;
    @Nullable

    /* renamed from: e */
    private View f70541e;

    /* renamed from: f */
    private int f70542f;

    /* renamed from: g */
    private int f70543g;

    /* renamed from: h */
    private boolean f70544h;
    @Nullable

    /* renamed from: i */
    private POBBaseBidder<POBBid> f70545i;
    @Nullable

    /* renamed from: j */
    private POBRequest f70546j;
    @Nullable

    /* renamed from: k */
    private POBTimeoutHandler f70547k;
    @Nullable

    /* renamed from: l */
    private POBBannerEvent f70548l;
    @Nullable

    /* renamed from: m */
    private POBBaseAdInteractionListener f70549m;
    @Nullable

    /* renamed from: n */
    private POBBannerViewListener f70550n;
    @Nullable

    /* renamed from: o */
    private View f70551o;

    /* renamed from: p */
    private boolean f70552p;
    @NonNull

    /* renamed from: q */
    private POBAdState f70553q;
    @Nullable

    /* renamed from: r */
    private POBLooper f70554r;
    @Nullable

    /* renamed from: s */
    private POBBannerEventListener f70555s;
    @Nullable

    /* renamed from: t */
    private POBAdRendererListener f70556t;
    @Nullable

    /* renamed from: u */
    private POBLooper.LooperListener f70557u;
    @Nullable

    /* renamed from: v */
    private POBBannerRendering f70558v;

    /* renamed from: w */
    private boolean f70559w;
    @Nullable

    /* renamed from: x */
    private POBBannerRendering f70560x;
    @Nullable

    /* renamed from: y */
    private POBBidEventListener f70561y;
    @Nullable

    /* renamed from: z */
    private POBAdResponse<POBBid> f70562z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes7.dex */
    public enum POBAdState {
        DEFAULT,
        LOAD_DEFERRED,
        LOADING,
        WAITING,
        WAITING_FOR_REFRESH,
        CREATIVE_LOADING,
        RENDERED,
        WAITING_FOR_AS_RESPONSE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.openwrap.banner.POBBannerView$a */
    /* loaded from: classes7.dex */
    public class C26784a implements OpenWrapSDKInitializer.Listener {
        C26784a() {
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onFailure(@NonNull POBError pOBError) {
            POBBannerView.this.f70544h = true;
            POBLog.error("POBBannerView", "OpenWrap SDK initialization failed with error : " + pOBError, new Object[0]);
            if (POBBannerView.this.f70553q == POBAdState.LOAD_DEFERRED) {
                POBBannerView.this.m40421a(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onSuccess() {
            POBBannerView.this.f70544h = true;
            POBLog.verbose("POBBannerView", "OpenWrap SDK initialization successful", new Object[0]);
            if (POBBannerView.this.f70553q == POBAdState.LOAD_DEFERRED) {
                POBBannerView.this.m40355s();
                POBBannerView.this.m40373j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.openwrap.banner.POBBannerView$b */
    /* loaded from: classes7.dex */
    public class C26785b implements POBTimeoutHandler.POBTimeoutHandlerListener {
        C26785b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBBannerView.this.f70553q == POBAdState.LOAD_DEFERRED) {
                POBBannerView.this.m40373j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.openwrap.banner.POBBannerView$c */
    /* loaded from: classes7.dex */
    public class C26786c implements POBAdRendererListener {
        private C26786c() {
        }

        /* renamed from: a */
        private POBAdResponse<POBBid> m40345a(@NonNull POBAdResponse<POBBid> pOBAdResponse, @NonNull POBAdDescriptor pOBAdDescriptor) {
            if (pOBAdDescriptor instanceof POBBid) {
                POBBid pOBBid = (POBBid) pOBAdDescriptor;
                if (pOBBid.isStaticBid()) {
                    POBAdResponse.Builder builder = new POBAdResponse.Builder(pOBAdResponse);
                    builder.updateWinningBid(pOBBid);
                    return builder.build();
                }
                return pOBAdResponse;
            }
            return pOBAdResponse;
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdImpression() {
            POBAdsHelper.recordImpressionDepth(POBBannerView.this.getAppContext(), POBBannerView.this.f70536A);
            POBBannerView.this.m40365n();
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdInteractionStarted() {
            POBBannerView.this.m40389d();
            if (POBBannerView.this.f70549m != null) {
                POBBannerView.this.f70549m.trackClick();
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdInteractionStopped() {
            POBBannerView.this.m40395c();
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdReadyToRefresh(int i) {
            if (!POBBannerView.this.f70540d) {
                POBBannerView.this.m40423a(i);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
            POBLog.debug("POBBannerView", "onAdRender()", new Object[0]);
            if (POBBannerView.this.f70562z != null && pOBAdDescriptor != null) {
                POBBannerView pOBBannerView = POBBannerView.this;
                pOBBannerView.f70562z = m40345a(pOBBannerView.f70562z, pOBAdDescriptor);
            }
            POBBannerView.this.f70559w = true;
            if (!POBBannerView.this.f70540d) {
                POBBannerView.this.m40383e(view);
                return;
            }
            Trace.endSection();
            POBBannerView.this.f70541e = view;
            POBLog.debug("POBBannerView", "Defer UI attachment for %s ad", "OW");
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdRenderingFailed(@NonNull POBError pOBError) {
            POBBid winningBid = POBBiddingManager.getWinningBid(POBBannerView.this.f70562z);
            if (winningBid != null && POBBannerView.this.f70562z != null) {
                POBLog.info("POBBannerView", "On rendering failed for Partner %s, with Error : %s", winningBid.getPartnerName(), pOBError.toString());
            }
            POBBannerView.this.m40421a(pOBError);
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onLeavingApplication() {
            POBBannerView.this.m40361p();
            if (POBBannerView.this.f70549m != null) {
                POBBannerView.this.f70549m.trackClick();
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onRenderAdClick() {
            if (POBBannerView.this.f70550n != null) {
                POBBannerView.this.f70550n.onAdClicked(POBBannerView.this);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onRenderProcessGone() {
            POBBannerView.this.m40357r();
            POBBannerView.this.f70551o = null;
            POBBannerView pOBBannerView = POBBannerView.this;
            pOBBannerView.m40423a(pOBBannerView.f70542f);
        }

        /* synthetic */ C26786c(POBBannerView pOBBannerView, C26784a c26784a) {
            this();
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdExpired() {
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdUnload() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.openwrap.banner.POBBannerView$d */
    /* loaded from: classes7.dex */
    public class C26787d implements POBBannerEventListener {
        private C26787d() {
        }

        /* renamed from: a */
        private void m40344a() {
            POBBannerView.this.f70552p = true;
            POBLog.debug("POBBannerView", "PartnerBidWin", new Object[0]);
            POBBid winningBid = POBBiddingManager.getWinningBid(POBBannerView.this.f70562z);
            if (winningBid != null) {
                winningBid.setHasWon(true);
                POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
                String partnerName = winningBid.getPartnerName();
                if (POBBannerView.this.f70548l != null && partnerName != null) {
                    POBBannerView pOBBannerView = POBBannerView.this;
                    pOBBannerView.f70560x = pOBBannerView.f70548l.getRenderer(partnerName);
                }
                if (winningBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBBannerView.this.getAppContext()).saveRenderedBid(winningBid.getRawBid());
                }
                POBBannerView.this.m40397b(winningBid);
            }
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        @Nullable
        public POBBidsProvider getBidsProvider() {
            return POBBannerView.this.f70562z;
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClick() {
            POBBannerView.this.m40367m();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClosed() {
            POBBannerView.this.m40371k();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener
        public void onAdExecutionComplete() {
            POBBannerView.this.setState(POBAdState.DEFAULT);
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdImpression() {
            POBBannerView.this.setAdServerViewVisibility(false);
            if (!POBBannerView.this.f70552p) {
                POBBannerView.this.m40365n();
            }
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdLeftApplication() {
            POBBannerView.this.m40361p();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdOpened() {
            POBBannerView.this.m40363o();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener
        public void onAdServerWin(@NonNull View view) {
            POBBannerView.this.f70552p = false;
            POBBannerView.this.f70559w = true;
            Trace.endSection();
            if (!POBBannerView.this.f70540d) {
                POBBannerView.this.m40388d(view);
                return;
            }
            Trace.endSection();
            POBBannerView.this.f70541e = view;
            POBLog.debug("POBBannerView", "Defer UI attachment for %s ad", "Ad Server");
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener
        public void onFailed(@NonNull POBError pOBError) {
            POBBannerView.this.m40421a(pOBError);
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener
        public void onOpenWrapPartnerWin(@Nullable String str) {
            if (POBBannerView.this.f70562z != null) {
                POBBid pOBBid = (POBBid) POBBannerView.this.f70562z.getBid(str);
                if (pOBBid != null) {
                    POBAdResponse.Builder updateWinningBid = new POBAdResponse.Builder(POBBannerView.this.f70562z).updateWinningBid(pOBBid);
                    POBBannerView.this.f70562z = updateWinningBid.build();
                } else {
                    POBLog.debug("POBBannerView", "bidId is invalid in onOpenWrapPartnerWin(), rendering the client-side winning bid", new Object[0]);
                }
            }
            m40344a();
        }

        /* synthetic */ C26787d(POBBannerView pOBBannerView, C26784a c26784a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.openwrap.banner.POBBannerView$e */
    /* loaded from: classes7.dex */
    public class C26788e implements POBLooper.LooperListener {
        private C26788e() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBLooper.LooperListener
        public void invoke() {
            if (POBBannerView.this.f70559w && !POBBannerView.this.m40404b()) {
                POBLog.debug("POBBannerView", "Banner is not visibile.", new Object[0]);
                POBBannerView pOBBannerView = POBBannerView.this;
                pOBBannerView.m40423a(pOBBannerView.f70542f);
                return;
            }
            POBUtils.runOnMainThread(new RunnableC26790a(this));
        }

        /* synthetic */ C26788e(POBBannerView pOBBannerView, C26784a c26784a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.openwrap.banner.POBBannerView$f */
    /* loaded from: classes7.dex */
    public class C26789f implements POBBidderListener<POBBid> {
        private C26789f() {
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFailed(@NonNull POBBidding<POBBid> pOBBidding, @NonNull POBError pOBError) {
            POBLog.debug("POBBannerView", "onBidsFailed : errorMessage= " + pOBError, new Object[0]);
            if (POBBannerView.this.f70561y != null) {
                POBLog.debug("POBBannerView", "Notifying error through bid event delegate - %s", pOBError.getErrorMessage());
                POBBannerView.this.setState(POBAdState.WAITING);
                POBBannerView.this.f70561y.onBidFailed(POBBannerView.this, pOBError);
            } else if (!(POBBannerView.this.f70548l instanceof POBDefaultBannerEventHandler)) {
                POBBannerView.this.m40409a((POBBid) null);
            } else {
                POBBannerView.this.m40421a(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFetched(@NonNull POBBidding<POBBid> pOBBidding, @NonNull POBAdResponse<POBBid> pOBAdResponse) {
            POBAdFormat pOBAdFormat;
            POBBannerView.this.f70562z = POBAdsHelper.updateResponseUsingPlacementType(pOBAdResponse, "inline");
            POBBid pOBBid = (POBBid) POBBannerView.this.f70562z.getWinningBid();
            if (pOBBid != null) {
                if (POBBannerView.this.f70538C) {
                    POBBannerView pOBBannerView = POBBannerView.this;
                    if (new POBAdSize(pOBBid.getWidth(), pOBBid.getHeight()).isMREC()) {
                        pOBAdFormat = POBAdFormat.MREC;
                    } else {
                        pOBAdFormat = POBAdFormat.BANNER;
                    }
                    pOBBannerView.f70536A = pOBAdFormat;
                }
                POBLog.debug("POBBannerView", "onBidsFetched : ImpressionId=%s, BidPrice=%s", pOBBid.getImpressionId(), String.valueOf(pOBBid.getPrice()));
                if (pOBBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBBannerView.this.getAppContext()).saveReceivedBid(pOBBid.getRawBid());
                }
            }
            POBBannerView.this.setRefreshInterval(pOBBid);
            if (POBBannerView.this.f70561y == null) {
                POBBannerView.this.m40409a(pOBBid);
                return;
            }
            POBLog.debug("POBBannerView", "Sharing bids through bid event delegate.", new Object[0]);
            POBBannerView.this.setState(POBAdState.WAITING);
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                POBLog.debug("POBBannerView", "Sharing bids through bid event delegate.", new Object[0]);
                POBBannerView.this.f70561y.onBidReceived(POBBannerView.this, pOBBid);
                return;
            }
            POBError pOBError = new POBError(1002, "No ads available");
            POBLog.info("POBBannerView", "Notifying error through bid event delegate - %s", pOBError.getErrorMessage());
            POBBannerView.this.f70561y.onBidFailed(POBBannerView.this, pOBError);
        }

        /* synthetic */ C26789f(POBBannerView pOBBannerView, C26784a c26784a) {
            this();
        }
    }

    static {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        f70535c = layoutParams;
        layoutParams.gravity = 17;
    }

    public POBBannerView(@NonNull Context context) {
        this(context, null);
        m40420a(new POBDefaultBannerEventHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getAppContext() {
        return getContext().getApplicationContext();
    }

    @NonNull
    private String getImpressionId() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdServerViewVisibility(boolean z) {
        int i = 0;
        POBLog.info("POBBannerView", "is adserverview available %s", this.f70537B);
        View view = this.f70537B;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    private void setRefreshInterval(int i) {
        this.f70542f = POBUtils.getValidRefreshInterval(i, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(@NonNull POBAdState pOBAdState) {
        this.f70553q = pOBAdState;
    }

    public void destroy() {
        POBLog.debug("POBBannerView", "destroy invoked.", new Object[0]);
        m40355s();
        m40381f();
        this.f70554r = null;
        this.f70541e = null;
        m40379g();
        POBBannerEvent pOBBannerEvent = this.f70548l;
        if (pOBBannerEvent != null) {
            pOBBannerEvent.destroy();
        }
        this.f70550n = null;
        this.f70561y = null;
        this.f70556t = null;
        this.f70557u = null;
        this.f70555s = null;
        this.f70537B = null;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public boolean forceRefresh() {
        if (m40424a()) {
            m40381f();
            loadAd();
            return true;
        }
        return false;
    }

    @Nullable
    public POBRequest getAdRequest() {
        POBRequest pOBRequest = this.f70546j;
        if (pOBRequest != null) {
            return pOBRequest;
        }
        POBLog.warn("POBBannerView", "Please call POBBannerView.init() before calling getAdRequest()", new Object[0]);
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    @Nullable
    public POBBid getBid() {
        return POBBiddingManager.getWinningBid(this.f70562z);
    }

    @Nullable
    public POBAdSize getCreativeSize() {
        if (this.f70552p) {
            POBBid winningBid = POBBiddingManager.getWinningBid(this.f70562z);
            if (winningBid != null) {
                if (winningBid.isVideo() && winningBid.getWidth() == 0 && winningBid.getHeight() == 0) {
                    return f70533a;
                }
                return new POBAdSize(winningBid.getWidth(), winningBid.getHeight());
            }
            POBLog.warn("POBBannerView", "getCreativeSize() called for null bid", new Object[0]);
            return null;
        }
        POBBannerEvent pOBBannerEvent = this.f70548l;
        if (pOBBannerEvent == null) {
            return null;
        }
        return pOBBannerEvent.getAdSize();
    }

    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.f70546j);
    }

    public void init(@NonNull String str, int i, @NonNull String str2, @NonNull POBBannerEvent pOBBannerEvent) {
        POBAdSize[] requestedAdSizes = pOBBannerEvent == null ? null : pOBBannerEvent.requestedAdSizes();
        POBError m40406a = m40406a(str, str2, pOBBannerEvent, requestedAdSizes);
        if (m40406a != null) {
            POBLog.error("POBBannerView", m40406a.toString(), new Object[0]);
            return;
        }
        destroy();
        if (!this.f70544h) {
            OpenWrapSDK.initialize(getContext(), new OpenWrapSDKConfig.Builder(str, new ArrayList(Collections.singletonList(Integer.valueOf(i)))).build(), new C26784a());
        }
        this.f70557u = new C26788e(this, null);
        m40420a(pOBBannerEvent);
        POBLooper pOBLooper = new POBLooper();
        this.f70554r = pOBLooper;
        pOBLooper.setListener(this.f70557u);
        this.f70554r.setNetworkMonitor(POBInstanceProvider.getNetworkMonitor(getAppContext()));
        POBImpression pOBImpression = new POBImpression(getImpressionId(), str2);
        if (requestedAdSizes != null) {
            pOBImpression.setBanner(new POBBanner(requestedAdSizes));
            if (m40396b(requestedAdSizes)) {
                pOBImpression.setVideo(new POBVideo(POBVideo.Placement.IN_BANNER, POBVideo.Plcmt.STANDALONE, POBVideo.Linearity.LINEAR, f70533a));
            }
            this.f70536A = m40405a(requestedAdSizes);
        }
        this.f70539D = POBInstanceProvider.getCacheManager(getAppContext());
        POBRequest createInstance = POBRequest.createInstance(str, i, this.f70536A, pOBImpression);
        this.f70546j = createInstance;
        if (createInstance != null) {
            setRefreshInterval(30);
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void loadAd() {
        POBImpression impression = getImpression();
        POBBannerEvent pOBBannerEvent = this.f70548l;
        POBAdSize[] requestedAdSizes = pOBBannerEvent != null ? pOBBannerEvent.requestedAdSizes() : null;
        if (this.f70546j != null && impression != null && requestedAdSizes != null) {
            POBAdState pOBAdState = this.f70553q;
            if (pOBAdState != POBAdState.DEFAULT) {
                POBLog.error("POBBannerView", "Skipping loadAd() as ad is already in %s state", pOBAdState.name());
                return;
            }
            Trace.beginSection("POB Banner Load Ad");
            Trace.beginSection("POB Request Building");
            if (this.f70544h) {
                m40373j();
                return;
            }
            this.f70553q = POBAdState.LOAD_DEFERRED;
            m40353t();
            return;
        }
        POBLog.error("POBBannerView", "Unable to process loadAd() please ensure banner is initialized with valid ad tag details and ad sizes.", new Object[0]);
    }

    public void pauseAutoRefresh() {
        POBLooper pOBLooper = this.f70554r;
        if (pOBLooper != null) {
            if (this.f70542f > 0) {
                pOBLooper.forcePause();
                return;
            } else {
                POBLog.info("POBBannerView", "Skipping pause auto-refresh as refresh is disabled.", new Object[0]);
                return;
            }
        }
        POBLog.info("POBBannerView", "Can't pause refresh, banner instance is not valid.", new Object[0]);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void proceedOnError(@NonNull POBBidEvent.BidEventError bidEventError, @NonNull String str) {
        if (this.f70561y == null) {
            POBLog.warn("POBBannerView", "'POBBidEventListener' not implemented", new Object[0]);
        } else if (this.f70553q == POBAdState.WAITING) {
            POBLog.info("POBBannerView", "Bid lost client side auction. Hence proceeding with error.", new Object[0]);
            if (this.f70548l instanceof POBDefaultBannerEventHandler) {
                POBLog.info("POBBannerView", "Notified with error code - " + bidEventError + " description - " + str, new Object[0]);
                m40423a(this.f70542f);
                return;
            }
            m40377h();
        } else {
            POBLog.warn("POBBannerView", "Can not proceed before calling loadAd() or already in the process of proceed.", new Object[0]);
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public boolean proceedToLoadAd() {
        if (this.f70561y == null) {
            POBLog.warn("POBBannerView", "'POBBidEventListener' not implemented", new Object[0]);
            return false;
        } else if (this.f70553q == POBAdState.WAITING) {
            POBLog.info("POBBannerView", "Bid won client side auction. Hence proceeding to load.", new Object[0]);
            POBLog.debug("POBBannerView", "Proceeding with bid.", new Object[0]);
            POBBid winningBid = POBBiddingManager.getWinningBid(this.f70562z);
            if (winningBid != null && winningBid.isExpired()) {
                POBError convertToPOBError = POBBidEventHelper.convertToPOBError(POBBidEvent.BidEventError.BID_EXPIRED);
                if (this.f70548l instanceof POBDefaultBannerEventHandler) {
                    m40421a(convertToPOBError);
                    return false;
                }
                POBLog.warn("POBBannerView", "Bid expired! Invoking ad server call by ignoring OpenWrap Bid.", new Object[0]);
                m40377h();
                return true;
            }
            POBLog.debug("POBBannerView", "Proceeding with bid.", new Object[0]);
            setState(POBAdState.LOADING);
            m40409a(winningBid);
            return true;
        } else {
            POBLog.warn("POBBannerView", "Can not proceed before calling loadAd() or already in the process of proceed.", new Object[0]);
            return false;
        }
    }

    public void resumeAutoRefresh() {
        POBLooper pOBLooper = this.f70554r;
        if (pOBLooper != null) {
            if (this.f70542f > 0) {
                pOBLooper.forceResume();
                return;
            } else {
                POBLog.info("POBBannerView", "Skipping resume auto-refresh as refresh is disabled.", new Object[0]);
                return;
            }
        }
        POBLog.info("POBBannerView", "Can't resume refresh, banner instance is not valid.", new Object[0]);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
        this.f70561y = pOBBidEventListener;
    }

    public void setListener(@Nullable POBBannerViewListener pOBBannerViewListener) {
        this.f70550n = pOBBannerViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: e */
    public void m40384e() {
        this.f70562z = null;
        this.f70552p = false;
        setAdServerViewVisibility(false);
        if (this.f70546j != null) {
            setState(POBAdState.LOADING);
            m40408a(this.f70546j).requestBid();
            return;
        }
        m40402b(new POBError(1001, "Missing ad request parameters. Please check."));
        POBLog.error("POBBannerView", "Missing ad request parameters. Please check.", new Object[0]);
    }

    /* renamed from: f */
    private void m40381f() {
        setState(POBAdState.DEFAULT);
        POBLooper pOBLooper = this.f70554r;
        if (pOBLooper != null) {
            pOBLooper.destroy();
        }
        POBBaseBidder<POBBid> pOBBaseBidder = this.f70545i;
        if (pOBBaseBidder != null) {
            pOBBaseBidder.setBidderListener(null);
            this.f70545i.destroy();
            this.f70545i = null;
        }
    }

    /* renamed from: g */
    private void m40379g() {
        POBBannerRendering pOBBannerRendering = this.f70558v;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.setAdRendererListener(null);
            this.f70558v.destroy();
            this.f70558v = null;
        }
        POBBannerRendering pOBBannerRendering2 = this.f70560x;
        if (pOBBannerRendering2 != null) {
            pOBBannerRendering2.setAdRendererListener(null);
            this.f70560x.destroy();
            this.f70560x = null;
        }
    }

    /* renamed from: h */
    private void m40377h() {
        setState(POBAdState.LOADING);
        POBAdResponse<POBBid> pOBAdResponse = this.f70562z;
        if (pOBAdResponse != null) {
            this.f70562z = new POBAdResponse.Builder(pOBAdResponse).setWinningBid(null).build();
        }
        if (this.f70548l != null) {
            POBLog.info("POBBannerView", "Proceeding with bid. Ad server integration is " + this.f70548l.getClass().getSimpleName(), new Object[0]);
        }
        m40409a((POBBid) null);
    }

    /* renamed from: i */
    private boolean m40375i() {
        return this.f70542f > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m40373j() {
        this.f70553q = POBAdState.LOADING;
        this.f70559w = false;
        m40384e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m40371k() {
        POBBannerViewListener pOBBannerViewListener = this.f70550n;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdClosed(this);
        }
    }

    /* renamed from: l */
    private void m40369l() {
        Trace.endSection();
        POBBannerViewListener pOBBannerViewListener = this.f70550n;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdReceived(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m40367m() {
        POBBannerViewListener pOBBannerViewListener = this.f70550n;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m40365n() {
        POBBannerViewListener pOBBannerViewListener = this.f70550n;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdImpression(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m40363o() {
        POBBannerViewListener pOBBannerViewListener = this.f70550n;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdOpened(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m40361p() {
        POBBannerViewListener pOBBannerViewListener = this.f70550n;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAppLeaving(this);
        }
    }

    /* renamed from: q */
    private void m40359q() {
        ViewGroup viewGroup;
        View view = this.f70537B;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(this.f70537B);
        this.f70537B = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m40357r() {
        View view = this.f70551o;
        if (view != null) {
            removeView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: s */
    public void m40355s() {
        POBTimeoutHandler pOBTimeoutHandler = this.f70547k;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.f70547k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshInterval(@Nullable POBBid pOBBid) {
        if (pOBBid != null) {
            setRefreshInterval(pOBBid.getRefreshInterval());
        } else {
            setRefreshInterval(this.f70542f);
        }
    }

    /* renamed from: t */
    private void m40353t() {
        POBLog.debug("POBBannerView", "scheduleDelay until init completed.", new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new C26785b());
        this.f70547k = pOBTimeoutHandler;
        pOBTimeoutHandler.start(500L);
    }

    /* renamed from: u */
    private void m40351u() {
        if (m40375i()) {
            setState(POBAdState.WAITING_FOR_REFRESH);
        } else {
            setState(POBAdState.DEFAULT);
        }
    }

    public POBBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public POBBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70544h = false;
        this.f70536A = POBAdFormat.BANNER;
        this.f70538C = false;
        this.f70553q = POBAdState.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m40388d(@NonNull View view) {
        POBLog.debug("POBBannerView", "Show ad for %s", "Ad Server");
        POBBid winningBid = POBBiddingManager.getWinningBid(this.f70562z);
        if (winningBid != null) {
            POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
        } else {
            POBLog.debug("POBBannerView", "AdServerWin", new Object[0]);
        }
        m40394c(view);
        m40422a(view);
        m40423a(this.f70542f);
        m40369l();
    }

    /* renamed from: b */
    private boolean m40396b(@NonNull POBAdSize[] pOBAdSizeArr) {
        for (POBAdSize pOBAdSize : pOBAdSizeArr) {
            if (f70533a.equals(pOBAdSize)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m40394c(@Nullable View view) {
        if (view == null) {
            POBLog.verbose("POBBannerView", "Passed rendered view is null in prepareForUIAttachment(), hence ignoring the attachment in UI", new Object[0]);
            return;
        }
        POBBannerRendering pOBBannerRendering = this.f70558v;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.destroy();
        }
        this.f70558v = this.f70560x;
        this.f70560x = null;
        m40357r();
        m40359q();
        this.f70551o = view;
    }

    /* renamed from: b */
    private void m40402b(@NonNull POBError pOBError) {
        Trace.endSection();
        POBLog.error("POBBannerView", "Failed to receive ad with error - " + pOBError, new Object[0]);
        POBBannerViewListener pOBBannerViewListener = this.f70550n;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdFailed(this, pOBError);
        }
    }

    public POBBannerView(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @NonNull POBAdSize... pOBAdSizeArr) {
        this(context, str, i, str2, new POBDefaultBannerEventHandler(pOBAdSizeArr));
    }

    public POBBannerView(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @NonNull POBBannerEvent pOBBannerEvent) {
        this(context, null, 0);
        init(str, i, str2, pOBBannerEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m40383e(@NonNull View view) {
        POBBid winningBid = POBBiddingManager.getWinningBid(this.f70562z);
        if (winningBid != null) {
            POBLog.debug("POBBannerView", "Show ad for OW partner : %s", winningBid.getPartnerName());
        }
        m40394c(view);
        m40403b(view);
        setState(POBAdState.RENDERED);
        m40369l();
    }

    /* renamed from: a */
    private void m40420a(@NonNull POBBannerEvent pOBBannerEvent) {
        this.f70556t = new C26786c(this, null);
        C26787d c26787d = new C26787d(this, null);
        this.f70555s = c26787d;
        if (pOBBannerEvent != null) {
            this.f70548l = pOBBannerEvent;
            pOBBannerEvent.setEventListener(c26787d);
        }
    }

    /* renamed from: b */
    private void m40403b(@NonNull View view) {
        int i;
        int i2;
        POBAdSize creativeSize = getCreativeSize();
        POBLog.debug("POBBannerView", "Creative ad size is %s", creativeSize);
        if (creativeSize == null || creativeSize.getAdWidth() <= 0 || creativeSize.getAdHeight() <= 0) {
            i = -1;
            i2 = -1;
        } else {
            i = POBUtils.convertDpToPixel(creativeSize.getAdWidth());
            i2 = POBUtils.convertDpToPixel(creativeSize.getAdHeight());
        }
        POBBannerEvent pOBBannerEvent = this.f70548l;
        if (pOBBannerEvent != null) {
            this.f70537B = pOBBannerEvent.getAdServerView();
        }
        if (this.f70537B != null) {
            setAdServerViewVisibility(true);
            addView(this.f70537B, 0, f70535c);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        POBBaseAdInteractionListener pOBBaseAdInteractionListener = this.f70549m;
        if (pOBBaseAdInteractionListener != null) {
            pOBBaseAdInteractionListener.trackImpression();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m40389d() {
        if (this.f70543g == 0) {
            f70534b = true;
            POBLooper pOBLooper = this.f70554r;
            if (pOBLooper != null) {
                pOBLooper.pause();
            }
            this.f70540d = true;
            m40363o();
        }
        this.f70543g++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m40395c() {
        int i = this.f70543g - 1;
        this.f70543g = i;
        if (i == 0) {
            f70534b = false;
            POBLooper pOBLooper = this.f70554r;
            if (pOBLooper != null) {
                pOBLooper.resume();
            }
            this.f70540d = false;
            m40371k();
            View view = this.f70541e;
            if (view != null) {
                if (this.f70552p) {
                    m40383e(view);
                    POBAdResponse<POBBid> pOBAdResponse = this.f70562z;
                    POBBid winningBid = pOBAdResponse != null ? pOBAdResponse.getWinningBid() : null;
                    if (winningBid != null && !winningBid.isVideo()) {
                        m40423a(this.f70542f);
                    }
                } else {
                    m40388d(view);
                }
                this.f70541e = null;
            }
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void loadAd(@NonNull String str) {
        this.f70538C = true;
        if (!POBUtils.isNullOrEmpty(str)) {
            POBAdState pOBAdState = this.f70553q;
            if (pOBAdState != POBAdState.DEFAULT) {
                POBLog.error("POBBannerView", "Skipping loadAd() as ad is already in %s state", pOBAdState.name());
                return;
            }
            Trace.beginSection("POB Banner Load Ad");
            Trace.beginSection("POB Response Parsing");
            this.f70562z = null;
            this.f70553q = POBAdState.LOADING;
            m40407a(str).requestBid();
            return;
        }
        m40402b(new POBError(1007, "Invalid Bid Response."));
        POBLog.error("POBBannerView", "Invalid Bid Response.", new Object[0]);
    }

    @Nullable
    /* renamed from: a */
    private POBError m40406a(@NonNull String str, @NonNull String str2, @Nullable POBBannerEvent pOBBannerEvent, @Nullable POBAdSize... pOBAdSizeArr) {
        if (!POBAdsHelper.validate(getContext(), str, str2, pOBBannerEvent) || POBUtils.isNull(pOBAdSizeArr)) {
            return new POBError(1001, "Invalid/Missing ad request parameters like Publisher Id, Profile Id, Banner ad sizes. Please check.");
        }
        return null;
    }

    /* renamed from: a */
    private boolean m40424a() {
        POBAdState pOBAdState = this.f70553q;
        if (pOBAdState == POBAdState.WAITING_FOR_AS_RESPONSE || pOBAdState == POBAdState.CREATIVE_LOADING || this.f70540d) {
            POBLog.debug("POBBannerView", "ForceRefresh is not allowed as banner is in %s state or it is clicked.", pOBAdState);
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: a */
    private POBBaseBidder<POBBid> m40408a(@NonNull POBRequest pOBRequest) {
        POBProfileInfo pOBProfileInfo;
        if (this.f70545i == null) {
            if (this.f70539D != null) {
                pOBProfileInfo = this.f70539D.getProfileInfo(POBUtils.getMappingKey(pOBRequest.getProfileId(), pOBRequest.getVersionId()));
            } else {
                pOBProfileInfo = null;
            }
            POBBiddingManager pOBBiddingManager = new POBBiddingManager(POBOWPartnerHelper.createPOBManager(getAppContext(), pOBRequest, pOBProfileInfo));
            this.f70545i = pOBBiddingManager;
            pOBBiddingManager.setBidderListener(new C26789f(this, null));
        }
        return this.f70545i;
    }

    @MainThread
    /* loaded from: classes7.dex */
    public static class POBBannerViewListener {
        public void onAdClicked(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdClosed(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdImpression(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdOpened(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdReceived(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAppLeaving(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdFailed(@NonNull POBBannerView pOBBannerView, @NonNull POBError pOBError) {
        }
    }

    public void init(@NonNull String str, int i, @NonNull String str2, @NonNull POBAdSize... pOBAdSizeArr) {
        init(str, i, str2, new POBDefaultBannerEventHandler(pOBAdSizeArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m40404b() {
        /*
            r6 = this;
            android.content.Context r0 = r6.getAppContext()
            boolean r0 = com.pubmatic.sdk.common.network.POBNetworkMonitor.isNetworkAvailable(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            java.lang.String r0 = "Network not available"
        Le:
            r3 = r2
            goto L4d
        L10:
            boolean r0 = r6.isAttachedToWindow()
            if (r0 != 0) goto L19
            java.lang.String r0 = "Banner ad is not attached"
            goto Le
        L19:
            boolean r0 = r6.hasWindowFocus()
            if (r0 != 0) goto L22
            java.lang.String r0 = "Banner ad is not in active screen"
            goto Le
        L22:
            boolean r0 = r6.isShown()
            if (r0 != 0) goto L2b
            java.lang.String r0 = "Banner ad is not shown or visible"
            goto Le
        L2b:
            boolean r0 = com.pubmatic.sdk.common.utility.POBUtils.isViewVisible(r6, r1)
            if (r0 != 0) goto L44
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3[r2] = r4
            java.lang.String r4 = "Banner ad visibility is less than %s pixel"
            java.lang.String r0 = java.lang.String.format(r0, r4, r3)
            goto Le
        L44:
            boolean r0 = com.pubmatic.sdk.openwrap.banner.POBBannerView.f70534b
            if (r0 == 0) goto L4b
            java.lang.String r0 = "Banner view is in background"
            goto Le
        L4b:
            r0 = 0
            r3 = r1
        L4d:
            java.lang.String r4 = "POBBannerView"
            if (r3 != 0) goto L70
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ", refreshing banner ad after %s secs."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r5 = r6.f70542f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r2] = r5
            com.pubmatic.sdk.common.log.POBLog.warn(r4, r0, r1)
            goto L8b
        L70:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r5 = com.pubmatic.sdk.common.utility.POBUtils.getViewVisiblePixel(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r2] = r5
            java.lang.String r5 = "%s pixel of Banner ad is visible"
            java.lang.String r0 = java.lang.String.format(r0, r5, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.pubmatic.sdk.common.log.POBLog.warn(r4, r0, r1)
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.openwrap.banner.POBBannerView.m40404b():boolean");
    }

    @NonNull
    /* renamed from: a */
    private POBBaseBidder<POBBid> m40407a(@NonNull String str) {
        POBExtBidHandler pOBExtBidHandler = new POBExtBidHandler(str);
        this.f70545i = pOBExtBidHandler;
        pOBExtBidHandler.setBidderListener(new C26789f(this, null));
        return this.f70545i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40421a(@NonNull POBError pOBError) {
        m40423a(this.f70542f);
        m40402b(pOBError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40409a(@Nullable POBBid pOBBid) {
        this.f70553q = POBAdState.WAITING_FOR_AS_RESPONSE;
        if (this.f70548l != null) {
            Trace.endSection();
            this.f70548l.requestAd(pOBBid);
            this.f70549m = this.f70548l.getAdInteractionListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m40397b(@NonNull POBBid pOBBid) {
        if (this.f70560x == null) {
            this.f70560x = POBRenderer.getBannerRenderer(getAppContext(), pOBBid.getRemainingExpirationTime());
        }
        this.f70560x.setAdRendererListener(this.f70556t);
        this.f70553q = POBAdState.CREATIVE_LOADING;
        this.f70560x.renderAd(pOBBid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40423a(int i) {
        m40351u();
        if (this.f70554r == null || !m40375i()) {
            return;
        }
        this.f70554r.loop(i);
        POBLog.debug("POBBannerView", "loopNextAd with interval %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    private POBAdFormat m40405a(@NonNull POBAdSize[] pOBAdSizeArr) {
        boolean z = false;
        boolean z2 = false;
        for (POBAdSize pOBAdSize : pOBAdSizeArr) {
            if (pOBAdSize.isMREC()) {
                z = true;
            } else {
                z2 = true;
            }
            if (z && z2) {
                return POBAdFormat.BANNER_AND_MREC;
            }
        }
        return z ? POBAdFormat.MREC : POBAdFormat.BANNER;
    }

    /* renamed from: a */
    private void m40422a(@NonNull View view) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams.gravity = 17;
            } else {
                m40421a(new POBError(1009, "Ad Server layout params must be of type FrameLayout."));
                return;
            }
        } else {
            layoutParams = f70535c;
        }
        view.setVisibility(0);
        addView(view, layoutParams);
    }
}
