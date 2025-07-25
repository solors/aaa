package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

/* loaded from: classes4.dex */
public class LogFileManager {

    /* renamed from: c */
    private static final NoopLogStore f42447c = new NoopLogStore();

    /* renamed from: a */
    private final FileStore f42448a;

    /* renamed from: b */
    private FileLogStore f42449b;

    public LogFileManager(FileStore fileStore) {
        this.f42448a = fileStore;
        this.f42449b = f42447c;
    }

    /* renamed from: a */
    private File m67045a(String str) {
        return this.f42448a.getSessionFile(str, "userlog");
    }

    /* renamed from: b */
    void m67044b(File file, int i) {
        this.f42449b = new QueueFileLogStore(file, i);
    }

    public void clearLog() {
        this.f42449b.deleteLogFile();
    }

    public byte[] getBytesForLog() {
        return this.f42449b.getLogAsBytes();
    }

    @Nullable
    public String getLogString() {
        return this.f42449b.getLogAsString();
    }

    public final void setCurrentSession(String str) {
        this.f42449b.closeLogFile();
        this.f42449b = f42447c;
        if (str == null) {
            return;
        }
        m67044b(m67045a(str), 65536);
    }

    public void writeToLog(long j, String str) {
        this.f42449b.writeToLog(j, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        setCurrentSession(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class NoopLogStore implements FileLogStore {
        private NoopLogStore() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public byte[] getLogAsBytes() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public String getLogAsString() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void closeLogFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void deleteLogFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void writeToLog(long j, String str) {
        }
    }
}
