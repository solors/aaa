package com.smaato.sdk.core.datacollector;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.core.util.reflection.Reflections;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;

/* renamed from: com.smaato.sdk.core.datacollector.p */
/* loaded from: classes7.dex */
public class SystemInfoProvider {
    @NonNull

    /* renamed from: a */
    private final Logger f71468a;
    @NonNull

    /* renamed from: b */
    private final Context f71469b;
    @NonNull

    /* renamed from: c */
    private final NetworkStateMonitor f71470c;
    @NonNull

    /* renamed from: d */
    private final TelephonyManager f71471d;
    @NonNull

    /* renamed from: e */
    private final UserAgentProvider f71472e;
    @Nullable

    /* renamed from: f */
    private GoogleAdvertisingClientInfo f71473f;

    public SystemInfoProvider(@NonNull Logger logger, @NonNull Context context, @NonNull NetworkStateMonitor networkStateMonitor, @NonNull TelephonyManager telephonyManager, @NonNull UserAgentProvider userAgentProvider) {
        this.f71468a = (Logger) Objects.requireNonNull(logger, "Parameter logger cannot be null for SystemInfoProvider::new");
        this.f71469b = (Context) Objects.requireNonNull(context, "Parameter context cannot be null for SystemInfoProvider::new");
        this.f71470c = (NetworkStateMonitor) Objects.requireNonNull(networkStateMonitor, "Parameter networkStateMonitor cannot be null for SystemInfoProvider::new");
        this.f71471d = (TelephonyManager) Objects.requireNonNull(telephonyManager, "Parameter telephonyManager cannot be null for SystemInfoProvider::new");
        this.f71472e = (UserAgentProvider) Objects.requireNonNull(userAgentProvider, "Parameter userAgentProvider cannot be null for SystemInfoProvider::new");
    }

    /* renamed from: a */
    private String m39645a() {
        if ("Amazon".equals(Build.MANUFACTURER)) {
            ContentResolver contentResolver = this.f71469b.getContentResolver();
            if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING, 2) == 0) {
                return Settings.Secure.getString(contentResolver, "advertising_id");
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    private GoogleAdvertisingClientInfo m39644b() {
        return new GoogleAdvertisingClientInfo(this.f71468a, this.f71469b);
    }

    /* renamed from: c */
    private String m39643c(String str) {
        if (str == null) {
            try {
                if ("Amazon".equals(Build.MANUFACTURER)) {
                    return m39645a();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    @NonNull
    /* renamed from: d */
    private String m39642d() {
        Locale locale;
        if (this.f71469b.getResources() != null) {
            locale = this.f71469b.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            return language;
        }
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: f */
    private boolean m39640f() {
        return Reflections.isClassInClasspath("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    @NonNull
    /* renamed from: e */
    public SystemInfo m39641e() {
        String simOperatorName = this.f71471d.getSimOperatorName();
        String simOperator = this.f71471d.getSimOperator();
        GoogleAdvertisingClientInfo googleAdvertisingClientInfo = this.f71473f;
        if (googleAdvertisingClientInfo == null && m39640f()) {
            googleAdvertisingClientInfo = m39644b();
            this.f71473f = googleAdvertisingClientInfo;
        }
        String str = (String) Objects.transformOrNull(googleAdvertisingClientInfo, new Function() { // from class: com.smaato.sdk.core.datacollector.n
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return ((GoogleAdvertisingClientInfo) obj).getAdvertisingId();
            }
        });
        Boolean bool = (Boolean) Objects.transformOrNull(googleAdvertisingClientInfo, new Function() { // from class: com.smaato.sdk.core.datacollector.o
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((GoogleAdvertisingClientInfo) obj).isLimitAdTrackingEnabled());
            }
        });
        String str2 = Build.MODEL;
        if (str2 == null) {
            str2 = C21114v8.C21123i.f54153l;
        }
        return new SystemInfo(simOperatorName, simOperator, m39643c(str), bool, str2, this.f71470c.getNetworkConnectionType(), this.f71472e.get(), this.f71469b.getPackageName(), m39642d());
    }
}
