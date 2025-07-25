package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.cl */
/* loaded from: classes6.dex */
public final class C19716cl extends AbstractC21231xn {
    @NotNull

    /* renamed from: d */
    public static final C19717a f49467d = new C19717a(null);
    @NotNull

    /* renamed from: e */
    private static final String f49468e = "ManualTrigger";

    @Metadata
    /* renamed from: com.ironsource.cl$a */
    /* loaded from: classes6.dex */
    public static final class C19717a {
        private C19717a() {
        }

        public /* synthetic */ C19717a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C19716cl() {
        this(false, 1, null);
    }

    @Override // com.ironsource.AbstractC21231xn
    @NotNull
    /* renamed from: b */
    public String mo54110b() {
        return f49468e;
    }

    /* renamed from: e */
    public final void m59090e() {
        m54111a(true);
    }

    /* renamed from: f */
    public final void m59089f() {
        m54111a(false);
    }

    public C19716cl(boolean z) {
        super(z);
    }

    public /* synthetic */ C19716cl(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
