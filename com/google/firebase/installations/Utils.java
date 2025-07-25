package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class Utils {
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    private static final Pattern f43083b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c */
    private static Utils f43084c;

    /* renamed from: a */
    private final Clock f43085a;

    private Utils(Clock clock) {
        this.f43085a = clock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m66755a(@Nullable String str) {
        return f43083b.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m66754b(@Nullable String str) {
        return str.contains(":");
    }

    public static Utils getInstance() {
        return getInstance(SystemClock.getInstance());
    }

    public long currentTimeInMillis() {
        return this.f43085a.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeInMillis());
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean isAuthTokenExpired(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.getAuthToken()) || persistedInstallationEntry.getTokenCreationEpochInSecs() + persistedInstallationEntry.getExpiresInSecs() < currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS) {
            return true;
        }
        return false;
    }

    public static Utils getInstance(Clock clock) {
        if (f43084c == null) {
            f43084c = new Utils(clock);
        }
        return f43084c;
    }
}
