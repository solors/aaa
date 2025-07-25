package com.facebook.login;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CodeChallengeMethod.kt */
@Metadata
/* loaded from: classes4.dex */
public enum CodeChallengeMethod {
    S256("S256"),
    PLAIN("plain");

    CodeChallengeMethod(String str) {
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CodeChallengeMethod[] valuesCustom() {
        CodeChallengeMethod[] valuesCustom = values();
        return (CodeChallengeMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* synthetic */ CodeChallengeMethod(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "S256" : str);
    }
}
