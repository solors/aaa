package com.facebook.gamingservices.internal;

import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TournamentSortOrder.kt */
@Metadata
/* loaded from: classes3.dex */
public enum TournamentSortOrder {
    LowerIsBetter("LOWER_IS_BETTER"),
    HigherIsBetter("HIGHER_IS_BETTER");
    
    @NotNull
    private final String rawValue;

    TournamentSortOrder(String str) {
        this.rawValue = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TournamentSortOrder[] valuesCustom() {
        TournamentSortOrder[] valuesCustom = values();
        return (TournamentSortOrder[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.rawValue;
    }
}
