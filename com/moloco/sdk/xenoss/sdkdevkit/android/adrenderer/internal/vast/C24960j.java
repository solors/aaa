package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.EnumC24586k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.InterfaceC24650f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j */
/* loaded from: classes7.dex */
public final class C24960j {
    @NotNull
    /* renamed from: a */
    public static final EnumC24586k m45393a(@NotNull InterfaceC24650f.AbstractC24651a.AbstractC24652a mediaResult) {
        Intrinsics.checkNotNullParameter(mediaResult, "mediaResult");
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24668p.f63698a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_TMP_FILE_NOT_RENAMED_DISK_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24653a.f63683a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_DISK_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24654b.f63684a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_IO_DISK_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24655c.f63685a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_SECURITY_DISK_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24656d.f63686a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_UNKNOWN_DISK_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24658f.f63688a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_HTTP_DISK_IO_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24659g.f63689a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_HTTP_DISK_SECURITY_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24670r.f63700a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_MEDIA_FETCH_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24657e.f63687a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_CLIENT_HTTP_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24660h.f63690a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_SERVER_HTTP_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24666n.f63696a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_NO_NETWORK_HTTP_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24663k.f63693a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_INVALID_URL_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24667o.f63697a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_NOT_FOUND_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24669q.f63699a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_HOST_HTTP_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24661i.f63691a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_SOCKET_HTTP_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24662j.f63692a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_HTTP_SSL_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24665m.f63695a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_FILE_TIMEOUT_ERROR;
        }
        if (Intrinsics.m17075f(mediaResult, InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24664l.f63694a)) {
            return EnumC24586k.VAST_AD_LOAD_MEDIA_NUMBER_PARSE_ERROR;
        }
        throw new NoWhenBranchMatchedException();
    }
}
