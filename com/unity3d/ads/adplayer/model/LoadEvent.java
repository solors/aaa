package com.unity3d.ads.adplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoadEvent.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class LoadEvent {

    /* compiled from: LoadEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Completed extends LoadEvent {
        @NotNull
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    /* compiled from: LoadEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Error extends LoadEvent {
        private final int errorCode;
        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String message, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.errorCode = i;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            return error.copy(str, i);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        @NotNull
        public final Error copy(@NotNull String message, int i) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(message, i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (Intrinsics.m17075f(this.message, error.message) && this.errorCode == error.errorCode) {
                return true;
            }
            return false;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + Integer.hashCode(this.errorCode);
        }

        @NotNull
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ')';
        }
    }

    private LoadEvent() {
    }

    public /* synthetic */ LoadEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
