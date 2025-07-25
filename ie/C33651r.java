package ie;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LockFreeLinkedList.kt */
@Metadata
/* renamed from: ie.r */
/* loaded from: classes8.dex */
public final class C33651r {
    @NotNull

    /* renamed from: a */
    private static final Object f92128a = new Symbol("CONDITION_FALSE");

    @NotNull
    /* renamed from: a */
    public static final Object m22917a() {
        return f92128a;
    }

    @NotNull
    /* renamed from: b */
    public static final C33653s m22916b(@NotNull Object obj) {
        LockFreeLinkedList lockFreeLinkedList;
        C33653s c33653s;
        if (obj instanceof LockFreeLinkedList) {
            lockFreeLinkedList = (LockFreeLinkedList) obj;
        } else {
            lockFreeLinkedList = null;
        }
        if (lockFreeLinkedList == null || (c33653s = lockFreeLinkedList.f92082a) == null) {
            Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (C33653s) obj;
        }
        return c33653s;
    }
}
