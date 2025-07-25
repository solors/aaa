package androidx.sqlite.util;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProcessLock.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ProcessLock {
    @NotNull
    private static final String TAG = "SupportSQLiteLock";
    @Nullable
    private FileChannel lockChannel;
    @Nullable
    private final File lockFile;
    private final boolean processLock;
    @SuppressLint({"SyntheticAccessor"})
    @NotNull
    private final Lock threadLock;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Map<String, Lock> threadLocksMap = new HashMap();

    /* compiled from: ProcessLock.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock getThreadLock(String str) {
            Lock lock;
            synchronized (ProcessLock.threadLocksMap) {
                Map map = ProcessLock.threadLocksMap;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    map.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }
    }

    public ProcessLock(@NotNull String name, @Nullable File file, boolean z) {
        File file2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.processLock = z;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.lockFile = file2;
        this.threadLock = Companion.getThreadLock(name);
    }

    public static /* synthetic */ void lock$default(ProcessLock processLock, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = processLock.processLock;
        }
        processLock.lock(z);
    }

    public final void lock(boolean z) {
        this.threadLock.lock();
        if (z) {
            try {
                File file = this.lockFile;
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(this.lockFile).getChannel();
                    channel.lock();
                    this.lockChannel = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e) {
                this.lockChannel = null;
                Log.w(TAG, "Unable to grab file lock.", e);
            }
        }
    }

    public final void unlock() {
        try {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.threadLock.unlock();
    }
}
