package p1013v9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: v9.d */
/* loaded from: classes8.dex */
public final class ValidatorItemData {
    @NotNull

    /* renamed from: a */
    private final BaseValidator f116890a;
    @NotNull

    /* renamed from: b */
    private final String f116891b;
    @NotNull

    /* renamed from: c */
    private final String f116892c;

    public ValidatorItemData(@NotNull BaseValidator validator, @NotNull String variableName, @NotNull String labelId) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        this.f116890a = validator;
        this.f116891b = variableName;
        this.f116892c = labelId;
    }

    @NotNull
    /* renamed from: a */
    public final String m2658a() {
        return this.f116892c;
    }

    @NotNull
    /* renamed from: b */
    public final BaseValidator m2657b() {
        return this.f116890a;
    }

    @NotNull
    /* renamed from: c */
    public final String m2656c() {
        return this.f116891b;
    }
}
