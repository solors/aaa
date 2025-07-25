package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public enum AppSetIdScope {
    UNKNOWN(""),
    APP("app"),
    DEVELOPER("developer");
    

    /* renamed from: a */
    private final String f92348a;

    AppSetIdScope(String str) {
        this.f92348a = str;
    }

    @NotNull
    public final String getValue() {
        return this.f92348a;
    }
}
