package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class LoggerStorage {

    /* renamed from: a */
    private static HashMap f92426a = new HashMap();

    /* renamed from: b */
    private static final Object f92427b = new Object();

    /* renamed from: c */
    private static volatile PublicLogger f92428c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f92428c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f92428c = getOrCreatePublicLogger(str);
        return f92428c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) f92426a.get(str);
        if (publicLogger == null) {
            synchronized (f92427b) {
                publicLogger = (PublicLogger) f92426a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f92426a.put(str, publicLogger);
                }
            }
        }
        return publicLogger;
    }

    @VisibleForTesting(otherwise = 5)
    public static void unsetPublicLoggers() {
        f92426a = new HashMap();
        f92428c = PublicLogger.getAnonymousInstance();
    }
}
