package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionDatastore.kt */
@Metadata
/* loaded from: classes4.dex */
final class SessionDatastoreImpl$Companion$dataStore$2 extends Lambda implements Function1<CorruptionException, Preferences> {
    public static final SessionDatastoreImpl$Companion$dataStore$2 INSTANCE = new SessionDatastoreImpl$Companion$dataStore$2();

    SessionDatastoreImpl$Companion$dataStore$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Preferences invoke(@NotNull CorruptionException ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', ex);
        return PreferencesFactory.createEmpty();
    }
}
