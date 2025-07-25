package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
@Keep
/* loaded from: classes5.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(@NonNull Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            CronetProviderInstaller.zzc(this.mContext);
        } catch (GooglePlayServicesNotAvailableException unused) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        } catch (GooglePlayServicesRepairableException unused2) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            CronetProviderInstaller.zzc(this.mContext);
            Throwable th = null;
            try {
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) ((ClassLoader) Preconditions.checkNotNull(((DynamiteModule) Preconditions.checkNotNull(CronetProviderInstaller.zza())).getModuleContext().getClassLoader())).loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                builder = null;
                th = e;
            }
            if (th == null) {
                Preconditions.checkNotNull(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th);
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (GooglePlayServicesRepairableException e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext)) {
            return true;
        }
        return false;
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public String getName() {
        return CronetProviderInstaller.PROVIDER_NAME;
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public String getVersion() {
        tryToInstallCronetProvider();
        return CronetProviderInstaller.zzb();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return CronetProviderInstaller.isInstalled();
    }
}
