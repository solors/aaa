package com.mobilefuse.sdk.device;

import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebSettings;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.Debugging;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import com.mobilefuse.sdk.p543rx.FlowKt;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: UserAgentInfo.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UserAgentInfo {
    @NotNull
    public static final String CACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY = "userAgentLastUpdateAndroidApi";
    @NotNull
    public static final String CACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY = "userAgentLastUpdateTimestamp";
    @NotNull
    public static final String CACHE_USER_AGENT_VALUE_KEY = "userAgent";
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long USER_AGENT_MAX_VALIDITY_TIME_MILLIS = 2592000000L;
    private boolean requestInProgress;
    @Nullable
    private final Functions<SharedPreferences> sharedPrefs;
    @NotNull
    private String userAgent = "";
    private Source userAgentSource = Source.NONE;
    @NotNull
    private final Set<Function1<String, Unit>> awaitingCompleteActions = new LinkedHashSet();

    /* compiled from: UserAgentInfo.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public enum Source {
        NONE,
        BROWSER,
        CACHE,
        ERROR
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAgentInfo(@Nullable Functions<? extends SharedPreferences> functions) {
        this.sharedPrefs = functions;
    }

    @VisibleForTesting
    public final int getAndroidApiVersion$mobilefuse_sdk_common_release() {
        return Build.VERSION.SDK_INT;
    }

    @NotNull
    public final Set<Function1<String, Unit>> getAwaitingCompleteActions$mobilefuse_sdk_common_release() {
        return this.awaitingCompleteActions;
    }

    @Nullable
    public final Functions<SharedPreferences> getSharedPrefs() {
        return this.sharedPrefs;
    }

    @NotNull
    public final String getUserAgent() {
        return this.userAgent;
    }

    @VisibleForTesting
    @NotNull
    public final String getUserAgentFromBrowser$mobilefuse_sdk_common_release() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return WebSettings.getDefaultUserAgent(AppLifecycleHelper.getGlobalContext());
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            Throwable th2 = (Throwable) new ErrorResult(th).getValue();
            return "";
        }
    }

    @VisibleForTesting
    @Nullable
    public final String getUserAgentFromPrefs$mobilefuse_sdk_common_release() {
        Either errorResult;
        Functions<SharedPreferences> functions;
        SharedPreferences invoke;
        String string;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object obj = null;
        try {
            functions = this.sharedPrefs;
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (functions == null || (invoke = functions.invoke()) == null || (string = invoke.getString(CACHE_USER_AGENT_VALUE_KEY, null)) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(string, "sharedPrefs.getString(CA…KEY, null) ?: return null");
        long j = invoke.getLong(CACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY, 0L);
        if (System.currentTimeMillis() - j > USER_AGENT_MAX_VALIDITY_TIME_MILLIS) {
            Debugging.logDebug$default(this, "(-) Cached user agent has expired with timestamp " + j + ", so it will not be used.", null, 2, null);
            return null;
        }
        int i = invoke.getInt(CACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY, 0);
        if (i != 0 && i == getAndroidApiVersion$mobilefuse_sdk_common_release()) {
            errorResult = new SuccessResult(string);
            if (errorResult instanceof ErrorResult) {
                Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            } else if (errorResult instanceof SuccessResult) {
                obj = ((SuccessResult) errorResult).getValue();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return (String) obj;
        }
        Debugging.logDebug$default(this, "(-) Cached user agent was stored for different Android API version, version " + i + ", so it will not be used.", null, 2, null);
        return null;
    }

    public final void requestUserAgent(@NotNull final Function1<? super String, Unit> completeAction) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.userAgentSource != Source.NONE) {
                completeAction.invoke(this.userAgent);
            } else {
                this.awaitingCompleteActions.add(completeAction);
                if (this.requestInProgress) {
                    Debugging.logDebug$default(this, "(+) User agent has been already requested but not completed yet. For this request a completion callback will be registered and called for prior request result.", null, 2, null);
                } else {
                    Debugging.logDebug$default(this, "(+) Request user agent", null, 2, null);
                    this.requestInProgress = true;
                    FlowKt.flow(new UserAgentInfo$$special$$inlined$catchElse$1(FlowKt.flow(new C23508x79a5e4c4(FlowKt.flow(new UserAgentInfo$runOn$$inlined$transformForConcurrency$1(FlowKt.flow(new UserAgentInfo$emitOn$$inlined$transformOnThread$1(FlowKt.flow(new C23507x79a5e4c3(this, completeAction)), Schedulers.IO)), Schedulers.MAIN)), this, completeAction)))).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$3
                        @Override // com.mobilefuse.sdk.p543rx.FlowCollector
                        public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                            UserAgentInfo.Source source;
                            Set<Function1> m17547e1;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof SuccessResult) {
                                Tuples tuples = (Tuples) ((SuccessResult) result).getValue();
                                String str = (String) tuples.m17632a();
                                UserAgentInfo.Source source2 = (UserAgentInfo.Source) tuples.m17631b();
                                UserAgentInfo userAgentInfo = UserAgentInfo.this;
                                if (str == null) {
                                    str = "";
                                }
                                userAgentInfo.userAgent = str;
                                UserAgentInfo.this.userAgentSource = source2;
                                UserAgentInfo userAgentInfo2 = UserAgentInfo.this;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("(+) User agent loaded from source: ");
                                source = UserAgentInfo.this.userAgentSource;
                                sb2.append(source);
                                sb2.append(" with value: ");
                                sb2.append(UserAgentInfo.this.getUserAgent());
                                Debugging.logDebug$default(userAgentInfo2, sb2.toString(), null, 2, null);
                                m17547e1 = _Collections.m17547e1(UserAgentInfo.this.getAwaitingCompleteActions$mobilefuse_sdk_common_release());
                                UserAgentInfo.this.getAwaitingCompleteActions$mobilefuse_sdk_common_release().clear();
                                UserAgentInfo.this.requestInProgress = false;
                                for (Function1 function1 : m17547e1) {
                                    function1.invoke(UserAgentInfo.this.getUserAgent());
                                }
                            }
                        }

                        @Override // com.mobilefuse.sdk.p543rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.p543rx.FlowCollector
                        public void emitSuccess(T t) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t);
                        }
                    });
                }
            }
            errorResult = new SuccessResult(Unit.f99208a);
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            completeAction.invoke(this.userAgent);
        } else if (errorResult instanceof SuccessResult) {
            ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @VisibleForTesting
    public final void storeUserAgentInPrefs$mobilefuse_sdk_common_release(@NotNull String userAgent) {
        SharedPreferences invoke;
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Functions<SharedPreferences> functions = this.sharedPrefs;
            if (functions != null && (invoke = functions.invoke()) != null) {
                Debugging.logDebug$default(this, "(+) Store user agent in cache: " + userAgent, null, 2, null);
                SharedPreferences.Editor edit = invoke.edit();
                edit.putString(CACHE_USER_AGENT_VALUE_KEY, userAgent);
                edit.putLong(CACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY, System.currentTimeMillis());
                edit.putInt(CACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY, getAndroidApiVersion$mobilefuse_sdk_common_release());
                edit.commit();
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    /* compiled from: UserAgentInfo.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        /* renamed from: getCACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY$mobilefuse_sdk_common_release$annotations */
        public static /* synthetic */ void m47796xdbdedc52() {
        }

        @VisibleForTesting
        /* renamed from: getCACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY$mobilefuse_sdk_common_release$annotations */
        public static /* synthetic */ void m47795xbe27de3e() {
        }

        @VisibleForTesting
        /* renamed from: getCACHE_USER_AGENT_VALUE_KEY$mobilefuse_sdk_common_release$annotations */
        public static /* synthetic */ void m47794xb11cf406() {
        }

        @VisibleForTesting
        /* renamed from: getUSER_AGENT_MAX_VALIDITY_TIME_MILLIS$mobilefuse_sdk_common_release$annotations */
        public static /* synthetic */ void m47793xc0dfdaee() {
        }
    }

    @VisibleForTesting
    /* renamed from: getAwaitingCompleteActions$mobilefuse_sdk_common_release$annotations */
    public static /* synthetic */ void m47797xbf1dcc52() {
    }
}
