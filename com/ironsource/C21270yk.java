package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.yk */
/* loaded from: classes6.dex */
public final class C21270yk {

    /* renamed from: a */
    private final int f54660a;

    /* renamed from: b */
    private final int f54661b;

    /* renamed from: c */
    private final int f54662c;

    /* renamed from: d */
    private final boolean f54663d;

    public C21270yk(@NotNull JSONObject applicationLogger) {
        Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.f54660a = applicationLogger.optInt(C21320zk.f54768a, 3);
        this.f54661b = applicationLogger.optInt(C21320zk.f54769b, 3);
        this.f54662c = applicationLogger.optInt("console", 3);
        this.f54663d = applicationLogger.optBoolean(C21320zk.f54771d, false);
    }

    /* renamed from: a */
    public final int m53965a() {
        return this.f54662c;
    }

    /* renamed from: b */
    public final int m53964b() {
        return this.f54661b;
    }

    /* renamed from: c */
    public final int m53963c() {
        return this.f54660a;
    }

    /* renamed from: d */
    public final boolean m53962d() {
        return this.f54663d;
    }
}
