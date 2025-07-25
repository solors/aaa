package com.chartboost.sdk.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;
import td.EnumEntries;

@Metadata
/* loaded from: classes3.dex */
public final class CacheError implements CBError {
    @NotNull
    private final Code code;
    @Nullable
    private final Exception exception;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Code {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Code[] $VALUES;
        private final int errorCode;
        public static final Code INTERNAL = new Code("INTERNAL", 0, 0);
        public static final Code INTERNET_UNAVAILABLE = new Code("INTERNET_UNAVAILABLE", 1, 1);
        public static final Code NETWORK_FAILURE = new Code("NETWORK_FAILURE", 2, 5);
        public static final Code NO_AD_FOUND = new Code("NO_AD_FOUND", 3, 6);
        public static final Code SESSION_NOT_STARTED = new Code("SESSION_NOT_STARTED", 4, 7);
        public static final Code SERVER_ERROR = new Code("SERVER_ERROR", 5, 8);
        public static final Code ASSET_DOWNLOAD_FAILURE = new Code("ASSET_DOWNLOAD_FAILURE", 6, 16);
        public static final Code BANNER_DISABLED = new Code("BANNER_DISABLED", 7, 36);
        public static final Code BANNER_VIEW_IS_DETACHED = new Code("BANNER_VIEW_IS_DETACHED", 8, 37);

        private static final /* synthetic */ Code[] $values() {
            return new Code[]{INTERNAL, INTERNET_UNAVAILABLE, NETWORK_FAILURE, NO_AD_FOUND, SESSION_NOT_STARTED, SERVER_ERROR, ASSET_DOWNLOAD_FAILURE, BANNER_DISABLED, BANNER_VIEW_IS_DETACHED};
        }

        static {
            Code[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C44401b.m3113a($values);
        }

        private Code(String str, int i, int i2) {
            this.errorCode = i2;
        }

        @NotNull
        public static EnumEntries<Code> getEntries() {
            return $ENTRIES;
        }

        public static Code valueOf(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        public static Code[] values() {
            return (Code[]) $VALUES.clone();
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public CacheError(@NotNull Code code, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.exception = exc;
    }

    @NotNull
    public final Code getCode() {
        return this.code;
    }

    @Override // com.chartboost.sdk.events.CBError
    @Nullable
    public Exception getException() {
        return this.exception;
    }

    @NotNull
    public String toString() {
        String name = this.code.name();
        Exception exception = getException();
        return "Chartboost CacheError: " + name + " with exception " + exception;
    }

    public /* synthetic */ CacheError(Code code, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
