package com.google.android.gms.ads.identifier;

import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.solver.widgets.Optimizer;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes4.dex */
public final class zzc {
    @WorkerThread
    public static final void zza(String str) {
        try {
            try {
                zzi.zzb(Optimizer.OPTIMIZATION_STANDARD);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb2.append("Received non-success response code ");
                        sb2.append(responseCode);
                        sb2.append(" from pinging URL: ");
                        sb2.append(str);
                        Log.w("HttpUrlPinger", sb2.toString());
                    }
                    zzi.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message);
                Log.w("HttpUrlPinger", sb3.toString(), e);
                zzi.zza();
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb4.append("Error while parsing ping URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message2);
                Log.w("HttpUrlPinger", sb4.toString(), e2);
                zzi.zza();
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb32.append("Error while pinging URL: ");
                sb32.append(str);
                sb32.append(". ");
                sb32.append(message3);
                Log.w("HttpUrlPinger", sb32.toString(), e);
                zzi.zza();
            }
        } catch (Throwable th) {
            zzi.zza();
            throw th;
        }
    }
}
