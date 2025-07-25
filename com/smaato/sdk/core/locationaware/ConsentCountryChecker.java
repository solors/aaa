package com.smaato.sdk.core.locationaware;

import android.content.Context;
import android.text.TextUtils;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes7.dex */
public class ConsentCountryChecker {
    private final Context context;
    private final DnsLookup dns;
    private volatile List<TxtRecord> dnsRecords;
    private volatile Boolean isGeoDns;
    private final Logger logger;
    private volatile String networkCountryIso;
    private volatile String simCountryIso;
    private final SimInfo simInfo;
    private final TzSettings tzSettings;

    public ConsentCountryChecker(Context context, SimInfo simInfo, TzSettings tzSettings, DnsLookup dnsLookup, Logger logger) {
        this.logger = logger;
        this.dns = dnsLookup;
        this.context = context;
        this.simInfo = simInfo;
        this.tzSettings = tzSettings;
    }

    private List<TxtRecord> getDNSRecords(String str) throws IOException {
        if (this.dnsRecords == null || this.dnsRecords.isEmpty()) {
            this.dnsRecords = this.dns.blockingTxt(str);
        }
        return this.dnsRecords;
    }

    private String getNetworkCountryIso() {
        if (this.networkCountryIso == null) {
            this.networkCountryIso = this.simInfo.getNetworkCountryIso();
        }
        return this.networkCountryIso;
    }

    private String getSimCountryIso() {
        if (this.simCountryIso == null) {
            this.simCountryIso = this.simInfo.getSimCountryIso();
        }
        return this.simCountryIso;
    }

    private boolean isConsentCountry(String str, Set<String> set) {
        if (!TextUtils.isEmpty(str) && set.contains(str.toUpperCase(Locale.US))) {
            return true;
        }
        return false;
    }

    public String getPackageName() {
        return this.context.getPackageName();
    }

    public boolean isConsentCountryBySIM(Set<String> set) {
        boolean z;
        synchronized (this) {
            if (!isConsentCountry(getSimCountryIso(), set) && !isConsentCountry(getNetworkCountryIso(), set)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public boolean isConsentCountryByTimeZone(Map<String, String> map) {
        synchronized (this) {
            if (this.tzSettings.isAutoTimeZoneEnabled()) {
                return map.containsKey(TimeZone.getDefault().getID());
            }
            return false;
        }
    }

    public boolean isGeoDns(String str, String str2) {
        synchronized (this) {
            try {
                this.isGeoDns = Boolean.FALSE;
                List<TxtRecord> dNSRecords = getDNSRecords(str);
                if (dNSRecords != null) {
                    for (TxtRecord txtRecord : dNSRecords) {
                        if (txtRecord != null && txtRecord.data() != null) {
                            String[] split = txtRecord.data().split(":");
                            if (split.length > 1 && str2.equalsIgnoreCase(split[1].trim())) {
                                this.isGeoDns = Boolean.TRUE;
                            }
                        }
                    }
                }
            } catch (IOException e) {
                this.logger.error(LogDomain.NETWORK, e, "Error when checking geo dns", new Object[0]);
            }
        }
        if (this.isGeoDns == null || !this.isGeoDns.booleanValue()) {
            return false;
        }
        return true;
    }
}
