package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.f0 */
/* loaded from: classes7.dex */
public abstract class AbstractC24350f0 {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.services.f0$a */
    /* loaded from: classes7.dex */
    public static final class C24351a extends AbstractC24350f0 {
        @NotNull

        /* renamed from: a */
        public final String f63047a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24351a(@NotNull String carrier) {
            super(null);
            Intrinsics.checkNotNullParameter(carrier, "carrier");
            this.f63047a = carrier;
        }

        @NotNull
        /* renamed from: a */
        public final String m46552a() {
            return this.f63047a;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.services.f0$b */
    /* loaded from: classes7.dex */
    public static final class C24352b extends AbstractC24350f0 {
        @NotNull

        /* renamed from: a */
        public static final C24352b f63048a = new C24352b();

        public C24352b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.services.f0$c */
    /* loaded from: classes7.dex */
    public static final class C24353c extends AbstractC24350f0 {
        @NotNull

        /* renamed from: a */
        public static final C24353c f63049a = new C24353c();

        public C24353c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC24350f0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC24350f0() {
    }
}
