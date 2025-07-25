package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public abstract class AFd1zSDK<T> {
    public final String AFInAppEventParameterName;
    public final FutureTask<T> AFInAppEventType = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFd1zSDK.2
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFd1zSDK.this.AFKeystoreWrapper()) {
                return (T) AFd1zSDK.this.values();
            }
            return null;
        }
    });
    public final Context AFKeystoreWrapper;
    private final String[] valueOf;
    public final AFd1fSDK values;

    public AFd1zSDK(Context context, AFd1fSDK aFd1fSDK, String str, String... strArr) {
        this.AFKeystoreWrapper = context;
        this.AFInAppEventParameterName = str;
        this.valueOf = strArr;
        this.values = aFd1fSDK;
    }

    public final boolean AFKeystoreWrapper() {
        try {
            ProviderInfo resolveContentProvider = this.AFKeystoreWrapper.getPackageManager().resolveContentProvider(this.AFInAppEventParameterName, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.valueOf).contains(AFb1vSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return false;
        }
    }

    @Nullable
    public T valueOf() {
        try {
            return this.AFInAppEventType.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e3) {
            AFLogger.afErrorLog(e3.getMessage(), e3, false, false);
            return null;
        }
    }

    protected abstract T values();
}
