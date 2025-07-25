package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.p358vb.InterfaceC9576bX;
import com.bytedance.sdk.openadsdk.p358vb.p359IL.C9575bg;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes3.dex */
public class BusMonitorDependWrapper implements InterfaceC9576bX {

    /* renamed from: IL */
    private Handler f17170IL;

    /* renamed from: bg */
    private InterfaceC9576bX f17171bg;

    public BusMonitorDependWrapper(InterfaceC9576bX interfaceC9576bX) {
        this.f17171bg = interfaceC9576bX;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9576bX
    public Context getContext() {
        InterfaceC9576bX interfaceC9576bX = this.f17171bg;
        if (interfaceC9576bX != null && interfaceC9576bX.getContext() != null) {
            return this.f17171bg.getContext();
        }
        return getReflectContext();
    }

    @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9576bX
    public Handler getHandler() {
        InterfaceC9576bX interfaceC9576bX = this.f17171bg;
        if (interfaceC9576bX != null && interfaceC9576bX.getHandler() != null) {
            return this.f17171bg.getHandler();
        }
        if (this.f17170IL == null) {
            HandlerThread handlerThread = new HandlerThread("pag_monitor");
            handlerThread.start();
            this.f17170IL = new Handler(handlerThread.getLooper());
        }
        return this.f17170IL;
    }

    @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9576bX
    public int getOnceLogCount() {
        InterfaceC9576bX interfaceC9576bX = this.f17171bg;
        if (interfaceC9576bX != null) {
            return interfaceC9576bX.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9576bX
    public int getOnceLogInterval() {
        InterfaceC9576bX interfaceC9576bX = this.f17171bg;
        if (interfaceC9576bX != null) {
            return interfaceC9576bX.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9576bX
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        InterfaceC9576bX interfaceC9576bX = this.f17171bg;
        if (interfaceC9576bX == null || (uploadIntervalTime = interfaceC9576bX.getUploadIntervalTime()) < 1800000) {
            return 1800000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9576bX
    public boolean isMonitorOpen() {
        InterfaceC9576bX interfaceC9576bX = this.f17171bg;
        if (interfaceC9576bX != null) {
            return interfaceC9576bX.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9576bX
    public void onMonitorUpload(List<C9575bg> list) {
        InterfaceC9576bX interfaceC9576bX = this.f17171bg;
        if (interfaceC9576bX != null) {
            interfaceC9576bX.onMonitorUpload(list);
        }
    }
}
