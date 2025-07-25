package androidx.compose.p015ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$Role$1 */
/* loaded from: classes.dex */
final class SemanticsProperties$Role$1 extends Lambda implements Function2<Role, Role, Role> {
    public static final SemanticsProperties$Role$1 INSTANCE = new SemanticsProperties$Role$1();

    SemanticsProperties$Role$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Role mo105910invoke(Role role, Role role2) {
        return m109290invokeqtAw6s(role, role2.m109279unboximpl());
    }

    @Nullable
    /* renamed from: invoke-qtA-w6s  reason: not valid java name */
    public final Role m109290invokeqtAw6s(@Nullable Role role, int i) {
        return role;
    }
}
