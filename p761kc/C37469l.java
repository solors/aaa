package p761kc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C38277v;
import org.jetbrains.annotations.NotNull;

/* compiled from: Headers.kt */
@Metadata
/* renamed from: kc.l */
/* loaded from: classes9.dex */
public final class C37469l extends C38277v {
    public C37469l() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mc.C38277v
    /* renamed from: k */
    public void mo15199k(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        super.mo15199k(name);
        C37477o.f98953a.m17909a(name);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mc.C38277v
    /* renamed from: l */
    public void mo15198l(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.mo15198l(value);
        C37477o.f98953a.m17908b(value);
    }

    @NotNull
    /* renamed from: m */
    public InterfaceC37464k m17940m() {
        return new C37471m(m15202h());
    }

    public C37469l(int i) {
        super(true, i);
    }

    public /* synthetic */ C37469l(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
