package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PersistedInstallation {

    /* renamed from: a */
    private File f43110a;
    @NonNull

    /* renamed from: b */
    private final FirebaseApp f43111b;

    /* loaded from: classes4.dex */
    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull FirebaseApp firebaseApp) {
        this.f43111b = firebaseApp;
    }

    /* renamed from: a */
    private File m66746a() {
        if (this.f43110a == null) {
            synchronized (this) {
                if (this.f43110a == null) {
                    File filesDir = this.f43111b.getApplicationContext().getFilesDir();
                    this.f43110a = new File(filesDir, "PersistedInstallation." + this.f43111b.getPersistenceKey() + ".json");
                }
            }
        }
        return this.f43110a;
    }

    /* renamed from: b */
    private JSONObject m66745b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m66746a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void clearForTesting() {
        m66746a().delete();
    }

    @NonNull
    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put("Status", persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.getAuthToken());
            jSONObject.put("RefreshToken", persistedInstallationEntry.getRefreshToken());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put("FisError", persistedInstallationEntry.getFisError());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f43111b.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(m66746a())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return persistedInstallationEntry;
    }

    @NonNull
    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject m66745b = m66745b();
        String optString = m66745b.optString("Fid", null);
        int optInt = m66745b.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m66745b.optString("AuthToken", null);
        String optString3 = m66745b.optString("RefreshToken", null);
        long optLong = m66745b.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m66745b.optLong("ExpiresInSecs", 0L);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(optString).setRegistrationStatus(RegistrationStatus.values()[optInt]).setAuthToken(optString2).setRefreshToken(optString3).setTokenCreationEpochInSecs(optLong).setExpiresInSecs(optLong2).setFisError(m66745b.optString("FisError", null)).build();
    }
}
