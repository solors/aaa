package com.mbridge.msdk.video.p511bt.p512a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C19909fc;
import com.mbridge.msdk.click.CommonClickControl;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.Frequence;
import com.mbridge.msdk.foundation.entity.VideoBean;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.p434db.FrequenceDao;
import com.mbridge.msdk.foundation.p434db.VideoDao;
import com.mbridge.msdk.foundation.same.p436a.StaticDataPoll;
import com.mbridge.msdk.foundation.tools.JsonUtils;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameSDKTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.foundation.tools.ViewUtil;
import com.mbridge.msdk.mbsignalcommon.windvane.CallMethodContext;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.p511bt.module.BTBaseView;
import com.mbridge.msdk.video.p511bt.module.MBTempContainer;
import com.mbridge.msdk.video.p511bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.p511bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.p511bt.module.MBridgeBTNativeEC;
import com.mbridge.msdk.video.p511bt.module.MBridgeBTVideoView;
import com.mbridge.msdk.video.p511bt.module.MBridgeBTWebView;
import com.mbridge.msdk.video.p511bt.p512a.H5MediaPlayerManager;
import com.mbridge.msdk.video.signal.p534a.JSCommon;
import com.mbridge.msdk.videocommon.p536b.Reward;
import com.mbridge.msdk.videocommon.p538d.RewardUnitSetting;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.a.a */
/* loaded from: classes6.dex */
public class BaseOperateViews {

    /* renamed from: a */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f59939a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static LinkedHashMap<String, String> f59940b = new LinkedHashMap<>();

    /* renamed from: c */
    private static LinkedHashMap<String, CampaignEx> f59941c = new LinkedHashMap<>();

    /* renamed from: d */
    private static LinkedHashMap<String, RewardUnitSetting> f59942d = new LinkedHashMap<>();

    /* renamed from: e */
    private static LinkedHashMap<String, String> f59943e = new LinkedHashMap<>();

    /* renamed from: f */
    private static LinkedHashMap<String, Integer> f59944f = new LinkedHashMap<>();

    /* renamed from: g */
    private static LinkedHashMap<String, Activity> f59945g = new LinkedHashMap<>();

    /* renamed from: h */
    private static volatile int f59946h = 10000;

    /* renamed from: i */
    private static int f59947i = 0;

    /* renamed from: j */
    private static int f59948j = 1;

    /* renamed from: k */
    private static String f59949k = "";

    /* renamed from: l */
    private static int f59950l;

    /* renamed from: m */
    private static int f59951m;

    /* renamed from: n */
    private static int f59952n;

    /* renamed from: o */
    private static int f59953o;

    /* renamed from: p */
    private static int f59954p;

    /* renamed from: h */
    private String m49237h(String str) {
        return f59940b.containsKey(str) ? f59940b.get(str) : "";
    }

    /* renamed from: A */
    public final void m49284A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).stop();
                    m49263a(obj, optString2);
                    SameLogTool.m51827a("OperateViews", "playerStop success");
                    return;
                }
                m49249c(obj, "instanceId is not player");
                SameLogTool.m51827a("OperateViews", "playerStop failed instanceId is not player instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exit");
            SameLogTool.m51827a("OperateViews", "playerStop failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "playerStop failed: " + th.getMessage());
        }
    }

    /* renamed from: B */
    public final void m49283B(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
            }
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
        }
    }

    /* renamed from: C */
    public final void m49282C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    if (((MBridgeBTVideoView) view).playMute()) {
                        m49263a(obj, optString2);
                        SameLogTool.m51827a("OperateViews", "playerMute success");
                        return;
                    }
                    m49249c(obj, "set mute failed");
                    SameLogTool.m51827a("OperateViews", "playerMute failed set mute failed");
                    return;
                }
                m49249c(obj, "instanceId is not player");
                SameLogTool.m51827a("OperateViews", "playerMute failed: instanceId is not player");
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "playerMute failed: instanceId is not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "playerMute failed: " + th.getMessage());
        }
    }

    /* renamed from: D */
    public final void m49281D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    if (((MBridgeBTVideoView) view).playUnMute()) {
                        m49263a(obj, optString2);
                        m49262a(obj, "onUnmute", optString2);
                        SameLogTool.m51827a("OperateViews", "playerUnmute successed");
                        return;
                    }
                    m49263a(obj, "set unmute failed");
                    SameLogTool.m51827a("OperateViews", "playerUnmute failed: set unmute failed");
                    return;
                }
                m49249c(obj, "instanceId is not player");
                SameLogTool.m51827a("OperateViews", "playerUnmute failed: instanceId is not player");
                return;
            }
            m49249c(obj, "instanceId not exit");
            SameLogTool.m51827a("OperateViews", "playerUnmute failed: instanceId not exit");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "playerUnmute failed: " + th.getMessage());
        }
    }

    /* renamed from: E */
    public final void m49280E(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    int mute = ((MBridgeBTVideoView) view).getMute();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C26559a.f69635d, f59947i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", optString2);
                    jSONObject3.put("mute", mute);
                    jSONObject2.put("data", jSONObject3);
                    WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    SameLogTool.m51827a("OperateViews", "playerGetMuteState successed mute = " + mute);
                    return;
                }
                m49249c(obj, "instanceId is not player");
                SameLogTool.m51827a("OperateViews", "playerGetMuteState failed instanceId is not player");
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "playerGetMuteState failed instanceId not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "playerGetMuteState failed: " + th.getMessage());
        }
    }

    /* renamed from: F */
    public final void m49279F(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
            }
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
        }
    }

    /* renamed from: G */
    public final void m49278G(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
            } else {
                m49249c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
        }
    }

    /* renamed from: H */
    public final void m49277H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).preload();
                    m49263a(obj, optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                return;
            }
            m49249c(obj, "instanceId not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "preloadSubPlayTemplateView failed: " + th.getMessage());
        }
    }

    /* renamed from: I */
    public final void m49276I(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        H5MediaPlayerManager unused;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.size() > 0) {
                MBridgeBTContainer mBridgeBTContainer = null;
                for (View view : m49250b.values()) {
                    if (view instanceof MBridgeBTContainer) {
                        mBridgeBTContainer = (MBridgeBTContainer) view;
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    } else if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).getInstanceId();
                        unused = H5MediaPlayerManager.C22960a.f59972a;
                        ((MBridgeBTVideoView) view).onDestory();
                    } else if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                }
                if (mBridgeBTContainer != null) {
                    mBridgeBTContainer.onAdClose();
                    f59939a.remove(m49250b);
                    m49250b.clear();
                    ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap = f59939a;
                    concurrentHashMap.remove(optString + "_" + m49237h);
                    m49263a(obj, optString2);
                    return;
                }
                m49249c(obj, "not found MBridgeBTContainer");
                SameLogTool.m51827a("OperateViews", "closeAd successed");
                return;
            }
            m49249c(obj, "unitId or instanceId not exist");
            SameLogTool.m51827a("OperateViews", "closeAd failed: unitId or instanceId not exist unitId = " + optString);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "closeAd failed: " + th.getMessage());
        }
    }

    /* renamed from: J */
    public final void m49275J(Object obj, JSONObject jSONObject) {
        String str;
        try {
            WindVaneWebView windVaneWebView = ((CallMethodContext) obj).f57740b;
            if (windVaneWebView == null) {
                str = "";
            } else {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> m49250b = m49250b(optString, str);
            if (m49250b != null && m49250b.size() > 0) {
                for (View view : m49250b.values()) {
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).broadcast(optString2, optJSONObject);
                    }
                    if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).broadcast(optString2, optJSONObject);
                    }
                }
                m49263a(obj, "");
                return;
            }
            m49249c(obj, "unitId not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "broadcast failed: " + th.getMessage());
        }
    }

    /* renamed from: K */
    public final void m49274K(Object obj, JSONObject jSONObject) {
        String str;
        Reward reward;
        String str2;
        try {
            WindVaneWebView windVaneWebView = ((CallMethodContext) obj).f57740b;
            if (windVaneWebView == null) {
                str = "";
            } else {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString("userId");
            boolean optBoolean = optJSONObject.optBoolean("expired");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(Reporting.EventType.REWARD);
            String optString4 = optJSONObject.optString("extra");
            if (optJSONObject2 != null) {
                reward = new Reward(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                str2 = optJSONObject2.optString("id");
            } else {
                reward = null;
                str2 = "";
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, str);
            if (m49250b.size() > 0 && f59943e.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBTempContainer) {
                    MBTempContainer mBTempContainer = (MBTempContainer) view;
                    mBTempContainer.setReward(reward);
                    mBTempContainer.setUserId(optString3);
                    mBTempContainer.setRewardId(str2);
                    mBTempContainer.setCampaignExpired(optBoolean);
                    if (!TextUtils.isEmpty(optString4)) {
                        mBTempContainer.setDeveloperExtraData(optString4);
                    }
                    m49263a(obj, optString2);
                    SameLogTool.m51827a("OperateViews", "setSubPlayTemplateInfo success instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "instanceId not exist");
                SameLogTool.m51827a("OperateViews", "setSubPlayTemplateInfo failed: instanceId not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "unitId not exist");
            SameLogTool.m51827a("OperateViews", "setSubPlayTemplateInfo failed: unitId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "setSubPlayTemplateInfo failed: " + th.getMessage());
        }
    }

    /* renamed from: L */
    public final void m49273L(Object obj, JSONObject jSONObject) {
        try {
            String str = "";
            WindVaneWebView windVaneWebView = ((CallMethodContext) obj).f57740b;
            if (windVaneWebView != null) {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString("eventName");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("eventData");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, str);
            if (m49250b.size() > 0) {
                View view = m49250b.get(optString2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof WindVaneWebView) {
                            WindVaneCallJs.m51063a().m51061a((WebView) ((WindVaneWebView) childAt), optString3, Base64.encodeToString(optJSONObject2.toString().getBytes(), 2));
                            m49263a(obj, optString2);
                            SameLogTool.m51827a("OperateViews", "webviewFireEvent instanceId = " + optString2);
                            return;
                        }
                    }
                }
                m49249c(obj, "instanceId not exist");
                SameLogTool.m51827a("OperateViews", "webviewFireEvent failed: instanceId not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "unitId not exist");
            SameLogTool.m51827a("OperateViews", "webviewFireEvent failed: unitId not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "webviewFireEvent failed: " + th.getMessage());
        }
    }

    /* renamed from: M */
    public final void m49272M(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                m49249c(obj, "data camapign is empty");
                return;
            }
            new Thread(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.3
                {
                    BaseOperateViews.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        FrequenceDao m52576a = FrequenceDao.m52576a(CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()));
                        if (m52576a != null) {
                            if (!m52576a.m52572b(parseCampaignWithBackData.getId())) {
                                Frequence frequence = new Frequence();
                                frequence.m52462a(parseCampaignWithBackData.getId());
                                frequence.m52460b(parseCampaignWithBackData.getFca());
                                frequence.m52458c(parseCampaignWithBackData.getFcb());
                                frequence.m52464a(0);
                                frequence.m52456d(1);
                                frequence.m52463a(System.currentTimeMillis());
                                m52576a.m52575a(frequence);
                            } else {
                                m52576a.m52574a(parseCampaignWithBackData.getId());
                            }
                        }
                        BaseOperateViews.m49264a(BaseOperateViews.this, parseCampaignWithBackData.getCampaignUnitId(), parseCampaignWithBackData);
                    } catch (Throwable th) {
                        SameLogTool.m51823b("OperateViews", th.getMessage(), th);
                    }
                }
            }).start();
            m49263a(obj, "");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [org.json.JSONObject, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    /* renamed from: N */
    public final void m49271N(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        boolean z;
        String m51783a;
        String str6;
        String h5ResAddress;
        ?? jSONObject2 = new JSONObject();
        String str7 = "message";
        String str8 = C26559a.f69635d;
        int i2 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put(C26559a.f69635d, 1);
                jSONObject2.put("message", "params is null");
                WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                SameLogTool.m51827a("OperateViews", e.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put(C26559a.f69635d, 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray == null || jSONArray.length() <= 0) {
                str3 = "message";
                str2 = C26559a.f69635d;
                str = 1;
                try {
                    try {
                        jSONObject2.put(str2, 1);
                        str4 = str3;
                        try {
                            jSONObject2.put(str4, "resource is null");
                            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            str = str4;
                        } catch (JSONException e2) {
                            e = e2;
                            SameLogTool.m51827a("OperateViews", e.getMessage());
                            str = str4;
                            return;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        str4 = str3;
                    } catch (Throwable th) {
                        th = th;
                        str = str3;
                        try {
                            jSONObject2.put(str2, 1);
                            jSONObject2.put(str, th.getLocalizedMessage());
                            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            return;
                        } catch (JSONException e4) {
                            SameLogTool.m51827a("OperateViews", e4.getMessage());
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    jSONObject2.put(str2, 1);
                    jSONObject2.put(str, th.getLocalizedMessage());
                    WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                }
            }
            ?? jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                String optString = jSONObject3.optString("ref", "");
                int i4 = jSONObject3.getInt("type");
                ?? jSONObject4 = new JSONObject();
                JSONArray jSONArray3 = jSONArray;
                if (i4 == i2 && !TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject5 = new JSONObject();
                    VideoBean m52553a = VideoDao.m52555a(CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c())).m52553a(optString);
                    if (m52553a != null) {
                        i = length;
                        SameLogTool.m51827a("OperateViews", "VideoBean not null");
                        jSONObject5.put("type", 1);
                        str3 = str7;
                        try {
                            jSONObject5.put("videoDataLength", m52553a.m52370d());
                            String m52369e = m52553a.m52369e();
                            str5 = str8;
                            if (TextUtils.isEmpty(m52369e)) {
                                try {
                                    SameLogTool.m51827a("OperateViews", "VideoPath null");
                                    jSONObject5.put("path", "");
                                    jSONObject5.put("path4Web", "");
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = str3;
                                    str2 = str5;
                                    jSONObject2.put(str2, 1);
                                    jSONObject2.put(str, th.getLocalizedMessage());
                                    WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                    return;
                                }
                            } else {
                                SameLogTool.m51827a("OperateViews", "VideoPath not null");
                                jSONObject5.put("path", m52369e);
                                jSONObject5.put("path4Web", m52369e);
                            }
                            if (m52553a.m52375b() == 5) {
                                jSONObject5.put("downloaded", 1);
                                z = false;
                            } else {
                                z = false;
                                jSONObject5.put("downloaded", 0);
                            }
                            jSONObject4.put(optString, jSONObject5);
                            jSONArray2.put(jSONObject4);
                        } catch (Throwable th4) {
                            th = th4;
                            str2 = str8;
                            str = str3;
                            jSONObject2.put(str2, 1);
                            jSONObject2.put(str, th.getLocalizedMessage());
                            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            return;
                        }
                    } else {
                        str3 = str7;
                        str5 = str8;
                        i = length;
                        z = false;
                        SameLogTool.m51827a("OperateViews", "VideoBean null");
                    }
                } else {
                    str3 = str7;
                    str5 = str8;
                    i = length;
                    z = false;
                    if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("type", 2);
                        if (H5DownLoadManager.getInstance().getH5ResAddress(optString) == null) {
                            h5ResAddress = "";
                        } else {
                            h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(optString);
                        }
                        jSONObject6.put("path", h5ResAddress);
                        jSONObject4.put(optString, jSONObject6);
                        jSONArray2.put(jSONObject4);
                    } else if (i4 == 3 && !TextUtils.isEmpty(optString)) {
                        File file = new File(optString);
                        if (!file.exists() || !file.isFile() || !file.canRead()) {
                            str6 = "";
                        } else {
                            SameLogTool.m51827a("OperateViews", "getFileInfo Mraid file " + optString);
                            str6 = "file:////" + optString;
                        }
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", 3);
                        jSONObject7.put("path", str6);
                        jSONObject4.put(optString, jSONObject7);
                        jSONArray2.put(jSONObject4);
                    } else if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("type", 4);
                        if (SameSDKTool.m51783a(optString) == null) {
                            m51783a = "";
                        } else {
                            m51783a = SameSDKTool.m51783a(optString);
                        }
                        jSONObject8.put("path", m51783a);
                        jSONObject4.put(optString, jSONObject8);
                        jSONArray2.put(jSONObject4);
                    }
                }
                i3++;
                jSONArray = jSONArray3;
                length = i;
                str7 = str3;
                str8 = str5;
                i2 = 1;
            }
            str3 = str7;
            str5 = str8;
            jSONObject2.put("resource", jSONArray2);
            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th5) {
            th = th5;
            str = str7;
            str2 = str8;
        }
    }

    /* renamed from: O */
    public final void m49270O(Object obj, JSONObject jSONObject) {
        SameLogTool.m51827a("OperateViews", "createNativeEC:" + jSONObject);
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str = parseCampaignWithBackData.getRequestId();
                }
                RewardUnitSetting m48306a = RewardUnitSetting.m48306a(optJSONObject.optJSONObject("unitSetting"));
                if (m48306a != null) {
                    m48306a.m48309a(optString);
                }
                MBridgeBTNativeEC mBridgeBTNativeEC = new MBridgeBTNativeEC(MBSDKContext.m52746m().m52792c());
                mBridgeBTNativeEC.setCampaign(parseCampaignWithBackData);
                JSCommon jSCommon = new JSCommon(null, parseCampaignWithBackData);
                jSCommon.mo48611a(optString);
                mBridgeBTNativeEC.setJSCommon(jSCommon);
                mBridgeBTNativeEC.setUnitId(optString);
                mBridgeBTNativeEC.setRewardUnitSetting(m48306a);
                WindVaneWebView windVaneWebView = ((CallMethodContext) obj).f57740b;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    mBridgeBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> m49250b = m49250b(optString, str);
                String m49269a = m49269a();
                f59940b.put(m49269a, str);
                mBridgeBTNativeEC.setInstanceId(m49269a);
                m49250b.put(m49269a, mBridgeBTNativeEC);
                mBridgeBTNativeEC.preLoadData();
                if (parseCampaignWithBackData == null) {
                    m49249c(obj, "campaign is null");
                    SameLogTool.m51827a("OperateViews", "createNativeEC failed");
                    return;
                }
                m49263a(obj, m49269a);
                SameLogTool.m51827a("OperateViews", "createNativeEC instanceId = " + m49269a);
                return;
            }
            m49249c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "createNativeEC failed：" + th.getMessage());
        }
    }

    /* renamed from: a */
    public final String m49269a() {
        f59946h++;
        return String.valueOf(f59946h);
    }

    /* renamed from: c */
    public final String m49247c(String str) {
        return f59943e.containsKey(str) ? f59943e.get(str) : "";
    }

    /* renamed from: d */
    public final void m49245d(String str) {
        f59945g.remove(str);
    }

    /* renamed from: e */
    public final int m49243e(String str) {
        if (f59944f.containsKey(str)) {
            return f59944f.get(str).intValue();
        }
        return 2;
    }

    /* renamed from: f */
    public final void m49241f(String str) {
        if (f59943e.containsKey(str)) {
            f59943e.remove(str);
        }
        if (f59942d.containsKey(str)) {
            f59942d.remove(str);
        }
        if (f59941c.containsKey(str)) {
            f59941c.remove(str);
        }
        if (f59940b.containsKey(str)) {
            f59940b.remove(str);
        }
    }

    /* renamed from: g */
    public final void m49239g(String str) {
        if (f59944f.containsKey(str)) {
            f59944f.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d6, code lost:
        com.mbridge.msdk.foundation.tools.ViewUtil.m51671a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d9, code lost:
        r2 = (com.mbridge.msdk.video.p511bt.module.MBTempContainer) r5;
        r6 = (com.mbridge.msdk.video.signal.p534a.JSCommon) ((com.mbridge.msdk.mbsignalcommon.windvane.CallMethodContext) r13).f57740b.getObject();
        r2.setAdEvents(r6.m48597l());
        r2.setAdSession(r6.m48599j());
        r2.setVideoEvents(r6.m48598k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fd, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00fe, code lost:
        com.mbridge.msdk.foundation.tools.SameLogTool.m51824b("OperateViews", r2.getMessage());
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m49236i(java.lang.Object r13, org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p511bt.p512a.BaseOperateViews.m49236i(java.lang.Object, org.json.JSONObject):void");
    }

    /* renamed from: j */
    public final void m49235j(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
                if (m49250b.containsKey(optString2) && m49250b.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) m49250b.get(optString3);
                    View view = m49250b.get(optString2);
                    ViewUtil.m51671a(view);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            Iterator<View> it = m49250b.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof MBridgeBTContainer) {
                                    ViewUtil.m51671a(view);
                                    ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    optInt = ((BTBaseView) view).getViewWidth();
                                    optInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                    rect = null;
                                    optInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                                optInt = optJSONObject2.optInt("width");
                                optInt2 = optJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            ViewGroup.LayoutParams m49267a = m49267a(layoutParams, rect, optInt, optInt2);
                            ViewUtil.m51671a(view);
                            viewGroup.addView(view, m49267a);
                        }
                        m49263a(obj, optString2);
                        m49262a(obj, "onAppendViewTo", optString2);
                        SameLogTool.m51827a("OperateViews", "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    m49249c(obj, "view is not exist");
                    return;
                }
                m49249c(obj, "instanceId is not exist");
                SameLogTool.m51827a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            m49249c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    /* renamed from: k */
    public final void m49234k(Object obj, JSONObject jSONObject) {
        int optInt;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString3) && m49250b.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) m49250b.get(optString2);
                View view = m49250b.get(optString3);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    int i = 0;
                    if (view instanceof MBTempContainer) {
                        SameLogTool.m51824b("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f59950l), Integer.valueOf(f59951m), Integer.valueOf(f59952n), Integer.valueOf(f59953o), Integer.valueOf(f59954p)));
                        ((MBTempContainer) view).setNotchPadding(f59950l, f59951m, f59952n, f59953o, f59954p);
                        Iterator<View> it = m49250b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTContainer) {
                                ViewUtil.m51671a(view);
                                ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                i = ((BTBaseView) view).getViewWidth();
                                optInt = ((BTBaseView) view).getViewHeight();
                            } else {
                                rect = null;
                                optInt = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                            i = optJSONObject2.optInt("width");
                            optInt = optJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, m49267a(layoutParams, rect, i, optInt));
                    }
                    m49263a(obj, optString2);
                    m49262a(obj, "onAppendView", optString2);
                    SameLogTool.m51827a("OperateViews", "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
                m49249c(obj, "view is not exist");
                return;
            }
            m49249c(obj, "instanceId is not exist");
            SameLogTool.m51827a("OperateViews", "appendSubView failed: instanceId is not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "appendSubView failed: " + th.getMessage());
        }
    }

    /* renamed from: l */
    public final void m49233l(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
                if (m49250b.containsKey(optString2) && m49250b.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) m49250b.get(optString3);
                    View view = m49250b.get(optString2);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            Iterator<View> it = m49250b.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof MBridgeBTContainer) {
                                    ViewUtil.m51671a(view);
                                    ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    optInt = ((BTBaseView) view).getViewWidth();
                                    optInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                    rect = null;
                                    optInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                                optInt = optJSONObject2.optInt("width");
                                optInt2 = optJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            viewGroup.addView(view, m49267a(layoutParams, rect, optInt, optInt2));
                        }
                        m49263a(obj, optString2);
                        m49262a(obj, "onAppendViewTo", optString2);
                        SameLogTool.m51827a("OperateViews", "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    m49249c(obj, "view is not exist");
                    return;
                }
                m49249c(obj, "instanceId is not exist");
                SameLogTool.m51827a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            m49249c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    /* renamed from: m */
    public final void m49232m(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                        m49263a(obj, optString2);
                        m49262a(obj, "onBringViewToFront", optString2);
                        SameLogTool.m51827a("OperateViews", "bringViewToFront instanceId = " + optString2);
                        return;
                    }
                    m49249c(obj, "parent is null");
                    SameLogTool.m51827a("OperateViews", "bringViewToFront failed: parent is null");
                    return;
                }
                m49249c(obj, "view is null");
                SameLogTool.m51827a("OperateViews", "bringViewToFront failed: view is null");
                return;
            }
            m49249c(obj, "instanceId is not exist");
            SameLogTool.m51827a("OperateViews", "bringViewToFront failed: instanceId is not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "bringViewToFront failed: " + th.getMessage());
        }
    }

    /* renamed from: n */
    public final void m49231n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view != null) {
                    view.setVisibility(8);
                    m49263a(obj, optString2);
                    m49262a(obj, "onHideView", optString2);
                    SameLogTool.m51827a("OperateViews", "hideView instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "hideView failed: view not exist");
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "hideView failed: instanceId not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "hideView failed: + " + th.getMessage());
        }
    }

    /* renamed from: o */
    public final void m49230o(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view != null) {
                    view.setVisibility(0);
                    m49263a(obj, optString2);
                    m49262a(obj, "onShowView", optString2);
                    SameLogTool.m51827a("OperateViews", "showView instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "showView failed: view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "showView failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "showView failed: " + th.getMessage());
        }
    }

    /* renamed from: p */
    public final void m49229p(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("color");
            if (TextUtils.isEmpty(optString3)) {
                m49249c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view != null) {
                    m49263a(obj, optString2);
                    view.setBackgroundColor(Color.parseColor(optString3));
                    m49262a(obj, "onViewBgColorChanged", optString2);
                    SameLogTool.m51827a("OperateViews", "setViewBgColor instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "setViewBgColor failed: view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "setViewBgColor failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "setViewBgColor failed: " + th.getMessage());
        }
    }

    /* renamed from: q */
    public final void m49228q(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view != null) {
                    view.setAlpha((float) optDouble);
                    m49263a(obj, optString2);
                    m49262a(obj, "onViewAlphaChanged", optString2);
                    SameLogTool.m51827a("OperateViews", "setViewAlpha instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "setViewAlpha failed: view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "setViewAlpha failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "setViewAlpha failed: " + th.getMessage());
        }
    }

    /* renamed from: r */
    public final void m49227r(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("vertical", 1.0d);
            double optDouble2 = optJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view != null) {
                    view.setScaleX((float) optDouble2);
                    view.setScaleY((float) optDouble);
                    m49263a(obj, optString2);
                    m49262a(obj, "onViewScaleChanged", optString2);
                    SameLogTool.m51827a("OperateViews", "setViewScale instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "setViewScale failed: view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "setViewScale failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "setViewScale failed: " + th.getMessage());
        }
    }

    /* renamed from: s */
    public final void m49226s(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2) && m49250b.containsKey(optString3)) {
                View view = m49250b.get(optString2);
                View view2 = m49250b.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, indexOfChild + 1, m49267a(layoutParams, rect, optInt, optInt2));
                    m49263a(obj, optString2);
                    m49262a(obj, "onInsertViewAbove", optString2);
                    SameLogTool.m51827a("OperateViews", "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "insertViewAbove failed: " + th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* renamed from: t */
    public final void m49225t(Object obj, JSONObject jSONObject) {
        String str;
        int optInt;
        WindVaneWebView windVaneWebView;
        int i = obj;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) i).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(i, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("content");
            if (optJSONObject2 == null) {
                m49249c(i, "content is empty");
                return;
            }
            String optString3 = optJSONObject2.optString("fileURL");
            String optString4 = optJSONObject2.optString(C19909fc.C19912c.f50076c);
            String optString5 = optJSONObject2.optString("html");
            if (TextUtils.isEmpty(optString3) && TextUtils.isEmpty(optString4) && TextUtils.isEmpty(optString5)) {
                m49249c(i, "url is empty");
                return;
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("campaigns");
            List<CampaignEx> arrayList = new ArrayList<>();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONArray jSONArray = optJSONArray;
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONArray.getJSONObject(i2));
                    if (parseCampaignWithBackData != null) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                        arrayList.add(parseCampaignWithBackData);
                    }
                    i2++;
                    optJSONArray = jSONArray;
                }
            }
            String optString6 = optJSONObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            RewardUnitSetting m48306a = RewardUnitSetting.m48306a(optJSONObject2.optJSONObject("unitSetting"));
            if (m48306a != null) {
                m48306a.m48309a(optString6);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect = new Rect(-999, -999, -999, -999);
            if (optJSONObject3 != null) {
                try {
                    str = "OperateViews";
                } catch (Throwable th) {
                    th = th;
                    i = obj;
                    rect = "OperateViews";
                    m49249c(i, th.getMessage());
                    SameLogTool.m51827a(rect, "webviewLoad failed: " + th.getMessage());
                }
                try {
                    Rect rect2 = new Rect(optJSONObject3.optInt("left", -999), optJSONObject3.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject3.optInt("right", -999), optJSONObject3.optInt("bottom", -999));
                    int optInt2 = optJSONObject3.optInt("width");
                    optInt = optJSONObject3.optInt("height");
                    rect = rect2;
                    i = optInt2;
                } catch (Throwable th2) {
                    th = th2;
                    i = obj;
                    rect = str;
                    m49249c(i, th.getMessage());
                    SameLogTool.m51827a(rect, "webviewLoad failed: " + th.getMessage());
                }
            } else {
                str = "OperateViews";
                optInt = 0;
                i = 0;
            }
            int optInt3 = optJSONObject2.optInt("refreshCache", 0);
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            try {
                if (m49250b.containsKey(optString2)) {
                    View view = m49250b.get(optString2);
                    if (view instanceof MBridgeBTWebView) {
                        MBridgeBTWebView mBridgeBTWebView = (MBridgeBTWebView) view;
                        mBridgeBTWebView.setHtml(optString5);
                        mBridgeBTWebView.setFilePath(optString4);
                        mBridgeBTWebView.setFileURL(optString3);
                        mBridgeBTWebView.setRect(rect);
                        mBridgeBTWebView.setLayout(i, optInt);
                        mBridgeBTWebView.setCampaigns(arrayList);
                        mBridgeBTWebView.setRewardUnitSetting(m48306a);
                        mBridgeBTWebView.webviewLoad(optInt3);
                        Object obj2 = obj;
                        try {
                            m49263a(obj2, optString2);
                            String str2 = str;
                            SameLogTool.m51827a(str2, "webviewLoad instanceId = " + optString2);
                            i = obj2;
                            rect = str2;
                        } catch (Throwable th3) {
                            th = th3;
                            i = obj2;
                            rect = str;
                            m49249c(i, th.getMessage());
                            SameLogTool.m51827a(rect, "webviewLoad failed: " + th.getMessage());
                        }
                    } else {
                        Object obj3 = obj;
                        String str3 = str;
                        m49249c(obj3, "view not exist");
                        SameLogTool.m51827a(str3, "webviewLoad failed: view not exist instanceId = " + optString2);
                        i = obj3;
                        rect = str3;
                    }
                } else {
                    Object obj4 = obj;
                    String str4 = str;
                    m49249c(obj4, "instanceId not exist");
                    SameLogTool.m51827a(str4, "webviewLoad failed: instanceId not exist instanceId = " + optString2);
                    i = obj4;
                    rect = str4;
                }
            } catch (Throwable th4) {
                th = th4;
                m49249c(i, th.getMessage());
                SameLogTool.m51827a(rect, "webviewLoad failed: " + th.getMessage());
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: u */
    public final void m49224u(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewReload()) {
                        m49263a(obj, optString2);
                        SameLogTool.m51827a("OperateViews", "webviewReload instanceId = " + optString2);
                        return;
                    }
                    m49249c(obj, "reload failed");
                    SameLogTool.m51827a("OperateViews", "webviewReload failed reload failed instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "webviewReload failed view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "webviewReload failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "webviewReload failed: " + th.getMessage());
        }
    }

    /* renamed from: v */
    public final void m49223v(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewGoBack()) {
                        m49263a(obj, optString2);
                        SameLogTool.m51827a("OperateViews", "webviewGoBack instanceId = " + optString2);
                        return;
                    }
                    m49249c(obj, "webviewGoBack failed");
                    SameLogTool.m51827a("OperateViews", "webviewGoBack failed instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "webviewGoBack failed view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "webviewGoBack failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "webviewGoBack failed: " + th.getMessage());
        }
    }

    /* renamed from: w */
    public final void m49222w(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewGoForward()) {
                        m49263a(obj, optString2);
                        SameLogTool.m51827a("OperateViews", "webviewGoForward instanceId = " + optString2);
                        return;
                    }
                    m49249c(obj, "webviewGoForward failed");
                    SameLogTool.m51827a("OperateViews", "webviewGoForward failed instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "webviewGoForward failed view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "webviewGoForward failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "webviewGoForward failed: " + th.getMessage());
        }
    }

    /* renamed from: x */
    public final void m49221x(Object obj, JSONObject jSONObject) {
        MBridgeBTContainer mBridgeBTContainer;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    MBridgeBTVideoView mBridgeBTVideoView = (MBridgeBTVideoView) view;
                    LinkedHashMap<String, View> m49250b2 = m49250b(optString, m49237h);
                    if (m49250b2.size() > 0) {
                        for (View view2 : m49250b2.values()) {
                            if (view2 instanceof MBridgeBTContainer) {
                                mBridgeBTContainer = (MBridgeBTContainer) view2;
                                break;
                            }
                        }
                    }
                    mBridgeBTContainer = null;
                    if (mBridgeBTContainer != null) {
                        mBridgeBTVideoView.setAdEvents(mBridgeBTContainer.getAdEvents());
                        mBridgeBTVideoView.setAdSession(mBridgeBTContainer.getAdSession());
                        mBridgeBTVideoView.setVideoEvents(mBridgeBTContainer.getVideoEvents());
                    }
                    mBridgeBTVideoView.play();
                    m49263a(obj, optString2);
                    SameLogTool.m51827a("OperateViews", "playerPlay success");
                    return;
                }
                m49249c(obj, "instanceId is not player");
                SameLogTool.m51827a("OperateViews", "playerPlay failed instanceId is not player instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exit");
            SameLogTool.m51827a("OperateViews", "playerPlay failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "playerPlay failed: " + th.getMessage());
        }
    }

    /* renamed from: y */
    public final void m49220y(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).pause();
                    m49263a(obj, optString2);
                    SameLogTool.m51827a("OperateViews", "playerPause success");
                    return;
                }
                m49249c(obj, "instanceId is not player");
                SameLogTool.m51827a("OperateViews", "playerPause failed instanceId is not player instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exit");
            SameLogTool.m51827a("OperateViews", "playerPause failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "playerPause failed: " + th.getMessage());
        }
    }

    /* renamed from: z */
    public final void m49219z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).resume();
                    m49263a(obj, optString2);
                    SameLogTool.m51827a("OperateViews", "playerResume success");
                    return;
                }
                m49249c(obj, "instanceId is not player");
                SameLogTool.m51827a("OperateViews", "playerResume failed instanceId is not player instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exit");
            SameLogTool.m51827a("OperateViews", "playerResume failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "playerResume failed: " + th.getMessage());
        }
    }

    /* renamed from: b */
    public final RewardUnitSetting m49251b(String str) {
        if (f59942d.containsKey(str)) {
            return f59942d.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final void m49246d(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                int optInt = optJSONObject.optInt("mute");
                String str = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str = parseCampaignWithBackData.getRequestId();
                }
                RewardUnitSetting m48306a = RewardUnitSetting.m48306a(optJSONObject.optJSONObject("unitSetting"));
                if (m48306a != null) {
                    m48306a.m48309a(optString);
                }
                String optString2 = optJSONObject.optString("userId");
                if (TextUtils.isEmpty(str) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                    str = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> m49250b = m49250b(optString, str);
                String m49269a = m49269a();
                f59940b.put(m49269a, str);
                MBTempContainer mBTempContainer = new MBTempContainer(MBSDKContext.m52746m().m52792c());
                try {
                    JSCommon jSCommon = (JSCommon) ((CallMethodContext) obj).f57740b.getObject();
                    mBTempContainer.setAdEvents(jSCommon.m48597l());
                    mBTempContainer.setAdSession(jSCommon.m48599j());
                    mBTempContainer.setVideoEvents(jSCommon.m48598k());
                } catch (Exception e) {
                    SameLogTool.m51824b("OperateViews", e.getMessage());
                }
                mBTempContainer.setInstanceId(m49269a);
                mBTempContainer.setUnitId(optString);
                mBTempContainer.setCampaign(parseCampaignWithBackData);
                mBTempContainer.setRewardUnitSetting(m48306a);
                mBTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(optString2)) {
                    mBTempContainer.setUserId(optString2);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(Reporting.EventType.REWARD);
                if (optJSONObject2 != null) {
                    String optString3 = optJSONObject2.optString("id");
                    Reward reward = new Reward(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                    if (!TextUtils.isEmpty(optString3)) {
                        mBTempContainer.setRewardId(optString3);
                    }
                    if (!TextUtils.isEmpty(reward.m48381a())) {
                        mBTempContainer.setReward(reward);
                    }
                }
                String optString4 = optJSONObject.optString("extra");
                if (!TextUtils.isEmpty(optString4)) {
                    mBTempContainer.setDeveloperExtraData(optString4);
                }
                mBTempContainer.setMute(optInt);
                m49250b.put(m49269a, mBTempContainer);
                f59943e.put(m49269a, optString);
                f59941c.put(m49269a, parseCampaignWithBackData);
                f59942d.put(m49269a, m48306a);
                m49263a(obj, m49269a);
                SameLogTool.m51827a("OperateViews", "createSubPlayTemplateView instanceId = " + m49269a);
                return;
            }
            m49249c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "createSubPlayTemplateView failed：" + th.getMessage());
        }
    }

    /* renamed from: c */
    private void m49249c(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, f59948j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            SameLogTool.m51827a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: a */
    public final CampaignEx m49259a(String str) {
        if (f59941c.containsKey(str)) {
            return f59941c.get(str);
        }
        return null;
    }

    /* renamed from: e */
    public final void m49244e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(optString)) {
                String m49237h = m49237h(optString2);
                if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                    m49237h = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
                if (m49250b != null && m49250b.containsKey(optString2)) {
                    View view = m49250b.get(optString2);
                    m49250b.remove(optString2);
                    if (view != null && view.getParent() != null) {
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() > 0) {
                                int childCount = viewGroup2.getChildCount();
                                for (int i = 0; i < childCount; i++) {
                                    View childAt = viewGroup2.getChildAt(i);
                                    if (childAt instanceof MBridgeBTWebView) {
                                        m49250b.remove(((MBridgeBTWebView) childAt).getInstanceId());
                                        ((MBridgeBTWebView) childAt).onDestory();
                                    } else if (childAt instanceof MBridgeBTVideoView) {
                                        m49250b.remove(((MBridgeBTVideoView) childAt).getInstanceId());
                                        ((MBridgeBTVideoView) childAt).onDestory();
                                    } else if (childAt instanceof MBTempContainer) {
                                        m49250b.remove(((MBTempContainer) childAt).getInstanceId());
                                        ((MBTempContainer) childAt).onDestroy();
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    }
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onDestory();
                    }
                    m49263a(obj, optString2);
                    m49262a(obj, "onComponentDestroy", optString2);
                    SameLogTool.m51827a("OperateViews", "destroyComponent instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "unitId or instanceId not exist");
                SameLogTool.m51827a("OperateViews", "destroyComponent failed");
                return;
            }
            m49249c(obj, "unidId or data is empty");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "destroyComponent failed");
        }
    }

    /* renamed from: g */
    public final void m49240g(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            if (optJSONObject2 == null) {
                m49249c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            Rect rect = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
            int optInt = optJSONObject2.optInt("width");
            int optInt2 = optJSONObject2.optInt("height");
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view != null) {
                    if (view.getParent() != null) {
                        view.setLayoutParams(m49267a(view.getLayoutParams(), rect, optInt, optInt2));
                        view.requestLayout();
                    } else {
                        if (view instanceof MBridgeBTWebView) {
                            ((MBridgeBTWebView) view).setRect(rect);
                            ((MBridgeBTWebView) view).setLayout(optInt, optInt2);
                        }
                        if (view instanceof MBridgeBTVideoView) {
                            ((MBridgeBTVideoView) view).setRect(rect);
                            ((MBridgeBTVideoView) view).setLayout(optInt, optInt2);
                        }
                    }
                    m49263a(obj, optString2);
                    m49262a(obj, "onViewRectChanged", optString2);
                    SameLogTool.m51827a("OperateViews", "setViewRect instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view is null");
                SameLogTool.m51827a("OperateViews", "setViewRect failed: view is null");
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "setViewRect failed: instanceId not exist");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "setViewRect failed: " + th.getMessage());
        }
    }

    /* renamed from: h */
    public final void m49238h(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2)) {
                View view = m49250b.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                        m49263a(obj, optString2);
                        m49262a(obj, "onRemoveFromView", optString2);
                        SameLogTool.m51827a("OperateViews", "removeFromSuperView instanceId = " + optString2);
                        return;
                    }
                    m49249c(obj, "parent is null");
                    SameLogTool.m51827a("OperateViews", "removeFromSuperView failed: parent is null instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view is null");
                SameLogTool.m51827a("OperateViews", "removeFromSuperView failed: view is null instanceId = " + optString2);
                return;
            }
            m49249c(obj, "params not enough");
            SameLogTool.m51827a("OperateViews", "removeFromSuperView failed: params not enough instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "removeFromSuperView failed: " + th.getMessage());
        }
    }

    /* renamed from: b */
    public final synchronized LinkedHashMap<String, View> m49250b(String str, String str2) {
        ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap = f59939a;
        if (concurrentHashMap.containsKey(str + "_" + str2)) {
            ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap2 = f59939a;
            return concurrentHashMap2.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap3 = f59939a;
        concurrentHashMap3.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void m49256a(String str, String str2) {
        f59940b.put(str, str2);
    }

    /* renamed from: a */
    public final void m49257a(String str, Activity activity) {
        f59945g.put(str, activity);
    }

    /* renamed from: a */
    public final void m49258a(String str, int i) {
        f59944f.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void m49266a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, f59948j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            WindVaneCallJs.m51063a().m51060a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            SameLogTool.m51827a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void m49253b(final Object obj, JSONObject jSONObject) {
        final int i;
        final int i2;
        final Rect rect;
        try {
            final String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                m49249c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            int optInt = optJSONObject.optInt("delay", 0);
            final String optString2 = optJSONObject.optString("fileURL");
            final String optString3 = optJSONObject.optString(C19909fc.C19912c.f50076c);
            final String optString4 = optJSONObject.optString("html");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                int optInt2 = optJSONObject2.optInt("width");
                i2 = optJSONObject2.optInt("height");
                rect = rect3;
                i = optInt2;
            } else {
                i = 0;
                i2 = 0;
                rect = rect2;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.2
                {
                    BaseOperateViews.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((CallMethodContext) obj).f57740b;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> m49250b = BaseOperateViews.this.m49250b(optString, str);
                    String m49269a = BaseOperateViews.this.m49269a();
                    BaseOperateViews.f59940b.put(m49269a, str);
                    MBridgeBTWebView mBridgeBTWebView = new MBridgeBTWebView(MBSDKContext.m52746m().m52792c());
                    m49250b.put(m49269a, mBridgeBTWebView);
                    mBridgeBTWebView.setInstanceId(m49269a);
                    mBridgeBTWebView.setUnitId(optString);
                    mBridgeBTWebView.setFileURL(optString2);
                    mBridgeBTWebView.setFilePath(optString3);
                    mBridgeBTWebView.setHtml(optString4);
                    mBridgeBTWebView.setRect(rect);
                    mBridgeBTWebView.setWebViewRid(str);
                    mBridgeBTWebView.setCreateWebView(windVaneWebView);
                    int i3 = i;
                    if (i3 > 0 || i2 > 0) {
                        mBridgeBTWebView.setLayout(i3, i2);
                    }
                    mBridgeBTWebView.preload();
                    BaseOperateViews.this.m49263a(obj, m49269a);
                    SameLogTool.m51827a("OperateViews", "createWebview instanceId = " + m49269a);
                }
            }, optInt);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "createWebview failed：" + th.getMessage());
        }
    }

    /* renamed from: c */
    public final void m49248c(Object obj, JSONObject jSONObject) {
        H5MediaPlayerManager unused;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str = parseCampaignWithBackData.getRequestId();
                }
                int optInt = optJSONObject.optInt("show_time", 0);
                int optInt2 = optJSONObject.optInt("show_mute", 0);
                int optInt3 = optJSONObject.optInt("show_close", 0);
                int optInt4 = optJSONObject.optInt("orientation", 1);
                int optInt5 = optJSONObject.optInt("show_pgb", 0);
                MBridgeBTVideoView mBridgeBTVideoView = new MBridgeBTVideoView(MBSDKContext.m52746m().m52792c());
                try {
                    JSCommon jSCommon = (JSCommon) ((CallMethodContext) obj).f57740b.getObject();
                    mBridgeBTVideoView.setAdEvents(jSCommon.m48597l());
                    mBridgeBTVideoView.setAdSession(jSCommon.m48599j());
                    mBridgeBTVideoView.setVideoEvents(jSCommon.m48598k());
                } catch (Exception e) {
                    SameLogTool.m51824b("OperateViews", e.getMessage());
                }
                mBridgeBTVideoView.setCampaign(parseCampaignWithBackData);
                mBridgeBTVideoView.setUnitId(optString);
                mBridgeBTVideoView.setShowMute(optInt2);
                mBridgeBTVideoView.setShowTime(optInt);
                mBridgeBTVideoView.setShowClose(optInt3);
                mBridgeBTVideoView.setOrientation(optInt4);
                mBridgeBTVideoView.setProgressBarState(optInt5);
                WindVaneWebView windVaneWebView = ((CallMethodContext) obj).f57740b;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    mBridgeBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> m49250b = m49250b(optString, str);
                String m49269a = m49269a();
                f59940b.put(m49269a, str);
                mBridgeBTVideoView.setInstanceId(m49269a);
                m49250b.put(m49269a, mBridgeBTVideoView);
                mBridgeBTVideoView.preLoadData();
                if (parseCampaignWithBackData == null) {
                    m49249c(obj, "campaign is null");
                    SameLogTool.m51827a("OperateViews", "createPlayerView failed");
                } else {
                    m49263a(obj, m49269a);
                    SameLogTool.m51827a("OperateViews", "createPlayerView instanceId = " + m49269a);
                }
                unused = H5MediaPlayerManager.C22960a.f59972a;
                return;
            }
            m49249c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "createPlayerView failed：" + th.getMessage());
        }
    }

    /* renamed from: f */
    public final void m49242f(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                m49249c(obj, "data is empty");
            } else {
                m49263a(obj, optString);
            }
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
        }
    }

    /* renamed from: a */
    public final void m49263a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, f59947i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m49249c(obj, e.getMessage());
            SameLogTool.m51827a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: a */
    private void m49262a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, f59947i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            WindVaneCallJs.m51063a().m51059a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m49249c(obj, e.getMessage());
            SameLogTool.m51827a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void m49252b(Object obj, JSONObject jSONObject, boolean z) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2) && m49250b.containsKey(optString3)) {
                View view = m49250b.get(optString2);
                View view2 = m49250b.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            rect = null;
                            optInt = 0;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams m49267a = m49267a(layoutParams, rect, optInt, optInt2);
                    if (z) {
                        ViewUtil.m51671a(view);
                    }
                    int i = indexOfChild - 1;
                    viewGroup.addView(view, i > -1 ? i : 0, m49267a);
                    m49263a(obj, optString2);
                    m49262a(obj, "onInsertViewBelow", optString2);
                    SameLogTool.m51827a("OperateViews", "insertViewBelow instanceId = " + optString2);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "insertViewBelow failed: view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "insertViewBelow failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "insertViewBelow failed: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void m49265a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, f59947i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            WindVaneCallJs.m51063a().m51061a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m49266a(webView, e.getMessage());
            SameLogTool.m51827a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void m49261a(final Object obj, JSONObject jSONObject) {
        final int i;
        final int i2;
        final Rect rect;
        try {
            final String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                m49249c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            int optInt = optJSONObject.optInt("delay", 0);
            optJSONObject.optString("fileURL");
            optJSONObject.optString(C19909fc.C19912c.f50076c);
            optJSONObject.optString("html");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                int optInt2 = optJSONObject2.optInt("width");
                i2 = optJSONObject2.optInt("height");
                rect = rect3;
                i = optInt2;
            } else {
                i = 0;
                i2 = 0;
                rect = rect2;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.1
                {
                    BaseOperateViews.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((CallMethodContext) obj).f57740b;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> m49250b = BaseOperateViews.this.m49250b(optString, str);
                    String m49269a = BaseOperateViews.this.m49269a();
                    BaseOperateViews.f59940b.put(m49269a, str);
                    MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(MBSDKContext.m52746m().m52792c());
                    m49250b.put(m49269a, mBridgeBTLayout);
                    mBridgeBTLayout.setInstanceId(m49269a);
                    mBridgeBTLayout.setUnitId(optString);
                    mBridgeBTLayout.setWebView(windVaneWebView);
                    mBridgeBTLayout.setRect(rect);
                    int i3 = i;
                    if (i3 > 0 || i2 > 0) {
                        mBridgeBTLayout.setLayout(i3, i2);
                    }
                    BaseOperateViews.this.m49263a(obj, m49269a);
                    SameLogTool.m51827a("OperateViews", "create view instanceId = " + m49269a);
                }
            }, optInt);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "create view failed：" + th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* renamed from: a */
    private ViewGroup.LayoutParams m49267a(ViewGroup.LayoutParams layoutParams, Rect rect, int i, int i2) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context m52792c = MBSDKContext.m52746m().m52792c();
        if (m52792c == null) {
            return layoutParams;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int i3 = rect.left;
            if (i3 != -999) {
                layoutParams2.leftMargin = SameTool.m51772a(m52792c, i3);
            }
            int i4 = rect.top;
            if (i4 != -999) {
                layoutParams2.topMargin = SameTool.m51772a(m52792c, i4);
            }
            int i5 = rect.right;
            if (i5 != -999) {
                layoutParams2.rightMargin = SameTool.m51772a(m52792c, i5);
            }
            int i6 = rect.bottom;
            if (i6 != -999) {
                layoutParams2.bottomMargin = SameTool.m51772a(m52792c, i6);
            }
            if (i > 0) {
                layoutParams2.width = SameTool.m51772a(m52792c, i);
            }
            if (i2 > 0) {
                layoutParams2.height = SameTool.m51772a(m52792c, i2);
            }
            return layoutParams2;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            int i7 = rect.left;
            if (i7 != -999) {
                layoutParams3.leftMargin = SameTool.m51772a(m52792c, i7);
            }
            int i8 = rect.top;
            if (i8 != -999) {
                layoutParams3.topMargin = SameTool.m51772a(m52792c, i8);
            }
            int i9 = rect.right;
            if (i9 != -999) {
                layoutParams3.rightMargin = SameTool.m51772a(m52792c, i9);
            }
            int i10 = rect.bottom;
            if (i10 != -999) {
                layoutParams3.bottomMargin = SameTool.m51772a(m52792c, i10);
            }
            if (i > 0) {
                layoutParams3.width = SameTool.m51772a(m52792c, i);
            }
            if (i2 > 0) {
                layoutParams3.height = SameTool.m51772a(m52792c, i2);
            }
            return layoutParams3;
        } else {
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                int i11 = rect.left;
                if (i11 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = SameTool.m51772a(m52792c, i11);
                }
                int i12 = rect.top;
                if (i12 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = SameTool.m51772a(m52792c, i12);
                }
                int i13 = rect.right;
                if (i13 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).rightMargin = SameTool.m51772a(m52792c, i13);
                }
                int i14 = rect.bottom;
                if (i14 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = SameTool.m51772a(m52792c, i14);
                }
                if (i > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).width = SameTool.m51772a(m52792c, i);
                }
                if (i2 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).height = SameTool.m51772a(m52792c, i2);
                }
            }
            return layoutParams;
        }
    }

    /* renamed from: b */
    public final void m49254b(Object obj, String str) {
        SameLogTool.m51827a("OperateViews", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("type");
                String m51755a = SameTool.m51755a(jSONObject.optString("url"), "&tun=", SameDiTool.m51869q() + "");
                int optInt2 = jSONObject.optInt("report");
                if (optInt2 == 0) {
                    CommonClickControl.m53242a(MBSDKContext.m52746m().m52792c(), (CampaignEx) null, "", m51755a, false, optInt != 0);
                } else {
                    CommonClickControl.m53241a(MBSDKContext.m52746m().m52792c(), (CampaignEx) null, "", m51755a, false, optInt != 0, optInt2);
                }
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            m49263a(obj, "");
        } catch (Throwable th2) {
            th = th2;
            SameLogTool.m51823b("OperateViews", "reportUrls", th);
        }
    }

    /* renamed from: a */
    public final void m49260a(Object obj, JSONObject jSONObject, boolean z) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String m49237h = m49237h(optString2);
            if (TextUtils.isEmpty(m49237h) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                m49237h = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m49249c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> m49250b = m49250b(optString, m49237h);
            if (m49250b.containsKey(optString2) && m49250b.containsKey(optString3)) {
                View view = m49250b.get(optString2);
                View view2 = m49250b.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams m49267a = m49267a(layoutParams, rect, optInt, optInt2);
                    if (z) {
                        ViewUtil.m51671a(view);
                    }
                    viewGroup.addView(view, indexOfChild + 1, m49267a);
                    m49263a(obj, optString2);
                    m49262a(obj, "onInsertViewAbove", optString2);
                    SameLogTool.m51827a("OperateViews", "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                m49249c(obj, "view not exist");
                SameLogTool.m51827a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + optString2);
                return;
            }
            m49249c(obj, "instanceId not exist");
            SameLogTool.m51827a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m49249c(obj, th.getMessage());
            SameLogTool.m51827a("OperateViews", "insertViewAbove failed: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void m49268a(int i, int i2, int i3, int i4, int i5) {
        SameLogTool.m51827a("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        f59949k = JsonUtils.m51618a(i, i2, i3, i4, i5);
        f59950l = i;
        f59951m = i2;
        f59952n = i3;
        f59953o = i4;
        f59954p = i5;
    }

    /* renamed from: a */
    static /* synthetic */ void m49264a(BaseOperateViews baseOperateViews, String str, CampaignEx campaignEx) {
        if (StaticDataPoll.f56494j == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        StaticDataPoll.m52302a(str, campaignEx, Reporting.EventType.REWARD);
    }
}
