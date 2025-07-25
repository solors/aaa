package p1007v3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: v3.l */
/* loaded from: classes6.dex */
public class UUIDManager {

    /* renamed from: a */
    private volatile String f116855a;

    /* compiled from: UUIDManager.java */
    /* renamed from: v3.l$b */
    /* loaded from: classes6.dex */
    private static class C44503b {

        /* renamed from: a */
        private static final UUIDManager f116856a = new UUIDManager();
    }

    /* renamed from: a */
    public static UUIDManager m2681a() {
        return C44503b.f116856a;
    }

    /* renamed from: b */
    public String m2680b(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f116855a)) {
            return this.f116855a;
        }
        synchronized (this) {
            if (TextUtils.isEmpty(this.f116855a)) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("sp_lxuid", 0);
                this.f116855a = sharedPreferences.getString("local_uuid", "");
                if (TextUtils.isEmpty(this.f116855a)) {
                    this.f116855a = UUID.randomUUID().toString();
                    this.f116855a = this.f116855a.replaceAll("-", "");
                    sharedPreferences.edit().putString("local_uuid", this.f116855a).apply();
                }
            }
            str = this.f116855a;
        }
        return str;
    }

    private UUIDManager() {
    }
}
