package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.factory.JSFactory;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {

    /* renamed from: w */
    private boolean f60498w;

    public MBridgeClickMiniCardView(Context context) {
        super(context);
        this.f60498w = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    /* renamed from: a */
    public final String mo48765a() {
        CampaignEx campaignEx = this.f60472b;
        if (campaignEx != null) {
            CampaignEx.C21961c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            String m52525c = rewardTemplateMode != null ? rewardTemplateMode.m52525c() : null;
            if (TextUtils.isEmpty(m52525c) || !m52525c.contains(".zip")) {
                return m52525c;
            }
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(m52525c);
            return !TextUtils.isEmpty(h5ResAddress) ? h5ResAddress : m52525c;
        }
        return null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    /* renamed from: b */
    protected final RelativeLayout.LayoutParams mo48817b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    @RequiresApi(api = 11)
    /* renamed from: e */
    public final void mo48810e() {
        super.mo48810e();
        if (this.f60475e) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            m48836a(this.f60555m);
            setClickable(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    @RequiresApi(api = 11)
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f60475e) {
            m48836a(this.f60555m);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(JSFactory jSFactory) {
        super.preLoadData(jSFactory);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i, int i2) {
        View findViewById = ((Activity) this.f60471a).getWindow().findViewById(16908290);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if (i > 0 && i2 > 0 && i <= width && i2 <= height) {
            ViewGroup.LayoutParams layoutParams = this.f60555m.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            this.f60555m.setLayoutParams(layoutParams);
        }
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z) {
        setClickable(z);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.f60498w = true;
        resizeMiniCard(i3, i4);
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(SameTool.m51772a(getContext(), i));
            gradientDrawable.setColor(-1);
            this.f60558p.setBackground(gradientDrawable);
            this.f60558p.setClipToOutline(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f60558p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeClickMiniCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        SameLogTool.m51827a(MBridgeBaseView.TAG, "webviewshow");
                        int[] iArr = new int[2];
                        MBridgeClickMiniCardView.this.f60558p.getLocationOnScreen(iArr);
                        SameLogTool.m51824b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("startX", SameTool.m51747b(MBSDKContext.m52746m().m52792c(), (float) iArr[0]));
                        jSONObject.put("startY", SameTool.m51747b(MBSDKContext.m52746m().m52792c(), (float) iArr[1]));
                        WindVaneCallJs.m51063a().m51061a((WebView) MBridgeClickMiniCardView.this.f60558p, "webviewshow", Base64.encodeToString(jSONObject.toString().toString().getBytes(), 2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("type", 3);
            C22011d.m52050a().m52044a("2000133", this.f60472b, parameterWrapper);
        }
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60498w = false;
    }

    @RequiresApi(api = 11)
    /* renamed from: a */
    private void m48836a(View view) {
        int m51724f = SameTool.m51724f(this.f60471a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((m51724f * 0.7f) + 0.5f);
        layoutParams.height = (int) ((SameTool.m51727e(this.f60471a) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }
}
