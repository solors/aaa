package com.learnings.unity.grt;

import com.learnings.unity.grt.LearningsGrtBridge;
import com.unity3d.player.UnityPlayer;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p039c4.GrtInitParameter;
import p039c4.LearningsGRT;
import p694h4.LTVManager;

/* loaded from: classes6.dex */
public class LearningsGrtBridge {
    public static void getLTV(final String str, final String str2) {
        runOnUiThread(new Runnable() { // from class: w4.c
            @Override // java.lang.Runnable
            public final void run() {
                LearningsGrtBridge.lambda$getLTV$4(str, str2);
            }
        });
    }

    public static void init() {
        runOnUiThread(new Runnable() { // from class: w4.e
            @Override // java.lang.Runnable
            public final void run() {
                LearningsGrtBridge.lambda$init$0();
            }
        });
    }

    public static /* synthetic */ void lambda$getLTV$3(String str, String str2, double d) {
        UnityPlayer.UnitySendMessage(str, str2, String.valueOf(d));
    }

    public static /* synthetic */ void lambda$getLTV$4(final String str, final String str2) {
        LearningsGRT.m103665b(new LTVManager.InterfaceC33478c() { // from class: w4.a
            @Override // p694h4.LTVManager.InterfaceC33478c
            /* renamed from: a */
            public final void mo2357a(double d) {
                LearningsGrtBridge.lambda$getLTV$3(str, str2, d);
            }
        });
    }

    public static /* synthetic */ void lambda$init$0() {
        LearningsGRT.m103664c(new GrtInitParameter.C3420b(UnityPlayer.currentActivity).m103668i(BridgeSettings.getProductionId()).m103669h(BridgeSettings.getInstallTime()).m103670g(BridgeSettings.isDebug()).m103667j(BridgeSettings.isShowLog()).m103671f());
    }

    public static /* synthetic */ void lambda$openDebugView$2() {
        LearningsGRT.m103663d(UnityPlayer.currentActivity);
    }

    public static /* synthetic */ void lambda$setAfData$1(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            LearningsGRT.m103662e(hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void openDebugView() {
        runOnUiThread(new Runnable() { // from class: w4.b
            @Override // java.lang.Runnable
            public final void run() {
                LearningsGrtBridge.lambda$openDebugView$2();
            }
        });
    }

    private static void runOnUiThread(Runnable runnable) {
        UnityPlayer.currentActivity.runOnUiThread(runnable);
    }

    public static void setAfData(final String str) {
        runOnUiThread(new Runnable() { // from class: w4.d
            @Override // java.lang.Runnable
            public final void run() {
                LearningsGrtBridge.lambda$setAfData$1(str);
            }
        });
    }
}
