package p823p;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.Contexts;
import p1003v.InterfaceC44485r;
import p1003v.Logs;
import p823p.InterfaceC39249e;

/* compiled from: NetworkObserver.kt */
@Metadata
/* renamed from: p.f */
/* loaded from: classes2.dex */
public final class C39251f {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC39249e m13341a(@NotNull Context context, @NotNull InterfaceC39249e.InterfaceC39250a interfaceC39250a, @Nullable InterfaceC44485r interfaceC44485r) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager != null && Contexts.m2844e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                return new C39252g(connectivityManager, interfaceC39250a);
            } catch (Exception e) {
                if (interfaceC44485r != null) {
                    Logs.m2838a(interfaceC44485r, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
                }
                return new NetworkObserver();
            }
        }
        if (interfaceC44485r != null && interfaceC44485r.getLevel() <= 5) {
            interfaceC44485r.m2795a("NetworkObserver", 5, "Unable to register network observer.", null);
        }
        return new NetworkObserver();
    }
}
