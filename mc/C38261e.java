package mc;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Attributes.kt */
@Metadata
/* renamed from: mc.e */
/* loaded from: classes9.dex */
public final class C38261e {
    /* renamed from: a */
    public static final void m15248a(@NotNull InterfaceC38258b interfaceC38258b, @NotNull InterfaceC38258b other) {
        Intrinsics.checkNotNullParameter(interfaceC38258b, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<T> it = other.mo15255a().iterator();
        while (it.hasNext()) {
            Attributes attributes = (Attributes) it.next();
            Intrinsics.m17073h(attributes, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            interfaceC38258b.mo15251f(attributes, other.mo15252e(attributes));
        }
    }
}
