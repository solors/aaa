package com.facebook.internal;

import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.facebook.internal.GamingAction */
/* loaded from: classes4.dex */
public enum FacebookGamingAction {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");
    
    @NotNull
    private final String rawValue;

    FacebookGamingAction(String str) {
        this.rawValue = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FacebookGamingAction[] valuesCustom() {
        FacebookGamingAction[] valuesCustom = values();
        return (FacebookGamingAction[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
