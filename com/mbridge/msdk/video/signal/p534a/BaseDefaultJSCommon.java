package com.mbridge.msdk.video.signal.p534a;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.click.CommonClickControl;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.BaseIJSCommon;
import com.mbridge.msdk.video.signal.IJSCommon;
import com.mbridge.msdk.videocommon.p538d.RewardUnitSetting;

/* renamed from: com.mbridge.msdk.video.signal.a.a */
/* loaded from: classes6.dex */
public abstract class BaseDefaultJSCommon implements IJSCommon {

    /* renamed from: j */
    protected String f60871j;

    /* renamed from: k */
    protected RewardUnitSetting f60872k;

    /* renamed from: l */
    protected CommonClickControl f60873l;

    /* renamed from: a */
    protected boolean f60862a = false;

    /* renamed from: b */
    protected boolean f60863b = false;

    /* renamed from: c */
    protected int f60864c = 0;

    /* renamed from: d */
    protected int f60865d = 0;

    /* renamed from: e */
    protected int f60866e = 0;

    /* renamed from: f */
    protected int f60867f = 0;

    /* renamed from: g */
    protected int f60868g = 0;

    /* renamed from: h */
    protected int f60869h = 1;

    /* renamed from: i */
    protected int f60870i = -1;

    /* renamed from: m */
    public BaseIJSCommon.InterfaceC23135a f60874m = new C23136a();

    /* renamed from: n */
    protected int f60875n = 2;

    /* renamed from: o */
    private AdSession f60876o = null;

    /* renamed from: p */
    private MediaEvents f60877p = null;

    /* renamed from: q */
    private AdEvents f60878q = null;

    /* compiled from: BaseDefaultJSCommon.java */
    /* renamed from: com.mbridge.msdk.video.signal.a.a$a */
    /* loaded from: classes6.dex */
    public static class C23136a implements BaseIJSCommon.InterfaceC23135a {
        @Override // com.mbridge.msdk.video.signal.BaseIJSCommon.InterfaceC23135a
        /* renamed from: a */
        public void mo48592a() {
            SameLogTool.m51827a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.video.signal.BaseIJSCommon.InterfaceC23135a
        /* renamed from: b */
        public void mo48589b() {
            SameLogTool.m51827a("DefaultJSCommon", "videoLocationReady");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            SameLogTool.m51827a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            SameLogTool.m51827a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
            SameLogTool.m51827a("DefaultJSCommon", "onDownloadProgress,progress:" + i);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            SameLogTool.m51827a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            SameLogTool.m51827a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            SameLogTool.m51827a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            SameLogTool.m51827a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            SameLogTool.m51827a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            SameLogTool.m51827a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.BaseIJSCommon.InterfaceC23135a
        /* renamed from: a */
        public void mo48590a(boolean z) {
            SameLogTool.m51827a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.BaseIJSCommon.InterfaceC23135a
        /* renamed from: a */
        public void mo48591a(int i, String str) {
            SameLogTool.m51827a("DefaultJSCommon", "onH5Error,code:" + i + "，msg:" + str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final void mo48615a(AdSession adSession) {
        this.f60876o = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: b */
    public final void mo48609b(int i) {
        this.f60865d = i;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: c */
    public final void mo48607c(int i) {
        this.f60864c = i;
    }

    @Override // com.mbridge.msdk.video.signal.IJSCommonClick
    public void click(int i, String str) {
        SameLogTool.m51827a("DefaultJSCommon", "click:type" + i + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: d */
    public final void mo48606d(int i) {
        this.f60866e = i;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: e */
    public final void mo48604e(int i) {
        this.f60868g = i;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: f */
    public void mo48569f() {
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: g */
    public final int mo48602g() {
        return this.f60870i;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: h */
    public final void mo48600h(int i) {
        SameLogTool.m51827a("DefaultJSCommon", "setAlertDialogRole " + i);
        this.f60869h = i;
    }

    @Override // com.mbridge.msdk.video.signal.IJSCommonClick
    public void handlerH5Exception(int i, String str) {
        SameLogTool.m51827a("DefaultJSCommon", "handlerH5Exception,code=" + i + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: i */
    public String mo48567i() {
        SameLogTool.m51827a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    /* renamed from: j */
    public final AdSession m48599j() {
        return this.f60876o;
    }

    /* renamed from: k */
    public final MediaEvents m48598k() {
        return this.f60877p;
    }

    /* renamed from: l */
    public final AdEvents m48597l() {
        return this.f60878q;
    }

    /* renamed from: m */
    public final int m48596m() {
        if (this.f60864c == 0 && this.f60863b) {
            this.f60864c = 1;
        }
        return this.f60864c;
    }

    /* renamed from: n */
    public final int m48595n() {
        if (this.f60865d == 0 && this.f60863b) {
            this.f60865d = 1;
        }
        return this.f60865d;
    }

    /* renamed from: o */
    public final int m48594o() {
        if (this.f60866e == 0 && this.f60863b) {
            this.f60866e = 1;
        }
        return this.f60866e;
    }

    /* renamed from: p */
    public final boolean m48593p() {
        return this.f60863b;
    }

    /* compiled from: BaseDefaultJSCommon.java */
    /* renamed from: com.mbridge.msdk.video.signal.a.a$b */
    /* loaded from: classes6.dex */
    public static class C23137b implements BaseIJSCommon.InterfaceC23135a {

        /* renamed from: a */
        private IJSCommon f60879a;

        /* renamed from: b */
        private BaseIJSCommon.InterfaceC23135a f60880b;

        public C23137b(IJSCommon iJSCommon, BaseIJSCommon.InterfaceC23135a interfaceC23135a) {
            this.f60879a = iJSCommon;
            this.f60880b = interfaceC23135a;
        }

        @Override // com.mbridge.msdk.video.signal.BaseIJSCommon.InterfaceC23135a
        /* renamed from: a */
        public final void mo48592a() {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.mo48592a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.BaseIJSCommon.InterfaceC23135a
        /* renamed from: b */
        public final void mo48589b() {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.mo48589b();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDismissLoading(Campaign campaign) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadFinish(Campaign campaign) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadProgress(int i) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.onDownloadProgress(i);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadStart(Campaign campaign) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.onFinishRedirection(campaign, str);
            }
            IJSCommon iJSCommon = this.f60879a;
            if (iJSCommon != null) {
                iJSCommon.mo48572d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final boolean onInterceptDefaultLoadingDialog() {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null && interfaceC23135a.onInterceptDefaultLoadingDialog()) {
                return true;
            }
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.onRedirectionFailed(campaign, str);
            }
            IJSCommon iJSCommon = this.f60879a;
            if (iJSCommon != null) {
                iJSCommon.mo48572d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onShowLoading(Campaign campaign) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.BaseIJSCommon.InterfaceC23135a
        /* renamed from: a */
        public final void mo48590a(boolean z) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.mo48590a(z);
            }
        }

        @Override // com.mbridge.msdk.video.signal.BaseIJSCommon.InterfaceC23135a
        /* renamed from: a */
        public final void mo48591a(int i, String str) {
            BaseIJSCommon.InterfaceC23135a interfaceC23135a = this.f60880b;
            if (interfaceC23135a != null) {
                interfaceC23135a.mo48591a(i, str);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final void mo48614a(MediaEvents mediaEvents) {
        this.f60877p = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: b */
    public final boolean mo48610b() {
        return this.f60862a;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: c */
    public String mo48575c() {
        SameLogTool.m51827a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: d */
    public void mo48572d() {
        SameLogTool.m51827a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: e */
    public final void mo48605e() {
        SameLogTool.m51827a("DefaultJSCommon", "release");
        CommonClickControl commonClickControl = this.f60873l;
        if (commonClickControl != null) {
            commonClickControl.m53218a(false);
            this.f60873l.m53221a((NativeListener.NativeTrackingListener) null);
            this.f60873l.m53246a();
        }
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: f */
    public final void mo48603f(int i) {
        this.f60870i = i;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: g */
    public String mo48568g(int i) {
        SameLogTool.m51827a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final void mo48616a(AdEvents adEvents) {
        this.f60878q = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: b */
    public final void mo48608b(boolean z) {
        this.f60862a = z;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: h */
    public final int mo48601h() {
        SameLogTool.m51827a("DefaultJSCommon", "getAlertDialogRole " + this.f60869h);
        return this.f60869h;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final void mo48617a(int i) {
        this.f60875n = i;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: b */
    public void mo48577b(String str) {
        SameLogTool.m51827a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final int mo48618a() {
        return this.f60868g;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final void mo48619a(boolean z) {
        SameLogTool.m51827a("DefaultJSCommon", "setIsShowingTransparent:" + z);
        this.f60863b = z;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final void mo48611a(String str) {
        SameLogTool.m51827a("DefaultJSCommon", "setUnitId:" + str);
        this.f60871j = str;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final void mo48613a(BaseIJSCommon.InterfaceC23135a interfaceC23135a) {
        SameLogTool.m51827a("DefaultJSCommon", "setTrackingListener:" + interfaceC23135a);
        this.f60874m = interfaceC23135a;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public final void mo48612a(RewardUnitSetting rewardUnitSetting) {
        SameLogTool.m51827a("DefaultJSCommon", "setSetting:" + rewardUnitSetting);
        this.f60872k = rewardUnitSetting;
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public void mo48586a(int i, String str) {
        SameLogTool.m51827a("DefaultJSCommon", "statistics,type:" + i + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.BaseIJSCommon
    /* renamed from: a */
    public void mo48585a(Activity activity) {
        SameLogTool.m51827a("DefaultJSCommon", "setActivity ");
    }
}
