package p856r2;

import com.helpshift.log.HSLogger;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.p552ot.pubsub.util.C26601v;
import java.io.File;
import p693h3.HSPersistentStorage;

/* renamed from: r2.c */
/* loaded from: classes5.dex */
public class HelpcenterCacheEvictionManager {

    /* renamed from: a */
    private final HSPersistentStorage f103661a;

    /* renamed from: b */
    private final String f103662b;

    /* renamed from: c */
    private String f103663c;

    public HelpcenterCacheEvictionManager(HSPersistentStorage hSPersistentStorage, String str, String str2) {
        this.f103661a = hSPersistentStorage;
        this.f103662b = str;
        this.f103663c = str2;
    }

    /* renamed from: b */
    private String m12703b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f103662b);
        String str = File.separator;
        sb2.append(str);
        sb2.append("helpshift");
        sb2.append(str);
        sb2.append("resource_cache");
        sb2.append(str);
        sb2.append(this.f103663c);
        return sb2.toString();
    }

    /* renamed from: c */
    private void m12702c(long j) {
        this.f103661a.m23768g0(j);
    }

    /* renamed from: a */
    public void m12704a() {
        long currentTimeMillis = System.currentTimeMillis();
        long m23747r = this.f103661a.m23747r();
        if (m23747r == 0) {
            m12702c(currentTimeMillis);
        } else if (currentTimeMillis - m23747r >= C26601v.f69834a) {
            m12702c(currentTimeMillis);
            File[] listFiles = new File(m12703b()).listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file : listFiles) {
                    long lastModified = file.lastModified();
                    if (lastModified != 0 && currentTimeMillis - lastModified > UserAgentInfo.USER_AGENT_MAX_VALIDITY_TIME_MILLIS && !file.delete()) {
                        HSLogger.m65441d("HCCacheEvctnMngr", "Failed to delete file : " + file.getPath());
                    }
                }
            }
        }
    }
}
