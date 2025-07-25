package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public class UncheckedTimeoutException extends RuntimeException {
    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(String str) {
        super(str);
    }

    public UncheckedTimeoutException(Throwable th) {
        super(th);
    }

    public UncheckedTimeoutException(String str, Throwable th) {
        super(str, th);
    }
}
