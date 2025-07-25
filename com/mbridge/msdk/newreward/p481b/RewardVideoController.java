package com.mbridge.msdk.newreward.p481b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.same.SameCommon;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.command.CommandType;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;
import com.mbridge.msdk.newreward.function.p492e.CampaignModel;
import com.mbridge.msdk.newreward.function.p495h.MBridgeCommonUtils;
import com.mbridge.msdk.newreward.function.p495h.MetricsUtil;
import com.mbridge.msdk.newreward.p477a.AdapterManager;
import com.mbridge.msdk.newreward.p477a.AdapterModel;
import com.mbridge.msdk.newreward.p477a.DevExtraData;
import com.mbridge.msdk.newreward.p477a.RewardMVVideoAdapter;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* renamed from: com.mbridge.msdk.newreward.b.d */
/* loaded from: classes6.dex */
public final class RewardVideoController extends AbsController implements RewardVideoListener, IController {

    /* renamed from: d */
    RewardVideoListener f58212d;

    /* renamed from: e */
    private int f58213e;

    /* renamed from: f */
    private boolean f58214f;

    /* renamed from: g */
    private int f58215g;

    /* renamed from: h */
    private int f58216h;

    /* renamed from: i */
    private int f58217i;

    public RewardVideoController(int i, String str, String str2, boolean z) {
        super(i, str, str2, z);
        this.f58213e = 2;
        this.f58214f = false;
        if (i == 287) {
            this.f58213e = CommonConst.f56455X;
        } else {
            this.f58213e = CommonConst.f56454W;
        }
    }

    @Override // com.mbridge.msdk.newreward.p481b.AbsController
    /* renamed from: a */
    final void mo50691a() {
        this.f58203b.mo50827a(this.f58202a, this.f58204c);
    }

    /* renamed from: b */
    public final String m50684b() {
        AdapterModel mo50826b;
        CampaignModel m50815D;
        MBridgeCampaigns m50341b;
        AdapterManager adapterManager = this.f58203b;
        if (adapterManager == null || (mo50826b = adapterManager.mo50826b()) == null || (m50815D = mo50826b.m50815D()) == null || (m50341b = m50815D.m50341b()) == null) {
            return "";
        }
        String m50583f = m50341b.m50583f();
        return TextUtils.isEmpty(m50583f) ? "" : m50583f;
    }

    /* renamed from: c */
    public final String m50682c() {
        AdapterModel mo50826b;
        CampaignModel m50815D;
        MBridgeCampaigns m50341b;
        AdapterManager adapterManager = this.f58203b;
        if (adapterManager == null || (mo50826b = adapterManager.mo50826b()) == null || (m50815D = mo50826b.m50815D()) == null || (m50341b = m50815D.m50341b()) == null) {
            return "";
        }
        return SameCommon.m52266a(m50341b.m50616E());
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z, int i) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdCloseWithIVReward(mBridgeIds, z, i);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        try {
            ((MBridgeDailyPlayModel) this.f58202a.m50472a((Object) null, CommandType.CREATE_DAILY)).insertDailyCap();
        } catch (Exception e) {
            SameLogTool.m51824b("RewardVideoController", "updateDailyShowCap error:" + e.getMessage());
        }
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f58212d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newreward.p481b.IController
    /* renamed from: a */
    public final void mo50685a(boolean z, String str) {
        RewardMVVideoAdapter rewardMVVideoAdapter = new RewardMVVideoAdapter(this.f58202a);
        AdapterModel adapterModel = new AdapterModel(z, this.f58204c.m50694e(), str, this.f58204c.m50696c(), this.f58204c.m50693f());
        adapterModel.m50746e(this.f58204c.m50695d());
        adapterModel.m50747e(this.f58213e);
        adapterModel.m50750d(MBSDKContext.m52746m().m52779k());
        adapterModel.m50751d(this.f58204c.m50693f() ? 2 : 1);
        adapterModel.m50742f(MetricsUtil.m50252a(str));
        adapterModel.m50745e(this.f58214f);
        adapterModel.m50790a(this.f58215g, this.f58216h, this.f58217i);
        this.f58203b.mo50835a(adapterModel, rewardMVVideoAdapter);
    }

    /* renamed from: b */
    public final void m50683b(boolean z) {
        this.f58214f = z;
    }

    @Override // com.mbridge.msdk.newreward.p481b.IController
    /* renamed from: a */
    public final void mo50687a(String str, String str2, String str3) {
        DevExtraData devExtraData = new DevExtraData();
        devExtraData.m50706a(str2);
        devExtraData.m50704b(str3);
        this.f58203b.mo50832a(devExtraData);
    }

    @Override // com.mbridge.msdk.newreward.p481b.IController
    /* renamed from: a */
    public final boolean mo50686a(boolean z) {
        return this.f58203b.mo50829a(z);
    }

    /* renamed from: a */
    public final void m50690a(int i) {
        this.f58213e = i;
        AdapterManager adapterManager = this.f58203b;
        if (adapterManager != null) {
            for (AdapterModel adapterModel : adapterManager.mo50842a()) {
                adapterModel.m50747e(i);
            }
        }
    }

    /* renamed from: a */
    public final void m50689a(int i, int i2, int i3) {
        this.f58215g = i;
        this.f58216h = i2;
        if (i2 == CommonConst.f56442K) {
            this.f58217i = i3 < 0 ? 5 : i3;
        }
        if (i2 == CommonConst.f56441J) {
            this.f58217i = i3 < 0 ? 80 : i3;
        }
        MBridgeCommonUtils.m50256a(this.f58204c.m50696c(), i, i2, i3);
    }

    @Override // com.mbridge.msdk.newreward.p481b.IController
    /* renamed from: a */
    public final void mo50688a(RewardVideoListener rewardVideoListener) {
        this.f58212d = rewardVideoListener;
        this.f58203b.mo50831a(this);
    }
}
