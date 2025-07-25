package me;

import ie.Symbol;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Mutex.kt */
@Metadata
/* renamed from: me.c */
/* loaded from: classes8.dex */
public final class C38289c {
    @NotNull

    /* renamed from: a */
    private static final Symbol f101182a = new Symbol("NO_OWNER");
    @NotNull

    /* renamed from: b */
    private static final Symbol f101183b = new Symbol("ALREADY_LOCKED_BY_OWNER");

    @NotNull
    /* renamed from: a */
    public static final Mutex m15158a(boolean z) {
        return new C38283b(z);
    }

    /* renamed from: b */
    public static /* synthetic */ Mutex m15157b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m15158a(z);
    }
}
