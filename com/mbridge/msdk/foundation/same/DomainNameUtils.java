package com.mbridge.msdk.foundation.same;

import com.mbridge.msdk.foundation.tools.SameBase64Tool;
import com.mbridge.msdk.system.NoProGuard;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class DomainNameUtils implements NoProGuard {
    public String AUTHORITY_DEFAULT_INFO_URL;
    public String DEFAULT_CDN_SPARE_SETTING_URL;
    public String DEFAULT_HB_HOST;
    public String DEFAULT_HOST_ANALYTICS;
    public String DEFAULT_HOST_API;
    public String DEFAULT_HOST_APPLETS;
    public String DEFAULT_HOST_MONITOR_DEFAULT;
    public String DEFAULT_HOST_MONITOR_DEFAULT_CN;
    public String DEFAULT_HOST_MONITOR_DEFAULT_NONE_CN;
    public String DEFAULT_HOST_PRIVACY;
    public String DEFAULT_HOST_PRIVACY_CN;
    public String DEFAULT_HOST_PRIVACY_NONE_CN;
    public String DEFAULT_HOST_REVENUE_DEFAULT;
    public String DEFAULT_HOST_REVENUE_DEFAULT_CN;
    public String DEFAULT_HOST_REVENUE_DEFAULT_NONE_CN;
    public String DEFAULT_HOST_SETTING;
    public String DEFAULT_HOST_TCP_ANALYTICS;
    public String DEFAULT_HOST_TCP_MONITOR;
    public String DEFAULT_HOST_TCP_MONITOR_CN;
    public String DEFAULT_HOST_TCP_MONITOR_NONE_CN;
    public String DEFAULT_HOST_TCP_REVENUE;
    public String DEFAULT_HOST_TCP_REVENUE_CN;
    public String DEFAULT_HOST_TCP_REVENUE_NONE_CN;
    public String DEFAULT_HOST_TCP_SETTING;
    public String OM_JS_H5_URL_DEFAULT;
    public String OM_JS_SERVICE_URL_DEFAULT;
    public ArrayList<String> SPARE_SETTING_HOST;
    public ArrayList<String> SPARE_TCP_SETTING_HOST;
    private boolean isExcludeCNDomain;
    public static final String VERIFICATION_URL = SameBase64Tool.m51603a("LdxThdi1WBKAiB22hB2bH+fTWnR/Dk2t4rK/D+JAWrfXYZKXY+f3LB2rLkeQhBKUYF2MY7QtYrfQWkuAWFKwLkNwJrcsLkxtJ7QXY02FH+zuHrQUD+xuYF9whFfBL+STW+DeWruA");
    private static final String AUTHORITY_DEFAULT_INFO_URL_CN = SameBase64Tool.m51603a("LdxThdi1WBKE4kzuhrN/hrcPLg5whoPUYFTXhgDXD+5TL7KBL+uTLkK/WrtTYkM=");
    private static final String AUTHORITY_DEFAULT_INFO_URL_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKE4kzuhrN/Y+xgHFeXDrcshBPUYFTXhgDXD+5TL7KBL+uTLkK/WrtTYkM=");
    private static final String DEFAULT_CDN_SPARE_SETTING_URL_CN = SameBase64Tool.m51603a("LdxThdi1WBK3i+xBJnlFh+z04nhBioPUY7K2H7HBYFPTWrPQJoKEYbfThF5TJ7Q/HM==");
    private static final String DEFAULT_CDN_SPARE_SETTING_URL_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBK3i+xBJnlFh+z04nhBioPUY7K2H7HBYFPTWrPQJoKEYbfThF5TJ7Q/HB2wJ7JgY7K0DkeA");
    private static final String DEFAULT_HB_HOST_CN = SameBase64Tool.m51603a("LdxThdi1WBKO6kt0Wgzt4ku2Y+v/DFKw");
    private static final String DEFAULT_HB_HOST_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKO6kt0Wr2THFJsYFztYdi/DFKw");
    private static final String DEFAULT_HOST_ANALYTICS_CN = SameBase64Tool.m51603a("LdxThdi1WBKtYrcs4+xuDbi/hrcPLg5whoPUYFT=");
    private static final String DEFAULT_HOST_ANALYTICS_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKtYrcs4+xuDbi/Y+xgHFeXDrcshBPUYFT=");
    private static final String DEFAULT_HOST_API_CN = SameBase64Tool.m51603a("LdxThdi1WBK/H+N/hrcPLg5whoPUYFT=");
    private static final String DEFAULT_HOST_API_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBK/H+N/Y+xgHFeXDrcshBPUYFT=");
    private static final String DEFAULT_HOST_APPLETS_CN = SameBase64Tool.m51603a("LdxThdi1WBKUY02wDkJ/H+N/hrcPLg5whoPUYFTXYkQ/LZKADFtQYkV=");
    private static final String DEFAULT_HOST_SETTING_CN = SameBase64Tool.m51603a("LdxThdi1WBKUYFPrLkJ2hrV/hrcPLg5whoPUYFT=");
    private static final String DEFAULT_HOST_SETTING_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKUYFPrLkJ2hrV/Y+xgHFeXDrcshBPUYFT=");
    private static final String DEFAULT_HOST_TCP_ANALYTICS_CN = SameBase64Tool.m51603a("DkPtYdQTLkfAW+xUhoPwLkPTHkJBDkM/Yr5T");
    private static final String DEFAULT_HOST_TCP_ANALYTICS_NONE_CN = SameBase64Tool.m51603a("DkPtYdQTLkfAW+xUhoPwJ7JgY7K0DkeAWrfXYN==");
    private static final String DEFAULT_HOST_TCP_SETTING_CN = SameBase64Tool.m51603a("DFK/HrQgJ+zQW+xUhoPBD+QqJk2MWrfXYN==");
    private static final String DEFAULT_HOST_TCP_SETTING_NONE_CN = SameBase64Tool.m51603a("DFK/HrQgJ+zQW+xUhoPwJ7JgY7K0DkeAWrfXYN==");
    private static final String OM_JS_H5_URL_DEFAULT_CN = SameBase64Tool.m51603a("LdxThdi1WBKwJ7hwYrcTL+HQWgzt4ku2Y+v/DFKwWFKwhFx8WFKwhFx8Lgf6DFKwYkK/+FuAWgx9Jv==");
    private static final String OM_JS_H5_URL_DEFAULT_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKwJ7hwYrcTL+HQWr2THFJsYFztYdi/DFKwWFKwhFx8WFKwhFx8Lgf6DFKwYkK/+FuAWgx9Jv==");
    private static final String OM_JS_SERVICE_URL_DEFAULT_CN = SameBase64Tool.m51603a("LdxThdi1WBKUH79wDkx/WktTJdSAWgzt4ku2Y+v/DFKwWFf3Y02tH79XJURXh7KBJ7csWAjPWAv9WARMWAjeWAvFWA53fkRFiFf0faVbHnR/Lgi=");
    private static final String OM_JS_SERVICE_URL_DEFAULT_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKUH79wDkx/WktTJdSAWr2THFJsYFztYdi/DFKwWFf3Y02tH79XJURXh7KBJ7csWAjPWAv9WARMWAjeWAvFWA53fkRFiFf0faVbHnR/Lgi=");
    private static final ArrayList<String> SPARE_SETTING_HOST_CN = new ArrayList<>(Arrays.asList(SameBase64Tool.m51603a("LdxThdi1WBKUYFPrLkJ2hrV/hrcPLg5whoPUYFT="), SameBase64Tool.m51603a("LdxThdi1WBKMYFeuDb3/hrcPLg5whoPUYFT="), SameBase64Tool.m51603a("LdxThdi1WBKsD+uPWgzt4ku2Y+v/DFKw"), SameBase64Tool.m51603a("LdxThdi1WBKUL75ULBPBD+QqJk2MWrfXYN==")));
    private static final ArrayList<String> SPARE_SETTING_HOST_NONE_CN = new ArrayList<>(Arrays.asList(SameBase64Tool.m51603a("LdxThdi1WBKUYFPrLkJ2hrV/Y+xgHFeXDrcshBPUYFT="), SameBase64Tool.m51603a("LdxThdi1WBKMYFeuDb3/Y+xgHFeXDrcshBPUYFT="), SameBase64Tool.m51603a("LdxThdi1WBKsD+uPWr2THFJsYFztYdi/DFKw"), SameBase64Tool.m51603a("LdxThdi1WBKUL75ULBPwJ7JgY7K0DkeAWrfXYN==")));
    private static final ArrayList<String> SPARE_TCP_SETTING_HOST_CN = new ArrayList<>(Arrays.asList(SameBase64Tool.m51603a("DFK/HrQgJ+zQW+xUhoPBD+QqJk2MWrfXYN=="), SameBase64Tool.m51603a("h7KsLkfPW+xUhoPBD+QqJk2MWrfXYN=="), SameBase64Tool.m51603a("Y7c14Z2TDbv/hrcPLg5whoPUYFT="), SameBase64Tool.m51603a("DFtQDFswJ7fMWgzt4ku2Y+v/DFKw")));
    private static final ArrayList<String> SPARE_TCP_SETTING_HOST_NONE_CN = new ArrayList<>(Arrays.asList(SameBase64Tool.m51603a("DFK/HrQgJ+zQW+xUhoPwJ7JgY7K0DkeAWrfXYN=="), SameBase64Tool.m51603a("h7KsLkfPW+xUhoPwJ7JgY7K0DkeAWrfXYN=="), SameBase64Tool.m51603a("Y7c14Z2TDbv/Y+xgHFeXDrcshBPUYFT="), SameBase64Tool.m51603a("DFtQDFswJ7fMWr2THFJsYFztYdi/DFKw")));

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.foundation.same.DomainNameUtils$a */
    /* loaded from: classes6.dex */
    public static final class C21965a {

        /* renamed from: a */
        public static final DomainNameUtils f56431a = new DomainNameUtils();
    }

    public static DomainNameUtils getInstance() {
        return C21965a.f56431a;
    }

    public void excludeCNDomain() {
        this.isExcludeCNDomain = true;
        this.DEFAULT_HB_HOST = DEFAULT_HB_HOST_NONE_CN;
        this.DEFAULT_HOST_ANALYTICS = DEFAULT_HOST_ANALYTICS_NONE_CN;
        this.DEFAULT_HOST_TCP_ANALYTICS = DEFAULT_HOST_TCP_ANALYTICS_NONE_CN;
        this.DEFAULT_HOST_API = DEFAULT_HOST_API_NONE_CN;
        this.DEFAULT_HOST_SETTING = DEFAULT_HOST_SETTING_NONE_CN;
        this.DEFAULT_HOST_TCP_SETTING = DEFAULT_HOST_TCP_SETTING_NONE_CN;
        this.DEFAULT_CDN_SPARE_SETTING_URL = DEFAULT_CDN_SPARE_SETTING_URL_NONE_CN;
        this.SPARE_SETTING_HOST = SPARE_SETTING_HOST_NONE_CN;
        this.SPARE_TCP_SETTING_HOST = SPARE_TCP_SETTING_HOST_NONE_CN;
        this.AUTHORITY_DEFAULT_INFO_URL = AUTHORITY_DEFAULT_INFO_URL_NONE_CN;
        this.OM_JS_SERVICE_URL_DEFAULT = OM_JS_SERVICE_URL_DEFAULT_NONE_CN;
        this.OM_JS_H5_URL_DEFAULT = OM_JS_H5_URL_DEFAULT_NONE_CN;
        this.DEFAULT_HOST_REVENUE_DEFAULT = this.DEFAULT_HOST_REVENUE_DEFAULT_NONE_CN;
        this.DEFAULT_HOST_TCP_REVENUE = this.DEFAULT_HOST_TCP_REVENUE_NONE_CN;
        this.DEFAULT_HOST_PRIVACY = this.DEFAULT_HOST_PRIVACY_NONE_CN;
        this.DEFAULT_HOST_TCP_MONITOR_CN = this.DEFAULT_HOST_TCP_MONITOR_NONE_CN;
        this.DEFAULT_HOST_MONITOR_DEFAULT = this.DEFAULT_HOST_MONITOR_DEFAULT_NONE_CN;
    }

    public boolean isExcludeCNDomain() {
        return this.isExcludeCNDomain;
    }

    private DomainNameUtils() {
        this.AUTHORITY_DEFAULT_INFO_URL = AUTHORITY_DEFAULT_INFO_URL_CN;
        this.DEFAULT_CDN_SPARE_SETTING_URL = DEFAULT_CDN_SPARE_SETTING_URL_CN;
        this.DEFAULT_HB_HOST = DEFAULT_HB_HOST_CN;
        this.DEFAULT_HOST_ANALYTICS = DEFAULT_HOST_ANALYTICS_CN;
        this.DEFAULT_HOST_API = DEFAULT_HOST_API_CN;
        this.DEFAULT_HOST_APPLETS = DEFAULT_HOST_APPLETS_CN;
        String m51603a = SameBase64Tool.m51603a("LdxThdi1WBKXDgfQhgHQWktTJdv/YkQ/J75ghrcsWrPQJv==");
        this.DEFAULT_HOST_MONITOR_DEFAULT_CN = m51603a;
        this.DEFAULT_HOST_MONITOR_DEFAULT = m51603a;
        this.DEFAULT_HOST_MONITOR_DEFAULT_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKXDgfQhgHQWktTJdv/Y+xgHFeXDrcshBPUYFT=");
        String m51603a2 = SameBase64Tool.m51603a("LdxThdi1WBKbJbh/YkQ/J75ghrcsWrfXYZKQY0KMhrQFDkfPWM==");
        this.DEFAULT_HOST_PRIVACY_CN = m51603a2;
        this.DEFAULT_HOST_PRIVACY = m51603a2;
        this.DEFAULT_HOST_PRIVACY_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKbJbh/Y+xgHFeXDrcshBPUYFTXHk9XhdzuJrcU4ZI=");
        String m51603a3 = SameBase64Tool.m51603a("LdxThdi1WBKUY73wHrR/YkQ/J75ghrcsWrPQJv==");
        this.DEFAULT_HOST_REVENUE_DEFAULT_CN = m51603a3;
        this.DEFAULT_HOST_REVENUE_DEFAULT = m51603a3;
        this.DEFAULT_HOST_REVENUE_DEFAULT_NONE_CN = SameBase64Tool.m51603a("LdxThdi1WBKUY73wHrR/Y+xgHFeXDrcshBPUYFT=");
        this.DEFAULT_HOST_SETTING = DEFAULT_HOST_SETTING_CN;
        this.DEFAULT_HOST_TCP_ANALYTICS = DEFAULT_HOST_TCP_ANALYTICS_CN;
        String m51603a4 = SameBase64Tool.m51603a("YFzAH+zFHZ2TDbv/YkQ/J75ghrcsWrPQJv==");
        this.DEFAULT_HOST_TCP_MONITOR_CN = m51603a4;
        this.DEFAULT_HOST_TCP_MONITOR = m51603a4;
        this.DEFAULT_HOST_TCP_MONITOR_NONE_CN = SameBase64Tool.m51603a("YFzAH+zFHZ2TDbv/Y+xgHFeXDrcshBPUYFT=");
        String m51603a5 = SameBase64Tool.m51603a("DFeuWkH0W+xUhoPwLkPTHkJBDkM/Yr5T");
        this.DEFAULT_HOST_TCP_REVENUE_CN = m51603a5;
        this.DEFAULT_HOST_TCP_REVENUE = m51603a5;
        this.DEFAULT_HOST_TCP_REVENUE_NONE_CN = SameBase64Tool.m51603a("DFeuWkH0W+xUhoPwJ7JgY7K0DkeAWrfXYN==");
        this.DEFAULT_HOST_TCP_SETTING = DEFAULT_HOST_TCP_SETTING_CN;
        this.OM_JS_H5_URL_DEFAULT = OM_JS_H5_URL_DEFAULT_CN;
        this.OM_JS_SERVICE_URL_DEFAULT = OM_JS_SERVICE_URL_DEFAULT_CN;
        this.SPARE_SETTING_HOST = SPARE_SETTING_HOST_CN;
        this.SPARE_TCP_SETTING_HOST = SPARE_TCP_SETTING_HOST_CN;
        this.isExcludeCNDomain = false;
    }
}
