package com.smaato.sdk.core.remoteconfig.global;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.DnsResolver;
import com.smaato.sdk.core.errorreport.ErrorReportFactory;
import com.smaato.sdk.core.errorreport.ErrorReporter;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;

/* loaded from: classes7.dex */
public class GenericConfigProvider {
    @NonNull
    String configurationUrl;
    @NonNull
    DnsResolver dnsResolver;
    @NonNull
    ErrorReportFactory errorReportFactory;
    @NonNull
    ErrorReporter errorReporter;
    @NonNull
    Logger logger;
    @NonNull
    NetworkStateMonitor networkStateMonitor;
    private GenericConfigResourceCache resourceCache;
    @NonNull
    String resourceKey;
    @NonNull
    SharedPreferences sharedPreferences;
    @NonNull
    SimpleHttpClient simpleHttpClient;

    public GenericConfigProvider(@NonNull SharedPreferences sharedPreferences, @NonNull DnsResolver dnsResolver, @NonNull String str, @NonNull SimpleHttpClient simpleHttpClient, @NonNull Logger logger) {
        this.sharedPreferences = sharedPreferences;
        this.dnsResolver = dnsResolver;
        this.resourceKey = str;
        this.simpleHttpClient = simpleHttpClient;
        this.logger = logger;
    }

    public void fetchConfiguration() {
        GenericConfigResourceCache genericConfigResourceCache = new GenericConfigResourceCache(this.sharedPreferences, this.dnsResolver, "1", this.logger, this.simpleHttpClient);
        this.resourceCache = genericConfigResourceCache;
        genericConfigResourceCache.start();
    }

    @NonNull
    public GenericConfig getConfiguration() {
        GenericConfigResourceCache genericConfigResourceCache = this.resourceCache;
        if (genericConfigResourceCache == null) {
            this.logger.error(LogDomain.CORE, "Publisher Configuration request from uninitialized resource cache, returning default configuration", new Object[0]);
            return GenericConfig.create();
        }
        return genericConfigResourceCache.get();
    }
}
