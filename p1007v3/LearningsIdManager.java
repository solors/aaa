package p1007v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.ArrayList;
import java.util.List;
import p027b4.AnalyzeLog;
import p027b4.EncryptUtil;
import p992u3.LogLevel;

/* renamed from: v3.i */
/* loaded from: classes6.dex */
public class LearningsIdManager {

    /* renamed from: a */
    private static final List<String> f116848a = new C44498a();

    /* renamed from: b */
    private static C44499b f116849b;

    /* compiled from: LearningsIdManager.java */
    /* renamed from: v3.i$a */
    /* loaded from: classes6.dex */
    class C44498a extends ArrayList<String> {
        C44498a() {
            add("9774d56d682e549c");
            add("0123456789abcdef");
        }
    }

    /* compiled from: LearningsIdManager.java */
    /* renamed from: v3.i$b */
    /* loaded from: classes6.dex */
    public static class C44499b {

        /* renamed from: a */
        long f116850a = -1;

        /* renamed from: b */
        String f116851b = "unset";

        /* renamed from: c */
        String f116852c = "unset";

        @NonNull
        public String toString() {
            return "firstInstallTime = " + this.f116850a + " androidId = " + this.f116851b + " learningsId = " + this.f116852c;
        }
    }

    /* renamed from: a */
    public static C44499b m2683a(Context context) {
        C44499b c44499b = f116849b;
        if (c44499b != null) {
            return c44499b;
        }
        if (context == null) {
            AnalyzeLog.m103949a(LogLevel.WARN, "context is not when create learningsId");
            return new C44499b();
        }
        String m2680b = UUIDManager.m2681a().m2680b(context);
        C44499b c44499b2 = new C44499b();
        try {
            c44499b2.f116850a = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (c44499b2.f116850a < 0) {
            c44499b2.f116852c = m2680b;
            f116849b = c44499b2;
            return c44499b2;
        }
        String string = Settings.System.getString(context.getContentResolver(), C26484a.f69184A);
        if (m2682b(string) && !f116848a.contains(string)) {
            c44499b2.f116851b = string;
            c44499b2.f116852c = EncryptUtil.m103937c(string + c44499b2.f116850a);
            f116849b = c44499b2;
            return c44499b2;
        }
        c44499b2.f116852c = m2680b;
        f116849b = c44499b2;
        return c44499b2;
    }

    /* renamed from: b */
    private static boolean m2682b(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals("unset")) {
            return true;
        }
        return false;
    }
}
