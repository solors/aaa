package p1066z2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.helpshift.log.HSLogger;
import com.ironsource.C21114v8;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p026b3.HSRequestData;
import p026b3.HTTPTransport;
import p026b3.NetworkConstants;
import p026b3.POSTNetwork;
import p648e3.InterfaceC32918a;
import p693h3.HSPersistentStorage;
import p752k3.C37382g;
import p752k3.C37383m;
import p977t2.HSThreadingService;

/* renamed from: z2.a */
/* loaded from: classes5.dex */
public class MigrationFailureLogProvider {

    /* renamed from: f */
    private static final AtomicBoolean f118657f = new AtomicBoolean(false);

    /* renamed from: a */
    private final SharedPreferences f118658a;

    /* renamed from: b */
    private final HTTPTransport f118659b;

    /* renamed from: c */
    private final HSPersistentStorage f118660c;

    /* renamed from: d */
    private final InterfaceC32918a f118661d;

    /* renamed from: e */
    private final HSThreadingService f118662e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MigrationFailureLogProvider.java */
    /* renamed from: z2.a$a */
    /* loaded from: classes5.dex */
    public class RunnableC45114a implements Runnable {
        RunnableC45114a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                } catch (Exception e) {
                    HSLogger.m65438e("MgrFailLog", "Migration failure logs synced failed", e);
                }
                if (MigrationFailureLogProvider.f118657f.get()) {
                    Log.d("MgrFailLog", "Migration failure log sync already in progress. Skipping.");
                } else {
                    MigrationFailureLogProvider.f118657f.set(true);
                    String string = MigrationFailureLogProvider.this.f118658a.getString("failure_logs", "");
                    if (C37383m.m18236d(string)) {
                        Log.d("MgrFailLog", "Migration failure logs are empty. Skipping.");
                    } else {
                        JSONObject jSONObject = new JSONObject(string);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject);
                        String appName = MigrationFailureLogProvider.this.f118661d.getAppName();
                        String mo2781g = MigrationFailureLogProvider.this.f118661d.mo2781g();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(MigrationFailureLogProvider.this.m887i(C21114v8.C21123i.f54109D, MigrationFailureLogProvider.this.f118660c.m23763j() + "." + MigrationFailureLogProvider.this.f118660c.m23755n()));
                        MigrationFailureLogProvider migrationFailureLogProvider = MigrationFailureLogProvider.this;
                        arrayList.add(migrationFailureLogProvider.m887i(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, migrationFailureLogProvider.f118661d.getDeviceModel()));
                        MigrationFailureLogProvider migrationFailureLogProvider2 = MigrationFailureLogProvider.this;
                        arrayList.add(migrationFailureLogProvider2.m887i(KeyConstants.RequestBody.KEY_DID, migrationFailureLogProvider2.f118661d.getDeviceId()));
                        MigrationFailureLogProvider migrationFailureLogProvider3 = MigrationFailureLogProvider.this;
                        arrayList.add(migrationFailureLogProvider3.m887i("os", migrationFailureLogProvider3.f118661d.mo2783e()));
                        if (!C37383m.m18236d(appName)) {
                            arrayList.add(MigrationFailureLogProvider.this.m887i("an", appName));
                        }
                        if (!C37383m.m18236d(mo2781g)) {
                            arrayList.add(MigrationFailureLogProvider.this.m887i("av", mo2781g));
                        }
                        JSONArray m18251g = C37382g.m18251g(arrayList);
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", UUID.randomUUID().toString());
                        hashMap.put("v", "1");
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        hashMap.put("ctime", simpleDateFormat.format(new Date()));
                        hashMap.put("src", "sdkx.android.10.3.1");
                        hashMap.put("logs", jSONArray.toString());
                        hashMap.put("md", m18251g.toString());
                        hashMap.put("platform-id", MigrationFailureLogProvider.this.f118660c.m23804D());
                        int m103957b = new POSTNetwork(MigrationFailureLogProvider.this.f118659b, MigrationFailureLogProvider.this.m888h()).mo103964a(new HSRequestData(NetworkConstants.m103954a(MigrationFailureLogProvider.this.f118661d, MigrationFailureLogProvider.this.f118660c.m23804D()), hashMap)).m103957b();
                        if (m103957b >= 200 && m103957b < 300) {
                            MigrationFailureLogProvider.this.f118658a.edit().putBoolean("failure_logs_synced", true).apply();
                            MigrationFailureLogProvider.this.f118658a.edit().putString("failure_logs", "").commit();
                        }
                    }
                }
            } finally {
                MigrationFailureLogProvider.f118657f.set(false);
            }
        }
    }

    public MigrationFailureLogProvider(Context context, HTTPTransport hTTPTransport, HSPersistentStorage hSPersistentStorage, InterfaceC32918a interfaceC32918a, HSThreadingService hSThreadingService) {
        this.f118658a = context.getSharedPreferences("__hs_migration_prefs", 0);
        this.f118659b = hTTPTransport;
        this.f118660c = hSPersistentStorage;
        this.f118661d = interfaceC32918a;
        this.f118662e = hSThreadingService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public String m888h() {
        return "https://api." + this.f118660c.m23755n() + "/events/v1/" + this.f118660c.m23763j() + "/sdkx/crash-log";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public JSONObject m887i(String str, String str2) throws JSONException {
        return new JSONObject().put(str, str2);
    }

    /* renamed from: j */
    public void m886j() {
        int i = this.f118658a.getInt("migration_state", 0);
        if (i == 1 || i == 0 || this.f118658a.getBoolean("failure_logs_synced", false)) {
            return;
        }
        this.f118662e.m3280c().submit(new RunnableC45114a());
    }
}
