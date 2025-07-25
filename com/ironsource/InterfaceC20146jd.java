package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.jd */
/* loaded from: classes6.dex */
public interface InterfaceC20146jd {

    @Metadata
    /* renamed from: com.ironsource.jd$a */
    /* loaded from: classes6.dex */
    public static final class C20147a implements InterfaceC20146jd {
        @NotNull

        /* renamed from: a */
        private final EnumC20260ld f50707a;

        public C20147a(@NotNull EnumC20260ld strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.f50707a = strategy;
        }

        @Override // com.ironsource.InterfaceC20146jd
        @NotNull
        /* renamed from: a */
        public String mo57850a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.InterfaceC20146jd
        @NotNull
        /* renamed from: b */
        public EnumC20260ld mo57849b() {
            return this.f50707a;
        }

        @NotNull
        /* renamed from: c */
        public final EnumC20260ld m57848c() {
            return this.f50707a;
        }
    }

    @NotNull
    /* renamed from: a */
    String mo57850a();

    @NotNull
    /* renamed from: b */
    EnumC20260ld mo57849b();
}
