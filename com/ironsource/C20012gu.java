package com.ironsource;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.gu */
/* loaded from: classes6.dex */
public final class C20012gu extends AbstractC21231xn {
    @NotNull

    /* renamed from: f */
    public static final C20013a f50313f = new C20013a(null);
    @NotNull

    /* renamed from: g */
    private static final String f50314g = "ViewVisibilityTrigger";
    @NotNull

    /* renamed from: d */
    private final C20014b f50315d;
    @NotNull

    /* renamed from: e */
    private final C20117iu f50316e;

    @Metadata
    /* renamed from: com.ironsource.gu$a */
    /* loaded from: classes6.dex */
    public static final class C20013a {
        private C20013a() {
        }

        public /* synthetic */ C20013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.gu$b */
    /* loaded from: classes6.dex */
    public static final class C20014b implements InterfaceC20160jn {
        C20014b() {
        }

        @Override // com.ironsource.InterfaceC20160jn
        /* renamed from: a */
        public void mo57799a(boolean z) {
            C20012gu.this.m54111a(!z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20012gu(@NotNull View view) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(view, "view");
        C20014b c20014b = new C20014b();
        this.f50315d = c20014b;
        C20117iu c20117iu = new C20117iu(c20014b);
        this.f50316e = c20117iu;
        c20117iu.m57936a(view);
        m54111a(!c20117iu.m57931c());
    }

    @Override // com.ironsource.AbstractC21231xn
    @NotNull
    /* renamed from: b */
    public String mo54110b() {
        return f50314g;
    }

    /* renamed from: e */
    public final void m58321e() {
        this.f50316e.m57933b();
    }
}
