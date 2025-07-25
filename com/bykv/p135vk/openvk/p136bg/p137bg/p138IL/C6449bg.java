package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL;

import android.content.Context;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p153iR.C6509bg;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.bg */
/* loaded from: classes3.dex */
public class C6449bg {

    /* renamed from: IL */
    public static int f13452IL = 10;

    /* renamed from: bX */
    public static int f13453bX = 10;

    /* renamed from: bg */
    public static int f13454bg = 10;
    public static int eqN = 10;

    /* renamed from: zx */
    private static InterfaceC6498IL f13455zx;

    /* renamed from: IL */
    public static int m91913IL() {
        return f13454bg;
    }

    /* renamed from: bX */
    public static int m91912bX() {
        return f13452IL;
    }

    /* renamed from: bg */
    public static void m91910bg(Context context) {
        C6509bg.m91676bg(context);
    }

    public static int eqN() {
        return f13453bX;
    }

    /* renamed from: zx */
    public static int m91907zx() {
        return eqN;
    }

    /* renamed from: bg */
    public static void m91908bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            f13454bg = jSONObject.optInt("splash", 10);
            f13452IL = jSONObject.optInt(Reporting.EventType.REWARD, 10);
            f13453bX = jSONObject.optInt("brand", 10);
            int optInt = jSONObject.optInt("other", 10);
            eqN = optInt;
            if (f13454bg < 0) {
                f13454bg = 10;
            }
            if (f13452IL < 0) {
                f13452IL = 10;
            }
            if (f13453bX < 0) {
                f13453bX = 10;
            }
            if (optInt < 0) {
                eqN = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: bg */
    public static void m91909bg(InterfaceC6498IL interfaceC6498IL) {
        f13455zx = interfaceC6498IL;
    }

    /* renamed from: bg */
    public static void m91911bg() {
        InterfaceC6498IL interfaceC6498IL = f13455zx;
        if (interfaceC6498IL != null) {
            interfaceC6498IL.eqN();
        }
    }
}
