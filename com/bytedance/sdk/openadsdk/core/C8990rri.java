package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9353eqN;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;
import com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9635eqN;
import com.bytedance.sdk.openadsdk.yDt.p365bg.InterfaceC9632bX;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.rri */
/* loaded from: classes3.dex */
public class C8990rri {

    /* renamed from: IL */
    private static final AtomicInteger f20037IL;

    /* renamed from: bX */
    private static final AtomicInteger f20038bX;

    /* renamed from: bg */
    private static final AtomicInteger f20039bg;
    private static final AtomicInteger eqN;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        f20039bg = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        f20037IL = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        f20038bX = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        eqN = atomicInteger4;
        atomicInteger.addAndGet(C9353eqN.m82980bg("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(C9353eqN.m82980bg("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(C9353eqN.m82980bg("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(C9353eqN.m82980bg("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    /* renamed from: IL */
    private static void m83868IL() {
        final int i = f20039bg.get();
        final int i2 = f20037IL.get();
        final int i3 = f20038bX.get();
        final int i4 = eqN.get();
        C9601bX.m82278bg("crypt_v4_statistics", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.core.rri.1
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable unused) {
                }
                return C9635eqN.m82211IL().m82197bg("crypt_v4_statistics").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bg */
    public static void m83866bg() {
        try {
            long m82979bg = C9353eqN.m82979bg("encrypt_statistics_file", "upload_time_key", 0L);
            int i = (m82979bg > 0L ? 1 : (m82979bg == 0L ? 0 : -1));
            if (i > 0 && System.currentTimeMillis() - m82979bg >= 86400000) {
                m83868IL();
                synchronized (C8990rri.class) {
                    f20039bg.set(0);
                    f20037IL.set(0);
                    f20038bX.set(0);
                    eqN.set(0);
                    C9353eqN.m82982bg("encrypt_statistics_file");
                    C9353eqN.m82976bg("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                }
            } else if (i <= 0 || m82979bg > System.currentTimeMillis()) {
                C9353eqN.m82976bg("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: IL */
    public static synchronized void m83867IL(boolean z) {
        synchronized (C8990rri.class) {
            if (z) {
                C9353eqN.m82977bg("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(f20039bg.incrementAndGet()));
            } else {
                C9353eqN.m82977bg("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(f20037IL.incrementAndGet()));
            }
        }
    }

    /* renamed from: bg */
    public static void m83865bg(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        C9601bX.m82278bg("crypt_v4_fail", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.core.rri.2
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put(KeyConstants.RequestBody.KEY_SCENE, cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put(Verification.VENDOR, Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return C9635eqN.m82211IL().m82197bg("crypt_v4_fail").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bg */
    public static synchronized void m83863bg(boolean z) {
        synchronized (C8990rri.class) {
            if (z) {
                C9353eqN.m82977bg("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(f20038bX.incrementAndGet()));
            } else {
                C9353eqN.m82977bg("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(f20038bX.incrementAndGet()));
            }
        }
    }

    /* renamed from: bg */
    public static void m83864bg(JSONObject jSONObject) {
        m83867IL(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
