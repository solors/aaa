package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.exception.BaseError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClient.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class HttpError implements BaseError {

    /* compiled from: HttpClient.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class ConnectionError extends HttpError {
        @Nullable
        private final String message;
        private final int statusCode;

        public /* synthetic */ ConnectionError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ ConnectionError copy$default(ConnectionError connectionError, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = connectionError.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = connectionError.getMessage();
            }
            return connectionError.copy(i, str);
        }

        public final int component1() {
            return this.statusCode;
        }

        @Nullable
        public final String component2() {
            return getMessage();
        }

        @NotNull
        public final ConnectionError copy(int i, @Nullable String str) {
            return new ConnectionError(i, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (obj instanceof ConnectionError) {
                    ConnectionError connectionError = (ConnectionError) obj;
                    if (this.statusCode != connectionError.statusCode || !Intrinsics.m17075f(getMessage(), connectionError.getMessage())) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }

        @Override // com.mobilefuse.sdk.exception.BaseError
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            int i;
            int hashCode = Integer.hashCode(this.statusCode) * 31;
            String message = getMessage();
            if (message != null) {
                i = message.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }

        @NotNull
        public String toString() {
            return "ConnectionError(statusCode=" + this.statusCode + ", message=" + getMessage() + ")";
        }

        public ConnectionError(int i, @Nullable String str) {
            super(null);
            this.statusCode = i;
            this.message = str;
        }
    }

    /* compiled from: HttpClient.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class UnknownError extends HttpError {
        @Nullable
        private final String message;

        public UnknownError() {
            this(null, 1, null);
        }

        public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.getMessage();
            }
            return unknownError.copy(str);
        }

        @Nullable
        public final String component1() {
            return getMessage();
        }

        @NotNull
        public final UnknownError copy(@Nullable String str) {
            return new UnknownError(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (!(obj instanceof UnknownError) || !Intrinsics.m17075f(getMessage(), ((UnknownError) obj).getMessage())) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // com.mobilefuse.sdk.exception.BaseError
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String message = getMessage();
            if (message != null) {
                return message.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "UnknownError(message=" + getMessage() + ")";
        }

        public UnknownError(@Nullable String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ UnknownError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    private HttpError() {
    }

    public /* synthetic */ HttpError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
