package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ld */
/* loaded from: classes6.dex */
public enum EnumC20260ld {
    SendEvent(0),
    NativeController(1);
    
    @NotNull

    /* renamed from: b */
    public static final C20261a f50992b = new C20261a(null);

    /* renamed from: a */
    private final int f50996a;

    @Metadata
    /* renamed from: com.ironsource.ld$a */
    /* loaded from: classes6.dex */
    public static final class C20261a {
        private C20261a() {
        }

        public /* synthetic */ C20261a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final EnumC20260ld m57491a(int i) {
            EnumC20260ld enumC20260ld;
            boolean z;
            EnumC20260ld[] values = EnumC20260ld.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC20260ld = values[i2];
                    if (enumC20260ld.m57492b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } else {
                    enumC20260ld = null;
                    break;
                }
            }
            if (enumC20260ld == null) {
                return EnumC20260ld.SendEvent;
            }
            return enumC20260ld;
        }
    }

    EnumC20260ld(int i) {
        this.f50996a = i;
    }

    /* renamed from: b */
    public final int m57492b() {
        return this.f50996a;
    }
}
