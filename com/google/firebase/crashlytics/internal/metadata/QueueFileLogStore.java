package com.google.firebase.crashlytics.internal.metadata;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes4.dex */
class QueueFileLogStore implements FileLogStore {

    /* renamed from: d */
    private static final Charset f42469d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f42470a;

    /* renamed from: b */
    private final int f42471b;

    /* renamed from: c */
    private QueueFile f42472c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public QueueFileLogStore(File file, int i) {
        this.f42470a = file;
        this.f42471b = i;
    }

    /* renamed from: a */
    private void m67015a(long j, String str) {
        int i;
        if (this.f42472c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f42471b / 4) {
                str = APSSharedUtil.TRUNCATE_SEPARATOR + str.substring(str.length() - i);
            }
            this.f42472c.add(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f42469d));
            while (!this.f42472c.isEmpty() && this.f42472c.usedBytes() > this.f42471b) {
                this.f42472c.remove();
            }
        } catch (IOException e) {
            Logger.getLogger().m67213e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    /* renamed from: b */
    private LogBytes m67014b() {
        if (!this.f42470a.exists()) {
            return null;
        }
        m67013c();
        QueueFile queueFile = this.f42472c;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.usedBytes()];
        try {
            this.f42472c.forEach(new QueueFile.ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.1
                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            Logger.getLogger().m67213e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    /* renamed from: c */
    private void m67013c() {
        if (this.f42472c == null) {
            try {
                this.f42472c = new QueueFile(this.f42470a);
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                logger.m67213e("Could not open log file: " + this.f42470a, e);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void closeLogFile() {
        CommonUtils.closeOrLog(this.f42472c, "There was a problem closing the Crashlytics log file.");
        this.f42472c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.f42470a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public byte[] getLogAsBytes() {
        LogBytes m67014b = m67014b();
        if (m67014b == null) {
            return null;
        }
        int i = m67014b.offset;
        byte[] bArr = new byte[i];
        System.arraycopy(m67014b.bytes, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public String getLogAsString() {
        byte[] logAsBytes = getLogAsBytes();
        if (logAsBytes != null) {
            return new String(logAsBytes, f42469d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void writeToLog(long j, String str) {
        m67013c();
        m67015a(j, str);
    }
}
