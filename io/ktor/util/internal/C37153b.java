package io.ktor.util.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LockFreeLinkedList.kt */
@Metadata
/* renamed from: io.ktor.util.internal.b */
/* loaded from: classes9.dex */
public final class C37153b {
    @NotNull

    /* renamed from: a */
    private static final Object f98014a = new C37157f("CONDITION_FALSE");
    @NotNull

    /* renamed from: b */
    private static final Object f98015b = new C37157f("ALREADY_REMOVED");
    @NotNull

    /* renamed from: c */
    private static final Object f98016c = new C37157f("LIST_EMPTY");
    @NotNull

    /* renamed from: d */
    private static final Object f98017d = new C37157f("REMOVE_PREPARED");
    @NotNull

    /* renamed from: e */
    private static final Object f98018e = new C37157f("NO_DECISION");

    @NotNull
    /* renamed from: a */
    public static final C37154c m18968a(@NotNull Object obj) {
        C37156e c37156e;
        C37154c c37154c;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (obj instanceof C37156e) {
            c37156e = (C37156e) obj;
        } else {
            c37156e = null;
        }
        if (c37156e == null || (c37154c = c37156e.f98022a) == null) {
            return (C37154c) obj;
        }
        return c37154c;
    }
}
