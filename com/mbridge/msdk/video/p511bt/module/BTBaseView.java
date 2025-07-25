package com.mbridge.msdk.video.p511bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import com.mbridge.msdk.video.p511bt.p512a.OperateViews;
import com.mbridge.msdk.videocommon.p538d.RewardUnitSetting;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.BTBaseView */
/* loaded from: classes6.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n */
    protected static int f59978n = 0;

    /* renamed from: o */
    protected static int f59979o = 1;

    /* renamed from: a */
    protected Context f59980a;

    /* renamed from: b */
    protected CampaignEx f59981b;

    /* renamed from: c */
    protected String f59982c;

    /* renamed from: d */
    protected String f59983d;

    /* renamed from: e */
    protected RewardUnitSetting f59984e;

    /* renamed from: f */
    protected LayoutInflater f59985f;

    /* renamed from: g */
    protected int f59986g;

    /* renamed from: h */
    protected boolean f59987h;

    /* renamed from: i */
    protected float f59988i;

    /* renamed from: j */
    protected float f59989j;

    /* renamed from: k */
    protected Rect f59990k;

    /* renamed from: l */
    protected int f59991l;

    /* renamed from: m */
    protected int f59992m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49101a() {
    }

    public void defaultShow() {
        SameLogTool.m51827a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return ResourceUtil.m51605a(this.f59980a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return ResourceUtil.m51605a(this.f59980a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return ResourceUtil.m51605a(this.f59980a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return ResourceUtil.m51605a(this.f59980a.getApplicationContext(), str, "layout");
    }

    public CampaignEx getCampaign() {
        return this.f59981b;
    }

    public String getInstanceId() {
        return this.f59983d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f59990k;
    }

    public String getUnitId() {
        return this.f59982c;
    }

    public int getViewHeight() {
        return this.f59992m;
    }

    public int getViewWidth() {
        return this.f59991l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        if (this.f59980a.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f59986g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f59988i = motionEvent.getRawX();
        this.f59989j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f59986g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f59981b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f59983d = str;
    }

    public void setLayout(int i, int i2) {
        this.f59991l = i;
        this.f59992m = i2;
    }

    public void setLayoutCenter(int i, int i2) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentRelativeLayoutParams.height = i2;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentLinearLayoutParams.height = i2;
            }
            setLayoutParams(parentLinearLayoutParams);
        } else if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i != -999) {
                parentFrameLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentFrameLayoutParams.height = i2;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i2;
            parentRelativeLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentRelativeLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i2;
            parentLinearLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentLinearLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
        } else if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i2;
            parentFrameLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentFrameLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentFrameLayoutParams.height = i4;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public void setRect(Rect rect) {
        this.f59990k = rect;
    }

    public void setRewardUnitSetting(RewardUnitSetting rewardUnitSetting) {
        this.f59984e = rewardUnitSetting;
    }

    public void setUnitId(String str) {
        this.f59982c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return;
        }
        layoutParams.height = -2;
        layoutParams.width = -2;
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59983d = "";
        this.f59986g = 1;
        this.f59987h = false;
        this.f59980a = context;
        this.f59985f = LayoutInflater.from(context);
        init(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject m49211a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(CommonConst.f56463h, SameTool.m51747b(MBSDKContext.m52746m().m52792c(), this.f59988i));
                jSONObject2.put(CommonConst.f56464i, SameTool.m51747b(MBSDKContext.m52746m().m52792c(), this.f59989j));
                jSONObject2.put(CommonConst.f56468m, i);
                try {
                    this.f59986g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(CommonConst.f56466k, this.f59986g);
                jSONObject2.put(CommonConst.f56467l, SameTool.m51731d(getContext()));
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m49210a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, f59978n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            WindVaneCallJs.m51063a().m51061a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            OperateViews.m49213c().m49266a(webView, e.getMessage());
            SameLogTool.m51827a(TAG, e.getMessage());
        }
    }
}
