package com.chartboost.sdk;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes3.dex */
public final class LoggingLevel {

    /* renamed from: b */
    public static final /* synthetic */ LoggingLevel[] f21525b;

    /* renamed from: c */
    public static final /* synthetic */ EnumEntries f21526c;
    public static final LoggingLevel NONE = new LoggingLevel(InterfaceC32663coo2iico.cco22, 0);
    public static final LoggingLevel INTEGRATION = new LoggingLevel("INTEGRATION", 1);
    public static final LoggingLevel ALL = new LoggingLevel("ALL", 2);

    static {
        LoggingLevel[] m82156a = m82156a();
        f21525b = m82156a;
        f21526c = C44401b.m3113a(m82156a);
    }

    public LoggingLevel(String str, int i) {
    }

    /* renamed from: a */
    public static final /* synthetic */ LoggingLevel[] m82156a() {
        return new LoggingLevel[]{NONE, INTEGRATION, ALL};
    }

    @NotNull
    public static EnumEntries<LoggingLevel> getEntries() {
        return f21526c;
    }

    public static LoggingLevel valueOf(String str) {
        return (LoggingLevel) Enum.valueOf(LoggingLevel.class, str);
    }

    public static LoggingLevel[] values() {
        return (LoggingLevel[]) f21525b.clone();
    }
}
