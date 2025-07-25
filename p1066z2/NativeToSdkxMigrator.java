package p1066z2;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.inmobi.unification.sdk.InitializationStatus;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import p004a3.HSLegacySupportKeyValueStore;
import p004a3.HSNativeSDKUserDBHelper;
import p693h3.HSPersistentStorage;
import p752k3.C37383m;

/* renamed from: z2.c */
/* loaded from: classes5.dex */
public class NativeToSdkxMigrator {

    /* renamed from: a */
    private final SharedPreferences f118665a;

    /* renamed from: b */
    private HSLegacySupportKeyValueStore f118666b;

    /* renamed from: c */
    private final HSPersistentStorage f118667c;

    /* renamed from: d */
    private final Context f118668d;

    /* renamed from: e */
    private HSNativeSDKUserDBHelper f118669e;

    /* renamed from: f */
    private final MigrationLogger f118670f;

    /* renamed from: g */
    private final StringBuilder f118671g;

    /* renamed from: h */
    private final Map<String, String> f118672h;

    /* renamed from: i */
    private final String f118673i;

    /* renamed from: j */
    private final String f118674j;

    /* renamed from: k */
    private final String f118675k;

    /* renamed from: l */
    private final String f118676l;

    /* renamed from: m */
    private final String f118677m;

    /* renamed from: n */
    private final String f118678n;

    /* renamed from: o */
    private final String f118679o;

    /* renamed from: p */
    private int f118680p;

    public NativeToSdkxMigrator(Context context, HSPersistentStorage hSPersistentStorage) {
        HashMap hashMap = new HashMap();
        this.f118672h = hashMap;
        this.f118673i = InitializationStatus.SUCCESS;
        this.f118674j = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED;
        this.f118675k = "DeviceId : ";
        this.f118676l = "SDK Language : ";
        this.f118677m = "Push Token : ";
        this.f118678n = "User Data : ";
        this.f118679o = "Legacy Analytics Id : ";
        this.f118680p = 0;
        this.f118668d = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("__hs_migration_prefs", 0);
        this.f118665a = sharedPreferences;
        this.f118667c = hSPersistentStorage;
        this.f118670f = new MigrationLogger(sharedPreferences);
        this.f118671g = new StringBuilder("Migration Result: ");
        hashMap.put("DeviceId : ", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        hashMap.put("SDK Language : ", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        hashMap.put("Push Token : ", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        hashMap.put("Legacy Analytics Id : ", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        hashMap.put("User Data : ", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
    }

    /* renamed from: a */
    private void m881a(int i) {
        try {
            String str = "Native SDK version: " + this.f118668d.getSharedPreferences("HSJsonData", 0).getString("libraryVersion", "unknown") + " to SDK X version: 10.3.1";
            if (i == -1) {
                this.f118670f.m884b("Helpshift_Migrator", str);
                this.f118670f.m884b("Helpshift_Migrator", " Migration failed!");
            } else {
                this.f118670f.m885a("Helpshift_Migrator", str);
                this.f118670f.m885a("Helpshift_Migrator", "Migration success!");
            }
        } catch (Exception e) {
            this.f118670f.m883c("Helpshift_Migrator", "Error fetching SDK info for logging", e);
        }
    }

    /* renamed from: b */
    private boolean m880b(String str) {
        return new File(this.f118668d.getDatabasePath(str).getAbsolutePath()).exists();
    }

    /* renamed from: d */
    private void m878d(String str, boolean z) {
        String str2;
        if (z) {
            str2 = " : Success";
        } else {
            str2 = " : Failed";
        }
        if (!z) {
            MigrationLogger migrationLogger = this.f118670f;
            migrationLogger.m884b("Helpshift_Migrator", str + str2);
            return;
        }
        MigrationLogger migrationLogger2 = this.f118670f;
        migrationLogger2.m885a("Helpshift_Migrator", str + str2);
    }

    /* renamed from: f */
    private boolean m876f() {
        if (C37383m.m18233g(this.f118667c.m23753o())) {
            return true;
        }
        Object m870l = m870l("key_support_device_id");
        if (m870l == null) {
            return false;
        }
        this.f118667c.m23774d0((String) m870l);
        return true;
    }

    /* renamed from: g */
    private boolean m875g() {
        boolean m876f = m876f();
        m878d("DeviceId migration", m876f);
        m865q("DeviceId : ", m876f);
        boolean m873i = m873i();
        m878d("Push token migration", m873i);
        m865q("Push Token : ", m873i);
        boolean m872j = m872j();
        m878d("SDK language migration", m872j);
        m865q("SDK Language : ", m872j);
        if (m876f && m873i && m872j) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r1 == null) goto L13;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m874h() {
        /*
            r6 = this;
            java.lang.String r0 = "__hs_db_helpshift_users"
            boolean r0 = r6.m880b(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            a3.b r2 = r6.f118669e     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String r3 = "SELECT * FROM legacy_analytics_event_id_table"
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
        L1c:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r2 == 0) goto L48
            java.lang.String r2 = "identifier"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String r3 = "analytics_event_id"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            goto L1c
        L3a:
            r0 = move-exception
            goto L5e
        L3c:
            r2 = move-exception
            z2.b r3 = r6.f118670f     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Helpshift_Migrator"
            java.lang.String r5 = "Error reading legacy analytics event id."
            r3.m883c(r4, r5, r2)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L4b
        L48:
            r1.close()
        L4b:
            int r1 = r0.length()
            if (r1 <= 0) goto L5c
            h3.b r1 = r6.f118667c
            java.lang.String r2 = "legacy_event_ids"
            java.lang.String r0 = r0.toString()
            r1.m23793O(r2, r0)
        L5c:
            r0 = 1
            return r0
        L5e:
            if (r1 == 0) goto L63
            r1.close()
        L63:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1066z2.NativeToSdkxMigrator.m874h():boolean");
    }

    /* renamed from: i */
    private boolean m873i() {
        String str;
        if (C37383m.m18233g(this.f118667c.m23765i())) {
            return true;
        }
        Object m870l = m870l("key_push_token");
        if (m870l instanceof String) {
            str = (String) m870l;
        } else {
            str = "";
        }
        this.f118667c.m23784X(str);
        return true;
    }

    /* renamed from: j */
    private boolean m872j() {
        String str;
        if (C37383m.m18233g(this.f118667c.m23749q())) {
            return true;
        }
        Object m870l = m870l("sdkLanguage");
        if (m870l instanceof String) {
            str = (String) m870l;
        } else {
            str = "";
        }
        this.f118667c.m23772e0(str);
        return true;
    }

    /* renamed from: k */
    private boolean m871k() {
        if (!m880b("__hs_db_helpshift_users")) {
            return false;
        }
        ArrayList<Map> arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f118669e.getReadableDatabase().rawQuery("SELECT * FROM user_table", null);
                while (cursor.moveToNext()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anon", String.valueOf(cursor.getInt(cursor.getColumnIndex("anonymous"))));
                    hashMap.put("userId", cursor.getString(cursor.getColumnIndex("identifier")));
                    hashMap.put("userName", cursor.getString(cursor.getColumnIndex("name")));
                    hashMap.put("userEmail", cursor.getString(cursor.getColumnIndex("email")));
                    hashMap.put("userAuthToken", cursor.getString(cursor.getColumnIndex("auth_token")));
                    hashMap.put("isActive", String.valueOf(cursor.getInt(cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ACTIVE))));
                    arrayList.add(hashMap);
                }
                cursor.close();
                for (Map map : arrayList) {
                    try {
                        boolean equals = "1".equals(map.remove("anon"));
                        boolean equals2 = "1".equals(map.remove("isActive"));
                        if (equals) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("userId", map.get("userId"));
                            this.f118667c.m23748q0(jSONObject.toString());
                        } else if (equals2) {
                            this.f118667c.m23788T(new JSONObject(map).toString());
                        }
                    } catch (Exception e) {
                        this.f118670f.m883c("Helpshift_Migrator", "Error setting user data in SDK X migration", e);
                        return false;
                    }
                }
                return true;
            } catch (Exception e2) {
                this.f118670f.m883c("Helpshift_Migrator", "Error getting user data from native SDK", e2);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object m870l(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            a3.a r1 = r10.f118666b     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r5 = "key=?"
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r3 = 0
            r6[r3] = r11     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r3 = "key_value_store"
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L4d
            if (r3 == 0) goto L27
            byte[] r1 = r2.getBlob(r1)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L4d
            java.lang.Object r0 = r10.m866p(r1)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L4d
        L27:
            r2.close()
            goto L4c
        L2b:
            r1 = move-exception
            goto L31
        L2d:
            r11 = move-exception
            goto L4f
        L2f:
            r1 = move-exception
            r2 = r0
        L31:
            z2.b r3 = r10.f118670f     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "Helpshift_Migrator"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r5.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r6 = "Failed to read the native db or DB does not exist. Key : "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4d
            r5.append(r11)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> L4d
            r3.m883c(r4, r11, r1)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L4c
            goto L27
        L4c:
            return r0
        L4d:
            r11 = move-exception
            r0 = r2
        L4f:
            if (r0 == 0) goto L54
            r0.close()
        L54:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p1066z2.NativeToSdkxMigrator.m870l(java.lang.String):java.lang.Object");
    }

    /* renamed from: n */
    private boolean m868n() {
        int i = this.f118665a.getInt("migration_state", 0);
        if (!m880b("__hs__db_support_key_values") || i != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private void m867o(int i) {
        if (i != -1) {
            return;
        }
        StringBuilder sb2 = this.f118671g;
        sb2.append(" Attempts: ");
        sb2.append(this.f118680p);
        sb2.append(" , ");
        StringBuilder sb3 = this.f118671g;
        sb3.append("DeviceId : ");
        sb3.append(this.f118672h.get("DeviceId : "));
        sb3.append(" , ");
        StringBuilder sb4 = this.f118671g;
        sb4.append("User Data : ");
        sb4.append(this.f118672h.get("User Data : "));
        sb4.append(" , ");
        StringBuilder sb5 = this.f118671g;
        sb5.append("Push Token : ");
        sb5.append(this.f118672h.get("Push Token : "));
        sb5.append(" , ");
        StringBuilder sb6 = this.f118671g;
        sb6.append("SDK Language : ");
        sb6.append(this.f118672h.get("SDK Language : "));
        sb6.append(" , ");
        StringBuilder sb7 = this.f118671g;
        sb7.append("Legacy Analytics Id : ");
        sb7.append(this.f118672h.get("Legacy Analytics Id : "));
        try {
            JSONObject jSONObject = new JSONObject();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            jSONObject.put("dt", simpleDateFormat.format(new Date()));
            jSONObject.put("l", "ERROR");
            jSONObject.put("msg", this.f118671g.toString());
            jSONObject.put("src", "sdkx.android.10.3.1");
            this.f118665a.edit().putString("failure_logs", jSONObject.toString()).commit();
        } catch (Exception unused) {
            Log.e("Helpshift_Migrator", "Error storing failure log.");
        }
    }

    /* renamed from: p */
    private Object m866p(byte[] bArr) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
            }
        } catch (Throwable th3) {
            byteArrayInputStream = null;
            th = th3;
            objectInputStream = null;
        }
        try {
            Object readObject = objectInputStream.readObject();
            C37383m.m18238b(byteArrayInputStream);
            C37383m.m18238b(objectInputStream);
            return readObject;
        } catch (Throwable th4) {
            th = th4;
            C37383m.m18238b(byteArrayInputStream);
            C37383m.m18238b(objectInputStream);
            throw th;
        }
    }

    /* renamed from: q */
    private void m865q(String str, boolean z) {
        if (z) {
            this.f118672h.put(str, InitializationStatus.SUCCESS);
        }
    }

    /* renamed from: c */
    public String m879c() {
        int i;
        if (!this.f118665a.getBoolean("mig_log_synced_with_webchat", false) && (i = this.f118665a.getInt("migration_state", 0)) != 1 && i != 0) {
            try {
                String string = this.f118665a.getString("error_logs", "");
                if (C37383m.m18236d(string)) {
                    string = "[]";
                }
                JSONArray jSONArray = new JSONArray(string);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("migration_state", "FAILED");
                jSONObject.put(KeyConstants.RequestBody.KEY_DID, this.f118667c.m23753o());
                jSONObject.put("logs", jSONArray);
                return jSONObject.toString();
            } catch (Exception unused) {
                Log.e("Helpshift_Migrator", "Error getting error logs for migration");
            }
        }
        return "";
    }

    /* renamed from: e */
    public synchronized void m877e() {
        String str;
        String str2;
        int i;
        try {
        } catch (Exception e) {
            this.f118670f.m883c("Helpshift_Migrator", "Migration failed with exception", e);
            try {
                HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore = this.f118666b;
                if (hSLegacySupportKeyValueStore != null) {
                    hSLegacySupportKeyValueStore.close();
                }
                HSNativeSDKUserDBHelper hSNativeSDKUserDBHelper = this.f118669e;
                if (hSNativeSDKUserDBHelper != null) {
                    hSNativeSDKUserDBHelper.close();
                }
            } catch (Exception e2) {
                e = e2;
                str = "Helpshift_Migrator";
                str2 = "Error closing DB instance";
                Log.e(str, str2, e);
            }
        }
        if (!m868n()) {
            this.f118670f.m885a("Helpshift_Migrator", "Migration not required, skipping");
            try {
                HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore2 = this.f118666b;
                if (hSLegacySupportKeyValueStore2 != null) {
                    hSLegacySupportKeyValueStore2.close();
                }
                HSNativeSDKUserDBHelper hSNativeSDKUserDBHelper2 = this.f118669e;
                if (hSNativeSDKUserDBHelper2 != null) {
                    hSNativeSDKUserDBHelper2.close();
                }
            } catch (Exception e3) {
                Log.e("Helpshift_Migrator", "Error closing DB instance", e3);
            }
            return;
        }
        this.f118666b = new HSLegacySupportKeyValueStore(this.f118668d);
        this.f118669e = new HSNativeSDKUserDBHelper(this.f118668d);
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            i = 1;
            if (i2 >= 3) {
                break;
            }
            this.f118680p++;
            z = m875g();
            z2 = m871k();
            m878d("User data migration", z2);
            m865q("User Data : ", z2);
            z3 = m874h();
            m878d("Legacy analytics event ID data migration", z3);
            m865q("Legacy Analytics Id : ", z3);
            if (z && z2 && z3) {
                break;
            }
            MigrationLogger migrationLogger = this.f118670f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Native SDK to SDK X migration failed! Attempt : ");
            i2++;
            sb2.append(i2);
            migrationLogger.m884b("Helpshift_Migrator", sb2.toString());
        }
        if (!z || !z2 || !z3) {
            i = -1;
        }
        m881a(i);
        m867o(i);
        this.f118665a.edit().putInt("migration_state", i).commit();
        try {
            HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore3 = this.f118666b;
            if (hSLegacySupportKeyValueStore3 != null) {
                hSLegacySupportKeyValueStore3.close();
            }
            HSNativeSDKUserDBHelper hSNativeSDKUserDBHelper3 = this.f118669e;
            if (hSNativeSDKUserDBHelper3 != null) {
                hSNativeSDKUserDBHelper3.close();
            }
        } catch (Exception e4) {
            e = e4;
            str = "Helpshift_Migrator";
            str2 = "Error closing DB instance";
            Log.e(str, str2, e);
        }
    }

    /* renamed from: m */
    public void m869m(boolean z) {
        this.f118665a.edit().putBoolean("mig_log_synced_with_webchat", z).commit();
    }
}
