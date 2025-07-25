package com.smaato.sdk.core.dnsbasedresource;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.dns.DnsResolver;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes7.dex */
public abstract class VersionBasedDnsResourceCache<T> {
    private static final Pattern PATTERN = Pattern.compile("[a-f0-9]{32}");
    private final DnsBasedKeyValuePairLoader dnsBasedKeyValuePairLoader;
    private T inMemoryCache;
    private T initialResource;
    private final String resourceKey;
    private final SharedPreferences sharedPreferences;
    private final SimpleHttpClient simpleHttpClient;

    public VersionBasedDnsResourceCache(@NonNull SharedPreferences sharedPreferences, @NonNull DnsResolver dnsResolver, @NonNull String str, @NonNull final String str2, @NonNull SimpleHttpClient simpleHttpClient, @NonNull Logger logger) {
        this.sharedPreferences = sharedPreferences;
        this.resourceKey = str;
        this.simpleHttpClient = simpleHttpClient;
        this.dnsBasedKeyValuePairLoader = new DnsBasedKeyValuePairLoader(dnsResolver, getDomainForDnsQuery(), new Predicate() { // from class: com.smaato.sdk.core.dnsbasedresource.d
            @Override // com.smaato.sdk.core.util.p574fi.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$0;
                lambda$new$0 = VersionBasedDnsResourceCache.lambda$new$0(str2, (Map) obj);
                return lambda$new$0;
            }
        }, logger);
    }

    @Nullable
    private String getActualVersionNumberFromDns() {
        return this.dnsBasedKeyValuePairLoader.getKeyValuePairs().get("ETAG");
    }

    private String getVersionNumberFromHeaderFields(Map<String, List<String>> map) {
        List<String> list = map.get("ETag");
        if (list != null && list.size() > 0) {
            Matcher matcher = PATTERN.matcher(list.get(0));
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }

    public static /* synthetic */ boolean lambda$new$0(String str, Map map) {
        return str.equals(map.get("v"));
    }

    public void readLocalResource() {
        synchronized (this) {
            if (this.inMemoryCache == null) {
                String string = this.sharedPreferences.getString(this.resourceKey, null);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        this.inMemoryCache = decodeResource(string);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void saveLocalResource(String str) {
        this.sharedPreferences.edit().putString(this.resourceKey, str).apply();
    }

    private void update() {
        Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.core.dnsbasedresource.e
            {
                VersionBasedDnsResourceCache.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VersionBasedDnsResourceCache.this.updateLocalResource();
            }
        });
        Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.core.dnsbasedresource.f
            {
                VersionBasedDnsResourceCache.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VersionBasedDnsResourceCache.this.readLocalResource();
            }
        });
    }

    public void updateLocalResource() {
        synchronized (this) {
            String actualVersionNumberFromDns = getActualVersionNumberFromDns();
            String localVersionNumber = getLocalVersionNumber();
            if (actualVersionNumberFromDns != null && !actualVersionNumberFromDns.equals(localVersionNumber)) {
                HashMap hashMap = new HashMap();
                String readString = this.simpleHttpClient.readString(getResourceUrl(), hashMap);
                String versionNumberFromHeaderFields = getVersionNumberFromHeaderFields(hashMap);
                if (readString != null && actualVersionNumberFromDns.equals(versionNumberFromHeaderFields)) {
                    saveLocalVersionNumber(versionNumberFromHeaderFields);
                    saveLocalResource(readString);
                    try {
                        this.inMemoryCache = decodeResource(readString);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    protected abstract T decodeResource(@NonNull String str) throws JSONException;

    public T get() {
        T t = this.inMemoryCache;
        if (t != null) {
            return t;
        }
        return this.initialResource;
    }

    @NonNull
    protected abstract String getDomainForDnsQuery();

    @NonNull
    protected abstract T getInitialResource();

    @NonNull
    public String getLocalVersionNumber() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        return sharedPreferences.getString(this.resourceKey + ".version", "");
    }

    @NonNull
    protected abstract String getResourceUrl();

    public void saveLocalVersionNumber(String str) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(this.resourceKey + ".version", str).apply();
    }

    public void start() {
        this.initialResource = getInitialResource();
        update();
    }
}
