package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* compiled from: EidDataUpdateDispatcher.kt */
@Metadata
/* loaded from: classes7.dex */
public final class EidDataUpdateDispatcher {
    @NotNull
    private final Set<EidDataUpdateListener> eidDataUpdateListeners = new LinkedHashSet();
    @Nullable
    private Functions<? extends Map<String, String>> eidOverridesFactory;

    public final void addEidDataUpdateListener(@NotNull EidDataUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.eidDataUpdateListeners.add(listener);
    }

    public final void dispatchUpdatedEidData(@NotNull EidDataModel eidData, @NotNull Set<String> alteredEids, boolean z) {
        Map<String, String> m17284j;
        Tuples m14532a;
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(alteredEids, "alteredEids");
        if (alteredEids.isEmpty()) {
            return;
        }
        Functions<? extends Map<String, String>> functions = this.eidOverridesFactory;
        if (functions == null || (m17284j = functions.invoke()) == null) {
            m17284j = C37559r0.m17284j();
        }
        for (String str : alteredEids) {
            if (z || !m17284j.containsKey(str)) {
                if (m17284j.containsKey(str)) {
                    m14532a = C38513v.m14532a(m17284j.get(str), Boolean.FALSE);
                } else if (eidData.getSdkEids().containsKey(str)) {
                    m14532a = C38513v.m14532a(eidData.getSdkEids().get(str), Boolean.TRUE);
                } else {
                    m14532a = C38513v.m14532a(null, Boolean.FALSE);
                }
                String str2 = (String) m14532a.m17632a();
                boolean booleanValue = ((Boolean) m14532a.m17631b()).booleanValue();
                for (EidDataUpdateListener eidDataUpdateListener : this.eidDataUpdateListeners) {
                    eidDataUpdateListener.onEidUpdate(str, str2, booleanValue);
                }
            }
        }
    }

    @NotNull
    public final Set<EidDataUpdateListener> getEidDataUpdateListeners$mobilefuse_sdk_core_release() {
        return this.eidDataUpdateListeners;
    }

    @Nullable
    public final Functions<Map<String, String>> getEidOverridesFactory() {
        return this.eidOverridesFactory;
    }

    public final void removeEidDataUpdateListener(@NotNull EidDataUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.eidDataUpdateListeners.remove(listener);
    }

    public final void setEidOverridesFactory(@Nullable Functions<? extends Map<String, String>> functions) {
        this.eidOverridesFactory = functions;
    }

    @VisibleForTesting
    /* renamed from: getEidDataUpdateListeners$mobilefuse_sdk_core_release$annotations */
    public static /* synthetic */ void m47791xe59fdfe6() {
    }
}
