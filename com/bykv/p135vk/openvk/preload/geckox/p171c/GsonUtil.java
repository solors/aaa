package com.bykv.p135vk.openvk.preload.geckox.p171c;

import com.bykv.p135vk.openvk.preload.p155a.Gson;
import com.bykv.p135vk.openvk.preload.p155a.GsonBuilder;

/* renamed from: com.bykv.vk.openvk.preload.geckox.c.b */
/* loaded from: classes3.dex */
public final class GsonUtil {

    /* renamed from: a */
    private static GsonUtil f14017a = new GsonUtil();

    /* renamed from: b */
    private Gson f14018b;

    private GsonUtil() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.m91493a(Boolean.class, new BooleanTypeAdapter());
        gsonBuilder.m91493a(Boolean.TYPE, new BooleanTypeAdapter());
        this.f14018b = gsonBuilder.m91494a();
    }

    /* renamed from: a */
    public static GsonUtil m91325a() {
        return f14017a;
    }

    /* renamed from: b */
    public final Gson m91324b() {
        return this.f14018b;
    }
}
