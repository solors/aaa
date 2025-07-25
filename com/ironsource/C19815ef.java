package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ef */
/* loaded from: classes6.dex */
public final class C19815ef extends Throwable {
    @NotNull

    /* renamed from: a */
    private final IronSourceError f49878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19815ef(@NotNull IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f49878a = error;
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m58811a() {
        return this.f49878a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(C19815ef.class, obj.getClass())) {
            return false;
        }
        C19815ef c19815ef = (C19815ef) obj;
        if (this.f49878a.getErrorCode() != c19815ef.f49878a.getErrorCode()) {
            return false;
        }
        return Intrinsics.m17075f(this.f49878a.getErrorMessage(), c19815ef.f49878a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f49878a.getErrorCode()), this.f49878a.getErrorMessage());
    }
}
