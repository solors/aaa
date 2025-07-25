package p1074zb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lc.AbstractC38150b;
import org.jetbrains.annotations.NotNull;

/* compiled from: utils.kt */
@Metadata
/* renamed from: zb.h */
/* loaded from: classes9.dex */
public final class C45253h extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45253h(@NotNull AbstractC38150b content) {
        super("Failed to write body: " + Reflection.m17042b(content.getClass()));
        Intrinsics.checkNotNullParameter(content, "content");
    }
}
