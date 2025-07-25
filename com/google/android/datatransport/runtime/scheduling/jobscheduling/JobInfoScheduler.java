package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

@RequiresApi(api = 21)
/* loaded from: classes4.dex */
public class JobInfoScheduler implements WorkScheduler {

    /* renamed from: a */
    private final Context f31183a;

    /* renamed from: b */
    private final EventStore f31184b;

    /* renamed from: c */
    private final SchedulerConfig f31185c;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.f31183a = context;
        this.f31184b = eventStore;
        this.f31185c = schedulerConfig;
    }

    /* renamed from: b */
    private boolean m76274b(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                if (i3 < i2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: a */
    int m76275a(TransportContext transportContext) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f31183a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(transportContext.getPriority())).array());
        if (transportContext.getExtras() != null) {
            adler32.update(transportContext.getExtras());
        }
        return (int) adler32.getValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i) {
        schedule(transportContext, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f31183a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f31183a.getSystemService("jobscheduler");
        int m76275a = m76275a(transportContext);
        if (!z && m76274b(jobScheduler, m76275a, i)) {
            Logging.m76290d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.f31184b.getNextCallTime(transportContext);
        JobInfo.Builder configureJob = this.f31185c.configureJob(new JobInfo.Builder(m76275a, componentName), transportContext.getPriority(), nextCallTime, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", transportContext.getBackendName());
        persistableBundle.putInt("priority", PriorityMapping.toInt(transportContext.getPriority()));
        if (transportContext.getExtras() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        configureJob.setExtras(persistableBundle);
        Logging.m76288d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(m76275a), Long.valueOf(this.f31185c.getScheduleDelay(transportContext.getPriority(), nextCallTime, i)), Long.valueOf(nextCallTime), Integer.valueOf(i));
        jobScheduler.schedule(configureJob.build());
    }
}
