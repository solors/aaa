package com.mbridge.msdk.tracker;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.mbridge.msdk.tracker.g */
/* loaded from: classes6.dex */
public final class EventProcessor implements IEventProcessor {

    /* renamed from: a */
    private final DatabaseManager f59667a;

    /* renamed from: b */
    private final ReportManager f59668b;

    /* renamed from: c */
    private final ExecutorManager f59669c;

    /* renamed from: d */
    private final AtomicLong f59670d = new AtomicLong(0);

    /* renamed from: e */
    private final long[] f59671e = new long[2];

    /* renamed from: f */
    private volatile EventTable f59672f;

    public EventProcessor(DatabaseManager databaseManager, ReportManager reportManager, ExecutorManager executorManager) {
        this.f59667a = databaseManager;
        this.f59668b = reportManager;
        this.f59669c = executorManager;
    }

    @Override // com.mbridge.msdk.tracker.IEventProcessor
    /* renamed from: b */
    public final void mo49358b(final C22885e c22885e) {
        this.f59669c.m49566b(new Runnable() { // from class: com.mbridge.msdk.tracker.g.1
            /* renamed from: a */
            private void m49581a(EventTable eventTable, int i) {
                while (i > 0) {
                    if (EventProcessor.this.f59667a.m49616a(eventTable) > 0) {
                        EventProcessor.this.f59668b.m49349c();
                        EventProcessor.this.f59668b.m49347d();
                        EventProcessor.this.f59668b.m49356a(c22885e);
                        return;
                    }
                    i--;
                }
                EventProcessor.this.f59672f = eventTable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EventTable eventTable = new EventTable(c22885e);
                eventTable.m49578a(1);
                eventTable.m49574b(0);
                eventTable.m49577a(System.currentTimeMillis() + c22885e.m49590h());
                if (EventProcessor.this.f59672f != null) {
                    m49581a(EventProcessor.this.f59672f, 5);
                    EventProcessor.this.f59672f = null;
                }
                m49581a(eventTable, 5);
            }
        });
    }

    @Override // com.mbridge.msdk.tracker.IEventProcessor
    /* renamed from: a */
    public final void mo49359a(C22885e c22885e) {
        long incrementAndGet = this.f59670d.incrementAndGet();
        this.f59671e[0] = System.currentTimeMillis();
        this.f59671e[1] = incrementAndGet;
    }

    @Override // com.mbridge.msdk.tracker.IEventProcessor
    /* renamed from: a */
    public final long[] mo49360a() {
        long[] jArr = this.f59671e;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
