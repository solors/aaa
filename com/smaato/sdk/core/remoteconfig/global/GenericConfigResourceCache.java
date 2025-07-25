package com.smaato.sdk.core.remoteconfig.global;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.BuildConfig;
import com.smaato.sdk.core.dns.DnsResolver;
import com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class GenericConfigResourceCache extends VersionBasedDnsResourceCache<GenericConfig> {
    public GenericConfigResourceCache(@NonNull SharedPreferences sharedPreferences, @NonNull DnsResolver dnsResolver, @NonNull String str, @NonNull Logger logger, @NonNull SimpleHttpClient simpleHttpClient) {
        super(sharedPreferences, dnsResolver, "remote_config_url_template", str, simpleHttpClient, logger);
        if (getLocalVersionNumber().isEmpty()) {
            saveLocalVersionNumber(BuildConfig.SDK_REMOTE_CONFIG_VERSION);
        }
    }

    @Override // com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache
    @NonNull
    protected String getDomainForDnsQuery() {
        return "smaato_sdk_remote_config\\.json.sdk-files.smaato.net";
    }

    @Override // com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache
    @NonNull
    protected String getResourceUrl() {
        return BuildConfig.SDK_REMOTE_CONFIG_URL;
    }

    @Override // com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache
    public GenericConfig decodeResource(@NonNull String str) throws JSONException {
        return GenericConfig.create(new JSONObject(str));
    }

    @Override // com.smaato.sdk.core.dnsbasedresource.VersionBasedDnsResourceCache
    @NonNull
    public GenericConfig getInitialResource() {
        return GenericConfig.create();
    }
}
