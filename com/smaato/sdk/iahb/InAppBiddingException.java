package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class InAppBiddingException extends Exception {
    @NonNull
    private final InApBiddingError reason;

    /* loaded from: classes7.dex */
    public enum InApBiddingError {
        NOT_INITIALISED("The module is not initialised. Forgot to call SmaatoSdk.init()?"),
        INVALID_JSON("An invalid JSON was provided inside of InAppBid object."),
        INTERNAL_ERROR("An internal error happened.");
        
        @NonNull
        private final String description;

        InApBiddingError(@NonNull String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "InApBiddingError{description='" + this.description + "'}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InAppBiddingException(@NonNull InApBiddingError inApBiddingError) {
        super(inApBiddingError.description);
        this.reason = inApBiddingError;
    }

    @NonNull
    public InApBiddingError getReason() {
        return this.reason;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InAppBiddingException(@NonNull InApBiddingError inApBiddingError, @NonNull Throwable th) {
        super(th);
        this.reason = inApBiddingError;
    }
}
