package com.google.firebase.sessions;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionDataStoreConfigs.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SessionDataStoreConfigs {
    @NotNull
    public static final SessionDataStoreConfigs INSTANCE = new SessionDataStoreConfigs();

    /* renamed from: a */
    private static final String f43710a;
    @NotNull

    /* renamed from: b */
    private static final String f43711b;
    @NotNull

    /* renamed from: c */
    private static final String f43712c;

    static {
        byte[] m16618v;
        m16618v = StringsJVM.m16618v(ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions());
        String encodeToString = Base64.encodeToString(m16618v, 10);
        f43710a = encodeToString;
        f43711b = "firebase_session_" + encodeToString + "_data";
        f43712c = "firebase_session_" + encodeToString + "_settings";
    }

    private SessionDataStoreConfigs() {
    }

    @NotNull
    public final String getSESSIONS_CONFIG_NAME() {
        return f43711b;
    }

    @NotNull
    public final String getSETTINGS_CONFIG_NAME() {
        return f43712c;
    }
}
