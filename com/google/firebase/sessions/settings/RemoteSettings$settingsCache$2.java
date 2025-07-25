package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: RemoteSettings.kt */
@Metadata
/* loaded from: classes4.dex */
final class RemoteSettings$settingsCache$2 extends Lambda implements Functions<SettingsCache> {

    /* renamed from: g */
    final /* synthetic */ DataStore<Preferences> f43829g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$settingsCache$2(DataStore<Preferences> dataStore) {
        super(0);
        this.f43829g = dataStore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final SettingsCache invoke() {
        return new SettingsCache(this.f43829g);
    }
}
