package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.f */
/* loaded from: classes7.dex */
public abstract class AbstractC24347f {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.services.f$a */
    /* loaded from: classes7.dex */
    public static final class C24348a extends AbstractC24347f {
        @NotNull

        /* renamed from: a */
        public final String f63045a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24348a(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f63045a = id2;
        }

        @NotNull
        /* renamed from: a */
        public final String m46553a() {
            return this.f63045a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C24348a) && Intrinsics.m17075f(this.f63045a, ((C24348a) obj).f63045a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f63045a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Available(id=" + this.f63045a + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.services.f$b */
    /* loaded from: classes7.dex */
    public static final class C24349b extends AbstractC24347f {
        @NotNull

        /* renamed from: a */
        public static final C24349b f63046a = new C24349b();

        public C24349b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC24347f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC24347f() {
    }
}
