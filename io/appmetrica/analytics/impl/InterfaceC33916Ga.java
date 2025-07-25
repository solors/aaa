package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ga */
/* loaded from: classes9.dex */
public interface InterfaceC33916Ga extends InterfaceC33791Ba, InterfaceC34908tc {
    /* renamed from: a */
    void mo21516a(@Nullable Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC34908tc
    /* renamed from: a */
    /* synthetic */ void mo20846a(@Nullable Location location);

    /* renamed from: a */
    void mo21515a(@NonNull AnrListener anrListener);

    /* renamed from: a */
    void mo21514a(@NonNull ExternalAttribution externalAttribution);

    /* renamed from: a */
    void mo21513a(@NonNull C33904Fn c33904Fn);

    /* renamed from: a */
    void mo21512a(@NonNull EnumC34763o enumC34763o);

    @Override // io.appmetrica.analytics.impl.InterfaceC33791Ba
    /* renamed from: a */
    /* synthetic */ void mo21511a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC34908tc
    /* renamed from: a */
    /* synthetic */ void mo20840a(String str, String str2);

    /* renamed from: a */
    void mo21510a(@NonNull String str, boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC34908tc
    /* renamed from: a */
    /* synthetic */ void mo20839a(boolean z);

    /* renamed from: b */
    void mo21508b(@Nullable Activity activity);

    /* renamed from: b */
    void mo21507b(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC33791Ba
    /* renamed from: b */
    /* synthetic */ void mo21506b(@NonNull String str, @Nullable String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC33791Ba
    /* renamed from: b */
    /* synthetic */ boolean mo21509b();

    /* renamed from: c */
    void mo21505c();

    /* renamed from: g */
    List<String> mo21504g();
}
