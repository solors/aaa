package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C33933H2;

/* loaded from: classes9.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(C33933H2.f92945g),
    VISIBLE("visible");
    

    /* renamed from: a */
    private final String f92373a;

    ApplicationState(String str) {
        this.f92373a = str;
    }

    @NonNull
    public static ApplicationState fromString(@Nullable String str) {
        ApplicationState[] values;
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f92373a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    @NonNull
    public String getStringValue() {
        return this.f92373a;
    }
}
