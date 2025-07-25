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
public final class ClickError implements CBError {
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
        public static final Code INTERNAL = new Code("INTERNAL", 0, 0);
        public static final Code URI_INVALID = new Code("URI_INVALID", 1, 1);
        public static final Code URI_UNRECOGNIZED = new Code("URI_UNRECOGNIZED", 2, 2);
        private final int errorCode;

        private static final /* synthetic */ Code[] $values() {
            return new Code[]{INTERNAL, URI_INVALID, URI_UNRECOGNIZED};
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

    public ClickError(@NotNull Code code, @Nullable Exception exc) {
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
        return "Chartboost ClickError: " + name + " with exception " + exception;
    }

    public /* synthetic */ ClickError(Code code, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
