package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.video.module.p530a.OnNotifyListener;
import com.mbridge.msdk.video.module.p530a.p531a.DefaultOnNotifyListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* renamed from: a */
    protected Context f60471a;

    /* renamed from: b */
    protected CampaignEx f60472b;

    /* renamed from: c */
    protected LayoutInflater f60473c;

    /* renamed from: d */
    protected int f60474d;

    /* renamed from: e */
    protected boolean f60475e;

    /* renamed from: f */
    protected float f60476f;

    /* renamed from: g */
    protected float f60477g;

    /* renamed from: h */
    protected boolean f60478h;

    /* renamed from: i */
    protected int f60479i;

    /* renamed from: j */
    protected boolean f60480j;

    /* renamed from: k */
    protected int f60481k;

    /* renamed from: l */
    protected int f60482l;
    public OnNotifyListener notifyListener;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject m48844a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(CommonConst.f56463h, SameTool.m51747b(MBSDKContext.m52746m().m52792c(), this.f60476f));
                jSONObject2.put(CommonConst.f56464i, SameTool.m51747b(MBSDKContext.m52746m().m52792c(), this.f60477g));
                jSONObject2.put(CommonConst.f56468m, i);
                try {
                    this.f60474d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(CommonConst.f56466k, this.f60474d);
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
    /* renamed from: d */
    public final String m48843d() {
        return m48844a(0).toString();
    }

    public void defaultShow() {
        SameLogTool.m51827a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z, String str) {
        if (z) {
            return findDyID(str);
        }
        return findID(str);
    }

    public int findColor(String str) {
        return ResourceUtil.m51605a(this.f60471a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return ResourceUtil.m51605a(this.f60471a.getApplicationContext(), str, "drawable");
    }

    public int findDyID(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    public int findID(String str) {
        return ResourceUtil.m51605a(this.f60471a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return ResourceUtil.m51605a(this.f60471a.getApplicationContext(), str, "layout");
    }

    public CampaignEx getCampaign() {
        return this.f60472b;
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

    public abstract void init(Context context);

    public boolean isLandscape() {
        if (this.f60471a.getResources().getConfiguration().orientation == 2) {
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
        this.f60474d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f60476f = motionEvent.getRawX();
        this.f60477g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f60474d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f60472b = campaignEx;
    }

    public void setLayoutCenter(int i, int i2) {
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
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
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

    public void setNotifyListener(OnNotifyListener onNotifyListener) {
        this.notifyListener = onNotifyListener;
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

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2, int i3) {
        super(context, attributeSet);
        this.f60474d = 1;
        this.notifyListener = new DefaultOnNotifyListener();
        this.f60475e = false;
        this.f60481k = 1;
        this.f60482l = 0;
        this.f60471a = context;
        this.f60473c = LayoutInflater.from(context);
        this.f60478h = z;
        this.f60479i = i;
        this.f60480j = z2;
        this.f60481k = i2;
        this.f60482l = i3;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60474d = 1;
        this.notifyListener = new DefaultOnNotifyListener();
        this.f60475e = false;
        this.f60481k = 1;
        this.f60482l = 0;
        this.f60471a = context;
        this.f60473c = LayoutInflater.from(context);
        init(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo48721c() {
    }
}
