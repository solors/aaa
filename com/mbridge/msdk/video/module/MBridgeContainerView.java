package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.VideoReportData;
import com.mbridge.msdk.foundation.same.report.PlayableReportUtils;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper;
import com.mbridge.msdk.foundation.tools.JsonUtils;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.foundation.tools.UriUtil;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import com.mbridge.msdk.video.dynview.moffer.MOfferEnergize;
import com.mbridge.msdk.video.dynview.p519e.CampOrderViewBuildCallback;
import com.mbridge.msdk.video.dynview.p524i.UIControlUtil;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.p530a.OnNotifyListener;
import com.mbridge.msdk.video.module.p530a.p531a.MiniCardProxyNotifyListener;
import com.mbridge.msdk.video.module.p530a.p531a.ProxyOnNotifyListener;
import com.mbridge.msdk.video.module.p530a.p531a.StatisticsOnNotifyListener;
import com.mbridge.msdk.video.module.p530a.p531a.VastProxyNotifyListener;
import com.mbridge.msdk.video.module.p532b.VideoViewReport;
import com.mbridge.msdk.video.signal.IJSContainerModule;
import com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1;
import com.mbridge.msdk.video.signal.factory.JSFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class MBridgeContainerView extends MBridgeBaseView implements IJSContainerModule, IJSRewardVideoModuleV1 {

    /* renamed from: A */
    private int f60500A;

    /* renamed from: B */
    private boolean f60501B;

    /* renamed from: C */
    private boolean f60502C;

    /* renamed from: D */
    private boolean f60503D;

    /* renamed from: E */
    private boolean f60504E;

    /* renamed from: F */
    private boolean f60505F;

    /* renamed from: G */
    private boolean f60506G;

    /* renamed from: H */
    private int f60507H;

    /* renamed from: I */
    private boolean f60508I;

    /* renamed from: J */
    private boolean f60509J;

    /* renamed from: K */
    private int f60510K;

    /* renamed from: L */
    private int f60511L;

    /* renamed from: M */
    private int f60512M;

    /* renamed from: N */
    private int f60513N;

    /* renamed from: O */
    private int f60514O;

    /* renamed from: P */
    private String f60515P;

    /* renamed from: Q */
    private JSFactory f60516Q;

    /* renamed from: R */
    private boolean f60517R;

    /* renamed from: S */
    private boolean f60518S;

    /* renamed from: T */
    private List<CampaignEx> f60519T;

    /* renamed from: m */
    private MBridgePlayableView f60520m;

    /* renamed from: n */
    private MBridgeClickCTAView f60521n;

    /* renamed from: o */
    private MBridgeClickMiniCardView f60522o;

    /* renamed from: p */
    private MBridgeNativeEndCardView f60523p;

    /* renamed from: q */
    private MBridgeH5EndCardView f60524q;

    /* renamed from: r */
    private MBridgeVastEndCardView f60525r;

    /* renamed from: s */
    private MBridgeLandingPageView f60526s;

    /* renamed from: t */
    private MBridgeVideoEndCoverView f60527t;

    /* renamed from: u */
    private MBridgeAlertWebview f60528u;

    /* renamed from: v */
    private MBridgeOrderCampView f60529v;

    /* renamed from: w */
    private String f60530w;

    /* renamed from: x */
    private int f60531x;

    /* renamed from: y */
    private int f60532y;

    /* renamed from: z */
    private int f60533z;

    public MBridgeContainerView(Context context) {
        super(context);
        this.f60532y = 1;
        this.f60533z = 1;
        this.f60500A = 1;
        this.f60501B = false;
        this.f60502C = false;
        this.f60503D = false;
        this.f60504E = true;
        this.f60505F = false;
        this.f60506G = false;
        this.f60508I = false;
        this.f60509J = false;
        this.f60517R = false;
        this.f60518S = false;
        this.f60519T = new ArrayList();
    }

    /* renamed from: b */
    private void m48830b() {
        if (this.f60524q == null) {
            m48831a(this.f60516Q, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isLoadSuccess()) {
            this.f60508I = true;
            addView(this.f60524q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f60524q.excuteTask();
            this.f60524q.setNotchValue(this.f60515P, this.f60510K, this.f60511L, this.f60512M, this.f60513N);
            VideoReportData videoReportData = new VideoReportData();
            videoReportData.m52344f(this.f60472b.getRequestId());
            videoReportData.m52342g(this.f60472b.getRequestIdNotice());
            videoReportData.m52346e(this.f60472b.getId());
            videoReportData.m52350d(this.f60472b.isMraid() ? VideoReportData.f56390a : VideoReportData.f56391b);
            PlayableReportUtils.m51981d(videoReportData, this.f60471a, this.f60530w);
        } else {
            m48828e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f60524q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f60524q.setError(true);
            }
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f60524q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f60530w);
        }
    }

    /* renamed from: e */
    private void m48828e() {
        this.f60532y = 1;
        if (this.f60523p == null) {
            m48831a(this.f60516Q, 2);
        }
        addView(this.f60523p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f60523p.notifyShowListener();
        this.f60518S = true;
        bringToFront();
    }

    /* renamed from: f */
    private void m48827f() {
        if (this.f60522o == null) {
            m48829b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f60503D && this.f60504E) {
            this.f60504E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f60522o, layoutParams);
    }

    /* renamed from: g */
    private void m48826g() {
        if (this.f60528u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f60471a);
            this.f60528u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f60530w);
            this.f60528u.setCampaign(this.f60472b);
        }
        this.f60528u.preLoadData(this.f60516Q);
    }

    /* renamed from: h */
    private void m48825h() {
        this.f60502C = false;
        this.f60518S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: i */
    private void m48824i() {
        boolean z;
        CampaignEx campaignEx = this.f60472b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        int i = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(UriUtil.m51690a(str, "ecid"));
            } catch (Throwable th) {
                SameLogTool.m51824b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        int i2 = i;
        Context context = this.f60471a;
        if (this.f60472b.getAdSpaceT() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f60523p = new MBridgeNativeEndCardView(context, null, true, i2, z, this.f60481k, this.f60472b.getMof_tplid());
        if (this.f60472b.getDynamicTempCode() == 5) {
            OnNotifyListener onNotifyListener = this.notifyListener;
            if (onNotifyListener != null && (onNotifyListener instanceof StatisticsOnNotifyListener)) {
                ((StatisticsOnNotifyListener) onNotifyListener).m48650a(this.f60472b);
            }
            this.f60523p.setCampaign(this.f60472b);
            return;
        }
        this.f60523p.setCampaign(this.f60472b);
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.f60519T = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            m48834a(view);
            super.addView(view);
            return;
        }
        SameLogTool.m51824b(MBridgeBaseView.TAG, "view is null");
    }

    public boolean canBackPress() {
        if (this.f60523p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f60526s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f60520m;
        if (mBridgePlayableView == null) {
            return false;
        }
        return mBridgePlayableView.canBackPress();
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void configurationChanged(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60522o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f60522o.resizeMiniCard(i, i2);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public boolean endCardShowing() {
        return this.f60501B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable()) {
            return true;
        }
        return false;
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView == null) {
            return this.f60520m;
        }
        return mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f60472b.isDynamicView() || !TextUtils.isEmpty(this.f60472b.getendcard_url())) {
            return null;
        }
        int size = this.f60519T.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (this.f60519T.get(i2) != null && this.f60519T.get(i2).getId() == this.f60472b.getId()) {
                    i = i2 - 1;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.f60519T.get(i) == null) {
            return null;
        }
        return this.f60519T.get(i);
    }

    public boolean getShowingTransparent() {
        return this.f60503D;
    }

    public String getUnitID() {
        return this.f60530w;
    }

    public int getVideoInteractiveType() {
        return this.f60531x;
    }

    public int getVideoSkipTime() {
        return this.f60507H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f60508I) {
                return;
            }
        }
        m48835a();
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f60517R && !this.f60518S) {
                m48825h();
                this.f60517R = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f60528u;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f60528u);
                MBridgeClickCTAView mBridgeClickCTAView = this.f60521n;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.notifyListener.mo48633a(105, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void ivRewardAdsWithoutVideo(String str) {
        this.notifyListener.mo48633a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60522o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public boolean miniCardShowing() {
        return this.f60502C;
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1
    public void notifyCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f60520m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f60520m, this.f60521n, this.f60522o, this.f60523p, this.f60524q, this.f60525r, this.f60526s, this.f60527t};
        for (int i = 0; i < 8; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f60523p == null && this.f60525r == null) {
            if (this.f60526s != null) {
                this.notifyListener.mo48633a(103, "");
                return;
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.notifyListener.mo48633a(104, "");
        try {
            MOfferEnergize.m48876a().m48870b();
        } catch (Exception e) {
            SameLogTool.m51824b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f60502C) {
            this.notifyListener.mo48633a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f60520m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f60520m, this.f60522o, this.f60524q, this.f60528u};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void preLoadData(final JSFactory jSFactory) {
        this.f60516Q = jSFactory;
        CampaignEx campaignEx = this.f60472b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                if (this.f60520m == null) {
                    this.f60520m = new MBridgePlayableView(this.f60471a);
                }
                this.f60520m.setCloseDelayShowTime(this.f60533z);
                this.f60520m.setPlayCloseBtnTm(this.f60500A);
                this.f60520m.setCampaign(this.f60472b);
                this.f60520m.setNotifyListener(new ProxyOnNotifyListener(this.notifyListener) { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.4
                    @Override // com.mbridge.msdk.video.module.p530a.p531a.ProxyOnNotifyListener, com.mbridge.msdk.video.module.p530a.p531a.DefaultOnNotifyListener, com.mbridge.msdk.video.module.p530a.OnNotifyListener
                    /* renamed from: a */
                    public final void mo48633a(int i, Object obj) {
                        int i2;
                        super.mo48633a(i, obj);
                        if (i == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            VideoReportData videoReportData = new VideoReportData();
                            videoReportData.m52344f(MBridgeContainerView.this.f60472b.getRequestId());
                            videoReportData.m52342g(MBridgeContainerView.this.f60472b.getRequestIdNotice());
                            videoReportData.m52346e(MBridgeContainerView.this.f60472b.getId());
                            if (MBridgeContainerView.this.f60472b.isMraid()) {
                                i2 = VideoReportData.f56390a;
                            } else {
                                i2 = VideoReportData.f56391b;
                            }
                            videoReportData.m52350d(i2);
                            MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                            PlayableReportUtils.m51981d(videoReportData, mBridgeContainerView2.f60471a, mBridgeContainerView2.f60530w);
                        }
                    }
                });
                this.f60520m.preLoadData(jSFactory);
            } else {
                m48829b(this.f60531x);
                if (this.f60472b.isDynamicView()) {
                    try {
                        m48831a(jSFactory, Integer.valueOf(this.f60472b.getVideo_end_type()));
                    } catch (Throwable th) {
                        SameLogTool.m51824b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.m48831a(jSFactory, Integer.valueOf(mBridgeContainerView.f60472b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!SameTool.m51707l(this.f60472b.getendcard_url())) {
                        try {
                            String m51690a = UriUtil.m51690a(this.f60472b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(m51690a) && Integer.parseInt(m51690a) == 1) {
                                MOfferEnergize.m48876a().m48874a(this.f60472b, 2);
                            }
                        } catch (Exception e) {
                            SameLogTool.m51824b(MBridgeBaseView.TAG, e.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.m48831a(jSFactory, Integer.valueOf(mBridgeContainerView.f60472b.getVideo_end_type()));
                        }
                    }, getVideoSkipTime());
                }
            }
            m48826g();
        }
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void readyStatus(int i) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f60524q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f60520m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f60526s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f60523p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f60523p.release();
        }
        if (this.notifyListener != null) {
            this.notifyListener = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void resizeMiniCard(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60522o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i, i2);
            this.f60522o.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.f60518S = true;
            bringToFront();
            m48827f();
        }
    }

    public void setCloseDelayTime(int i) {
        this.f60533z = i;
    }

    public void setEndscreenType(int i) {
        this.f60532y = i;
    }

    public void setJSFactory(JSFactory jSFactory) {
        this.f60516Q = jSFactory;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60522o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f60522o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        SameLogTool.m51824b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)));
        this.f60514O = i;
        this.f60510K = i2;
        this.f60511L = i3;
        this.f60512M = i4;
        this.f60513N = i5;
        this.f60515P = JsonUtils.m51618a(i, i2, i3, i4, i5);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f60523p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f60558p != null) {
            mBridgeH5EndCardView.setNotchValue(this.f60515P, i2, i3, i4, i5);
            WindVaneCallJs.m51063a().m51061a((WebView) this.f60524q.f60558p, "oncutoutfetched", Base64.encodeToString(this.f60515P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f60520m;
        if (mBridgePlayableView != null && mBridgePlayableView.f60558p != null) {
            mBridgePlayableView.setNotchValue(this.f60515P, i2, i3, i4, i5);
            WindVaneCallJs.m51063a().m51061a((WebView) this.f60520m.f60558p, "oncutoutfetched", Base64.encodeToString(this.f60515P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f60529v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i2, i3, i4, i5);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(OnNotifyListener onNotifyListener) {
        super.setNotifyListener(onNotifyListener);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f60520m, this.f60521n, this.f60522o, this.f60523p, this.f60524q, this.f60525r, this.f60526s, this.f60527t};
        for (int i = 0; i < 8; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new MiniCardProxyNotifyListener(this.f60522o, onNotifyListener));
                } else {
                    mBridgeBaseView.setNotifyListener(new ProxyOnNotifyListener(onNotifyListener));
                }
            }
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f60523p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f60523p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i) {
        this.f60500A = i;
    }

    public void setRewardStatus(boolean z) {
        this.f60509J = z;
    }

    public void setShowingTransparent(boolean z) {
        this.f60503D = z;
    }

    public void setUnitID(String str) {
        this.f60530w = str;
    }

    public void setVideoInteractiveType(int i) {
        CampaignEx campaignEx = this.f60472b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            int m48940a = UIControlUtil.m48940a(this.f60472b);
            if (m48940a == 100) {
                this.f60531x = i;
                return;
            } else {
                this.f60531x = m48940a;
                return;
            }
        }
        this.f60531x = i;
    }

    public void setVideoSkipTime(int i) {
        this.f60507H = i;
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public boolean showAlertWebView() {
        boolean z;
        MBridgeAlertWebview mBridgeAlertWebview = this.f60528u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.f60518S) {
            removeAllViews();
            bringToFront();
            this.f60517R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60522o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f60528u == null) {
            m48826g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f60528u;
        if (mBridgeAlertWebview2 != null && mBridgeAlertWebview2.getParent() != null) {
            removeView(this.f60528u);
        }
        addView(this.f60528u);
        setBackgroundColor(0);
        this.f60528u.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void showEndcard(int i) {
        CampaignEx campaignEx = this.f60472b;
        if (campaignEx != null) {
            if (i != 1) {
                if (i != 100) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                removeAllViews();
                                setMatchParent();
                                this.f60518S = true;
                                bringToFront();
                                m48835a();
                                this.notifyListener.mo48633a(117, "");
                            } else {
                                this.notifyListener.mo48633a(106, "");
                            }
                        } else {
                            this.notifyListener.mo48633a(113, "");
                            removeAllViews();
                            setMatchParent();
                            if (this.f60526s == null) {
                                m48831a(this.f60516Q, 4);
                            }
                            this.f60526s.setUnitId(this.f60530w);
                            this.f60526s.preLoadData(this.f60516Q);
                            addView(this.f60526s);
                            this.f60518S = true;
                            bringToFront();
                        }
                    } else {
                        removeAllViews();
                        setMatchParent();
                        if (this.f60525r == null) {
                            m48831a(this.f60516Q, 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        addView(this.f60525r, layoutParams);
                        this.f60525r.notifyShowListener();
                        this.f60518S = true;
                        bringToFront();
                    }
                } else {
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        this.f60506G = true;
                    }
                    m48834a(this.f60520m);
                    setMatchParent();
                    m48828e();
                }
            } else {
                this.notifyListener.mo48633a(104, "");
            }
        }
        this.f60501B = true;
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60522o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.f60522o.setRadius(i5);
            this.f60522o.setCloseVisible(8);
            this.f60522o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f60518S = true;
            bringToFront();
            m48827f();
            if (!this.f60505F) {
                this.f60505F = true;
                this.notifyListener.mo48633a(109, "");
                this.notifyListener.mo48633a(117, "");
            }
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f60471a);
        this.f60529v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f60519T);
        OnNotifyListener onNotifyListener = this.notifyListener;
        if (onNotifyListener != null && (onNotifyListener instanceof StatisticsOnNotifyListener)) {
            ((StatisticsOnNotifyListener) onNotifyListener).m48648a(this.f60519T);
        }
        this.f60529v.setNotifyListener(new ProxyOnNotifyListener(this.notifyListener));
        this.f60529v.setRewarded(this.f60509J);
        this.f60529v.setNotchPadding(this.f60510K, this.f60511L, this.f60512M, this.f60513N);
        this.f60529v.setCampOrderViewBuildCallback(new CampOrderViewBuildCallback() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.3
            @Override // com.mbridge.msdk.video.dynview.p519e.CampOrderViewBuildCallback
            /* renamed from: a */
            public final void mo48823a() {
                OnNotifyListener onNotifyListener2 = MBridgeContainerView.this.notifyListener;
                if (onNotifyListener2 != null) {
                    onNotifyListener2.mo48633a(117, "");
                }
            }

            @Override // com.mbridge.msdk.video.dynview.p519e.CampOrderViewBuildCallback
            /* renamed from: b */
            public final void mo48822b() {
                if (MBridgeContainerView.this.f60472b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                    return;
                }
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.showEndcard(mBridgeContainerView.f60472b.getVideo_end_type());
            }
        });
        this.f60529v.createView(this);
    }

    public void showPlayableView() {
        if (this.f60472b != null && !this.f60506G) {
            removeAllViews();
            setMatchParent();
            if (this.f60520m == null) {
                preLoadData(this.f60516Q);
            }
            addView(this.f60520m);
            MBridgePlayableView mBridgePlayableView = this.f60520m;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f60530w);
                CampaignEx campaignEx = this.f60472b;
                if (campaignEx != null && campaignEx.isMraid() && this.f60472b.getPlayable_ads_without_video() == 2) {
                    this.f60520m.setCloseVisible(0);
                }
                this.f60520m.setNotchValue(this.f60515P, this.f60510K, this.f60511L, this.f60512M, this.f60513N);
            }
            this.f60518S = true;
            bringToFront();
        }
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void showVideoClickView(int i) {
        CampaignEx campaignEx;
        if (this.f60472b != null) {
            if (i != -1) {
                if (i != 1) {
                    if (i == 2) {
                        MBridgeClickCTAView mBridgeClickCTAView = this.f60521n;
                        if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                            removeView(this.f60521n);
                        }
                        MBridgeAlertWebview mBridgeAlertWebview = this.f60528u;
                        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                            return;
                        }
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60522o;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                CampaignEx campaignEx2 = this.f60472b;
                                if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    m48827f();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
                            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                                removeView(this.f60524q);
                            }
                            this.notifyListener.mo48633a(112, "");
                            CampaignEx campaignEx3 = this.f60472b;
                            if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                                this.f60472b.setHasReportAdTrackPause(true);
                                VideoViewReport.m48620f(this.f60471a, this.f60472b);
                            }
                            if (this.f60503D) {
                                this.notifyListener.mo48633a(115, "");
                            } else {
                                this.f60518S = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f60502C = true;
                            return;
                        }
                        m48825h();
                    }
                } else if (this.f60501B) {
                } else {
                    MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f60524q;
                    if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                        removeView(this.f60524q);
                    }
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f60522o;
                    if (mBridgeClickMiniCardView2 != null && mBridgeClickMiniCardView2.getParent() != null) {
                        removeView(this.f60522o);
                    }
                    MBridgeClickCTAView mBridgeClickCTAView2 = this.f60521n;
                    if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                        try {
                            CampaignEx campaignEx4 = this.f60472b;
                            if (campaignEx4 != null && campaignEx4.getPlayable_ads_without_video() == 1) {
                                this.f60518S = true;
                                if (this.f60521n == null) {
                                    m48829b(-1);
                                }
                                if (this.f60521n != null && ((campaignEx = this.f60472b) == null || !campaignEx.isDynamicView())) {
                                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                    layoutParams.addRule(12, -1);
                                    addView(this.f60521n, 0, layoutParams);
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (isLast()) {
                        bringToFront();
                    }
                }
            } else if (!isLast() && !endCardShowing()) {
                m48825h();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f60527t;
        if (mBridgeVideoEndCoverView == null) {
            JSFactory jSFactory = this.f60516Q;
            this.f60516Q = jSFactory;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f60471a);
                this.f60527t = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.f60472b);
                this.f60527t.setNotifyListener(new ProxyOnNotifyListener(this.notifyListener));
                this.f60527t.preLoadData(jSFactory);
            }
        }
        addView(this.f60527t);
        onConfigurationChanged(getResources().getConfiguration());
        this.f60518S = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1
    public void toggleCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f60520m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f60524q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("type", 2);
            C22011d.m52050a().m52040a("2000152", parameterWrapper);
            C22011d.m52050a().m52045a("2000134", this.f60472b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (this.f60472b != null) {
            this.notifyListener.mo48633a(122, "");
            this.notifyListener.mo48633a(104, "");
        }
    }

    public void webviewshow() {
        try {
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("type", 3);
            C22011d.m52050a().m52044a("2000133", this.f60472b, parameterWrapper);
        } catch (Exception unused) {
        }
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f60520m, this.f60522o, this.f60524q, this.f60528u};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    /* renamed from: a */
    private void m48834a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                SameLogTool.m51823b(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            m48834a(view);
            super.addView(view, layoutParams);
            return;
        }
        SameLogTool.m51824b(MBridgeBaseView.TAG, "view is null");
    }

    /* renamed from: a */
    private void m48835a() {
        CampaignEx campaignEx = this.f60472b;
        if (campaignEx != null) {
            boolean isDynamicView = campaignEx.isDynamicView();
            boolean m51707l = SameTool.m51707l(this.f60472b.getendcard_url());
            if (isDynamicView && !m51707l && !this.f60472b.isMraid()) {
                m48828e();
                return;
            }
        }
        if (this.f60532y == 2 && !this.f60508I) {
            m48830b();
        } else {
            m48828e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m48831a(JSFactory jSFactory, Integer num) {
        CampaignEx campaignEx;
        OnNotifyListener onNotifyListener;
        CampaignEx campaignEx2;
        this.f60516Q = jSFactory;
        CampaignEx campaignEx3 = this.f60472b;
        if (campaignEx3 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx3.getVideo_end_type());
            }
            if (!isLast()) {
                m48825h();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.f60525r == null) {
                        this.f60525r = new MBridgeVastEndCardView(this.f60471a);
                    }
                    this.f60525r.setCampaign(this.f60472b);
                    this.f60525r.setNotifyListener(new VastProxyNotifyListener(this.notifyListener));
                    this.f60525r.preLoadData(jSFactory);
                } else if (intValue == 4) {
                    if (this.f60526s == null) {
                        this.f60526s = new MBridgeLandingPageView(this.f60471a);
                    }
                    this.f60526s.setCampaign(this.f60472b);
                    this.f60526s.setNotifyListener(new ProxyOnNotifyListener(this.notifyListener));
                } else if (intValue != 5) {
                    if (this.f60532y == 2) {
                        boolean isDynamicView = this.f60472b.isDynamicView();
                        boolean m51707l = SameTool.m51707l(this.f60472b.getendcard_url());
                        if ((isDynamicView && !m51707l && (campaignEx2 = this.f60472b) != null && !campaignEx2.isMraid()) || (campaignEx = this.f60472b) == null || campaignEx.getAdSpaceT() == 2) {
                            return;
                        }
                        if (this.f60524q == null) {
                            this.f60524q = new MBridgeH5EndCardView(this.f60471a);
                            try {
                                ParameterWrapper parameterWrapper = new ParameterWrapper();
                                parameterWrapper.m52024a("type", 3);
                                C22011d.m52050a().m52044a("2000154", this.f60472b, parameterWrapper);
                            } catch (Throwable th) {
                                SameLogTool.m51824b(MBridgeBaseView.TAG, th.getMessage());
                            }
                        }
                        if (this.f60472b.getDynamicTempCode() == 5 && (onNotifyListener = this.notifyListener) != null && (onNotifyListener instanceof StatisticsOnNotifyListener)) {
                            ((StatisticsOnNotifyListener) onNotifyListener).m48650a(this.f60472b);
                        }
                        this.f60524q.setCampaign(this.f60472b);
                        this.f60524q.setCloseDelayShowTime(this.f60533z);
                        this.f60524q.setNotifyListener(new ProxyOnNotifyListener(this.notifyListener));
                        this.f60524q.setUnitId(this.f60530w);
                        this.f60524q.setNotchValue(this.f60515P, this.f60510K, this.f60511L, this.f60512M, this.f60513N);
                        this.f60524q.preLoadData(jSFactory);
                        if (this.f60503D) {
                            return;
                        }
                        addView(this.f60524q);
                        return;
                    }
                    CampaignEx campaignEx4 = this.f60472b;
                    int m52527b = (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null) ? 0 : this.f60472b.getRewardTemplateMode().m52527b();
                    if (this.f60523p == null) {
                        CampaignEx campaignEx5 = this.f60472b;
                        if (campaignEx5 != null && campaignEx5.isDynamicView()) {
                            m48824i();
                        } else {
                            Context context = this.f60471a;
                            CampaignEx campaignEx6 = this.f60472b;
                            boolean z = campaignEx6 != null && campaignEx6.getAdSpaceT() == 2;
                            CampaignEx campaignEx7 = this.f60472b;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(context, null, false, -1, z, m52527b, campaignEx7 != null ? campaignEx7.getMof_tplid() : 0);
                            this.f60523p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f60472b);
                        }
                    }
                    this.f60523p.setLayout();
                    if (this.f60472b.isDynamicView()) {
                        MOfferEnergize m48876a = MOfferEnergize.m48876a();
                        if (m48876a.m48871a(this.f60472b.getRequestId() + "_" + this.f60472b.getId())) {
                            try {
                                MOfferEnergize m48876a2 = MOfferEnergize.m48876a();
                                MBridgeNativeEndCardView mBridgeNativeEndCardView2 = this.f60523p;
                                m48876a2.m48875a(mBridgeNativeEndCardView2, this.f60472b.getRequestId() + "_" + this.f60472b.getId(), new ProxyOnNotifyListener(this.notifyListener));
                            } catch (Exception e) {
                                SameLogTool.m51824b(MBridgeBaseView.TAG, e.getMessage());
                            }
                        } else {
                            try {
                                String m51690a = UriUtil.m51690a(this.f60472b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(m51690a) && Integer.parseInt(m51690a) == 1) {
                                    MOfferEnergize.m48876a().m48873a(this.f60472b, this.f60523p, new ProxyOnNotifyListener(this.notifyListener), 2);
                                }
                            } catch (Exception e2) {
                                SameLogTool.m51824b(MBridgeBaseView.TAG, e2.getMessage());
                            }
                        }
                    }
                    this.f60523p.setUnitId(this.f60530w);
                    this.f60523p.setCloseBtnDelay(this.f60533z);
                    this.f60523p.setNotifyListener(new ProxyOnNotifyListener(this.notifyListener));
                    this.f60523p.preLoadData(jSFactory);
                    this.f60523p.setNotchPadding(this.f60510K, this.f60511L, this.f60512M, this.f60513N);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60532y = 1;
        this.f60533z = 1;
        this.f60500A = 1;
        this.f60501B = false;
        this.f60502C = false;
        this.f60503D = false;
        this.f60504E = true;
        this.f60505F = false;
        this.f60506G = false;
        this.f60508I = false;
        this.f60509J = false;
        this.f60517R = false;
        this.f60518S = false;
        this.f60519T = new ArrayList();
    }

    /* renamed from: b */
    private void m48829b(int i) {
        if (i != -3) {
            if (i != -2) {
                if (this.f60521n == null) {
                    this.f60521n = new MBridgeClickCTAView(this.f60471a);
                }
                this.f60521n.setCampaign(this.f60472b);
                this.f60521n.setUnitId(this.f60530w);
                this.f60521n.setNotifyListener(new ProxyOnNotifyListener(this.notifyListener));
                this.f60521n.preLoadData(this.f60516Q);
                return;
            }
            CampaignEx campaignEx = this.f60472b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f60522o == null) {
                this.f60522o = new MBridgeClickMiniCardView(this.f60471a);
            }
            this.f60522o.setCampaign(this.f60472b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60522o;
            mBridgeClickMiniCardView.setNotifyListener(new MiniCardProxyNotifyListener(mBridgeClickMiniCardView, this.notifyListener));
            this.f60522o.preLoadData(this.f60516Q);
            setMatchParent();
            m48827f();
            m48825h();
        }
    }
}
