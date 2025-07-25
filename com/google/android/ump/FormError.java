package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes5.dex */
public class FormError {

    /* renamed from: a */
    private final int f39291a;

    /* renamed from: b */
    private final String f39292b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i, @RecentlyNonNull String str) {
        this.f39291a = i;
        this.f39292b = str;
    }

    public int getErrorCode() {
        return this.f39291a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f39292b;
    }
}
