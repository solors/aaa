package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class CommandHandler implements ExecutionListener {
    static final String ACTION_CONSTRAINTS_CHANGED = "ACTION_CONSTRAINTS_CHANGED";
    static final String ACTION_DELAY_MET = "ACTION_DELAY_MET";
    static final String ACTION_EXECUTION_COMPLETED = "ACTION_EXECUTION_COMPLETED";
    static final String ACTION_RESCHEDULE = "ACTION_RESCHEDULE";
    static final String ACTION_SCHEDULE_WORK = "ACTION_SCHEDULE_WORK";
    static final String ACTION_STOP_WORK = "ACTION_STOP_WORK";
    private static final String KEY_NEEDS_RESCHEDULE = "KEY_NEEDS_RESCHEDULE";
    private static final String KEY_WORKSPEC_GENERATION = "KEY_WORKSPEC_GENERATION";
    private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    private static final String TAG = Logger.tagWithPrefix("CommandHandler");
    static final long WORK_PROCESSING_TIME_IN_MS = 600000;
    private final Context mContext;
    private final StartStopTokens mStartStopTokens;
    private final Map<WorkGenerationalId, DelayMetCommandHandler> mPendingDelayMet = new HashMap();
    private final Object mLock = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommandHandler(@NonNull Context context, @NonNull StartStopTokens startStopTokens) {
        this.mContext = context;
        this.mStartStopTokens = startStopTokens;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent createConstraintsChangedIntent(@NonNull Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_CONSTRAINTS_CHANGED);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent createDelayMetIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_DELAY_MET);
        return writeWorkGenerationalId(intent, workGenerationalId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent createExecutionCompletedIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_EXECUTION_COMPLETED);
        intent.putExtra(KEY_NEEDS_RESCHEDULE, z);
        return writeWorkGenerationalId(intent, workGenerationalId);
    }

    static Intent createRescheduleIntent(@NonNull Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_RESCHEDULE);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent createScheduleWorkIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_SCHEDULE_WORK);
        return writeWorkGenerationalId(intent, workGenerationalId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent createStopWorkIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_STOP_WORK);
        intent.putExtra(KEY_WORKSPEC_ID, str);
        return intent;
    }

    private void handleConstraintsChanged(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Handling constraints changed " + intent);
        new ConstraintsCommandHandler(this.mContext, i, systemAlarmDispatcher).handleConstraintsChanged();
    }

    private void handleDelayMet(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        synchronized (this.mLock) {
            WorkGenerationalId readWorkGenerationalId = readWorkGenerationalId(intent);
            Logger logger = Logger.get();
            String str = TAG;
            logger.debug(str, "Handing delay met for " + readWorkGenerationalId);
            if (!this.mPendingDelayMet.containsKey(readWorkGenerationalId)) {
                DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.mContext, i, systemAlarmDispatcher, this.mStartStopTokens.tokenFor(readWorkGenerationalId));
                this.mPendingDelayMet.put(readWorkGenerationalId, delayMetCommandHandler);
                delayMetCommandHandler.handleProcessWork();
            } else {
                Logger logger2 = Logger.get();
                logger2.debug(str, "WorkSpec " + readWorkGenerationalId + " is is already being handled for ACTION_DELAY_MET");
            }
        }
    }

    private void handleExecutionCompleted(@NonNull Intent intent, int i) {
        WorkGenerationalId readWorkGenerationalId = readWorkGenerationalId(intent);
        boolean z = intent.getExtras().getBoolean(KEY_NEEDS_RESCHEDULE);
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Handling onExecutionCompleted " + intent + ", " + i);
        onExecuted(readWorkGenerationalId, z);
    }

    private void handleReschedule(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Handling reschedule " + intent + ", " + i);
        systemAlarmDispatcher.getWorkManager().rescheduleEligibleWork();
    }

    private void handleScheduleWorkIntent(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        WorkGenerationalId readWorkGenerationalId = readWorkGenerationalId(intent);
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Handling schedule work for " + readWorkGenerationalId);
        WorkDatabase workDatabase = systemAlarmDispatcher.getWorkManager().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(readWorkGenerationalId.getWorkSpecId());
            if (workSpec == null) {
                Logger logger2 = Logger.get();
                logger2.warning(str, "Skipping scheduling " + readWorkGenerationalId + " because it's no longer in the DB");
            } else if (workSpec.state.isFinished()) {
                Logger logger3 = Logger.get();
                logger3.warning(str, "Skipping scheduling " + readWorkGenerationalId + "because it is finished.");
            } else {
                long calculateNextRunTime = workSpec.calculateNextRunTime();
                if (!workSpec.hasConstraints()) {
                    Logger logger4 = Logger.get();
                    logger4.debug(str, "Setting up Alarms for " + readWorkGenerationalId + "at " + calculateNextRunTime);
                    Alarms.setAlarm(this.mContext, workDatabase, readWorkGenerationalId, calculateNextRunTime);
                } else {
                    Logger logger5 = Logger.get();
                    logger5.debug(str, "Opportunistically setting an alarm for " + readWorkGenerationalId + "at " + calculateNextRunTime);
                    Alarms.setAlarm(this.mContext, workDatabase, readWorkGenerationalId, calculateNextRunTime);
                    systemAlarmDispatcher.getTaskExecutor().getMainThreadExecutor().execute(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher, createConstraintsChangedIntent(this.mContext), i));
                }
                workDatabase.setTransactionSuccessful();
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    private void handleStopWork(@NonNull Intent intent, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        List<StartStopToken> remove;
        Bundle extras = intent.getExtras();
        String string = extras.getString(KEY_WORKSPEC_ID);
        if (extras.containsKey(KEY_WORKSPEC_GENERATION)) {
            int i = extras.getInt(KEY_WORKSPEC_GENERATION);
            remove = new ArrayList<>(1);
            StartStopToken remove2 = this.mStartStopTokens.remove(new WorkGenerationalId(string, i));
            if (remove2 != null) {
                remove.add(remove2);
            }
        } else {
            remove = this.mStartStopTokens.remove(string);
        }
        for (StartStopToken startStopToken : remove) {
            Logger logger = Logger.get();
            String str = TAG;
            logger.debug(str, "Handing stopWork work for " + string);
            systemAlarmDispatcher.getWorkManager().stopWork(startStopToken);
            Alarms.cancelAlarm(this.mContext, systemAlarmDispatcher.getWorkManager().getWorkDatabase(), startStopToken.getId());
            systemAlarmDispatcher.onExecuted(startStopToken.getId(), false);
        }
    }

    private static boolean hasKeys(@Nullable Bundle bundle, @NonNull String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static WorkGenerationalId readWorkGenerationalId(@NonNull Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra(KEY_WORKSPEC_ID), intent.getIntExtra(KEY_WORKSPEC_GENERATION, 0));
    }

    private static Intent writeWorkGenerationalId(@NonNull Intent intent, @NonNull WorkGenerationalId workGenerationalId) {
        intent.putExtra(KEY_WORKSPEC_ID, workGenerationalId.getWorkSpecId());
        intent.putExtra(KEY_WORKSPEC_GENERATION, workGenerationalId.getGeneration());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasPendingCommands() {
        boolean z;
        synchronized (this.mLock) {
            if (!this.mPendingDelayMet.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.mLock) {
            DelayMetCommandHandler remove = this.mPendingDelayMet.remove(workGenerationalId);
            this.mStartStopTokens.remove(workGenerationalId);
            if (remove != null) {
                remove.onExecuted(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public void onHandleIntent(@NonNull Intent intent, int i, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if (ACTION_CONSTRAINTS_CHANGED.equals(action)) {
            handleConstraintsChanged(intent, i, systemAlarmDispatcher);
        } else if (ACTION_RESCHEDULE.equals(action)) {
            handleReschedule(intent, i, systemAlarmDispatcher);
        } else if (!hasKeys(intent.getExtras(), KEY_WORKSPEC_ID)) {
            Logger logger = Logger.get();
            String str = TAG;
            logger.error(str, "Invalid request for " + action + " , requires " + KEY_WORKSPEC_ID + " .");
        } else if (ACTION_SCHEDULE_WORK.equals(action)) {
            handleScheduleWorkIntent(intent, i, systemAlarmDispatcher);
        } else if (ACTION_DELAY_MET.equals(action)) {
            handleDelayMet(intent, i, systemAlarmDispatcher);
        } else if (ACTION_STOP_WORK.equals(action)) {
            handleStopWork(intent, systemAlarmDispatcher);
        } else if (ACTION_EXECUTION_COMPLETED.equals(action)) {
            handleExecutionCompleted(intent, i);
        } else {
            Logger logger2 = Logger.get();
            String str2 = TAG;
            logger2.warning(str2, "Ignoring intent " + intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent createStopWorkIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(ACTION_STOP_WORK);
        return writeWorkGenerationalId(intent, workGenerationalId);
    }
}
