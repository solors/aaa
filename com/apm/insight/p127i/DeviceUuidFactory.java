package com.apm.insight.p127i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.RuntimeContext;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.UUID;

/* renamed from: com.apm.insight.i.a */
/* loaded from: classes2.dex */
public class DeviceUuidFactory {

    /* renamed from: a */
    private static volatile UUID f3807a = null;

    /* renamed from: b */
    private static String f3808b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private DeviceUuidFactory(Context context) {
        String str;
        if (f3807a == null) {
            synchronized (DeviceUuidFactory.class) {
                if (f3807a == null) {
                    String m101322c = RuntimeContext.m101330a().m101322c();
                    if (m101322c != null) {
                        f3807a = UUID.fromString(m101322c);
                    } else {
                        try {
                            str = Settings.Secure.getString(context.getContentResolver(), C26484a.f69184A);
                        } catch (Throwable unused) {
                            str = null;
                        }
                        try {
                            if (str != null) {
                                f3807a = UUID.nameUUIDFromBytes(str.getBytes("utf8"));
                            } else {
                                f3807a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            RuntimeContext.m101330a().m101323b(f3807a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized String m101864a(Context context) {
        String str;
        synchronized (DeviceUuidFactory.class) {
            if (TextUtils.isEmpty(f3808b)) {
                new DeviceUuidFactory(context);
                UUID uuid = f3807a;
                if (uuid != null) {
                    f3808b = uuid.toString();
                }
            }
            str = f3808b;
        }
        return str;
    }
}
