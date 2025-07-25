package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InternalAppEventsLogger.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class InternalAppEventsLogger {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final AppEventsLoggerImpl loggerImpl;

    /* compiled from: InternalAppEventsLogger.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ InternalAppEventsLogger createInstance$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.createInstance(context, str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        public final InternalAppEventsLogger createInstance(@Nullable Context context) {
            return createInstance$default(this, context, null, 2, null);
        }

        @NotNull
        public final Executor getAnalyticsExecutor() {
            return AppEventsLoggerImpl.Companion.getAnalyticsExecutor();
        }

        @NotNull
        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.Companion.getFlushBehavior();
        }

        @Nullable
        public final String getPushNotificationsRegistrationId() {
            return AppEventsLoggerImpl.Companion.getPushNotificationsRegistrationId();
        }

        @RestrictTo({RestrictTo.Scope.GROUP_ID})
        public final void setInternalUserData(@NotNull Map<String, String> ud) {
            Intrinsics.checkNotNullParameter(ud, "ud");
            UserDataStore.setInternalUd(ud);
        }

        public final void setUserData(@Nullable Bundle bundle) {
            UserDataStore.setUserDataAndHash(bundle);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        public final InternalAppEventsLogger createInstance(@Nullable Context context, @Nullable String str) {
            return new InternalAppEventsLogger(context, str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        public final InternalAppEventsLogger createInstance(@NotNull String activityName, @Nullable String str, @Nullable AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            return new InternalAppEventsLogger(activityName, str, accessToken);
        }
    }

    public InternalAppEventsLogger(@NotNull AppEventsLoggerImpl loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.loggerImpl = loggerImpl;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final InternalAppEventsLogger createInstance(@Nullable Context context) {
        return Companion.createInstance(context);
    }

    @NotNull
    public static final Executor getAnalyticsExecutor() {
        return Companion.getAnalyticsExecutor();
    }

    @NotNull
    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        return Companion.getFlushBehavior();
    }

    @Nullable
    public static final String getPushNotificationsRegistrationId() {
        return Companion.getPushNotificationsRegistrationId();
    }

    @RestrictTo({RestrictTo.Scope.GROUP_ID})
    public static final void setInternalUserData(@NotNull Map<String, String> map) {
        Companion.setInternalUserData(map);
    }

    public static final void setUserData(@Nullable Bundle bundle) {
        Companion.setUserData(bundle);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final void logChangedSettingsEvent(@NotNull Bundle parameters) {
        boolean z;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if ((parameters.getInt("previous") & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly("fb_sdk_settings_changed", null, parameters);
        }
    }

    public final void logEvent(@Nullable String str, @Nullable Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(str, bundle);
        }
    }

    public final void logEventFromSE(@Nullable String str, @Nullable String str2) {
        this.loggerImpl.logEventFromSE(str, str2);
    }

    public final void logEventImplicitly(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, bigDecimal, currency, bundle);
        }
    }

    public final void logPurchaseImplicitly(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logPurchaseImplicitly(bigDecimal, currency, bundle);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final InternalAppEventsLogger createInstance(@Nullable Context context, @Nullable String str) {
        return Companion.createInstance(context, str);
    }

    public InternalAppEventsLogger(@Nullable Context context) {
        this(new AppEventsLoggerImpl(context, (String) null, (AccessToken) null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final InternalAppEventsLogger createInstance(@NotNull String str, @Nullable String str2, @Nullable AccessToken accessToken) {
        return Companion.createInstance(str, str2, accessToken);
    }

    public final void logEvent(@Nullable String str, double d, @Nullable Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(str, d, bundle);
        }
    }

    public final void logEventImplicitly(@Nullable String str) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, null, null);
        }
    }

    public InternalAppEventsLogger(@Nullable Context context, @Nullable String str) {
        this(new AppEventsLoggerImpl(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalAppEventsLogger(@NotNull String activityName, @Nullable String str, @Nullable AccessToken accessToken) {
        this(new AppEventsLoggerImpl(activityName, str, accessToken));
        Intrinsics.checkNotNullParameter(activityName, "activityName");
    }

    public final void logEventImplicitly(@Nullable String str, @Nullable Double d, @Nullable Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, d, bundle);
        }
    }

    public final void logEventImplicitly(@Nullable String str, @Nullable Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, null, bundle);
        }
    }
}
