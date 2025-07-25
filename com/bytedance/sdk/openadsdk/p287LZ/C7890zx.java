package com.bytedance.sdk.openadsdk.p287LZ;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.LZ.zx */
/* loaded from: classes3.dex */
public class C7890zx implements InterfaceC7889eqN {

    /* renamed from: IL */
    private InterfaceC7889eqN f17215IL;

    /* renamed from: bg */
    Handler f17216bg = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7890zx(InterfaceC7889eqN interfaceC7889eqN) {
        this.f17215IL = interfaceC7889eqN;
    }

    /* renamed from: Kg */
    private Context m87467Kg() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p287LZ.InterfaceC7889eqN
    /* renamed from: IL */
    public Context mo87468IL() {
        InterfaceC7889eqN interfaceC7889eqN = this.f17215IL;
        if (interfaceC7889eqN != null && interfaceC7889eqN.mo87468IL() != null) {
            return this.f17215IL.mo87468IL();
        }
        return m87467Kg();
    }

    @Override // com.bytedance.sdk.openadsdk.p287LZ.InterfaceC7889eqN
    /* renamed from: bX */
    public String mo87466bX() {
        InterfaceC7889eqN interfaceC7889eqN = this.f17215IL;
        if (interfaceC7889eqN != null && !TextUtils.isEmpty(interfaceC7889eqN.mo87466bX())) {
            return this.f17215IL.mo87466bX();
        }
        return "null";
    }

    @Override // com.bytedance.sdk.openadsdk.p287LZ.InterfaceC7889eqN
    /* renamed from: bg */
    public ExecutorService mo87465bg() {
        InterfaceC7889eqN interfaceC7889eqN = this.f17215IL;
        if (interfaceC7889eqN != null && interfaceC7889eqN.mo87465bg() != null) {
            return this.f17215IL.mo87465bg();
        }
        return Executors.newCachedThreadPool();
    }

    @Override // com.bytedance.sdk.openadsdk.p287LZ.InterfaceC7889eqN
    public Handler eqN() {
        InterfaceC7889eqN interfaceC7889eqN = this.f17215IL;
        if (interfaceC7889eqN != null && interfaceC7889eqN.mo87463iR() != null) {
            return this.f17215IL.eqN();
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f17216bg = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.p287LZ.InterfaceC7889eqN
    /* renamed from: iR */
    public Map<String, String> mo87463iR() {
        InterfaceC7889eqN interfaceC7889eqN = this.f17215IL;
        if (interfaceC7889eqN != null && interfaceC7889eqN.mo87463iR() != null) {
            return this.f17215IL.mo87463iR();
        }
        return new HashMap();
    }

    @Override // com.bytedance.sdk.openadsdk.p287LZ.InterfaceC7889eqN
    public JSONObject ldr() {
        InterfaceC7889eqN interfaceC7889eqN = this.f17215IL;
        if (interfaceC7889eqN != null) {
            return interfaceC7889eqN.ldr();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.p287LZ.InterfaceC7889eqN
    /* renamed from: zx */
    public String mo87462zx() {
        InterfaceC7889eqN interfaceC7889eqN = this.f17215IL;
        if (interfaceC7889eqN != null) {
            return interfaceC7889eqN.mo87462zx();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.p287LZ.InterfaceC7889eqN
    /* renamed from: bg */
    public JSONObject mo87464bg(JSONObject jSONObject) {
        InterfaceC7889eqN interfaceC7889eqN = this.f17215IL;
        return interfaceC7889eqN != null ? interfaceC7889eqN.mo87464bg(jSONObject) : jSONObject;
    }
}
