package com.smaato.sdk.richmedia.util;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.DnsResolver;
import com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.rawresourceloader.RawResourceLoader;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import com.smaato.sdk.richmedia_light.C27626R;

/* loaded from: classes7.dex */
public class OutstreamAdTemplateResourceCache extends VersionBasedDnsResourceCache<String> {
    private final RawResourceLoader rawResourceLoader;

    public OutstreamAdTemplateResourceCache(@NonNull SharedPreferences sharedPreferences, @NonNull DnsResolver dnsResolver, @NonNull String str, @NonNull RawResourceLoader rawResourceLoader, @NonNull SimpleHttpClient simpleHttpClient, @NonNull Logger logger) {
        super(sharedPreferences, dnsResolver, "outstream_ad_template", str, simpleHttpClient, logger);
        this.rawResourceLoader = rawResourceLoader;
        start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache
    public String decodeResource(@NonNull String str) {
        return str;
    }

    @Override // com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache
    @NonNull
    protected String getDomainForDnsQuery() {
        return "smaato_outstream_ad_template\\.txt.sdk-files.smaato.net";
    }

    @Override // com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache
    @NonNull
    protected String getResourceUrl() {
        return "https://sdk-files.smaato.net/smaato_outstream_ad_template.txt";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache
    @NonNull
    public String getInitialResource() {
        return this.rawResourceLoader.readRawTextFile(C27626R.raw.html_player_vast);
    }
}
