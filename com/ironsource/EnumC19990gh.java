package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.gh */
/* loaded from: classes6.dex */
public enum EnumC19990gh {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);
    
    @NotNull

    /* renamed from: b */
    public static final C19991a f50254b = new C19991a(null);

    /* renamed from: a */
    private final int f50259a;

    @Metadata
    /* renamed from: com.ironsource.gh$a */
    /* loaded from: classes6.dex */
    public static final class C19991a {
        private C19991a() {
        }

        public /* synthetic */ C19991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final EnumC19990gh m58356a(int i) {
            EnumC19990gh enumC19990gh;
            boolean z;
            EnumC19990gh[] values = EnumC19990gh.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC19990gh = values[i2];
                    if (enumC19990gh.f50259a == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } else {
                    enumC19990gh = null;
                    break;
                }
            }
            if (enumC19990gh == null) {
                return EnumC19990gh.NotSupported;
            }
            return enumC19990gh;
        }
    }

    EnumC19990gh(int i) {
        this.f50259a = i;
    }

    /* renamed from: b */
    public final int m58358b() {
        return this.f50259a;
    }

    /* renamed from: b */
    public final boolean m58357b(@NotNull EnumC19990gh instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.m58358b() == this.f50259a;
    }
}
