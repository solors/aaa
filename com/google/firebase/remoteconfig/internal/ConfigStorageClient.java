package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@AnyThread
/* loaded from: classes4.dex */
public class ConfigStorageClient {
    @GuardedBy("ConfigStorageClient.class")

    /* renamed from: c */
    private static final Map<String, ConfigStorageClient> f43551c = new HashMap();

    /* renamed from: a */
    private final Context f43552a;

    /* renamed from: b */
    private final String f43553b;

    private ConfigStorageClient(Context context, String str) {
        this.f43552a = context;
        this.f43553b = str;
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        synchronized (ConfigStorageClient.class) {
            f43551c.clear();
        }
    }

    public static synchronized ConfigStorageClient getInstance(Context context, String str) {
        ConfigStorageClient configStorageClient;
        synchronized (ConfigStorageClient.class) {
            Map<String, ConfigStorageClient> map = f43551c;
            if (!map.containsKey(str)) {
                map.put(str, new ConfigStorageClient(context, str));
            }
            configStorageClient = map.get(str);
        }
        return configStorageClient;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m66319a() {
        return this.f43553b;
    }

    public synchronized Void clear() {
        this.f43552a.deleteFile(this.f43553b);
        return null;
    }

    public synchronized ConfigContainer read() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f43552a.openFileInput(this.f43553b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            ConfigContainer m66417b = ConfigContainer.m66417b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return m66417b;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public synchronized Void write(ConfigContainer configContainer) throws IOException {
        FileOutputStream openFileOutput = this.f43552a.openFileOutput(this.f43553b, 0);
        openFileOutput.write(configContainer.toString().getBytes("UTF-8"));
        openFileOutput.close();
        return null;
    }
}
