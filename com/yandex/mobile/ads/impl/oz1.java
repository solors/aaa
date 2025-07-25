package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class oz1 implements InterfaceC31607ur {
    @Override // com.yandex.mobile.ads.impl.InterfaceC31607ur
    /* renamed from: a */
    public final boolean mo28686a(@NotNull String host) {
        Socket socket;
        Intrinsics.checkNotNullParameter(host, "host");
        try {
            socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(host, 80), 5000);
                boolean isConnected = socket.isConnected();
                try {
                    socket.close();
                } catch (Throwable unused) {
                    um0.m28726c(new Object[0]);
                }
                return isConnected;
            } catch (Throwable unused2) {
                try {
                    um0.m28726c(new Object[0]);
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (Throwable unused3) {
                            um0.m28726c(new Object[0]);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (Throwable unused4) {
                            um0.m28726c(new Object[0]);
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable unused5) {
            socket = null;
        }
    }
}
