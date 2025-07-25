package com.bykv.p135vk.openvk.preload.geckox.p171c;

import com.bykv.p135vk.openvk.preload.p155a.JsonParseException;
import com.bykv.p135vk.openvk.preload.p155a.TypeAdapter;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonToken;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter;
import java.io.IOException;

/* renamed from: com.bykv.vk.openvk.preload.geckox.c.a */
/* loaded from: classes3.dex */
public final class BooleanTypeAdapter extends TypeAdapter<Boolean> {

    /* compiled from: BooleanTypeAdapter.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.c.a$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C66341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14016a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f14016a = iArr;
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14016a[JsonToken.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14016a[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
    /* renamed from: a */
    public final /* synthetic */ void mo91326a(JsonWriter jsonWriter, Boolean bool) throws IOException {
        Boolean bool2 = bool;
        if (bool2 == null) {
            jsonWriter.m91499h();
        } else {
            jsonWriter.m91515a(bool2);
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
    /* renamed from: a */
    public final /* synthetic */ Boolean mo91327a(JsonReader jsonReader) throws IOException {
        JsonToken mo91542f = jsonReader.mo91542f();
        int i = C66341.f14016a[mo91542f.ordinal()];
        if (i != 1) {
            if (i == 2) {
                jsonReader.mo91538j();
                return null;
            } else if (i == 3) {
                return Boolean.valueOf(jsonReader.mo91535m() != 0);
            } else {
                throw new JsonParseException("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(mo91542f)));
            }
        }
        return Boolean.valueOf(jsonReader.mo91539i());
    }
}
