package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";

    /* renamed from: g */
    private static final Pattern f42406g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f42407h = Pattern.quote(RemoteSettings.FORWARD_SLASH_STRING);

    /* renamed from: a */
    private final InstallerPackageNameProvider f42408a;

    /* renamed from: b */
    private final Context f42409b;

    /* renamed from: c */
    private final String f42410c;

    /* renamed from: d */
    private final FirebaseInstallationsApi f42411d;

    /* renamed from: e */
    private final DataCollectionArbiter f42412e;

    /* renamed from: f */
    private InstallIdProvider.InstallIds f42413f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context != null) {
            if (str != null) {
                this.f42409b = context;
                this.f42410c = str;
                this.f42411d = firebaseInstallationsApi;
                this.f42412e = dataCollectionArbiter;
                this.f42408a = new InstallerPackageNameProvider();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    @NonNull
    /* renamed from: a */
    private synchronized String m67087a(String str, SharedPreferences sharedPreferences) {
        String m67085c;
        m67085c = m67085c(UUID.randomUUID().toString());
        Logger logger = Logger.getLogger();
        logger.m67210v("Created new Crashlytics installation ID: " + m67085c + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m67085c).putString("firebase.installation.id", str).apply();
        return m67085c;
    }

    /* renamed from: b */
    static String m67086b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @NonNull
    /* renamed from: c */
    private static String m67085c(@NonNull String str) {
        return f42406g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: d */
    static boolean m67084d(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private String m67083e(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: f */
    private String m67082f(String str) {
        return str.replaceAll(f42407h, "");
    }

    /* renamed from: g */
    private boolean m67081g() {
        InstallIdProvider.InstallIds installIds = this.f42413f;
        if (installIds != null && (installIds.getFirebaseInstallationId() != null || !this.f42412e.isAutomaticDataCollectionEnabled())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        com.google.firebase.crashlytics.internal.Logger.getLogger().m67207w("Error getting Firebase installation id.", r1);
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.firebase.crashlytics.internal.common.FirebaseInstallationId fetchTrueFid(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L1f
            com.google.firebase.installations.FirebaseInstallationsApi r5 = r4.f42411d     // Catch: java.lang.Exception -> L15
            r1 = 0
            com.google.android.gms.tasks.Task r5 = r5.getToken(r1)     // Catch: java.lang.Exception -> L15
            java.lang.Object r5 = com.google.firebase.crashlytics.internal.common.Utils.awaitEvenIfOnMainThread(r5)     // Catch: java.lang.Exception -> L15
            com.google.firebase.installations.InstallationTokenResult r5 = (com.google.firebase.installations.InstallationTokenResult) r5     // Catch: java.lang.Exception -> L15
            java.lang.String r5 = r5.getToken()     // Catch: java.lang.Exception -> L15
            goto L20
        L15:
            r5 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Error getting Firebase authentication token."
            r1.m67207w(r2, r5)
        L1f:
            r5 = r0
        L20:
            com.google.firebase.installations.FirebaseInstallationsApi r1 = r4.f42411d     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.tasks.Task r1 = r1.getId()     // Catch: java.lang.Exception -> L2e
            java.lang.Object r1 = com.google.firebase.crashlytics.internal.common.Utils.awaitEvenIfOnMainThread(r1)     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2e
            r0 = r1
            goto L38
        L2e:
            r1 = move-exception
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Error getting Firebase installation id."
            r2.m67207w(r3, r1)
        L38:
            com.google.firebase.crashlytics.internal.common.FirebaseInstallationId r1 = new com.google.firebase.crashlytics.internal.common.FirebaseInstallationId
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.IdManager.fetchTrueFid(boolean):com.google.firebase.crashlytics.internal.common.FirebaseInstallationId");
    }

    public String getAppIdentifier() {
        return this.f42410c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @NonNull
    public synchronized InstallIdProvider.InstallIds getInstallIds() {
        String str;
        if (!m67081g()) {
            return this.f42413f;
        }
        Logger.getLogger().m67210v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.f42409b);
        String string = sharedPrefs.getString("firebase.installation.id", null);
        Logger logger = Logger.getLogger();
        logger.m67210v("Cached Firebase Installation ID: " + string);
        if (this.f42412e.isAutomaticDataCollectionEnabled()) {
            FirebaseInstallationId fetchTrueFid = fetchTrueFid(false);
            Logger logger2 = Logger.getLogger();
            logger2.m67210v("Fetched Firebase Installation ID: " + fetchTrueFid.getFid());
            if (fetchTrueFid.getFid() == null) {
                if (string == null) {
                    str = m67086b();
                } else {
                    str = string;
                }
                fetchTrueFid = new FirebaseInstallationId(str, null);
            }
            if (Objects.equals(fetchTrueFid.getFid(), string)) {
                this.f42413f = InstallIdProvider.InstallIds.m67080a(m67083e(sharedPrefs), fetchTrueFid);
            } else {
                this.f42413f = InstallIdProvider.InstallIds.m67080a(m67087a(fetchTrueFid.getFid(), sharedPrefs), fetchTrueFid);
            }
        } else if (m67084d(string)) {
            this.f42413f = InstallIdProvider.InstallIds.createWithoutFid(m67083e(sharedPrefs));
        } else {
            this.f42413f = InstallIdProvider.InstallIds.createWithoutFid(m67087a(m67086b(), sharedPrefs));
        }
        Logger logger3 = Logger.getLogger();
        logger3.m67210v("Install IDs: " + this.f42413f);
        return this.f42413f;
    }

    public String getInstallerPackageName() {
        return this.f42408a.m67079a(this.f42409b);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", m67082f(Build.MANUFACTURER), m67082f(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return m67082f(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return m67082f(Build.VERSION.RELEASE);
    }
}
