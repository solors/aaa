package com.smaato.sdk.richmedia.mraid.exception;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MraidException extends Exception {
    public MraidException(@NonNull String str) {
        super(str);
    }

    public MraidException(@NonNull String str, @NonNull Throwable th) {
        super(str, th);
    }
}
