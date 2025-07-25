package com.applovin.impl.sdk;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");

    /* renamed from: a */
    private final int f9735a;

    /* renamed from: b */
    private final String f9736b;

    public AppLovinError(int i, @Nullable String str) {
        this.f9735a = i;
        this.f9736b = str;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        if (message != null ? message.equals(message2) : message2 == null) {
            return true;
        }
        return false;
    }

    public int getCode() {
        return this.f9735a;
    }

    @Nullable
    public String getMessage() {
        return this.f9736b;
    }

    public int hashCode() {
        int hashCode;
        String message = getMessage();
        int code = (getCode() + 59) * 59;
        if (message == null) {
            hashCode = 43;
        } else {
            hashCode = message.hashCode();
        }
        return code + hashCode;
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
