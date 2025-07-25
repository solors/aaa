package com.mobilefuse.sdk.network.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClient.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpStatusCode {
    public static final int BAD_REQUEST = 400;
    @NotNull
    public static final HttpStatusCode INSTANCE = new HttpStatusCode();
    public static final int NOT_FOUND = 404;
    public static final int NO_CONTENT = 204;

    /* renamed from: OK */
    public static final int f61698OK = 200;
    public static final int TOO_MANY_REQUESTS = 429;
    public static final int UNKNOWN_HOST = -1;

    private HttpStatusCode() {
    }
}
