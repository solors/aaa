package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.cd */
/* loaded from: classes9.dex */
public abstract class AbstractC34453cd extends AbstractC34805pe implements InterfaceC35046yk {
    public AbstractC34453cd(@NotNull InterfaceC33891Fa interfaceC33891Fa, @Nullable String str) {
        super(interfaceC33891Fa, str);
    }

    @Nullable
    /* renamed from: c */
    public final String m21871c(@NotNull String str, @Nullable String str2) {
        return this.f95179a.getString(mo21010f(str), str2);
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC35046yk m21867d(@NotNull String str, @Nullable String str2) {
        return (InterfaceC35046yk) m21145b(mo21010f(str), str2);
    }

    /* renamed from: e */
    public final boolean m21865e(@NotNull String str) {
        return this.f95179a.mo21212a(mo21010f(str));
    }

    @NotNull
    /* renamed from: f */
    public abstract String mo21010f(@NotNull String str);

    @NotNull
    /* renamed from: g */
    public InterfaceC35046yk mo21276g(@NotNull String str) {
        return (InterfaceC35046yk) m21142d(mo21010f(str));
    }

    public AbstractC34453cd(@NotNull InterfaceC33891Fa interfaceC33891Fa) {
        this(interfaceC33891Fa, null);
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC35046yk m21869d(@NotNull String str, int i) {
        return (InterfaceC35046yk) m21147b(mo21010f(str), i);
    }

    /* renamed from: c */
    public final int m21873c(@NotNull String str, int i) {
        return this.f95179a.getInt(mo21010f(str), i);
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC35046yk m21868d(@NotNull String str, long j) {
        return (InterfaceC35046yk) m21146b(mo21010f(str), j);
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC35046yk m21866d(@NotNull String str, boolean z) {
        return (InterfaceC35046yk) m21144b(mo21010f(str), z);
    }

    /* renamed from: c */
    public final long m21872c(@NotNull String str, long j) {
        return this.f95179a.getLong(mo21010f(str), j);
    }

    /* renamed from: c */
    public final boolean m21870c(@NotNull String str, boolean z) {
        return this.f95179a.getBoolean(mo21010f(str), z);
    }
}
