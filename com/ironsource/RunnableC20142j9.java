package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.j9 */
/* loaded from: classes6.dex */
public class RunnableC20142j9 implements Runnable {
    @NotNull

    /* renamed from: a */
    private final JSONObject f50691a;

    public RunnableC20142j9(@NotNull JSONObject stringToSend) {
        Intrinsics.checkNotNullParameter(stringToSend, "stringToSend");
        this.f50691a = stringToSend;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection openConnection = new URL(C20086i9.m57997d().f50554h).openConnection();
            Intrinsics.m17073h(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(this.f50691a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
            Log.i("MSG", httpURLConnection.getResponseMessage());
            httpURLConnection.disconnect();
            ironLog.verbose("sent crash report for type " + this.f50691a.get("crashType") + " and date " + this.f50691a.get("crashDate"));
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
