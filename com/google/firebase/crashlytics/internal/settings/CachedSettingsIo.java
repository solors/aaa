package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CachedSettingsIo {

    /* renamed from: a */
    private final File f42949a;

    public CachedSettingsIo(FileStore fileStore) {
        this.f42949a = fileStore.getCommonFile("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m66898a() {
        return this.f42949a;
    }

    public JSONObject readCachedSettings() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Logger.getLogger().m67216d("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m66898a = m66898a();
                if (m66898a.exists()) {
                    fileInputStream = new FileInputStream(m66898a);
                    try {
                        jSONObject = new JSONObject(CommonUtils.streamToString(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Logger.getLogger().m67213e("Failed to fetch cached settings", e);
                        CommonUtils.closeOrLog(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    Logger.getLogger().m67210v("Settings file does not exist.");
                    jSONObject = null;
                }
                CommonUtils.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void writeCachedSettings(long j, JSONObject jSONObject) {
        Logger.getLogger().m67210v("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    FileWriter fileWriter2 = new FileWriter(m66898a());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                    } catch (Exception e) {
                        e = e;
                        fileWriter = fileWriter2;
                        Logger.getLogger().m67213e("Failed to cache settings", e);
                        CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
