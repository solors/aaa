package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import ge.C33361p0;
import ge.InterfaceC33421z;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import me.C38289c;
import me.Mutex;
import org.jetbrains.annotations.NotNull;
import p850qd.C39385c;

/* compiled from: DownloadPriorityQueue.kt */
@Metadata
/* loaded from: classes7.dex */
public final class DownloadPriorityQueue {
    @NotNull
    private final Mutex mutex = C38289c.m15158a(false);
    @NotNull
    private final InterfaceC33421z<PriorityItem> nextTurn = C33361p0.m24033a(null);
    @NotNull
    private final PriorityQueue<PriorityItem> queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m12778d;
            m12778d = C39385c.m12778d(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t2).getPriority()));
            return m12778d;
        }
    });

    /* compiled from: DownloadPriorityQueue.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(int r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke(int, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }
}
