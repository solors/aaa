package com.mbridge.msdk.scheme.applet;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.C21990d;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.UriUtil;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
        public final void onError(CommonError commonError) {
            super.onError(commonError);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel != null) {
                appletsModel.changeRequestingState(false);
                this.appletsModel.handlerSchemeRequestNetworkError(commonError);
            }
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
        public final void onSuccess(C21990d<JSONObject> c21990d) {
            super.onSuccess(c21990d);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel != null) {
                appletsModel.changeRequestingState(false);
                if (c21990d == null || c21990d.f56586c == null) {
                    this.appletsModel.handlerRequestNetworkError();
                    return;
                }
                try {
                    this.appletsModel.handlerSchemeRequestResult(c21990d);
                } catch (SchemeRequestException e) {
                    this.appletsModel.handlerSchemeRequestFailed(-2, e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z) {
        this.isRequesting = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:11|(8:12|13|(4:15|16|(2:44|45)(10:20|21|22|23|(2:34|35)|27|28|(1:30)|31|32)|33)(1:52)|46|47|48|(1:50)|51)|53|54|55|(1:57)|58|59|60|61|(1:63)|64|65|66|67|(1:69)|70|71|72|73|(1:75)|76|(1:78)|79|80|81|51) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
        com.mbridge.msdk.foundation.tools.SameLogTool.m51823b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
        com.mbridge.msdk.foundation.tools.SameLogTool.m51823b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0115, code lost:
        com.mbridge.msdk.foundation.tools.SameLogTool.m51823b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0130, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
        com.mbridge.msdk.foundation.tools.SameLogTool.m51823b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> getAppletsParamsAndBuildRequest(com.mbridge.msdk.foundation.entity.CampaignEx r20) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.scheme.applet.AppletsModel.getAppletsParamsAndBuildRequest(com.mbridge.msdk.foundation.entity.CampaignEx):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51827a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b(TAG, "handler request network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(MBSDKContext.m52746m().m52792c(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51827a(TAG, String.format("handlerSchemeRequestFailed network error by code %s and %s", String.valueOf(i), str));
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i, str, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b(TAG, "handler wx scheme failed exception  ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(MBSDKContext.m52746m().m52792c(), String.format("network error by code %s and %s", String.valueOf(i), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(CommonError commonError) {
        int i;
        String str;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (commonError != null) {
            i = commonError.f56579a;
            str = commonError.getMessage();
            if (i == 10) {
                str = "request timeout";
            }
        } else {
            i = -1;
            str = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51827a(TAG, String.format("handlerSchemeRequestNetworkError network error by code %s and %s", String.valueOf(i), str));
        }
        try {
            IAppletSchemeCallBack iAppletSchemeCallBack = this.appletSchemeCallBack;
            iAppletSchemeCallBack.onNetworkError(i, "network error: " + str, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b(TAG, "handler wx scheme network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(MBSDKContext.m52746m().m52792c(), String.format("network error by code %s and %s", String.valueOf(i), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(C21990d<JSONObject> c21990d) throws SchemeRequestException {
        JSONObject jSONObject = c21990d.f56586c;
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51827a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(optString)) {
                this.isRequestSuccess = true;
                handlerSchemeRequestSuccess(optString);
                return;
            }
            throw new SchemeRequestException("wx_scheme value is null");
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(optInt, optString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b(TAG, "handler wx scheme start exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(MBSDKContext.m52746m().m52792c(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            String str2 = TAG;
            SameLogTool.m51827a(str2, "handlerSchemeRequestSuccess: " + str);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b(TAG, "handler wx scheme success exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(MBSDKContext.m52746m().m52792c(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(UriUtil.m51690a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            SameLogTool.m51823b(TAG, "query wx_miniprogram from click url exception ", e);
            return false;
        }
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        if (linkType != 8 && linkType != 9) {
            return false;
        }
        return true;
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.C21961c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.m52523e())) {
                return TextUtils.equals(UriUtil.m51690a(rewardTemplateMode.m52523e(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            SameLogTool.m51823b(TAG, "query reqwxurl from template url exception ", e);
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return RequestUrlUtil.m52180f().f56641a + "?" + str;
    }

    public boolean can(int i) {
        if (isRequesting() || !canRequestWxScheme(i)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i2 = this.lastRequestType;
        if ((i2 != 0 || i != 1) && (i2 != 1 || i != 1 || !this.isUserClick)) {
            return false;
        }
        return true;
    }

    public boolean canRequestWxScheme(int i) {
        if (!isSupportWxScheme()) {
            return false;
        }
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return true;
        }
        return isCanRequestByTemplateUrl("2");
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        boolean z;
        if (!this.isSupportWxScheme) {
            if (isCanRequestByClickUrl("1") && isCanRequestByLinkType()) {
                z = true;
            } else {
                z = false;
            }
            this.isSupportWxScheme = z;
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx != null && !TextUtils.isEmpty(this.unitID)) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b(TAG, "start request wx scheme");
            }
            this.isRequesting = true;
            if (iAppletSchemeCallBack != null) {
                this.appletSchemeCallBack = iAppletSchemeCallBack;
            }
            handlerSchemeRequestStart();
            AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(MBSDKContext.m52746m().m52792c());
            if (this.params == null) {
                this.params = getAppletsParamsAndBuildRequest(this.campaignEx);
            }
            if (this.params == null) {
                return;
            }
            if (isRequestTimesMaxPerDay()) {
                handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
                return;
            }
            this.lastRequestType = i;
            appletSchemeRequest.get(1, RequestUrlUtil.m52180f().f56641a, this.params, new DefaultAppletSchemeResponse(this), "applets_model", 60000L);
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z) {
        this.isUserClick = z;
    }
}
