package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes7.dex */
public class POBAdvertisingIdClient {
    @Nullable

    /* renamed from: a */
    private static volatile POBAdvertisingIdClient f70267a;
    @NonNull

    /* renamed from: b */
    private final ExecutorService f70268b = Executors.newSingleThreadExecutor();
    @NonNull

    /* renamed from: c */
    private final Context f70269c;
    @Nullable

    /* renamed from: d */
    private Future<?> f70270d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.utility.POBAdvertisingIdClient$a */
    /* loaded from: classes7.dex */
    public class RunnableC26722a implements Runnable {
        RunnableC26722a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(POBAdvertisingIdClient.this.f70269c);
                String id2 = advertisingIdInfo.getId();
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                if (id2 != null && !id2.equals(POBAdvertisingIdClient.this.getStoredAdvertisingId())) {
                    POBAdvertisingIdClient.this.saveAndroidAid(id2);
                }
                if (isLimitAdTrackingEnabled != POBAdvertisingIdClient.this.getStoredLMTState()) {
                    POBAdvertisingIdClient.this.saveLMTState(isLimitAdTrackingEnabled);
                }
            } catch (Exception | NoClassDefFoundError e) {
                POBLog.error("POBAdvertisingIdClient", "Error while requesting AAID: ", e.getMessage());
            }
        }
    }

    private POBAdvertisingIdClient(@NonNull Context context) {
        this.f70269c = context.getApplicationContext();
    }

    public static POBAdvertisingIdClient getInstance(@NonNull Context context) {
        if (f70267a == null) {
            synchronized (POBAdvertisingIdClient.class) {
                if (f70267a == null) {
                    f70267a = new POBAdvertisingIdClient(context);
                }
            }
        }
        return f70267a;
    }

    @Nullable
    public String getStoredAdvertisingId() {
        return this.f70269c.getSharedPreferences("aid_shared_preference", 0).getString("aid_key", null);
    }

    public boolean getStoredLMTState() {
        return this.f70269c.getSharedPreferences("aid_shared_preference", 0).getBoolean("limited_tracking_ad_key", false);
    }

    protected boolean isReadyToUpdate() {
        Future<?> future = this.f70270d;
        if (future != null) {
            return future.isDone();
        }
        return true;
    }

    protected void saveAndroidAid(@NonNull String str) {
        SharedPreferences.Editor edit = this.f70269c.getSharedPreferences("aid_shared_preference", 0).edit();
        if (edit != null) {
            edit.putString("aid_key", str);
            edit.apply();
        }
    }

    protected void saveLMTState(boolean z) {
        SharedPreferences.Editor edit = this.f70269c.getSharedPreferences("aid_shared_preference", 0).edit();
        if (edit != null) {
            edit.putBoolean("limited_tracking_ad_key", z);
            edit.apply();
        }
    }

    public boolean updateAAID() {
        if (isReadyToUpdate()) {
            m40562a();
            return true;
        }
        POBLog.debug("POBAdvertisingIdClient", "Skipping AAID update as last request is in progress", new Object[0]);
        return false;
    }

    /* renamed from: a */
    private void m40562a() {
        try {
            this.f70270d = this.f70268b.submit(new RunnableC26722a());
        } catch (OutOfMemoryError | RejectedExecutionException e) {
            POBLog.error("POBAdvertisingIdClient", "Unable to dispatch thread while requesting AAID: ", e.getMessage());
        }
    }
}
