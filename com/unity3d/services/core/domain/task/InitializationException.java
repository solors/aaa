package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InitializationException.kt */
@Metadata
/* loaded from: classes7.dex */
public final class InitializationException extends Exception {
    @NotNull
    private final Configuration config;
    @NotNull
    private final ErrorState errorState;
    @NotNull
    private final Exception originalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(@NotNull ErrorState errorState, @NotNull Exception originalException, @NotNull Configuration config) {
        super(originalException);
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(originalException, "originalException");
        Intrinsics.checkNotNullParameter(config, "config");
        this.errorState = errorState;
        this.originalException = originalException;
        this.config = config;
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, ErrorState errorState, Exception exc, Configuration configuration, int i, Object obj) {
        if ((i & 1) != 0) {
            errorState = initializationException.errorState;
        }
        if ((i & 2) != 0) {
            exc = initializationException.originalException;
        }
        if ((i & 4) != 0) {
            configuration = initializationException.config;
        }
        return initializationException.copy(errorState, exc, configuration);
    }

    @NotNull
    public final ErrorState component1() {
        return this.errorState;
    }

    @NotNull
    public final Exception component2() {
        return this.originalException;
    }

    @NotNull
    public final Configuration component3() {
        return this.config;
    }

    @NotNull
    public final InitializationException copy(@NotNull ErrorState errorState, @NotNull Exception originalException, @NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(originalException, "originalException");
        Intrinsics.checkNotNullParameter(config, "config");
        return new InitializationException(errorState, originalException, config);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        if (this.errorState == initializationException.errorState && Intrinsics.m17075f(this.originalException, initializationException.originalException) && Intrinsics.m17075f(this.config, initializationException.config)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Configuration getConfig() {
        return this.config;
    }

    @NotNull
    public final ErrorState getErrorState() {
        return this.errorState;
    }

    @NotNull
    public final Exception getOriginalException() {
        return this.originalException;
    }

    public int hashCode() {
        return (((this.errorState.hashCode() * 31) + this.originalException.hashCode()) * 31) + this.config.hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "InitializationException(errorState=" + this.errorState + ", originalException=" + this.originalException + ", config=" + this.config + ')';
    }
}
