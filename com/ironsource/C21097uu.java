package com.ironsource;

import com.ironsource.AbstractC20186k7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.uu */
/* loaded from: classes6.dex */
public final class C21097uu<Smash extends AbstractC20186k7<?>> {
    @NotNull

    /* renamed from: a */
    private final AbstractC21152vu<Smash> f53821a;

    public C21097uu(@NotNull AbstractC21152vu<Smash> smashPicker) {
        Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.f53821a = smashPicker;
    }

    @NotNull
    /* renamed from: a */
    public final List<Smash> m54552a() {
        return this.f53821a.m54385c();
    }

    /* renamed from: b */
    public final boolean m54551b() {
        if (this.f53821a.m54385c().isEmpty() && this.f53821a.m54389a().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m54550c() {
        if (this.f53821a.m54384d() == 0) {
            return true;
        }
        return false;
    }
}
