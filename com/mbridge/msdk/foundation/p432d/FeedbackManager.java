package com.mbridge.msdk.foundation.p432d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p432d.p433a.FeedBackBtnBean;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.SettingManagerDiff;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.d.b */
/* loaded from: classes6.dex */
public final class FeedbackManager {

    /* renamed from: a */
    public static int f56197a = -2;

    /* renamed from: b */
    public static int f56198b = -2;

    /* renamed from: c */
    public static volatile boolean f56199c = false;

    /* renamed from: d */
    private final RelativeLayout.LayoutParams f56200d;

    /* renamed from: e */
    private final ConcurrentHashMap<String, FeedBackBtnBean> f56201e;

    /* renamed from: f */
    private Setting f56202f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackManager.java */
    /* renamed from: com.mbridge.msdk.foundation.d.b$a */
    /* loaded from: classes6.dex */
    public static class C21917a {

        /* renamed from: a */
        private static final FeedbackManager f56203a = new FeedbackManager();
    }

    /* renamed from: a */
    public static FeedbackManager m52694a() {
        return C21917a.f56203a;
    }

    /* renamed from: d */
    private FeedBackBtnBean m52675d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = MBSDKContext.m52746m().m52779k();
        }
        if (this.f56201e.containsKey(str)) {
            return this.f56201e.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m52679b() {
        Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
        this.f56202f = m53279b;
        if (m53279b == null) {
            SettingManager.m53286a();
            this.f56202f = SettingManagerDiff.m53265a();
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public final void m52676c(String str) {
        try {
            FeedBackBtnBean m52675d = m52675d(str);
            if (m52675d != null) {
                m52675d.m52725a();
            }
            this.f56201e.remove(str);
            f56199c = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private FeedbackManager() {
        this.f56200d = new RelativeLayout.LayoutParams(f56198b, f56197a);
        this.f56201e = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final void m52685a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, FeedbackDialogEventListener feedbackDialogEventListener) {
        if (m52679b()) {
            FeedBackBtnBean m52691a = m52691a(str);
            if (feedbackDialogEventListener != null) {
                m52691a.m52719a(new FeedBackBtnBean.C21915a(str, feedbackDialogEventListener));
            }
            FeedBackButton m52706d = m52691a.m52706d();
            if (m52706d != null) {
                if (layoutParams == null) {
                    int m51772a = SameTool.m51772a(MBSDKContext.m52746m().m52792c(), 10.0f);
                    this.f56200d.setMargins(m51772a, m51772a, m51772a, m51772a);
                    layoutParams = this.f56200d;
                }
                ViewGroup viewGroup2 = (ViewGroup) m52706d.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(m52706d);
                }
                Activity m52693a = m52693a(context);
                if (m52693a != null && viewGroup == null) {
                    viewGroup = (ViewGroup) m52693a.findViewById(16908290);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(m52706d);
                    viewGroup.addView(m52706d, layoutParams);
                }
            }
        }
    }

    /* renamed from: b */
    public final FeedBackButton m52678b(String str) {
        return m52691a(str).m52706d();
    }

    /* renamed from: b */
    public final void m52677b(String str, int i) {
        m52691a(str).m52712b(i);
    }

    /* renamed from: a */
    public final FeedBackBtnBean m52691a(String str) {
        FeedBackBtnBean feedBackBtnBean;
        if (TextUtils.isEmpty(str)) {
            str = MBSDKContext.m52746m().m52779k();
        }
        if (!this.f56201e.containsKey(str)) {
            feedBackBtnBean = new FeedBackBtnBean(str);
            this.f56201e.put(str, feedBackBtnBean);
        } else {
            feedBackBtnBean = this.f56201e.get(str);
        }
        if (feedBackBtnBean == null) {
            FeedBackBtnBean feedBackBtnBean2 = new FeedBackBtnBean(str);
            this.f56201e.put(str, feedBackBtnBean2);
            return feedBackBtnBean2;
        }
        return feedBackBtnBean;
    }

    /* renamed from: a */
    public final Activity m52693a(Context context) {
        Activity activity;
        Context m52787e = MBSDKContext.m52746m().m52787e();
        Activity activity2 = null;
        try {
            Activity activity3 = m52787e instanceof Activity ? (Activity) m52787e : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> m52805a = MBSDKContext.m52746m().m52805a();
                if (m52805a != null && (activity = m52805a.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing()) {
                    return null;
                }
                if (activity3.isDestroyed()) {
                    return null;
                }
                return activity3;
            } catch (Exception e) {
                e = e;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    public final void m52687a(String str, int i, ViewGroup viewGroup) {
        FeedBackBtnBean m52691a = m52691a(str);
        if (m52691a.m52706d() != null) {
            m52691a.m52708c(i);
            if (i == 0) {
                m52685a(str, MBSDKContext.m52746m().m52792c(), viewGroup, (ViewGroup.LayoutParams) null, (FeedbackDialogEventListener) null);
            }
        }
    }

    /* renamed from: a */
    public final void m52689a(String str, int i, int i2, int i3, float f, float f2, float f3, String str2, String str3, float f4, JSONArray jSONArray) {
        FeedBackBtnBean m52691a = m52691a(str);
        Context m52792c = MBSDKContext.m52746m().m52792c();
        m52691a.m52723a(SameTool.m51772a(m52792c, f), SameTool.m51772a(m52792c, f2), SameTool.m51772a(m52792c, i), SameTool.m51772a(m52792c, i2), SameTool.m51772a(m52792c, i3), f3, str2, str3, f4, jSONArray);
    }

    /* renamed from: a */
    public final void m52686a(String str, int i, FeedbackDialogEventListener feedbackDialogEventListener) {
        FeedBackBtnBean m52691a = m52691a(str);
        m52691a.m52719a(new FeedBackBtnBean.C21915a(str, feedbackDialogEventListener));
        if (i == 1) {
            m52691a.m52713b();
        } else {
            m52691a.m52704e();
        }
    }

    /* renamed from: a */
    public final void m52688a(String str, int i, int i2, String str2, String str3) {
        FeedBackBtnBean m52675d = m52675d(str + "_1");
        if (m52675d == null) {
            m52675d = m52675d(str + "_2");
            if (m52675d == null) {
                m52675d = m52675d(str + "_3");
                if (m52675d == null) {
                    m52675d = m52675d(str + "_4");
                    if (m52675d == null) {
                        m52675d = m52691a(str);
                    }
                }
            }
            m52675d.m52712b(0);
        }
        if (m52675d != null) {
            CampaignEx m52709c = m52675d.m52709c();
            ReportUtil.m51957a(m52709c, m52709c != null ? m52709c.getCampaignUnitId() : "", m52675d.m52701g(), m52675d.m52702f(), !TextUtils.isEmpty(str2) ? str2 : "", i, m52709c != null ? m52709c.getAdType() : 0, i2, str3);
        }
    }

    /* renamed from: a */
    public final void m52682a(String str, CampaignEx campaignEx) {
        m52691a(str).m52717a(campaignEx);
    }

    /* renamed from: a */
    public final void m52680a(String str, String str2) {
        m52691a(str).m52714a(str2);
    }

    /* renamed from: a */
    public final void m52681a(String str, FeedBackButton feedBackButton) {
        m52691a(str).m52716a(feedBackButton);
    }

    /* renamed from: a */
    public final void m52683a(String str, FeedbackDialogEventListener feedbackDialogEventListener) {
        FeedBackBtnBean m52691a = m52691a(str);
        if (feedbackDialogEventListener != null) {
            m52691a.m52719a(new FeedBackBtnBean.C21915a(str, feedbackDialogEventListener));
        }
    }

    /* renamed from: a */
    public final void m52690a(String str, int i) {
        m52691a(str).m52724a(i);
    }

    /* renamed from: a */
    public final boolean m52684a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            SameLogTool.m51822c("", "mbAlertDialog  is null");
            return false;
        }
        return m52692a(context, mBFeedBackDialog);
    }

    /* renamed from: a */
    private boolean m52692a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity m52693a = m52693a(context);
        if (m52693a == null || mBFeedBackDialog == null || m52693a.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || m52693a.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
