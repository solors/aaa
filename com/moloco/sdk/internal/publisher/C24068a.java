package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import ee.DurationUnitJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C37700c;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.publisher.a */
/* loaded from: classes7.dex */
public final class C24068a implements InterfaceC24228z {
    @NotNull

    /* renamed from: f */
    public static final C24069a f62228f = new C24069a(null);
    @NotNull

    /* renamed from: b */
    public final AdFormatType f62229b;

    /* renamed from: c */
    public final long f62230c;

    /* renamed from: d */
    public long f62231d;

    /* renamed from: com.moloco.sdk.internal.publisher.a$a */
    /* loaded from: classes7.dex */
    public static final class C24069a {
        public /* synthetic */ C24069a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24069a() {
        }
    }

    public /* synthetic */ C24068a(AdFormatType adFormatType, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormatType, j);
    }

    /* renamed from: a */
    public final long m47066a(long j) {
        long m47065b = j - m47065b();
        long m16451t = C37700c.m16451t(Duration.m16484q(this.f62230c) - m47065b, DurationUnitJvm.f90129f);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "AdCreateLoadTimeoutManager", this.f62229b + " timeout: " + ((Object) Duration.m16502K(this.f62230c)) + " , create ad duration: " + m47065b + " ms (createTime: " + m47065b() + " ms, loadStartTime: " + j + " ms). Return value: " + ((Object) Duration.m16502K(m16451t)), false, 4, null);
        return m16451t;
    }

    /* renamed from: b */
    public long m47065b() {
        return this.f62231d;
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24228z
    public void setCreateAdObjectStartTime(long j) {
        this.f62231d = j;
    }

    public C24068a(AdFormatType adFormatType, long j) {
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.f62229b = adFormatType;
        this.f62230c = j;
    }
}
