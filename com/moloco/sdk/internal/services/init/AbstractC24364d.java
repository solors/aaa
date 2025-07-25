package com.moloco.sdk.internal.services.init;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.init.d */
/* loaded from: classes7.dex */
public abstract class AbstractC24364d {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.services.init.d$a */
    /* loaded from: classes7.dex */
    public static final class C24365a extends AbstractC24364d {
        @NotNull

        /* renamed from: a */
        public final EnumC24358a f63087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24365a(@NotNull EnumC24358a type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.f63087a = type;
        }

        @NotNull
        /* renamed from: a */
        public final EnumC24358a m46533a() {
            return this.f63087a;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.services.init.d$b */
    /* loaded from: classes7.dex */
    public static final class C24366b extends AbstractC24364d {

        /* renamed from: a */
        public final int f63088a;

        public C24366b(int i) {
            super(null);
            this.f63088a = i;
        }

        /* renamed from: a */
        public final int m46532a() {
            return this.f63088a;
        }
    }

    public /* synthetic */ AbstractC24364d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC24364d() {
    }
}
