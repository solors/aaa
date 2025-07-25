package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.L2 */
/* loaded from: classes9.dex */
public abstract class AbstractC34029L2 implements ModulePreferences {

    /* renamed from: a */
    public final InterfaceC35046yk f93162a;

    public AbstractC34029L2(@NotNull InterfaceC35046yk interfaceC35046yk) {
        this.f93162a = interfaceC35046yk;
    }

    @NotNull
    /* renamed from: a */
    public abstract String mo20916a(@NotNull String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@NotNull String str, boolean z) {
        return ((AbstractC34453cd) this.f93162a).m21870c(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@NotNull String str, int i) {
        return ((AbstractC34453cd) this.f93162a).m21873c(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@NotNull String str, long j) {
        return ((AbstractC34453cd) this.f93162a).m21872c(mo20916a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        return ((AbstractC34453cd) this.f93162a).m21871c(mo20916a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@NotNull String str, boolean z) {
        AbstractC34453cd abstractC34453cd = (AbstractC34453cd) this.f93162a;
        ((AbstractC34805pe) ((InterfaceC35046yk) abstractC34453cd.m21144b(abstractC34453cd.mo21010f(mo20916a(str)), z))).m21149b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@NotNull String str, int i) {
        AbstractC34453cd abstractC34453cd = (AbstractC34453cd) this.f93162a;
        ((AbstractC34805pe) ((InterfaceC35046yk) abstractC34453cd.m21147b(abstractC34453cd.mo21010f(str), i))).m21149b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@NotNull String str, long j) {
        AbstractC34453cd abstractC34453cd = (AbstractC34453cd) this.f93162a;
        ((AbstractC34805pe) ((InterfaceC35046yk) abstractC34453cd.m21146b(abstractC34453cd.mo21010f(mo20916a(str)), j))).m21149b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@NotNull String str, @Nullable String str2) {
        AbstractC34453cd abstractC34453cd = (AbstractC34453cd) this.f93162a;
        ((AbstractC34805pe) ((InterfaceC35046yk) abstractC34453cd.m21145b(abstractC34453cd.mo21010f(mo20916a(str)), str2))).m21149b();
    }
}
