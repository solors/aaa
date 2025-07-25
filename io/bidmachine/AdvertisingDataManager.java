package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.SharedPreferenceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class AdvertisingDataManager {
    @NonNull
    private static final String GENERATED_ADVERTISING_ID = UUID.randomUUID().toString();
    @NonNull
    private static final List<AbstractC35161b> PERSONAL_DATA_RETRIEVER_LIST;
    @NonNull
    private static final String SHARED_PREFERENCES_NAME = "ad_core_preferences";
    @NonNull
    private static final String UUID_ID = "uuid";
    @NonNull
    private static final String ZERO_ADVERTISING_ID = "00000000-0000-0000-0000-000000000000";
    @Nullable
    private static AdvertisingData advertisingData;
    @Nullable
    private static String storedAdvertisingId;
    @Nullable
    private static AbstractC35161b successfulAdvertisingDataRetriever;

    /* loaded from: classes9.dex */
    public static class AdvertisingData {
        @Nullable

        /* renamed from: id */
        private final String f95964id;
        private final boolean limitAdTrackingEnabled;

        public AdvertisingData(@Nullable String str, boolean z) {
            this.f95964id = str;
            this.limitAdTrackingEnabled = z;
        }

        @Nullable
        public String getId() {
            return this.f95964id;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.AdvertisingDataManager$b */
    /* loaded from: classes9.dex */
    public static abstract class AbstractC35161b {
        @NonNull
        private final AtomicBoolean isRetrieverAvailable = new AtomicBoolean(true);

        private boolean isRetrieverAvailable() {
            return this.isRetrieverAvailable.get();
        }

        @Nullable
        protected abstract AdvertisingData createAdvertisingData(@NonNull Context context) throws Throwable;

        @Nullable
        public AdvertisingData retrieve(@NonNull Context context) {
            if (!isRetrieverAvailable()) {
                return null;
            }
            try {
                return createAdvertisingData(context);
            } catch (NoClassDefFoundError e) {
                setIsRetrieverAvailable(false);
                Logger.m20086w(e);
                return null;
            } catch (Throwable th) {
                Logger.m20086w(th);
                return null;
            }
        }

        protected void setIsRetrieverAvailable(boolean z) {
            this.isRetrieverAvailable.set(z);
        }
    }

    /* renamed from: io.bidmachine.AdvertisingDataManager$c */
    /* loaded from: classes9.dex */
    private static class C35162c extends AbstractC35161b {
        private C35162c() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.AbstractC35161b
        @Nullable
        protected AdvertisingData createAdvertisingData(@NonNull Context context) throws Throwable {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                if (advertisingIdInfo != null) {
                    return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
                }
                return null;
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException unused) {
                setIsRetrieverAvailable(false);
                return null;
            }
        }
    }

    /* renamed from: io.bidmachine.AdvertisingDataManager$d */
    /* loaded from: classes9.dex */
    private static class C35163d extends AbstractC35161b {
        private C35163d() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.AbstractC35161b
        @Nullable
        protected AdvertisingData createAdvertisingData(@NonNull Context context) throws Throwable {
            AdvertisingIdClient.Info advertisingIdInfo = com.huawei.hms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            }
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        PERSONAL_DATA_RETRIEVER_LIST = arrayList;
        arrayList.add(new C35162c());
        arrayList.add(new C35163d());
    }

    AdvertisingDataManager() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static String getAdvertisingId(@NonNull Context context, boolean z) {
        String str;
        if (z) {
            return "00000000-0000-0000-0000-000000000000";
        }
        AdvertisingData advertisingData2 = advertisingData;
        if (advertisingData2 != null) {
            str = advertisingData2.getId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || "00000000-0000-0000-0000-000000000000".equals(str)) {
            return obtainStoredAdvertisingId(context);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isLimitAdTrackingEnabled() {
        AdvertisingData advertisingData2 = advertisingData;
        if (advertisingData2 != null && advertisingData2.isLimitAdTrackingEnabled()) {
            return true;
        }
        return false;
    }

    @NonNull
    private static String obtainStoredAdvertisingId(@NonNull Context context) {
        if (!TextUtils.isEmpty(storedAdvertisingId)) {
            return storedAdvertisingId;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        String optString = SharedPreferenceUtils.optString(sharedPreferences, "uuid", null);
        storedAdvertisingId = optString;
        if (!TextUtils.isEmpty(optString)) {
            return storedAdvertisingId;
        }
        storedAdvertisingId = GENERATED_ADVERTISING_ID;
        sharedPreferences.edit().putString("uuid", storedAdvertisingId).apply();
        return storedAdvertisingId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public static void updateInfo(@NonNull Context context) {
        AbstractC35161b abstractC35161b = successfulAdvertisingDataRetriever;
        if (abstractC35161b != null) {
            AdvertisingData retrieve = abstractC35161b.retrieve(context);
            if (retrieve != null) {
                advertisingData = retrieve;
                return;
            }
            return;
        }
        for (AbstractC35161b abstractC35161b2 : PERSONAL_DATA_RETRIEVER_LIST) {
            AdvertisingData retrieve2 = abstractC35161b2.retrieve(context);
            if (retrieve2 != null) {
                successfulAdvertisingDataRetriever = abstractC35161b2;
                advertisingData = retrieve2;
                return;
            }
        }
    }
}
