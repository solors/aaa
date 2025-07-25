package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* loaded from: classes6.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: b */
    protected WindVaneWebViewChromeClient f57724b;

    /* renamed from: c */
    protected ISignalCommunication f57725c;

    /* renamed from: d */
    protected WindVaneApiManager f57726d;

    /* renamed from: e */
    private Object f57727e;

    /* renamed from: f */
    private Object f57728f;

    /* renamed from: g */
    private String f57729g;

    /* renamed from: h */
    private IWebViewListener f57730h;

    /* renamed from: i */
    private String f57731i;

    /* renamed from: j */
    private String f57732j;

    /* renamed from: k */
    private CampaignEx f57733k;

    /* renamed from: l */
    private int f57734l;

    /* renamed from: m */
    private boolean f57735m;

    /* renamed from: n */
    private float f57736n;

    /* renamed from: o */
    private float f57737o;

    public WindVaneWebView(Context context) {
        super(context);
        this.f57735m = false;
        this.f57736n = 0.0f;
        this.f57737o = 0.0f;
    }

    public void clearWebView() {
        if (!this.f57735m) {
            loadUrl(AndroidWebViewClient.BLANK_PAGE);
        }
    }

    public CampaignEx getCampaignEx() {
        return this.f57733k;
    }

    public String getCampaignId() {
        return this.f57729g;
    }

    public Object getJsObject(String str) {
        WindVaneApiManager windVaneApiManager = this.f57726d;
        if (windVaneApiManager == null) {
            return null;
        }
        return windVaneApiManager.m51066a(str);
    }

    public String getLocalRequestId() {
        return this.f57732j;
    }

    public Object getMraidObject() {
        return this.f57728f;
    }

    public Object getObject() {
        return this.f57727e;
    }

    public String getRid() {
        return this.f57731i;
    }

    public ISignalCommunication getSignalCommunication() {
        return this.f57725c;
    }

    public IWebViewListener getWebViewListener() {
        return this.f57730h;
    }

    public boolean isDestoryed() {
        return this.f57735m;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        BaseWebViewClient baseWebViewClient = this.mWebViewClient;
        if (baseWebViewClient != null && (baseWebViewClient.m51164b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f57736n = motionEvent.getRawX();
                    this.f57737o = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f57736n;
                    float y = motionEvent.getY() - this.f57737o;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y >= 0.0f || (-1.0f) * y <= 48) && (y <= 0.0f || y <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        WindVaneApiManager windVaneApiManager = this.f57726d;
        if (windVaneApiManager == null) {
            return;
        }
        windVaneApiManager.m51064a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f57735m) {
                ParameterWrapper parameterWrapper = new ParameterWrapper();
                parameterWrapper.m52024a("type", Integer.valueOf(this.f57734l));
                C22011d.m52050a().m52044a("2000135", this.f57733k, parameterWrapper);
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f57727e = null;
            int m51748b = SameTool.m51748b(getContext());
            if (m51748b == 0) {
                this.f57735m = true;
                destroy();
            } else {
                new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.this.f57735m = true;
                        WindVaneWebView.this.destroy();
                    }
                }, m51748b * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        WindVaneApiManager windVaneApiManager = this.f57726d;
        if (windVaneApiManager != null) {
            windVaneApiManager.m51068a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        WindVaneApiManager windVaneApiManager = this.f57726d;
        if (windVaneApiManager != null) {
            windVaneApiManager.m51067a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f57733k = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f57729g = str;
    }

    public void setLocalRequestId(String str) {
        this.f57732j = str;
    }

    public void setMraidObject(Object obj) {
        this.f57728f = obj;
    }

    public void setObject(Object obj) {
        this.f57727e = obj;
    }

    public void setRid(String str) {
        this.f57731i = str;
    }

    public void setSignalCommunication(ISignalCommunication iSignalCommunication) {
        this.f57725c = iSignalCommunication;
        iSignalCommunication.mo51057a(this);
    }

    public void setTempTypeForMetrics(int i) {
        this.f57734l = i;
    }

    public void setWebViewChromeClient(WindVaneWebViewChromeClient windVaneWebViewChromeClient) {
        this.f57724b = windVaneWebViewChromeClient;
        setWebChromeClient(windVaneWebViewChromeClient);
    }

    public void setWebViewListener(IWebViewListener iWebViewListener) {
        this.f57730h = iWebViewListener;
        WindVaneWebViewChromeClient windVaneWebViewChromeClient = this.f57724b;
        if (windVaneWebViewChromeClient != null) {
            windVaneWebViewChromeClient.m51048a(iWebViewListener);
        }
        BaseWebViewClient baseWebViewClient = this.mWebViewClient;
        if (baseWebViewClient != null) {
            baseWebViewClient.m51166a(iWebViewListener);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    /* renamed from: a */
    protected final void mo51075a() {
        super.mo51075a();
        getSettings().setSavePassword(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f57724b == null) {
            this.f57724b = new WindVaneWebViewChromeClient(this);
        }
        setWebViewChromeClient(this.f57724b);
        WindVaneWebViewClient windVaneWebViewClient = new WindVaneWebViewClient();
        this.mWebViewClient = windVaneWebViewClient;
        setWebViewClient(windVaneWebViewClient);
        if (this.f57725c == null) {
            ISignalCommunication windVaneSignalCommunication = new WindVaneSignalCommunication(this.f57622a);
            this.f57725c = windVaneSignalCommunication;
            setSignalCommunication(windVaneSignalCommunication);
        }
        this.f57726d = new WindVaneApiManager(this.f57622a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57735m = false;
        this.f57736n = 0.0f;
        this.f57737o = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57735m = false;
        this.f57736n = 0.0f;
        this.f57737o = 0.0f;
    }
}
