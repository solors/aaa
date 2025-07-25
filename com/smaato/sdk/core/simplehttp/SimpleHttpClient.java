package com.smaato.sdk.core.simplehttp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class SimpleHttpClient {
    private final HttpClient httpClient;
    private final Logger logger;

    public SimpleHttpClient(HttpClient httpClient, Logger logger) {
        this.logger = logger;
        this.httpClient = httpClient;
    }

    private String readBody(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    String sb3 = sb2.toString();
                    bufferedReader.close();
                    return sb3;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public InputStream doNetworkRequest(@NonNull String str, @Nullable Map<String, List<String>> map) throws IOException {
        Response execute = this.httpClient.newCall(Request.get(str)).execute();
        if (map != null) {
            map.putAll(execute.headers().headers());
        }
        return execute.body().source();
    }

    public void fireAndForget(@NonNull List<String> list) {
        for (String str : list) {
            readString(str, null);
        }
    }

    public void fireAndTrackSuccess(@NonNull List<String> list, @NonNull List<String> list2, @Nullable List<Exception> list3) {
        for (String str : list) {
            try {
                readBody(doNetworkRequest(str, null));
            } catch (Exception e) {
                Logger logger = this.logger;
                LogDomain logDomain = LogDomain.CORE;
                logger.error(logDomain, "Http request failed for url: " + str, new Object[0]);
                list2.add(str);
                if (list3 != null) {
                    list3.add(e);
                }
            }
        }
    }

    public Bitmap readBitmap(String str) throws IOException {
        InputStream doNetworkRequest = doNetworkRequest(str, null);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(doNetworkRequest);
            if (doNetworkRequest != null) {
                doNetworkRequest.close();
            }
            return decodeStream;
        } catch (Throwable th) {
            if (doNetworkRequest != null) {
                try {
                    doNetworkRequest.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Nullable
    public String readString(@NonNull String str, @Nullable Map<String, List<String>> map) {
        try {
            return readStringOrThrowNetworkException(str, map);
        } catch (Exception unused) {
            Logger logger = this.logger;
            LogDomain logDomain = LogDomain.CORE;
            logger.error(logDomain, "Http request failed for url: " + str, new Object[0]);
            return null;
        }
    }

    @NonNull
    public String readStringOrThrowNetworkException(String str, Map<String, List<String>> map) throws IOException {
        return readBody(doNetworkRequest(str, map));
    }

    public void sendDataAndForget(String str, String str2) {
        try {
            Response execute = this.httpClient.newCall(Request.post(str, str2.getBytes())).execute();
            if (execute.responseCode() == 200) {
                Logger logger = this.logger;
                LogDomain logDomain = LogDomain.CORE;
                logger.debug(logDomain, "Sent data, URL = " + str, new Object[0]);
            } else {
                this.logger.error(LogDomain.CORE, "Sending data to %s failed, response code %d", str, Integer.valueOf(execute.responseCode()));
            }
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, e, "Sending data to %s failed", str);
        }
    }
}
