package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Fg */
/* loaded from: classes9.dex */
public final class C33897Fg extends C34199S5 {

    /* renamed from: d */
    public boolean f92843d;

    /* renamed from: e */
    public Location f92844e;

    /* renamed from: f */
    public boolean f92845f;

    /* renamed from: g */
    public int f92846g;

    /* renamed from: h */
    public int f92847h;

    /* renamed from: i */
    public boolean f92848i;

    /* renamed from: j */
    public int f92849j;

    /* renamed from: k */
    public Boolean f92850k;

    /* renamed from: l */
    public InterfaceC33822Cg f92851l;

    /* renamed from: m */
    public final InterfaceC33872Eg f92852m;

    /* renamed from: n */
    public String f92853n;

    /* renamed from: o */
    public boolean f92854o;

    /* renamed from: p */
    public boolean f92855p;

    /* renamed from: q */
    public String f92856q;

    /* renamed from: r */
    public List f92857r;

    /* renamed from: s */
    public int f92858s;

    /* renamed from: t */
    public long f92859t;

    /* renamed from: u */
    public long f92860u;

    /* renamed from: v */
    public boolean f92861v;

    /* renamed from: w */
    public long f92862w;

    /* renamed from: x */
    public List f92863x;

    public C33897Fg(C34580h5 c34580h5) {
        this.f92852m = c34580h5;
    }

    /* renamed from: a */
    public final void m22650a(Location location) {
        this.f92844e = location;
    }

    /* renamed from: b */
    public final void m22644b(List<String> list) {
        this.f92857r = list;
    }

    /* renamed from: c */
    public final String m22642c() {
        return this.f92853n;
    }

    /* renamed from: d */
    public final void m22636d(boolean z) {
        this.f92843d = z;
    }

    /* renamed from: e */
    public final void m22634e(boolean z) {
        this.f92848i = z;
    }

    /* renamed from: f */
    public final void m22632f(boolean z) {
        this.f92854o = z;
    }

    @NonNull
    /* renamed from: g */
    public final String m22631g() {
        return (String) WrapUtils.getOrDefault(this.f92856q, "");
    }

    /* renamed from: h */
    public final boolean m22630h() {
        return this.f92851l.mo21502a(this.f92850k);
    }

    /* renamed from: i */
    public final int m22629i() {
        return this.f92847h;
    }

    /* renamed from: j */
    public final Location m22628j() {
        return this.f92844e;
    }

    /* renamed from: k */
    public final long m22627k() {
        return this.f92862w;
    }

    /* renamed from: l */
    public final int m22626l() {
        return this.f92849j;
    }

    /* renamed from: m */
    public final long m22625m() {
        return this.f92859t;
    }

    /* renamed from: n */
    public final long m22624n() {
        return this.f92860u;
    }

    /* renamed from: o */
    public final List<String> m22623o() {
        return this.f92857r;
    }

    /* renamed from: p */
    public final int m22622p() {
        return this.f92846g;
    }

    /* renamed from: q */
    public final boolean m22621q() {
        return this.f92855p;
    }

    /* renamed from: r */
    public final boolean m22620r() {
        return this.f92845f;
    }

    /* renamed from: s */
    public final boolean m22619s() {
        return this.f92843d;
    }

    /* renamed from: t */
    public final boolean m22618t() {
        return this.f92854o;
    }

    @Override // io.appmetrica.analytics.impl.C34199S5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f92843d + ", mManualLocation=" + this.f92844e + ", mFirstActivationAsUpdate=" + this.f92845f + ", mSessionTimeout=" + this.f92846g + ", mDispatchPeriod=" + this.f92847h + ", mLogEnabled=" + this.f92848i + ", mMaxReportsCount=" + this.f92849j + ", dataSendingEnabledFromArguments=" + this.f92850k + ", dataSendingStrategy=" + this.f92851l + ", mPreloadInfoSendingStrategy=" + this.f92852m + ", mApiKey='" + this.f92853n + "', mPermissionsCollectingEnabled=" + this.f92854o + ", mFeaturesCollectingEnabled=" + this.f92855p + ", mClidsFromStartupResponse='" + this.f92856q + "', mReportHosts=" + this.f92857r + ", mAttributionId=" + this.f92858s + ", mPermissionsCollectingIntervalSeconds=" + this.f92859t + ", mPermissionsForceSendIntervalSeconds=" + this.f92860u + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f92861v + ", mMaxReportsInDbCount=" + this.f92862w + ", mCertificates=" + this.f92863x + "} " + super.toString();
    }

    /* renamed from: u */
    public final boolean m22617u() {
        if (isIdentifiersValid() && !AbstractC34679kn.m21470a((Collection) this.f92857r) && this.f92861v) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m22616v() {
        return ((C34580h5) this.f92852m).m21636B();
    }

    /* renamed from: a */
    public final void m22652a(int i) {
        this.f92858s = i;
    }

    /* renamed from: b */
    public final void m22645b(long j) {
        this.f92859t = j;
    }

    /* renamed from: c */
    public final void m22640c(long j) {
        this.f92860u = j;
    }

    /* renamed from: d */
    public final void m22637d(int i) {
        this.f92846g = i;
    }

    @Nullable
    /* renamed from: e */
    public final List<String> m22635e() {
        return this.f92863x;
    }

    /* renamed from: f */
    public final boolean m22633f() {
        return this.f92861v;
    }

    /* renamed from: a */
    public final void m22651a(long j) {
        this.f92862w = j;
    }

    /* renamed from: b */
    public final void m22643b(boolean z) {
        this.f92855p = z;
    }

    /* renamed from: c */
    public final void m22639c(boolean z) {
        this.f92845f = z;
    }

    /* renamed from: d */
    public final int m22638d() {
        return this.f92858s;
    }

    /* renamed from: a */
    public final void m22648a(@NonNull List<String> list) {
        this.f92863x = list;
    }

    /* renamed from: b */
    public final void m22646b(int i) {
        this.f92847h = i;
    }

    /* renamed from: c */
    public final void m22641c(int i) {
        this.f92849j = i;
    }

    /* renamed from: a */
    public final void m22649a(@Nullable Boolean bool, @NonNull InterfaceC33822Cg interfaceC33822Cg) {
        this.f92850k = bool;
        this.f92851l = interfaceC33822Cg;
    }

    /* renamed from: a */
    public final void m22647a(boolean z) {
        this.f92861v = z;
    }
}
