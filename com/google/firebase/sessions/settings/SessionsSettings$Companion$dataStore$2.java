package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.google.firebase.sessions.ProcessDetailsProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionsSettings.kt */
@Metadata
/* loaded from: classes4.dex */
final class SessionsSettings$Companion$dataStore$2 extends Lambda implements Function1<CorruptionException, Preferences> {
    public static final SessionsSettings$Companion$dataStore$2 INSTANCE = new SessionsSettings$Companion$dataStore$2();

    SessionsSettings$Companion$dataStore$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Preferences invoke(@NotNull CorruptionException ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', ex);
        return PreferencesFactory.createEmpty();
    }
}
