package com.yandex.div.core.view2;

import androidx.annotation.AnyThread;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.DivSightAction;

@AnyThread
@Metadata
/* renamed from: com.yandex.div.core.view2.n0 */
/* loaded from: classes8.dex */
public final class DivVisibilityTokenHolder {
    @NotNull

    /* renamed from: a */
    private final ConcurrentLinkedQueue<Map<CompositeLogId, DivSightAction>> f75865a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public final boolean m36731a(@NotNull Map<CompositeLogId, DivSightAction> logIds) {
        Intrinsics.checkNotNullParameter(logIds, "logIds");
        return this.f75865a.add(logIds);
    }

    @Nullable
    /* renamed from: b */
    public final CompositeLogId m36730b(@NotNull CompositeLogId logId) {
        Object obj;
        Set keySet;
        Intrinsics.checkNotNullParameter(logId, "logId");
        Iterator<T> it = this.f75865a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Map) obj).containsKey(logId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map map = (Map) obj;
        if (map == null || (keySet = map.keySet()) == null) {
            return null;
        }
        CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) keySet.toArray(new CompositeLogId[0]);
        if (compositeLogIdArr == null) {
            return null;
        }
        for (CompositeLogId compositeLogId : compositeLogIdArr) {
            if (Intrinsics.m17075f(compositeLogId, logId)) {
                return compositeLogId;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m36729c(@NotNull CompositeLogId logId, @NotNull Function1<? super Map<CompositeLogId, ? extends DivSightAction>, Unit> emptyTokenCallback) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(emptyTokenCallback, "emptyTokenCallback");
        Iterator<T> it = this.f75865a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Map) obj).remove(logId) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map map = (Map) obj;
        if (map != null && map.isEmpty()) {
            emptyTokenCallback.invoke(map);
            this.f75865a.remove(map);
        }
    }
}
