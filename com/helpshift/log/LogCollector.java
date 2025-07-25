package com.helpshift.log;

import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.helpshift.log.ILogger;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p752k3.C37383m;

/* loaded from: classes5.dex */
public class LogCollector {
    private static final String TAG = "Heplshift_LogCollector";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(Constants.TIME_PATTERN, Locale.US);
    public static final String logDirPath = "helpshift" + File.separator + "debugLogs";
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private FileOutputStream fos;
    private final File logFile;
    private final long mainThreadId;

    /* renamed from: com.helpshift.log.LogCollector$a */
    /* loaded from: classes5.dex */
    class RunnableC17731a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f44762b;

        /* renamed from: c */
        final /* synthetic */ long f44763c;

        /* renamed from: d */
        final /* synthetic */ ILogger.LEVEL f44764d;

        /* renamed from: f */
        final /* synthetic */ String f44765f;

        /* renamed from: g */
        final /* synthetic */ String f44766g;

        /* renamed from: h */
        final /* synthetic */ Throwable f44767h;

        RunnableC17731a(long j, long j2, ILogger.LEVEL level, String str, String str2, Throwable th) {
            this.f44762b = j;
            this.f44763c = j2;
            this.f44764d = level;
            this.f44765f = str;
            this.f44766g = str2;
            this.f44767h = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            String stackTraceString;
            try {
                String format = LogCollector.dateFormat.format(new Date(this.f44762b));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(format);
                sb2.append(" ");
                sb2.append(LogCollector.this.mainThreadId);
                sb2.append("-");
                sb2.append(this.f44763c);
                sb2.append(" ");
                sb2.append(this.f44764d.name());
                sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
                sb2.append(this.f44765f);
                sb2.append(" ");
                sb2.append(this.f44766g);
                Throwable th = this.f44767h;
                if (th instanceof UnknownHostException) {
                    stackTraceString = th.getMessage();
                } else {
                    stackTraceString = Log.getStackTraceString(th);
                }
                if (!C37383m.m18236d(stackTraceString)) {
                    sb2.append("\n");
                    sb2.append(stackTraceString);
                }
                sb2.append("\n");
                LogCollector.this.fos.write(sb2.toString().getBytes());
            } catch (Exception e) {
                Log.e(LogCollector.TAG, "Error writing to debug log file", e);
            }
        }
    }

    public LogCollector(Context context, String str, long j) {
        File file = new File(context.getFilesDir(), logDirPath);
        file.mkdirs();
        deleteOldFiles(file);
        this.logFile = new File(file, str + ".txt");
        this.mainThreadId = j;
    }

    private void deleteOldFiles(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 5) {
            Arrays.sort(listFiles);
            for (int i = 0; i < listFiles.length - 5; i++) {
                listFiles[i].delete();
            }
        }
    }

    public static String getLogFileName() {
        return dateFormat.format(new Date(System.currentTimeMillis()));
    }

    public void collectLog(String str, String str2, Throwable th, ILogger.LEVEL level) {
        long currentTimeMillis = System.currentTimeMillis();
        long id2 = Thread.currentThread().getId();
        if (this.fos == null) {
            try {
                this.fos = new FileOutputStream(this.logFile, true);
            } catch (Exception e) {
                Log.e(TAG, "Error opening debug log file: " + this.logFile.getAbsolutePath(), e);
                return;
            }
        }
        try {
            this.executorService.submit(new RunnableC17731a(currentTimeMillis, id2, level, str, str2, th));
        } catch (Exception e2) {
            Log.e(TAG, "Error submitting to executor", e2);
        }
    }
}
