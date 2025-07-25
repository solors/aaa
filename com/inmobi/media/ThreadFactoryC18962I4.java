package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.I4 */
/* loaded from: classes6.dex */
public final class ThreadFactoryC18962I4 implements ThreadFactory {

    /* renamed from: a */
    public final boolean f47343a;

    /* renamed from: b */
    public final String f47344b;

    public ThreadFactoryC18962I4(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f47343a = z;
        this.f47344b = "TIM-" + name;
    }

    /* renamed from: a */
    public final boolean m61042a() {
        return this.f47343a;
    }

    @Override // java.util.concurrent.ThreadFactory
    @Nullable
    public Thread newThread(@NotNull Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        try {
            Thread thread = new Thread(r, this.f47344b);
            thread.setDaemon(this.f47343a);
            return thread;
        } catch (InternalError e) {
            e.toString();
            return null;
        }
    }

    public /* synthetic */ ThreadFactoryC18962I4(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadFactoryC18962I4(@NotNull String name) {
        this(name, false);
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
