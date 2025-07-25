package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SystemAlarmDispatcher implements ExecutionListener {
    private static final int DEFAULT_START_ID = 0;
    private static final String KEY_START_ID = "KEY_START_ID";
    private static final String PROCESS_COMMAND_TAG = "ProcessCommand";
    static final String TAG = Logger.tagWithPrefix("SystemAlarmDispatcher");
    final CommandHandler mCommandHandler;
    @Nullable
    private CommandsCompletedListener mCompletedListener;
    final Context mContext;
    Intent mCurrentIntent;
    final List<Intent> mIntents;
    private final Processor mProcessor;
    private StartStopTokens mStartStopTokens;
    final TaskExecutor mTaskExecutor;
    private final WorkManagerImpl mWorkManager;
    private final WorkTimer mWorkTimer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class AddRunnable implements Runnable {
        private final SystemAlarmDispatcher mDispatcher;
        private final Intent mIntent;
        private final int mStartId;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AddRunnable(@NonNull SystemAlarmDispatcher systemAlarmDispatcher, @NonNull Intent intent, int i) {
            this.mDispatcher = systemAlarmDispatcher;
            this.mIntent = intent;
            this.mStartId = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.add(this.mIntent, this.mStartId);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    /* loaded from: classes2.dex */
    static class DequeueAndCheckForCompletion implements Runnable {
        private final SystemAlarmDispatcher mDispatcher;

        DequeueAndCheckForCompletion(@NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
            this.mDispatcher = systemAlarmDispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.dequeueAndCheckForCompletion();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SystemAlarmDispatcher(@NonNull Context context) {
        this(context, null, null);
    }

    private void assertMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    @MainThread
    private boolean hasIntentWithAction(@NonNull String str) {
        assertMainThread();
        synchronized (this.mIntents) {
            for (Intent intent : this.mIntents) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    @MainThread
    private void processCommand() {
        assertMainThread();
        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.mContext, PROCESS_COMMAND_TAG);
        try {
            newWakeLock.acquire();
            this.mWorkManager.getWorkTaskExecutor().executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public void run() {
                    Executor mainThreadExecutor;
                    DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (SystemAlarmDispatcher.this.mIntents) {
                        SystemAlarmDispatcher systemAlarmDispatcher = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher.mCurrentIntent = systemAlarmDispatcher.mIntents.get(0);
                    }
                    Intent intent = SystemAlarmDispatcher.this.mCurrentIntent;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.mCurrentIntent.getIntExtra(SystemAlarmDispatcher.KEY_START_ID, 0);
                        Logger logger = Logger.get();
                        String str = SystemAlarmDispatcher.TAG;
                        logger.debug(str, "Processing command " + SystemAlarmDispatcher.this.mCurrentIntent + ", " + intExtra);
                        Context context = SystemAlarmDispatcher.this.mContext;
                        PowerManager.WakeLock newWakeLock2 = WakeLocks.newWakeLock(context, action + " (" + intExtra + ")");
                        try {
                            Logger logger2 = Logger.get();
                            logger2.debug(str, "Acquiring operation wake lock (" + action + ") " + newWakeLock2);
                            newWakeLock2.acquire();
                            SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher2.mCommandHandler.onHandleIntent(systemAlarmDispatcher2.mCurrentIntent, intExtra, systemAlarmDispatcher2);
                            Logger logger3 = Logger.get();
                            logger3.debug(str, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                            newWakeLock2.release();
                            mainThreadExecutor = SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor();
                            dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                        } catch (Throwable th) {
                            try {
                                Logger logger4 = Logger.get();
                                String str2 = SystemAlarmDispatcher.TAG;
                                logger4.error(str2, "Unexpected error in onHandleIntent", th);
                                Logger logger5 = Logger.get();
                                logger5.debug(str2, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                                newWakeLock2.release();
                                mainThreadExecutor = SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor();
                                dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                            } catch (Throwable th2) {
                                Logger logger6 = Logger.get();
                                String str3 = SystemAlarmDispatcher.TAG;
                                logger6.debug(str3, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                                newWakeLock2.release();
                                SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor().execute(new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this));
                                throw th2;
                            }
                        }
                        mainThreadExecutor.execute(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            newWakeLock.release();
        }
    }

    @MainThread
    public boolean add(@NonNull Intent intent, int i) {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Adding command " + intent + " (" + i + ")");
        assertMainThread();
        String action = intent.getAction();
        boolean z = false;
        if (TextUtils.isEmpty(action)) {
            Logger.get().warning(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra(KEY_START_ID, i);
            synchronized (this.mIntents) {
                if (!this.mIntents.isEmpty()) {
                    z = true;
                }
                this.mIntents.add(intent);
                if (!z) {
                    processCommand();
                }
            }
            return true;
        }
    }

    @MainThread
    void dequeueAndCheckForCompletion() {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Checking if commands are complete.");
        assertMainThread();
        synchronized (this.mIntents) {
            if (this.mCurrentIntent != null) {
                Logger logger2 = Logger.get();
                logger2.debug(str, "Removing command " + this.mCurrentIntent);
                if (this.mIntents.remove(0).equals(this.mCurrentIntent)) {
                    this.mCurrentIntent = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            SerialExecutor serialTaskExecutor = this.mTaskExecutor.getSerialTaskExecutor();
            if (!this.mCommandHandler.hasPendingCommands() && this.mIntents.isEmpty() && !serialTaskExecutor.hasPendingTasks()) {
                Logger.get().debug(str, "No more commands & intents.");
                CommandsCompletedListener commandsCompletedListener = this.mCompletedListener;
                if (commandsCompletedListener != null) {
                    commandsCompletedListener.onAllCommandsCompleted();
                }
            } else if (!this.mIntents.isEmpty()) {
                processCommand();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Processor getProcessor() {
        return this.mProcessor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskExecutor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WorkManagerImpl getWorkManager() {
        return this.mWorkManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WorkTimer getWorkTimer() {
        return this.mWorkTimer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDestroy() {
        Logger.get().debug(TAG, "Destroying SystemAlarmDispatcher");
        this.mProcessor.removeExecutionListener(this);
        this.mCompletedListener = null;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        this.mTaskExecutor.getMainThreadExecutor().execute(new AddRunnable(this, CommandHandler.createExecutionCompletedIntent(this.mContext, workGenerationalId, z), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCompletedListener(@NonNull CommandsCompletedListener commandsCompletedListener) {
        if (this.mCompletedListener != null) {
            Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.mCompletedListener = commandsCompletedListener;
        }
    }

    @VisibleForTesting
    SystemAlarmDispatcher(@NonNull Context context, @Nullable Processor processor, @Nullable WorkManagerImpl workManagerImpl) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mStartStopTokens = new StartStopTokens();
        this.mCommandHandler = new CommandHandler(applicationContext, this.mStartStopTokens);
        workManagerImpl = workManagerImpl == null ? WorkManagerImpl.getInstance(context) : workManagerImpl;
        this.mWorkManager = workManagerImpl;
        this.mWorkTimer = new WorkTimer(workManagerImpl.getConfiguration().getRunnableScheduler());
        processor = processor == null ? workManagerImpl.getProcessor() : processor;
        this.mProcessor = processor;
        this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        processor.addExecutionListener(this);
        this.mIntents = new ArrayList();
        this.mCurrentIntent = null;
    }
}
