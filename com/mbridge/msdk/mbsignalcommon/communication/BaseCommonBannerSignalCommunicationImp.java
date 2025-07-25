package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.CommonClickUtil;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.windvane.CallMethodContext;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.communication.a */
/* loaded from: classes6.dex */
public abstract class BaseCommonBannerSignalCommunicationImp implements IBannerSignalCommunication {

    /* renamed from: a */
    public static final String f57697a = "a";

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: f */
    public void mo51117f(Object obj, String str) {
        try {
            if (obj instanceof CallMethodContext) {
                WindVaneCallJs.m51063a().m51062a(((CallMethodContext) obj).f57740b);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b(f57697a, "onSignalCommunication", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: l */
    public final void mo51111l(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonSignalCommunicatioImpUtils.m51105a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                CommonSignalCommunicatioImpUtils.m51104a(obj, new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: n */
    public final void mo51109n(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonSignalCommunicatioImpUtils.m51105a(obj, "params is null");
            return;
        }
        Context m52792c = MBSDKContext.m52746m().m52792c();
        if (!TextUtils.isEmpty(str)) {
            if (m52792c == null) {
                try {
                    if ((obj instanceof CallMethodContext) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                        m52792c = windVaneWebView.getContext();
                    }
                } catch (Exception unused) {
                }
            }
            if (m52792c == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    CommonClickUtil.m53164d(m52792c, optString);
                } else if (optInt == 2) {
                    CommonClickUtil.m53162f(m52792c, optString);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: o */
    public final void mo51108o(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonSignalCommunicatioImpUtils.m51105a(obj, "params is null");
            return;
        }
        Context m52792c = MBSDKContext.m52746m().m52792c();
        if (!TextUtils.isEmpty(str)) {
            if (m52792c == null) {
                try {
                    if ((obj instanceof CallMethodContext) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                        m52792c = windVaneWebView.getContext();
                    }
                } catch (Exception unused) {
                }
            }
            if (m52792c == null) {
                WindVaneCallJs.m51063a().m51060a(obj, CommonSignalCommunicatioImpUtils.m51106a(1));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", SameDiTool.m51876m(m52792c));
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = Base64.encodeToString(jSONObject2.getBytes(), 2);
                }
                WindVaneCallJs.m51063a().m51060a(obj, jSONObject2);
            } catch (Throwable unused2) {
                WindVaneCallJs.m51063a().m51060a(obj, CommonSignalCommunicatioImpUtils.m51106a(1));
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: a */
    public void mo51122a(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: b */
    public void mo51121b(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: c */
    public void mo51120c(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: d */
    public void mo51119d(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: e */
    public void mo51118e(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: g */
    public void mo51116g(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: h */
    public void mo51115h(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: i */
    public void mo51114i(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: j */
    public void mo51113j(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: k */
    public void mo51112k(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.BaseIBannerSignalCommunication
    /* renamed from: m */
    public final void mo51110m(Object obj, String str) {
    }
}
