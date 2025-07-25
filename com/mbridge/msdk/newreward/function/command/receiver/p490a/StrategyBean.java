package com.mbridge.msdk.newreward.function.command.receiver.p490a;

import com.mbridge.msdk.foundation.p431c.MBFailureReason;
import com.mbridge.msdk.newreward.function.command.CommandManager;
import com.mbridge.msdk.newreward.p477a.AdapterModel;

/* renamed from: com.mbridge.msdk.newreward.function.command.receiver.a.e */
/* loaded from: classes6.dex */
public final class StrategyBean {

    /* renamed from: a */
    private MBFailureReason f58498a;

    /* renamed from: b */
    private AdapterModel f58499b;

    /* renamed from: c */
    private CommandManager f58500c;

    /* renamed from: d */
    private int f58501d;

    public StrategyBean(MBFailureReason mBFailureReason, AdapterModel adapterModel, CommandManager commandManager, int i) {
        this.f58498a = mBFailureReason;
        this.f58499b = adapterModel;
        this.f58500c = commandManager;
        this.f58501d = i;
    }

    /* renamed from: a */
    public final MBFailureReason m50413a() {
        return this.f58498a;
    }

    /* renamed from: b */
    public final AdapterModel m50411b() {
        return this.f58499b;
    }

    /* renamed from: c */
    public final int m50410c() {
        return this.f58501d;
    }

    /* renamed from: d */
    public final CommandManager m50409d() {
        return this.f58500c;
    }

    /* renamed from: a */
    public final void m50412a(MBFailureReason mBFailureReason) {
        this.f58498a = mBFailureReason;
    }
}
