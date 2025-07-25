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
public final class ShowError implements CBError {
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
        public static final Code SESSION_NOT_STARTED = new Code("SESSION_NOT_STARTED", 1, 7);
        public static final Code AD_ALREADY_VISIBLE = new Code("AD_ALREADY_VISIBLE", 2, 8);
        public static final Code INTERNET_UNAVAILABLE = new Code("INTERNET_UNAVAILABLE", 3, 25);
        public static final Code PRESENTATION_FAILURE = new Code("PRESENTATION_FAILURE", 4, 33);
        public static final Code NO_CACHED_AD = new Code("NO_CACHED_AD", 5, 34);
        public static final Code BANNER_DISABLED = new Code("BANNER_DISABLED", 6, 36);
        public static final Code BANNER_VIEW_IS_DETACHED = new Code("BANNER_VIEW_IS_DETACHED", 7, 37);

        private static final /* synthetic */ Code[] $values() {
            return new Code[]{INTERNAL, SESSION_NOT_STARTED, AD_ALREADY_VISIBLE, INTERNET_UNAVAILABLE, PRESENTATION_FAILURE, NO_CACHED_AD, BANNER_DISABLED, BANNER_VIEW_IS_DETACHED};
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

    public ShowError(@NotNull Code code, @Nullable Exception exc) {
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
        return "Chartboost ShowError: " + name + " with exception " + exception;
    }

    public /* synthetic */ ShowError(Code code, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
