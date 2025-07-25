package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class ConfigGetParameterHandler {
    @VisibleForTesting(otherwise = 3)
    public static final Charset FRC_BYTE_ARRAY_ENCODING = Charset.forName("UTF-8");

    /* renamed from: e */
    static final Pattern f43503e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: f */
    static final Pattern f43504f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    private final Set<BiConsumer<String, ConfigContainer>> f43505a = new HashSet();

    /* renamed from: b */
    private final Executor f43506b;

    /* renamed from: c */
    private final ConfigCacheClient f43507c;

    /* renamed from: d */
    private final ConfigCacheClient f43508d;

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f43506b = executor;
        this.f43507c = configCacheClient;
        this.f43508d = configCacheClient2;
    }

    /* renamed from: b */
    private void m66371b(final String str, final ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        synchronized (this.f43505a) {
            for (final BiConsumer<String, ConfigContainer> biConsumer : this.f43505a) {
                this.f43506b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        biConsumer.accept(str, configContainer);
                    }
                });
            }
        }
    }

    @Nullable
    /* renamed from: c */
    private static ConfigContainer m66370c(ConfigCacheClient configCacheClient) {
        return configCacheClient.getBlocking();
    }

    @Nullable
    /* renamed from: d */
    private static Double m66369d(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer m66370c = m66370c(configCacheClient);
        if (m66370c == null) {
            return null;
        }
        try {
            return Double.valueOf(m66370c.getConfigs().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Set<String> m66368e(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer m66370c = m66370c(configCacheClient);
        if (m66370c == null) {
            return hashSet;
        }
        Iterator<String> keys = m66370c.getConfigs().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: f */
    private static TreeSet<String> m66367f(String str, ConfigContainer configContainer) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> keys = configContainer.getConfigs().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    @Nullable
    /* renamed from: g */
    private static Long m66366g(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer m66370c = m66370c(configCacheClient);
        if (m66370c == null) {
            return null;
        }
        try {
            return Long.valueOf(m66370c.getConfigs().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: h */
    private static String m66365h(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer m66370c = m66370c(configCacheClient);
        if (m66370c == null) {
            return null;
        }
        try {
            return m66370c.getConfigs().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static void m66363j(String str, String str2) {
        Log.w(FirebaseRemoteConfig.TAG, String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void addListener(BiConsumer<String, ConfigContainer> biConsumer) {
        synchronized (this.f43505a) {
            this.f43505a.add(biConsumer);
        }
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m66368e(this.f43507c));
        hashSet.addAll(m66368e(this.f43508d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, getValue(str));
        }
        return hashMap;
    }

    public boolean getBoolean(String str) {
        String m66365h = m66365h(this.f43507c, str);
        if (m66365h != null) {
            if (f43503e.matcher(m66365h).matches()) {
                m66371b(str, m66370c(this.f43507c));
                return true;
            } else if (f43504f.matcher(m66365h).matches()) {
                m66371b(str, m66370c(this.f43507c));
                return false;
            }
        }
        String m66365h2 = m66365h(this.f43508d, str);
        if (m66365h2 != null) {
            if (f43503e.matcher(m66365h2).matches()) {
                return true;
            }
            if (f43504f.matcher(m66365h2).matches()) {
                return false;
            }
        }
        m66363j(str, "Boolean");
        return false;
    }

    public byte[] getByteArray(String str) {
        String m66365h = m66365h(this.f43507c, str);
        if (m66365h != null) {
            m66371b(str, m66370c(this.f43507c));
            return m66365h.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        String m66365h2 = m66365h(this.f43508d, str);
        if (m66365h2 != null) {
            return m66365h2.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        m66363j(str, "ByteArray");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
    }

    public double getDouble(String str) {
        Double m66369d = m66369d(this.f43507c, str);
        if (m66369d != null) {
            m66371b(str, m66370c(this.f43507c));
            return m66369d.doubleValue();
        }
        Double m66369d2 = m66369d(this.f43508d, str);
        if (m66369d2 != null) {
            return m66369d2.doubleValue();
        }
        m66363j(str, "Double");
        return 0.0d;
    }

    public Set<String> getKeysByPrefix(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        ConfigContainer m66370c = m66370c(this.f43507c);
        if (m66370c != null) {
            treeSet.addAll(m66367f(str, m66370c));
        }
        ConfigContainer m66370c2 = m66370c(this.f43508d);
        if (m66370c2 != null) {
            treeSet.addAll(m66367f(str, m66370c2));
        }
        return treeSet;
    }

    public long getLong(String str) {
        Long m66366g = m66366g(this.f43507c, str);
        if (m66366g != null) {
            m66371b(str, m66370c(this.f43507c));
            return m66366g.longValue();
        }
        Long m66366g2 = m66366g(this.f43508d, str);
        if (m66366g2 != null) {
            return m66366g2.longValue();
        }
        m66363j(str, "Long");
        return 0L;
    }

    public String getString(String str) {
        String m66365h = m66365h(this.f43507c, str);
        if (m66365h != null) {
            m66371b(str, m66370c(this.f43507c));
            return m66365h;
        }
        String m66365h2 = m66365h(this.f43508d, str);
        if (m66365h2 != null) {
            return m66365h2;
        }
        m66363j(str, "String");
        return "";
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        String m66365h = m66365h(this.f43507c, str);
        if (m66365h != null) {
            m66371b(str, m66370c(this.f43507c));
            return new FirebaseRemoteConfigValueImpl(m66365h, 2);
        }
        String m66365h2 = m66365h(this.f43508d, str);
        if (m66365h2 != null) {
            return new FirebaseRemoteConfigValueImpl(m66365h2, 1);
        }
        m66363j(str, "FirebaseRemoteConfigValue");
        return new FirebaseRemoteConfigValueImpl("", 0);
    }
}
