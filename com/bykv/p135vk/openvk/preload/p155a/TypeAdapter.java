package com.bykv.p135vk.openvk.preload.p155a;

import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonToken;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter;
import java.io.IOException;

/* renamed from: com.bykv.vk.openvk.preload.a.q */
/* loaded from: classes3.dex */
public abstract class TypeAdapter<T> {
    /* renamed from: a */
    public final TypeAdapter<T> m91477a() {
        return new TypeAdapter<T>() { // from class: com.bykv.vk.openvk.preload.a.q.1
            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final void mo91326a(JsonWriter jsonWriter, T t) throws IOException {
                if (t == null) {
                    jsonWriter.m91499h();
                } else {
                    TypeAdapter.this.mo91326a(jsonWriter, t);
                }
            }

            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final T mo91327a(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo91542f() == JsonToken.NULL) {
                    jsonReader.mo91538j();
                    return null;
                }
                return (T) TypeAdapter.this.mo91327a(jsonReader);
            }
        };
    }

    /* renamed from: a */
    public abstract T mo91327a(JsonReader jsonReader) throws IOException;

    /* renamed from: a */
    public abstract void mo91326a(JsonWriter jsonWriter, T t) throws IOException;
}
