package com.smaato.sdk.core.datacollector;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Pair;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.reflection.MethodAccessor;

/* loaded from: classes7.dex */
public final class GoogleAdvertisingClientInfo {
    @NonNull
    private final Context context;
    @NonNull
    private final Logger logger;
    private MethodAccessor methodAccessor;
    private String advertisingId = null;
    private Boolean isAdTrackingEnabled = null;

    public GoogleAdvertisingClientInfo(@NonNull Logger logger, @NonNull Context context) {
        this.logger = logger;
        this.context = context;
        init();
    }

    private Object getGoogleAdvertisingIdInfo() throws ClassNotFoundException, MethodAccessor.MethodAccessingException {
        MethodAccessor build = new MethodAccessor.Builder().fromClassInstance("com.google.android.gms.ads.identifier.AdvertisingIdClient").setMethodName("getAdvertisingIdInfo").withParametersOfResolvedTypes(Pair.m39354of(Context.class, this.context)).build();
        this.methodAccessor = build;
        return build.execute();
    }

    public void fetchGAIDandTrackingEnabled() {
        try {
            Object googleAdvertisingIdInfo = getGoogleAdvertisingIdInfo();
            if (googleAdvertisingIdInfo != null) {
                Boolean valueOf = Boolean.valueOf(((Boolean) new MethodAccessor.Builder().fromObjectInstance(googleAdvertisingIdInfo).setMethodName(C21114v8.C21123i.f54118M).build().execute()).booleanValue());
                this.isAdTrackingEnabled = valueOf;
                if (valueOf.booleanValue()) {
                    this.advertisingId = null;
                    return;
                } else {
                    this.advertisingId = (String) new MethodAccessor.Builder().fromObjectInstance(googleAdvertisingIdInfo).setMethodName("getId").build().execute();
                    return;
                }
            }
            throw new MethodAccessor.MethodAccessingException(new Throwable("Cannot fetch AdvertisingIdClient.Info: null received"));
        } catch (MethodAccessor.MethodAccessingException | ClassNotFoundException unused) {
            this.logger.info(LogDomain.DATA_COLLECTOR, "Cannot fetch AdvertisingIdClient.Info: AdvertisingID or isLimitAdTrackingEnabled is null", new Object[0]);
        } catch (Exception unused2) {
            this.logger.info(LogDomain.DATA_COLLECTOR, "Cannot fetch AdvertisingIdClient.Info: Unknown Error", new Object[0]);
        }
    }

    @Nullable
    public String getAdvertisingId() {
        return this.advertisingId;
    }

    public void init() {
        Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.core.datacollector.l
            @Override // java.lang.Runnable
            public final void run() {
                GoogleAdvertisingClientInfo.this.fetchGAIDandTrackingEnabled();
            }
        });
    }

    public boolean isLimitAdTrackingEnabled() {
        Boolean bool = this.isAdTrackingEnabled;
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
