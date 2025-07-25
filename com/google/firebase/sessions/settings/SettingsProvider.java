package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SettingsProvider.kt */
@Metadata
/* loaded from: classes4.dex */
public interface SettingsProvider {

    /* compiled from: SettingsProvider.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static boolean isSettingsStale(@NotNull SettingsProvider settingsProvider) {
            return false;
        }

        @Nullable
        public static Object updateSettings(@NotNull SettingsProvider settingsProvider, @NotNull Continuation<? super Unit> continuation) {
            return Unit.f99208a;
        }
    }

    @Nullable
    Double getSamplingRate();

    @Nullable
    Boolean getSessionEnabled();

    @Nullable
    /* renamed from: getSessionRestartTimeout-FghU774 */
    Duration mo110201getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    @Nullable
    Object updateSettings(@NotNull Continuation<? super Unit> continuation);
}
