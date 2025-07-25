package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShowEvent.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class ShowEvent {

    /* compiled from: ShowEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class CancelTimeout extends ShowEvent {
        @NotNull
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    /* compiled from: ShowEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Clicked extends ShowEvent {
        @NotNull
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    /* compiled from: ShowEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Completed extends ShowEvent {
        @NotNull
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(@NotNull ShowStatus status) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                showStatus = completed.status;
            }
            return completed.copy(showStatus);
        }

        @NotNull
        public final ShowStatus component1() {
            return this.status;
        }

        @NotNull
        public final Completed copy(@NotNull ShowStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new Completed(status);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Completed) && this.status == ((Completed) obj).status) {
                return true;
            }
            return false;
        }

        @NotNull
        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return "Completed(status=" + this.status + ')';
        }
    }

    /* compiled from: ShowEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Error extends ShowEvent {
        private final int errorCode;
        @NotNull
        private final String message;
        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String message, int i, @NotNull String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.message = message;
            this.errorCode = i;
            this.reason = reason;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            if ((i2 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i, str2);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        @NotNull
        public final String component3() {
            return this.reason;
        }

        @NotNull
        public final Error copy(@NotNull String message, int i, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Error(message, i, reason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (Intrinsics.m17075f(this.message, error.message) && this.errorCode == error.errorCode && Intrinsics.m17075f(this.reason, error.reason)) {
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

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + Integer.hashCode(this.errorCode)) * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    /* compiled from: ShowEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class LeftApplication extends ShowEvent {
        @NotNull
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    /* compiled from: ShowEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Started extends ShowEvent {
        @NotNull
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    private ShowEvent() {
    }

    public /* synthetic */ ShowEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
