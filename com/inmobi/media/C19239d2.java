package com.inmobi.media;

import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.d2 */
/* loaded from: classes6.dex */
public final class C19239d2 extends FutureTask implements Comparable {

    /* renamed from: a */
    public volatile EnumC19414p9 f48157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19239d2(Runnable runnable, EnumC19414p9 priority) {
        super(runnable, null);
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f48157a = priority;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C19239d2 other = (C19239d2) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.m17071j(this.f48157a.f48583a, other.f48157a.f48583a);
    }
}
