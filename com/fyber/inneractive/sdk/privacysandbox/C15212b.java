package com.fyber.inneractive.sdk.privacysandbox;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.view.MotionEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* renamed from: com.fyber.inneractive.sdk.privacysandbox.b */
/* loaded from: classes4.dex */
public final class C15212b {

    /* renamed from: a */
    public final Context f30140a;

    public C15212b(Context context) {
        this.f30140a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m77043a(String str, MotionEvent motionEvent) {
        Executor mainExecutor;
        Context context = this.f30140a;
        MeasurementManagerFutures from = MeasurementManagerFutures.from(context.getApplicationContext());
        if (from == null) {
            IAlog.m76524f("MeasurementManager required", new Object[0]);
            return;
        }
        ListenableFuture<Unit> registerSourceAsync = from.registerSourceAsync(Uri.parse(str), motionEvent);
        RunnableC15211a runnableC15211a = new RunnableC15211a(str);
        mainExecutor = context.getMainExecutor();
        registerSourceAsync.addListener(runnableC15211a, mainExecutor);
    }

    /* renamed from: a */
    public static C15212b m77044a(Context context) {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        int extensionVersion = SdkExtensions.getExtensionVersion(1000000);
        IAlog.m76527c("Ad services version: %d", Integer.valueOf(extensionVersion));
        if (extensionVersion < 4 || !AbstractC15459m.m76485a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION") || (classLoader = context.getClass().getClassLoader()) == null) {
            return null;
        }
        try {
            if (classLoader.loadClass("androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures") != null) {
                return new C15212b(context);
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
