package com.smaato.sdk.core.rawresourceloader;

import android.app.Application;
import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes7.dex */
public class RawResourceLoader {
    private final Application application;

    public RawResourceLoader(Application application) {
        this.application = application;
    }

    @NonNull
    public String readRawTextFile(int i) {
        InputStream openRawResource = this.application.getResources().openRawResource(i);
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(openRawResource);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                        sb2.append('\n');
                    } else {
                        bufferedReader.close();
                        inputStreamReader.close();
                        return sb2.toString();
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
        } catch (IOException unused) {
            return "";
        }
    }
}
