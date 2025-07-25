package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.hls.offline.ExecutorC2515a;
import androidx.profileinstaller.ProfileInstaller;

/* loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @NonNull
    public static final String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    @NonNull
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    @NonNull
    public static final String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";
    @NonNull
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";
    @NonNull
    private static final String EXTRA_BENCHMARK_OPERATION = "EXTRA_BENCHMARK_OPERATION";
    @NonNull
    private static final String EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE = "DROP_SHADER_CACHE";
    @NonNull
    private static final String EXTRA_SKIP_FILE_OPERATION = "EXTRA_SKIP_FILE_OPERATION";
    @NonNull
    private static final String EXTRA_SKIP_FILE_OPERATION_DELETE = "DELETE_SKIP_FILE";
    @NonNull
    private static final String EXTRA_SKIP_FILE_OPERATION_WRITE = "WRITE_SKIP_FILE";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        ResultDiagnostics() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, @Nullable Object obj) {
            ProfileInstaller.LOG_DIAGNOSTICS.onDiagnosticReceived(i, obj);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, @Nullable Object obj) {
            ProfileInstaller.LOG_DIAGNOSTICS.onResultReceived(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    static void saveProfile(@NonNull ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        Process.sendSignal(Process.myPid(), 10);
        diagnosticsCallback.onResultReceived(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action)) {
            ProfileInstaller.writeProfile(context, new ExecutorC2515a(), new ResultDiagnostics(), true);
        } else if (ACTION_SKIP_FILE.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(EXTRA_SKIP_FILE_OPERATION);
                if (EXTRA_SKIP_FILE_OPERATION_WRITE.equals(string)) {
                    ProfileInstaller.writeSkipFile(context, new ExecutorC2515a(), new ResultDiagnostics());
                } else if (EXTRA_SKIP_FILE_OPERATION_DELETE.equals(string)) {
                    ProfileInstaller.deleteSkipFile(context, new ExecutorC2515a(), new ResultDiagnostics());
                }
            }
        } else if (ACTION_SAVE_PROFILE.equals(action)) {
            saveProfile(new ResultDiagnostics());
        } else if (ACTION_BENCHMARK_OPERATION.equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString(EXTRA_BENCHMARK_OPERATION);
            ResultDiagnostics resultDiagnostics = new ResultDiagnostics();
            if (EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE.equals(string2)) {
                BenchmarkOperation.dropShaderCache(context, resultDiagnostics);
            } else {
                resultDiagnostics.onResultReceived(16, null);
            }
        }
    }
}
