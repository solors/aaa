package com.google.android.exoplayer2.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class PlatformScheduler implements Scheduler {

    /* renamed from: d */
    private static final int f34108d;

    /* renamed from: a */
    private final int f34109a;

    /* renamed from: b */
    private final ComponentName f34110b;

    /* renamed from: c */
    private final JobScheduler f34111c;

    /* loaded from: classes4.dex */
    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int notMetRequirements = new Requirements(extras.getInt("requirements")).getNotMetRequirements(this);
            if (notMetRequirements == 0) {
                Util.startForegroundService(this, new Intent((String) Assertions.checkNotNull(extras.getString("service_action"))).setPackage((String) Assertions.checkNotNull(extras.getString("service_package"))));
                return false;
            }
            Log.m72602w("PlatformScheduler", "Requirements not met: " + notMetRequirements);
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        int i;
        if (Util.SDK_INT >= 26) {
            i = 16;
        } else {
            i = 0;
        }
        f34108d = i | 15;
    }

    @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
    public PlatformScheduler(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f34109a = i;
        this.f34110b = new ComponentName(applicationContext, PlatformSchedulerService.class);
        this.f34111c = (JobScheduler) Assertions.checkNotNull((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    /* renamed from: a */
    private static JobInfo m73928a(int i, ComponentName componentName, Requirements requirements, String str, String str2) {
        Requirements filterRequirements = requirements.filterRequirements(f34108d);
        if (!filterRequirements.equals(requirements)) {
            Log.m72602w("PlatformScheduler", "Ignoring unsupported requirements: " + (filterRequirements.getRequirements() ^ requirements.getRequirements()));
        }
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        if (requirements.isUnmeteredNetworkRequired()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.isNetworkRequired()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.isIdleRequired());
        builder.setRequiresCharging(requirements.isChargingRequired());
        if (Util.SDK_INT >= 26 && requirements.isStorageNotLowRequired()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", str);
        persistableBundle.putString("service_package", str2);
        persistableBundle.putInt("requirements", requirements.getRequirements());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean cancel() {
        this.f34111c.cancel(this.f34109a);
        return true;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public Requirements getSupportedRequirements(Requirements requirements) {
        return requirements.filterRequirements(f34108d);
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean schedule(Requirements requirements, String str, String str2) {
        if (this.f34111c.schedule(m73928a(this.f34109a, this.f34110b, requirements, str2, str)) == 1) {
            return true;
        }
        return false;
    }
}
