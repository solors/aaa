package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SystemJobService extends JobService implements ExecutionListener {
    private static final String TAG = Logger.tagWithPrefix("SystemJobService");
    private final Map<WorkGenerationalId, JobParameters> mJobParameters = new HashMap();
    private final StartStopTokens mStartStopTokens = new StartStopTokens();
    private WorkManagerImpl mWorkManagerImpl;

    @RequiresApi(24)
    /* loaded from: classes2.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static String[] getTriggeredContentAuthorities(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        @DoNotInline
        static Uri[] getTriggeredContentUris(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    @RequiresApi(28)
    /* loaded from: classes2.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Network getNetwork(JobParameters jobParameters) {
            Network network;
            network = jobParameters.getNetwork();
            return network;
        }
    }

    @Nullable
    private static WorkGenerationalId workGenerationalIdFromJobParameters(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
            this.mWorkManagerImpl = workManagerImpl;
            workManagerImpl.getProcessor().addExecutionListener(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                Logger.get().warning(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        JobParameters remove;
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        synchronized (this.mJobParameters) {
            remove = this.mJobParameters.remove(workGenerationalId);
        }
        this.mStartStopTokens.remove(workGenerationalId);
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        if (this.mWorkManagerImpl == null) {
            Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (workGenerationalIdFromJobParameters == null) {
            Logger.get().error(TAG, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.mJobParameters) {
            if (this.mJobParameters.containsKey(workGenerationalIdFromJobParameters)) {
                Logger logger = Logger.get();
                String str = TAG;
                logger.debug(str, "Job is already being executed by SystemJobService: " + workGenerationalIdFromJobParameters);
                return false;
            }
            Logger logger2 = Logger.get();
            String str2 = TAG;
            logger2.debug(str2, "onStartJob for " + workGenerationalIdFromJobParameters);
            this.mJobParameters.put(workGenerationalIdFromJobParameters, jobParameters);
            int i = Build.VERSION.SDK_INT;
            WorkerParameters.RuntimeExtras runtimeExtras = new WorkerParameters.RuntimeExtras();
            if (Api24Impl.getTriggeredContentUris(jobParameters) != null) {
                runtimeExtras.triggeredContentUris = Arrays.asList(Api24Impl.getTriggeredContentUris(jobParameters));
            }
            if (Api24Impl.getTriggeredContentAuthorities(jobParameters) != null) {
                runtimeExtras.triggeredContentAuthorities = Arrays.asList(Api24Impl.getTriggeredContentAuthorities(jobParameters));
            }
            if (i >= 28) {
                runtimeExtras.network = Api28Impl.getNetwork(jobParameters);
            }
            this.mWorkManagerImpl.startWork(this.mStartStopTokens.tokenFor(workGenerationalIdFromJobParameters), runtimeExtras);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        if (this.mWorkManagerImpl == null) {
            Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (workGenerationalIdFromJobParameters == null) {
            Logger.get().error(TAG, "WorkSpec id not found!");
            return false;
        }
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "onStopJob for " + workGenerationalIdFromJobParameters);
        synchronized (this.mJobParameters) {
            this.mJobParameters.remove(workGenerationalIdFromJobParameters);
        }
        StartStopToken remove = this.mStartStopTokens.remove(workGenerationalIdFromJobParameters);
        if (remove != null) {
            this.mWorkManagerImpl.stopWork(remove);
        }
        return !this.mWorkManagerImpl.getProcessor().isCancelled(workGenerationalIdFromJobParameters.getWorkSpecId());
    }
}
