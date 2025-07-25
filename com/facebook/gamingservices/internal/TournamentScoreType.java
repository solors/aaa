package com.facebook.gamingservices.internal;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: TournamentScoreType.kt */
@Metadata
/* loaded from: classes3.dex */
public enum TournamentScoreType {
    NUMERIC,
    TIME;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TournamentScoreType[] valuesCustom() {
        TournamentScoreType[] valuesCustom = values();
        return (TournamentScoreType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
