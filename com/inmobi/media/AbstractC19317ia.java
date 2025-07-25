package com.inmobi.media;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.inmobi.media.ia */
/* loaded from: classes6.dex */
public abstract class AbstractC19317ia {

    /* renamed from: a */
    public static final Set f48368a;

    static {
        Intrinsics.checkNotNullExpressionValue(AbstractC19317ia.class.getSimpleName(), "getSimpleName(...)");
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(...)");
        f48368a = newSetFromMap;
    }

    /* renamed from: a */
    public static void m60221a(C19289ga c19289ga, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        int ordinal = c19289ga.f48267f.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) AbstractC18933G3.f47259b.getValue();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) AbstractC18933G3.f47260c.getValue();
        }
        scheduledThreadPoolExecutor.schedule(new RunnableC19331ja(c19289ga, C19303ha.f48304a), j, TimeUnit.MILLISECONDS);
    }
}
