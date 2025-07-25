package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;

/* loaded from: classes4.dex */
public class AlarmManagerScheduler implements WorkScheduler {

    /* renamed from: a */
    private final Context f31170a;

    /* renamed from: b */
    private final EventStore f31171b;

    /* renamed from: c */
    private AlarmManager f31172c;

    /* renamed from: d */
    private final SchedulerConfig f31173d;

    /* renamed from: e */
    private final Clock f31174e;

    public AlarmManagerScheduler(Context context, EventStore eventStore, Clock clock, SchedulerConfig schedulerConfig) {
        this(context, eventStore, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), clock, schedulerConfig);
    }

    @VisibleForTesting
    /* renamed from: a */
    boolean m76278a(Intent intent) {
        if (PendingIntent.getBroadcast(this.f31170a, 0, intent, 603979776) == null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i) {
        schedule(transportContext, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", transportContext.getBackendName());
        builder.appendQueryParameter("priority", String.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        if (transportContext.getExtras() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        Intent intent = new Intent(this.f31170a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && m76278a(intent)) {
            Logging.m76290d("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.f31171b.getNextCallTime(transportContext);
        long scheduleDelay = this.f31173d.getScheduleDelay(transportContext.getPriority(), nextCallTime, i);
        Logging.m76288d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(scheduleDelay), Long.valueOf(nextCallTime), Integer.valueOf(i));
        this.f31172c.set(3, this.f31174e.getTime() + scheduleDelay, PendingIntent.getBroadcast(this.f31170a, 0, intent, 67108864));
    }

    @VisibleForTesting
    AlarmManagerScheduler(Context context, EventStore eventStore, AlarmManager alarmManager, Clock clock, SchedulerConfig schedulerConfig) {
        this.f31170a = context;
        this.f31171b = eventStore;
        this.f31172c = alarmManager;
        this.f31174e = clock;
        this.f31173d = schedulerConfig;
    }
}
