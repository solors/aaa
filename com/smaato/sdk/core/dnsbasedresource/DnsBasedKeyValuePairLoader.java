package com.smaato.sdk.core.dnsbasedresource;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.DnsResolver;
import com.smaato.sdk.core.dns.ResolverResult;
import com.smaato.sdk.core.dns.TXT;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class DnsBasedKeyValuePairLoader {
    private final String dnsDomain;
    private final DnsResolver dnsResolver;
    private final Logger logger;
    private final Predicate<Map<String, String>> recordFilter;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DnsBasedKeyValuePairLoader(DnsResolver dnsResolver, String str, Predicate<Map<String, String>> predicate, Logger logger) {
        this.dnsResolver = dnsResolver;
        this.dnsDomain = str;
        this.recordFilter = predicate;
        this.logger = logger;
    }

    @NonNull
    public Map<String, String> getKeyValuePairs() {
        try {
            ResolverResult resolve = this.dnsResolver.resolve(this.dnsDomain, TXT.class);
            if (resolve.getAnswers().isEmpty()) {
                return new HashMap();
            }
            HashMap hashMap = new HashMap();
            for (TXT txt : resolve.getAnswers()) {
                Map<String, String> keyValuePairs = getKeyValuePairs(txt.getText());
                if (this.recordFilter.test(keyValuePairs)) {
                    hashMap.putAll(keyValuePairs);
                }
            }
            return hashMap;
        } catch (Exception e) {
            Logger logger = this.logger;
            LogDomain logDomain = LogDomain.CORE;
            logger.error(logDomain, "Error while parsing key-value pairs from DNS record for domain " + this.dnsDomain, e);
            return new HashMap();
        }
    }

    @NonNull
    private Map<String, String> getKeyValuePairs(String str) {
        int i;
        if (str != null && !TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                int indexOf = str2.indexOf("=");
                hashMap.put(indexOf > 0 ? str2.substring(0, indexOf) : str2, (indexOf <= 0 || str2.length() <= (i = indexOf + 1)) ? null : str2.substring(i));
            }
            return hashMap;
        }
        return new HashMap();
    }
}
